/*
 * generated by Xtext 2.18.0.M3
 */
package fr.ytpdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class YtpDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class YtpModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.YtpModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInformationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInformationGeneratorInformationParserRuleCall_0_0 = (RuleCall)cInformationAssignment_0.eContents().get(0);
		private final Assignment cMediasAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMediasMediaParserRuleCall_1_0 = (RuleCall)cMediasAssignment_1.eContents().get(0);
		
		//YtpModel:
		//	information=GeneratorInformation?
		//	medias+=Media+;
		@Override public ParserRule getRule() { return rule; }
		
		//information=GeneratorInformation? medias+=Media+
		public Group getGroup() { return cGroup; }
		
		//information=GeneratorInformation?
		public Assignment getInformationAssignment_0() { return cInformationAssignment_0; }
		
		//GeneratorInformation
		public RuleCall getInformationGeneratorInformationParserRuleCall_0_0() { return cInformationGeneratorInformationParserRuleCall_0_0; }
		
		//medias+=Media+
		public Assignment getMediasAssignment_1() { return cMediasAssignment_1; }
		
		//Media
		public RuleCall getMediasMediaParserRuleCall_1_0() { return cMediasMediaParserRuleCall_1_0; }
	}
	public class GeneratorInformationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.GeneratorInformation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGeneratorInformationAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAuthorKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAuthorNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAuthorNameSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cAuthorNameAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVersionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVersionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVersionSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cVersionAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCreationKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCreationDateAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCreationDateSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cCreationDateAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFFMPEG_PATHKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFfmpegAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFfmpegSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cFfmpegAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cFFPROBE_PATHKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cFfprobeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cFfprobeSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cFfprobeAssignment_5_1.eContents().get(0);
		private final Assignment cLibraryAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLibraryVideoLibraryParserRuleCall_6_0 = (RuleCall)cLibraryAssignment_6.eContents().get(0);
		
		//GeneratorInformation:
		//	{GeneratorInformation} ('@author' authorName=STRING) ('@version' version=STRING)? ('@creation' creationDate=STRING)?
		//	('FFMPEG_PATH' ffmpeg=STRING) ('FFPROBE_PATH' ffprobe=STRING) library+=VideoLibrary*;
		@Override public ParserRule getRule() { return rule; }
		
		//{GeneratorInformation} ('@author' authorName=STRING) ('@version' version=STRING)? ('@creation' creationDate=STRING)?
		//('FFMPEG_PATH' ffmpeg=STRING) ('FFPROBE_PATH' ffprobe=STRING) library+=VideoLibrary*
		public Group getGroup() { return cGroup; }
		
		//{GeneratorInformation}
		public Action getGeneratorInformationAction_0() { return cGeneratorInformationAction_0; }
		
		//'@author' authorName=STRING
		public Group getGroup_1() { return cGroup_1; }
		
		//'@author'
		public Keyword getAuthorKeyword_1_0() { return cAuthorKeyword_1_0; }
		
		//authorName=STRING
		public Assignment getAuthorNameAssignment_1_1() { return cAuthorNameAssignment_1_1; }
		
		//STRING
		public RuleCall getAuthorNameSTRINGTerminalRuleCall_1_1_0() { return cAuthorNameSTRINGTerminalRuleCall_1_1_0; }
		
		//('@version' version=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'@version'
		public Keyword getVersionKeyword_2_0() { return cVersionKeyword_2_0; }
		
		//version=STRING
		public Assignment getVersionAssignment_2_1() { return cVersionAssignment_2_1; }
		
		//STRING
		public RuleCall getVersionSTRINGTerminalRuleCall_2_1_0() { return cVersionSTRINGTerminalRuleCall_2_1_0; }
		
		//('@creation' creationDate=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'@creation'
		public Keyword getCreationKeyword_3_0() { return cCreationKeyword_3_0; }
		
		//creationDate=STRING
		public Assignment getCreationDateAssignment_3_1() { return cCreationDateAssignment_3_1; }
		
		//STRING
		public RuleCall getCreationDateSTRINGTerminalRuleCall_3_1_0() { return cCreationDateSTRINGTerminalRuleCall_3_1_0; }
		
		//'FFMPEG_PATH' ffmpeg=STRING
		public Group getGroup_4() { return cGroup_4; }
		
		//'FFMPEG_PATH'
		public Keyword getFFMPEG_PATHKeyword_4_0() { return cFFMPEG_PATHKeyword_4_0; }
		
		//ffmpeg=STRING
		public Assignment getFfmpegAssignment_4_1() { return cFfmpegAssignment_4_1; }
		
		//STRING
		public RuleCall getFfmpegSTRINGTerminalRuleCall_4_1_0() { return cFfmpegSTRINGTerminalRuleCall_4_1_0; }
		
		//'FFPROBE_PATH' ffprobe=STRING
		public Group getGroup_5() { return cGroup_5; }
		
		//'FFPROBE_PATH'
		public Keyword getFFPROBE_PATHKeyword_5_0() { return cFFPROBE_PATHKeyword_5_0; }
		
		//ffprobe=STRING
		public Assignment getFfprobeAssignment_5_1() { return cFfprobeAssignment_5_1; }
		
		//STRING
		public RuleCall getFfprobeSTRINGTerminalRuleCall_5_1_0() { return cFfprobeSTRINGTerminalRuleCall_5_1_0; }
		
		//library+=VideoLibrary*
		public Assignment getLibraryAssignment_6() { return cLibraryAssignment_6; }
		
		//VideoLibrary
		public RuleCall getLibraryVideoLibraryParserRuleCall_6_0() { return cLibraryVideoLibraryParserRuleCall_6_0; }
	}
	public class VideoLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.VideoLibrary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFolderKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFolderAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFolderSTRINGTerminalRuleCall_1_0 = (RuleCall)cFolderAssignment_1.eContents().get(0);
		private final Keyword cExtKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExtensionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExtensionSTRINGTerminalRuleCall_3_0 = (RuleCall)cExtensionAssignment_3.eContents().get(0);
		
		//VideoLibrary:
		//	'folder' folder=STRING 'ext' extension+=STRING+;
		@Override public ParserRule getRule() { return rule; }
		
		//'folder' folder=STRING 'ext' extension+=STRING+
		public Group getGroup() { return cGroup; }
		
		//'folder'
		public Keyword getFolderKeyword_0() { return cFolderKeyword_0; }
		
		//folder=STRING
		public Assignment getFolderAssignment_1() { return cFolderAssignment_1; }
		
		//STRING
		public RuleCall getFolderSTRINGTerminalRuleCall_1_0() { return cFolderSTRINGTerminalRuleCall_1_0; }
		
		//'ext'
		public Keyword getExtKeyword_2() { return cExtKeyword_2; }
		
		//extension+=STRING+
		public Assignment getExtensionAssignment_3() { return cExtensionAssignment_3; }
		
		//STRING
		public RuleCall getExtensionSTRINGTerminalRuleCall_3_0() { return cExtensionSTRINGTerminalRuleCall_3_0; }
	}
	public class MediaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.Media");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMediaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionMediaDescriptionParserRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		
		//Media:
		//	'media' description=MediaDescription;
		@Override public ParserRule getRule() { return rule; }
		
		//'media' description=MediaDescription
		public Group getGroup() { return cGroup; }
		
		//'media'
		public Keyword getMediaKeyword_0() { return cMediaKeyword_0; }
		
		//description=MediaDescription
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }
		
		//MediaDescription
		public RuleCall getDescriptionMediaDescriptionParserRuleCall_1_0() { return cDescriptionMediaDescriptionParserRuleCall_1_0; }
	}
	public class MediaDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.MediaDescription");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cImageDescriptionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVideoDescriptionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MediaDescription:
		//	ImageDescription | VideoDescription;
		@Override public ParserRule getRule() { return rule; }
		
		//ImageDescription | VideoDescription
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ImageDescription
		public RuleCall getImageDescriptionParserRuleCall_0() { return cImageDescriptionParserRuleCall_0; }
		
		//VideoDescription
		public RuleCall getVideoDescriptionParserRuleCall_1() { return cVideoDescriptionParserRuleCall_1; }
	}
	public class ImageDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.ImageDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImageidAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImageidIDTerminalRuleCall_1_0 = (RuleCall)cImageidAssignment_1.eContents().get(0);
		private final Assignment cLocationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLocationSTRINGTerminalRuleCall_2_0 = (RuleCall)cLocationAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cToptextKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cTopAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cTopSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cTopAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cBottomtextKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cBottomAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cBottomSTRINGTerminalRuleCall_3_2_1_0 = (RuleCall)cBottomAssignment_3_2_1.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_3_3 = (RuleCall)cGroup_3.eContents().get(3);
		
		//ImageDescription:
		//	'image' imageid=ID? location=STRING (LEFT_BRACKET ('toptext' top=STRING) ('bottomtext' bottom=STRING)
		//	RIGHT_BRACKET)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'image' imageid=ID? location=STRING (LEFT_BRACKET ('toptext' top=STRING) ('bottomtext' bottom=STRING) RIGHT_BRACKET)?
		public Group getGroup() { return cGroup; }
		
		//'image'
		public Keyword getImageKeyword_0() { return cImageKeyword_0; }
		
		//imageid=ID?
		public Assignment getImageidAssignment_1() { return cImageidAssignment_1; }
		
		//ID
		public RuleCall getImageidIDTerminalRuleCall_1_0() { return cImageidIDTerminalRuleCall_1_0; }
		
		//location=STRING
		public Assignment getLocationAssignment_2() { return cLocationAssignment_2; }
		
		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_2_0() { return cLocationSTRINGTerminalRuleCall_2_0; }
		
		//(LEFT_BRACKET ('toptext' top=STRING) ('bottomtext' bottom=STRING) RIGHT_BRACKET)?
		public Group getGroup_3() { return cGroup_3; }
		
		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_3_0() { return cLEFT_BRACKETTerminalRuleCall_3_0; }
		
		//'toptext' top=STRING
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'toptext'
		public Keyword getToptextKeyword_3_1_0() { return cToptextKeyword_3_1_0; }
		
		//top=STRING
		public Assignment getTopAssignment_3_1_1() { return cTopAssignment_3_1_1; }
		
		//STRING
		public RuleCall getTopSTRINGTerminalRuleCall_3_1_1_0() { return cTopSTRINGTerminalRuleCall_3_1_1_0; }
		
		//'bottomtext' bottom=STRING
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'bottomtext'
		public Keyword getBottomtextKeyword_3_2_0() { return cBottomtextKeyword_3_2_0; }
		
		//bottom=STRING
		public Assignment getBottomAssignment_3_2_1() { return cBottomAssignment_3_2_1; }
		
		//STRING
		public RuleCall getBottomSTRINGTerminalRuleCall_3_2_1_0() { return cBottomSTRINGTerminalRuleCall_3_2_1_0; }
		
		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_3_3() { return cRIGHT_BRACKETTerminalRuleCall_3_3; }
	}
	public class VideoDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.VideoDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVideoseqKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVideoidAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVideoidIDTerminalRuleCall_1_0 = (RuleCall)cVideoidAssignment_1.eContents().get(0);
		private final Assignment cLocationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLocationSTRINGTerminalRuleCall_2_0 = (RuleCall)cLocationAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cDurationKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cDurationAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cDurationINTTerminalRuleCall_3_1_1_0 = (RuleCall)cDurationAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cProbabilityKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cProbabilityAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cProbabilityINTTerminalRuleCall_3_2_1_0 = (RuleCall)cProbabilityAssignment_3_2_1.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_3_1_0 = (RuleCall)cDescriptionAssignment_3_3_1.eContents().get(0);
		private final Group cGroup_3_4 = (Group)cGroup_3.eContents().get(4);
		private final Keyword cFilterKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Assignment cFilterAssignment_3_4_1 = (Assignment)cGroup_3_4.eContents().get(1);
		private final RuleCall cFilterFilterParserRuleCall_3_4_1_0 = (RuleCall)cFilterAssignment_3_4_1.eContents().get(0);
		private final Group cGroup_3_5 = (Group)cGroup_3.eContents().get(5);
		private final Keyword cTextKeyword_3_5_0 = (Keyword)cGroup_3_5.eContents().get(0);
		private final Assignment cTextAssignment_3_5_1 = (Assignment)cGroup_3_5.eContents().get(1);
		private final RuleCall cTextVideoTextParserRuleCall_3_5_1_0 = (RuleCall)cTextAssignment_3_5_1.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_3_6 = (RuleCall)cGroup_3.eContents().get(6);
		
		//VideoDescription:
		//	'videoseq' videoid=ID? location=STRING (LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)?
		//	('description' description=STRING)? ('filter' filter=Filter)? ('text' text=VideoText)? // incrust a text into a video
		//	RIGHT_BRACKET)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'videoseq' videoid=ID? location=STRING (LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)?
		//('description' description=STRING)? ('filter' filter=Filter)? ('text' text=VideoText)? // incrust a text into a video
		//RIGHT_BRACKET)?
		public Group getGroup() { return cGroup; }
		
		//'videoseq'
		public Keyword getVideoseqKeyword_0() { return cVideoseqKeyword_0; }
		
		//videoid=ID?
		public Assignment getVideoidAssignment_1() { return cVideoidAssignment_1; }
		
		//ID
		public RuleCall getVideoidIDTerminalRuleCall_1_0() { return cVideoidIDTerminalRuleCall_1_0; }
		
		//location=STRING
		public Assignment getLocationAssignment_2() { return cLocationAssignment_2; }
		
		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_2_0() { return cLocationSTRINGTerminalRuleCall_2_0; }
		
		//(LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)? ('description' description=STRING)? ('filter'
		//filter=Filter)? ('text' text=VideoText)? // incrust a text into a video
		//RIGHT_BRACKET)?
		public Group getGroup_3() { return cGroup_3; }
		
		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_3_0() { return cLEFT_BRACKETTerminalRuleCall_3_0; }
		
		//('duration' duration=INT)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'duration'
		public Keyword getDurationKeyword_3_1_0() { return cDurationKeyword_3_1_0; }
		
		//duration=INT
		public Assignment getDurationAssignment_3_1_1() { return cDurationAssignment_3_1_1; }
		
		//INT
		public RuleCall getDurationINTTerminalRuleCall_3_1_1_0() { return cDurationINTTerminalRuleCall_3_1_1_0; }
		
		//('probability' probability=INT)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'probability'
		public Keyword getProbabilityKeyword_3_2_0() { return cProbabilityKeyword_3_2_0; }
		
		//probability=INT
		public Assignment getProbabilityAssignment_3_2_1() { return cProbabilityAssignment_3_2_1; }
		
		//INT
		public RuleCall getProbabilityINTTerminalRuleCall_3_2_1_0() { return cProbabilityINTTerminalRuleCall_3_2_1_0; }
		
		//('description' description=STRING)?
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//'description'
		public Keyword getDescriptionKeyword_3_3_0() { return cDescriptionKeyword_3_3_0; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_3_3_1() { return cDescriptionAssignment_3_3_1; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_3_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_3_1_0; }
		
		//('filter' filter=Filter)?
		public Group getGroup_3_4() { return cGroup_3_4; }
		
		//'filter'
		public Keyword getFilterKeyword_3_4_0() { return cFilterKeyword_3_4_0; }
		
		//filter=Filter
		public Assignment getFilterAssignment_3_4_1() { return cFilterAssignment_3_4_1; }
		
		//Filter
		public RuleCall getFilterFilterParserRuleCall_3_4_1_0() { return cFilterFilterParserRuleCall_3_4_1_0; }
		
		//('text' text=VideoText)?
		public Group getGroup_3_5() { return cGroup_3_5; }
		
		//'text'
		public Keyword getTextKeyword_3_5_0() { return cTextKeyword_3_5_0; }
		
		//text=VideoText
		public Assignment getTextAssignment_3_5_1() { return cTextAssignment_3_5_1; }
		
		//VideoText
		public RuleCall getTextVideoTextParserRuleCall_3_5_1_0() { return cTextVideoTextParserRuleCall_3_5_1_0; }
		
		//// incrust a text into a video
		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_3_6() { return cRIGHT_BRACKETTerminalRuleCall_3_6; }
	}
	public class VideoTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.VideoText");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cContentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContentSTRINGTerminalRuleCall_2_0 = (RuleCall)cContentAssignment_2.eContents().get(0);
		private final Keyword cPositionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPositionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPositionPositionParserRuleCall_4_0 = (RuleCall)cPositionAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColorKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cColorAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cColorSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cColorAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cSizeKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cSizeAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cSizeINTTerminalRuleCall_6_1_0 = (RuleCall)cSizeAssignment_6_1.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//VideoText:
		//	LEFT_BRACKET
		//	'content' content=STRING
		//	'position' position=Position ('color' color=STRING)? ('size' size=INT)?
		//	RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//LEFT_BRACKET 'content' content=STRING 'position' position=Position ('color' color=STRING)? ('size' size=INT)?
		//RIGHT_BRACKET
		public Group getGroup() { return cGroup; }
		
		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_0() { return cLEFT_BRACKETTerminalRuleCall_0; }
		
		//'content'
		public Keyword getContentKeyword_1() { return cContentKeyword_1; }
		
		//content=STRING
		public Assignment getContentAssignment_2() { return cContentAssignment_2; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_2_0() { return cContentSTRINGTerminalRuleCall_2_0; }
		
		//'position'
		public Keyword getPositionKeyword_3() { return cPositionKeyword_3; }
		
		//position=Position
		public Assignment getPositionAssignment_4() { return cPositionAssignment_4; }
		
		//Position
		public RuleCall getPositionPositionParserRuleCall_4_0() { return cPositionPositionParserRuleCall_4_0; }
		
		//('color' color=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'color'
		public Keyword getColorKeyword_5_0() { return cColorKeyword_5_0; }
		
		//color=STRING
		public Assignment getColorAssignment_5_1() { return cColorAssignment_5_1; }
		
		//STRING
		public RuleCall getColorSTRINGTerminalRuleCall_5_1_0() { return cColorSTRINGTerminalRuleCall_5_1_0; }
		
		//('size' size=INT)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'size'
		public Keyword getSizeKeyword_6_0() { return cSizeKeyword_6_0; }
		
		//size=INT
		public Assignment getSizeAssignment_6_1() { return cSizeAssignment_6_1; }
		
		//INT
		public RuleCall getSizeINTTerminalRuleCall_6_1_0() { return cSizeINTTerminalRuleCall_6_1_0; }
		
		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_7() { return cRIGHT_BRACKETTerminalRuleCall_7; }
	}
	public class PositionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.Position");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTOPKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBOTTOMKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cCENTERKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//Position:
		//	'TOP' | 'BOTTOM' | 'CENTER';
		@Override public ParserRule getRule() { return rule; }
		
		//'TOP' | 'BOTTOM' | 'CENTER'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'TOP'
		public Keyword getTOPKeyword_0() { return cTOPKeyword_0; }
		
		//'BOTTOM'
		public Keyword getBOTTOMKeyword_1() { return cBOTTOMKeyword_1; }
		
		//'CENTER'
		public Keyword getCENTERKeyword_2() { return cCENTERKeyword_2; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.Filter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFlipFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNegateFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBlackWhiteFilterParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Filter:
		//	FlipFilter | NegateFilter | BlackWhiteFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//FlipFilter | NegateFilter | BlackWhiteFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FlipFilter
		public RuleCall getFlipFilterParserRuleCall_0() { return cFlipFilterParserRuleCall_0; }
		
		//NegateFilter
		public RuleCall getNegateFilterParserRuleCall_1() { return cNegateFilterParserRuleCall_1; }
		
		//BlackWhiteFilter
		public RuleCall getBlackWhiteFilterParserRuleCall_2() { return cBlackWhiteFilterParserRuleCall_2; }
	}
	public class BlackWhiteFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.BlackWhiteFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBlackWhiteFilterAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBWKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//BlackWhiteFilter:
		//	{BlackWhiteFilter}
		//	'b&w';
		@Override public ParserRule getRule() { return rule; }
		
		//{BlackWhiteFilter} 'b&w'
		public Group getGroup() { return cGroup; }
		
		//{BlackWhiteFilter}
		public Action getBlackWhiteFilterAction_0() { return cBlackWhiteFilterAction_0; }
		
		//'b&w'
		public Keyword getBWKeyword_1() { return cBWKeyword_1; }
	}
	public class NegateFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.NegateFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNegateFilterAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNegateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//NegateFilter:
		//	{NegateFilter}
		//	'negate';
		@Override public ParserRule getRule() { return rule; }
		
		//{NegateFilter} 'negate'
		public Group getGroup() { return cGroup; }
		
		//{NegateFilter}
		public Action getNegateFilterAction_0() { return cNegateFilterAction_0; }
		
		//'negate'
		public Keyword getNegateKeyword_1() { return cNegateKeyword_1; }
	}
	public class FlipFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.FlipFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFlipKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOrientationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOrientationAlternatives_1_0 = (Alternatives)cOrientationAssignment_1.eContents().get(0);
		private final Keyword cOrientationHKeyword_1_0_0 = (Keyword)cOrientationAlternatives_1_0.eContents().get(0);
		private final Keyword cOrientationHorizontalKeyword_1_0_1 = (Keyword)cOrientationAlternatives_1_0.eContents().get(1);
		private final Keyword cOrientationVKeyword_1_0_2 = (Keyword)cOrientationAlternatives_1_0.eContents().get(2);
		private final Keyword cOrientationVerticalKeyword_1_0_3 = (Keyword)cOrientationAlternatives_1_0.eContents().get(3);
		
		//FlipFilter:
		//	'flip' orientation=('h' | 'horizontal' | 'v' | 'vertical');
		@Override public ParserRule getRule() { return rule; }
		
		//'flip' orientation=('h' | 'horizontal' | 'v' | 'vertical')
		public Group getGroup() { return cGroup; }
		
		//'flip'
		public Keyword getFlipKeyword_0() { return cFlipKeyword_0; }
		
		//orientation=('h' | 'horizontal' | 'v' | 'vertical')
		public Assignment getOrientationAssignment_1() { return cOrientationAssignment_1; }
		
		//('h' | 'horizontal' | 'v' | 'vertical')
		public Alternatives getOrientationAlternatives_1_0() { return cOrientationAlternatives_1_0; }
		
		//'h'
		public Keyword getOrientationHKeyword_1_0_0() { return cOrientationHKeyword_1_0_0; }
		
		//'horizontal'
		public Keyword getOrientationHorizontalKeyword_1_0_1() { return cOrientationHorizontalKeyword_1_0_1; }
		
		//'v'
		public Keyword getOrientationVKeyword_1_0_2() { return cOrientationVKeyword_1_0_2; }
		
		//'vertical'
		public Keyword getOrientationVerticalKeyword_1_0_3() { return cOrientationVerticalKeyword_1_0_3; }
	}
	
	
	private final YtpModelElements pYtpModel;
	private final GeneratorInformationElements pGeneratorInformation;
	private final VideoLibraryElements pVideoLibrary;
	private final MediaElements pMedia;
	private final MediaDescriptionElements pMediaDescription;
	private final ImageDescriptionElements pImageDescription;
	private final VideoDescriptionElements pVideoDescription;
	private final VideoTextElements pVideoText;
	private final PositionElements pPosition;
	private final FilterElements pFilter;
	private final BlackWhiteFilterElements pBlackWhiteFilter;
	private final NegateFilterElements pNegateFilter;
	private final FlipFilterElements pFlipFilter;
	private final TerminalRule tLEFT_BRACKET;
	private final TerminalRule tRIGHT_BRACKET;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public YtpDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pYtpModel = new YtpModelElements();
		this.pGeneratorInformation = new GeneratorInformationElements();
		this.pVideoLibrary = new VideoLibraryElements();
		this.pMedia = new MediaElements();
		this.pMediaDescription = new MediaDescriptionElements();
		this.pImageDescription = new ImageDescriptionElements();
		this.pVideoDescription = new VideoDescriptionElements();
		this.pVideoText = new VideoTextElements();
		this.pPosition = new PositionElements();
		this.pFilter = new FilterElements();
		this.pBlackWhiteFilter = new BlackWhiteFilterElements();
		this.pNegateFilter = new NegateFilterElements();
		this.pFlipFilter = new FlipFilterElements();
		this.tLEFT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.LEFT_BRACKET");
		this.tRIGHT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.ytpdsl.YtpDsl.RIGHT_BRACKET");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.ytpdsl.YtpDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//YtpModel:
	//	information=GeneratorInformation?
	//	medias+=Media+;
	public YtpModelElements getYtpModelAccess() {
		return pYtpModel;
	}
	
	public ParserRule getYtpModelRule() {
		return getYtpModelAccess().getRule();
	}
	
	//GeneratorInformation:
	//	{GeneratorInformation} ('@author' authorName=STRING) ('@version' version=STRING)? ('@creation' creationDate=STRING)?
	//	('FFMPEG_PATH' ffmpeg=STRING) ('FFPROBE_PATH' ffprobe=STRING) library+=VideoLibrary*;
	public GeneratorInformationElements getGeneratorInformationAccess() {
		return pGeneratorInformation;
	}
	
	public ParserRule getGeneratorInformationRule() {
		return getGeneratorInformationAccess().getRule();
	}
	
	//VideoLibrary:
	//	'folder' folder=STRING 'ext' extension+=STRING+;
	public VideoLibraryElements getVideoLibraryAccess() {
		return pVideoLibrary;
	}
	
	public ParserRule getVideoLibraryRule() {
		return getVideoLibraryAccess().getRule();
	}
	
	//Media:
	//	'media' description=MediaDescription;
	public MediaElements getMediaAccess() {
		return pMedia;
	}
	
	public ParserRule getMediaRule() {
		return getMediaAccess().getRule();
	}
	
	//MediaDescription:
	//	ImageDescription | VideoDescription;
	public MediaDescriptionElements getMediaDescriptionAccess() {
		return pMediaDescription;
	}
	
	public ParserRule getMediaDescriptionRule() {
		return getMediaDescriptionAccess().getRule();
	}
	
	//ImageDescription:
	//	'image' imageid=ID? location=STRING (LEFT_BRACKET ('toptext' top=STRING) ('bottomtext' bottom=STRING)
	//	RIGHT_BRACKET)?;
	public ImageDescriptionElements getImageDescriptionAccess() {
		return pImageDescription;
	}
	
	public ParserRule getImageDescriptionRule() {
		return getImageDescriptionAccess().getRule();
	}
	
	//VideoDescription:
	//	'videoseq' videoid=ID? location=STRING (LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)?
	//	('description' description=STRING)? ('filter' filter=Filter)? ('text' text=VideoText)? // incrust a text into a video
	//	RIGHT_BRACKET)?;
	public VideoDescriptionElements getVideoDescriptionAccess() {
		return pVideoDescription;
	}
	
	public ParserRule getVideoDescriptionRule() {
		return getVideoDescriptionAccess().getRule();
	}
	
	//VideoText:
	//	LEFT_BRACKET
	//	'content' content=STRING
	//	'position' position=Position ('color' color=STRING)? ('size' size=INT)?
	//	RIGHT_BRACKET;
	public VideoTextElements getVideoTextAccess() {
		return pVideoText;
	}
	
	public ParserRule getVideoTextRule() {
		return getVideoTextAccess().getRule();
	}
	
	//Position:
	//	'TOP' | 'BOTTOM' | 'CENTER';
	public PositionElements getPositionAccess() {
		return pPosition;
	}
	
	public ParserRule getPositionRule() {
		return getPositionAccess().getRule();
	}
	
	//Filter:
	//	FlipFilter | NegateFilter | BlackWhiteFilter;
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//BlackWhiteFilter:
	//	{BlackWhiteFilter}
	//	'b&w';
	public BlackWhiteFilterElements getBlackWhiteFilterAccess() {
		return pBlackWhiteFilter;
	}
	
	public ParserRule getBlackWhiteFilterRule() {
		return getBlackWhiteFilterAccess().getRule();
	}
	
	//NegateFilter:
	//	{NegateFilter}
	//	'negate';
	public NegateFilterElements getNegateFilterAccess() {
		return pNegateFilter;
	}
	
	public ParserRule getNegateFilterRule() {
		return getNegateFilterAccess().getRule();
	}
	
	//FlipFilter:
	//	'flip' orientation=('h' | 'horizontal' | 'v' | 'vertical');
	public FlipFilterElements getFlipFilterAccess() {
		return pFlipFilter;
	}
	
	public ParserRule getFlipFilterRule() {
		return getFlipFilterAccess().getRule();
	}
	
	//terminal LEFT_BRACKET:
	//	'{';
	public TerminalRule getLEFT_BRACKETRule() {
		return tLEFT_BRACKET;
	}
	
	//terminal RIGHT_BRACKET:
	//	'}';
	public TerminalRule getRIGHT_BRACKETRule() {
		return tRIGHT_BRACKET;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
