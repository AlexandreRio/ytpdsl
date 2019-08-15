/*
 * generated by Xtext 2.18.0.M3
 */
package fr.ytpdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.ytpdsl.ide.contentassist.antlr.internal.InternalYtpDslParser;
import fr.ytpdsl.services.YtpDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class YtpDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(YtpDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, YtpDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMediaDescriptionAccess().getAlternatives(), "rule__MediaDescription__Alternatives");
			builder.put(grammarAccess.getPositionAccess().getAlternatives(), "rule__Position__Alternatives");
			builder.put(grammarAccess.getFilterAccess().getAlternatives(), "rule__Filter__Alternatives");
			builder.put(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0(), "rule__FlipFilter__OrientationAlternatives_1_0");
			builder.put(grammarAccess.getYtpModelAccess().getGroup(), "rule__YtpModel__Group__0");
			builder.put(grammarAccess.getGeneratorInformationAccess().getGroup(), "rule__GeneratorInformation__Group__0");
			builder.put(grammarAccess.getGeneratorInformationAccess().getGroup_1(), "rule__GeneratorInformation__Group_1__0");
			builder.put(grammarAccess.getGeneratorInformationAccess().getGroup_2(), "rule__GeneratorInformation__Group_2__0");
			builder.put(grammarAccess.getGeneratorInformationAccess().getGroup_3(), "rule__GeneratorInformation__Group_3__0");
			builder.put(grammarAccess.getGeneratorInformationAccess().getGroup_4(), "rule__GeneratorInformation__Group_4__0");
			builder.put(grammarAccess.getGeneratorInformationAccess().getGroup_5(), "rule__GeneratorInformation__Group_5__0");
			builder.put(grammarAccess.getVideoLibraryAccess().getGroup(), "rule__VideoLibrary__Group__0");
			builder.put(grammarAccess.getMediaAccess().getGroup(), "rule__Media__Group__0");
			builder.put(grammarAccess.getImageDescriptionAccess().getGroup(), "rule__ImageDescription__Group__0");
			builder.put(grammarAccess.getImageDescriptionAccess().getGroup_3(), "rule__ImageDescription__Group_3__0");
			builder.put(grammarAccess.getImageDescriptionAccess().getGroup_3_1(), "rule__ImageDescription__Group_3_1__0");
			builder.put(grammarAccess.getImageDescriptionAccess().getGroup_3_2(), "rule__ImageDescription__Group_3_2__0");
			builder.put(grammarAccess.getVideoDescriptionAccess().getGroup(), "rule__VideoDescription__Group__0");
			builder.put(grammarAccess.getVideoDescriptionAccess().getGroup_3(), "rule__VideoDescription__Group_3__0");
			builder.put(grammarAccess.getVideoDescriptionAccess().getGroup_3_1(), "rule__VideoDescription__Group_3_1__0");
			builder.put(grammarAccess.getVideoDescriptionAccess().getGroup_3_2(), "rule__VideoDescription__Group_3_2__0");
			builder.put(grammarAccess.getVideoDescriptionAccess().getGroup_3_3(), "rule__VideoDescription__Group_3_3__0");
			builder.put(grammarAccess.getVideoDescriptionAccess().getGroup_3_4(), "rule__VideoDescription__Group_3_4__0");
			builder.put(grammarAccess.getVideoDescriptionAccess().getGroup_3_5(), "rule__VideoDescription__Group_3_5__0");
			builder.put(grammarAccess.getVideoTextAccess().getGroup(), "rule__VideoText__Group__0");
			builder.put(grammarAccess.getVideoTextAccess().getGroup_5(), "rule__VideoText__Group_5__0");
			builder.put(grammarAccess.getVideoTextAccess().getGroup_6(), "rule__VideoText__Group_6__0");
			builder.put(grammarAccess.getBlackWhiteFilterAccess().getGroup(), "rule__BlackWhiteFilter__Group__0");
			builder.put(grammarAccess.getNegateFilterAccess().getGroup(), "rule__NegateFilter__Group__0");
			builder.put(grammarAccess.getFlipFilterAccess().getGroup(), "rule__FlipFilter__Group__0");
			builder.put(grammarAccess.getYtpModelAccess().getInformationAssignment_0(), "rule__YtpModel__InformationAssignment_0");
			builder.put(grammarAccess.getYtpModelAccess().getMediasAssignment_1(), "rule__YtpModel__MediasAssignment_1");
			builder.put(grammarAccess.getGeneratorInformationAccess().getAuthorNameAssignment_1_1(), "rule__GeneratorInformation__AuthorNameAssignment_1_1");
			builder.put(grammarAccess.getGeneratorInformationAccess().getVersionAssignment_2_1(), "rule__GeneratorInformation__VersionAssignment_2_1");
			builder.put(grammarAccess.getGeneratorInformationAccess().getCreationDateAssignment_3_1(), "rule__GeneratorInformation__CreationDateAssignment_3_1");
			builder.put(grammarAccess.getGeneratorInformationAccess().getFfmpegAssignment_4_1(), "rule__GeneratorInformation__FfmpegAssignment_4_1");
			builder.put(grammarAccess.getGeneratorInformationAccess().getFfprobeAssignment_5_1(), "rule__GeneratorInformation__FfprobeAssignment_5_1");
			builder.put(grammarAccess.getGeneratorInformationAccess().getLibraryAssignment_6(), "rule__GeneratorInformation__LibraryAssignment_6");
			builder.put(grammarAccess.getVideoLibraryAccess().getFolderAssignment_1(), "rule__VideoLibrary__FolderAssignment_1");
			builder.put(grammarAccess.getVideoLibraryAccess().getExtensionAssignment_3(), "rule__VideoLibrary__ExtensionAssignment_3");
			builder.put(grammarAccess.getMediaAccess().getDescriptionAssignment_1(), "rule__Media__DescriptionAssignment_1");
			builder.put(grammarAccess.getImageDescriptionAccess().getImageidAssignment_1(), "rule__ImageDescription__ImageidAssignment_1");
			builder.put(grammarAccess.getImageDescriptionAccess().getLocationAssignment_2(), "rule__ImageDescription__LocationAssignment_2");
			builder.put(grammarAccess.getImageDescriptionAccess().getTopAssignment_3_1_1(), "rule__ImageDescription__TopAssignment_3_1_1");
			builder.put(grammarAccess.getImageDescriptionAccess().getBottomAssignment_3_2_1(), "rule__ImageDescription__BottomAssignment_3_2_1");
			builder.put(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1(), "rule__VideoDescription__VideoidAssignment_1");
			builder.put(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2(), "rule__VideoDescription__LocationAssignment_2");
			builder.put(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1(), "rule__VideoDescription__DurationAssignment_3_1_1");
			builder.put(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1(), "rule__VideoDescription__ProbabilityAssignment_3_2_1");
			builder.put(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_3_1(), "rule__VideoDescription__DescriptionAssignment_3_3_1");
			builder.put(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_4_1(), "rule__VideoDescription__FilterAssignment_3_4_1");
			builder.put(grammarAccess.getVideoDescriptionAccess().getTextAssignment_3_5_1(), "rule__VideoDescription__TextAssignment_3_5_1");
			builder.put(grammarAccess.getVideoTextAccess().getContentAssignment_2(), "rule__VideoText__ContentAssignment_2");
			builder.put(grammarAccess.getVideoTextAccess().getPositionAssignment_4(), "rule__VideoText__PositionAssignment_4");
			builder.put(grammarAccess.getVideoTextAccess().getColorAssignment_5_1(), "rule__VideoText__ColorAssignment_5_1");
			builder.put(grammarAccess.getVideoTextAccess().getSizeAssignment_6_1(), "rule__VideoText__SizeAssignment_6_1");
			builder.put(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1(), "rule__FlipFilter__OrientationAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private YtpDslGrammarAccess grammarAccess;

	@Override
	protected InternalYtpDslParser createParser() {
		InternalYtpDslParser result = new InternalYtpDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public YtpDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(YtpDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
