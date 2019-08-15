package fr.ytpdsl.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import fr.ytpdsl.YtpDslStandaloneSetup;
import fr.ytpdsl.ui.YtpDSLConsole;
import fr.ytpdsl.ytpDsl.YtpModel;

public class SampleHandler extends AbstractHandler {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActivePart();
		IFile file = (IFile) workbenchPart.getSite().getPage().getActiveEditor().getEditorInput()
				.getAdapter(IFile.class);

		Injector injector = new YtpDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		SampleHandler handler = injector.getInstance(SampleHandler.class);
		handler.run(file.getLocation().toString());
		return null;
	}
	
	public void run(String input) {
		YtpDSLConsole console = YtpDSLConsole.getInstance();

		ResourceSet set = resourceSetProvider.get();

		Resource resource = set.getResource(URI.createFileURI(input), true);
		EObject root = resource.getContents().get(0);
		if (root instanceof YtpModel) {
			YtpModel ym = (YtpModel) root;
			console.printMessageln(ym.getInformation().getAuthorName());
		}
	}
}
