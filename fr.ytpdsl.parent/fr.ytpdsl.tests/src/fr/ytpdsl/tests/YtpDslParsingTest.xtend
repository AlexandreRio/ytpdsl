package fr.ytpdsl.tests

import com.google.inject.Inject
import fr.ytpdsl.ytpDsl.YtpModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.^extension.ExtendWith
import org.junit.jupiter.api.Test

@ExtendWith(InjectionExtension)
@InjectWith(YtpDslInjectorProvider)
class YtpDslParsingTest {

	@Inject
	ParseHelper<YtpModel> parseHelper

	@Test
	def void minimumNonEmptyModel() {
		val result = parseHelper.parse('''
		@author 'junit'
		
		FFMPEG_PATH ''
		FFPROBE_PATH ''
''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

}
