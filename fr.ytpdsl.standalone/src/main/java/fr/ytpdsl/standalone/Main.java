package fr.ytpdsl.standalone;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import fr.ytpdsl.YtpDslStandaloneSetup;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Aborting: no path to EMF resource provided!");
			return;
		}

		Injector injector = new YtpDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);

		main.runGenerator(args[0]);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	protected List<String> runGenerator(String inputFile) {
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(inputFile), true);
		List<String> runIds = new ArrayList<>();

		EObject root = resource.getContents().get(0);

		return null;
	}
}
