package fr.ytpdsl.ui.handlers;

import java.util.concurrent.TimeUnit;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressConstants;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import fr.ytpdsl.YtpDslStandaloneSetup;
import fr.ytpdsl.ui.YtpDSLConsole;
import fr.ytpdsl.video.VideoGenerator;
import fr.ytpdsl.ytpDsl.YtpModel;
import net.bramp.ffmpeg.FFmpegExecutor;
import net.bramp.ffmpeg.FFmpegUtils;
import net.bramp.ffmpeg.progress.Progress;
import net.bramp.ffmpeg.progress.ProgressListener;

public class GeneratorHandler extends AbstractHandler {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	private YtpDSLConsole console = YtpDSLConsole.getInstance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActivePart();
		IFile file = (IFile) workbenchPart.getSite().getPage().getActiveEditor().getEditorInput()
				.getAdapter(IFile.class);
		IFolder destFolder = file.getProject().getFolder("src-gen");
		if (!destFolder.exists()) {
			try {
				destFolder.create(true, true, null);
			} catch (CoreException e) {
				console.printErrorln("Cannot create destination folder : " + e.getMessage());
			}
		}

		Injector injector = new YtpDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		GeneratorHandler handler = injector.getInstance(GeneratorHandler.class);
		handler.run(file.getLocation().toString(), destFolder.getLocation().toString());
		return null;
	}
	
	
	public void run(String inputModelPath, String outputDirPath) {
		YtpDSLConsole console = YtpDSLConsole.getInstance();

		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(inputModelPath), true);
		EObject root = resource.getContents().get(0);
		if (root instanceof YtpModel) {
			console.printMessageln("Generating a video...");

			Job job = new Job("Generating a video") {
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("fait des trucs", 100);
					VideoGenerator generator = new VideoGenerator((YtpModel) root, outputDirPath);
					FFmpegExecutor executor = new FFmpegExecutor(generator.ffmpeg, generator.ffprobe);
					executor.createJob(generator.build().done(), new ProgressListener() {
						private int lastPercentage = 0;

						@Override
						public void progress(Progress progress) {
							double percentage = progress.out_time_ns / generator.duration();
							int roundedPercentage = ((int)percentage*100);
							if (lastPercentage != roundedPercentage) {
								monitor.worked(roundedPercentage - lastPercentage);
								lastPercentage =  roundedPercentage;
							}

							console.printMessageln(String.format(
									"[%.0f%%] status:%s frame:%d time:%s ms fps:%.0f speed:%.2fx",
									percentage * 100,
									progress.status,
									progress.frame,
									FFmpegUtils.toTimecode(progress.out_time_ns, TimeUnit.NANOSECONDS),
									progress.fps.doubleValue(),
									progress.speed
								));
						}}
					).run();
					
					setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
					setProperty(IProgressConstants.ACTION_PROPERTY, displayResultAction());
					return Status.OK_STATUS;
				}

				protected Action displayResultAction() {
					return new Action("View reservation status") {
						public void run() {
							MessageDialog.openInformation(
									PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
									"Reservation Complete", "Your reservation has been ");
						}
					};
				}
			};
			job.setUser(true);
			job.setPriority(Job.LONG);
			job.schedule(); // start as soon as possible

		}
	}
}
