package fr.ytpdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ytpdsl.services.YtpDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalYtpDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@author'", "'@version'", "'@creation'", "'FFMPEG_PATH'", "'FFPROBE_PATH'", "'folder'", "'ext'", "'media'", "'image'", "'toptext'", "'bottomtext'", "'videoseq'", "'duration'", "'probability'", "'description'", "'filter'", "'text'", "'content'", "'position'", "'color'", "'size'", "'TOP'", "'BOTTOM'", "'CENTER'", "'b&w'", "'negate'", "'flip'", "'h'", "'horizontal'", "'v'", "'vertical'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_LEFT_BRACKET=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalYtpDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalYtpDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalYtpDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalYtpDsl.g"; }



     	private YtpDslGrammarAccess grammarAccess;

        public InternalYtpDslParser(TokenStream input, YtpDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "YtpModel";
       	}

       	@Override
       	protected YtpDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleYtpModel"
    // InternalYtpDsl.g:64:1: entryRuleYtpModel returns [EObject current=null] : iv_ruleYtpModel= ruleYtpModel EOF ;
    public final EObject entryRuleYtpModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYtpModel = null;


        try {
            // InternalYtpDsl.g:64:49: (iv_ruleYtpModel= ruleYtpModel EOF )
            // InternalYtpDsl.g:65:2: iv_ruleYtpModel= ruleYtpModel EOF
            {
             newCompositeNode(grammarAccess.getYtpModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYtpModel=ruleYtpModel();

            state._fsp--;

             current =iv_ruleYtpModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYtpModel"


    // $ANTLR start "ruleYtpModel"
    // InternalYtpDsl.g:71:1: ruleYtpModel returns [EObject current=null] : ( ( (lv_information_0_0= ruleGeneratorInformation ) )? ( (lv_medias_1_0= ruleMedia ) )+ ) ;
    public final EObject ruleYtpModel() throws RecognitionException {
        EObject current = null;

        EObject lv_information_0_0 = null;

        EObject lv_medias_1_0 = null;



        	enterRule();

        try {
            // InternalYtpDsl.g:77:2: ( ( ( (lv_information_0_0= ruleGeneratorInformation ) )? ( (lv_medias_1_0= ruleMedia ) )+ ) )
            // InternalYtpDsl.g:78:2: ( ( (lv_information_0_0= ruleGeneratorInformation ) )? ( (lv_medias_1_0= ruleMedia ) )+ )
            {
            // InternalYtpDsl.g:78:2: ( ( (lv_information_0_0= ruleGeneratorInformation ) )? ( (lv_medias_1_0= ruleMedia ) )+ )
            // InternalYtpDsl.g:79:3: ( (lv_information_0_0= ruleGeneratorInformation ) )? ( (lv_medias_1_0= ruleMedia ) )+
            {
            // InternalYtpDsl.g:79:3: ( (lv_information_0_0= ruleGeneratorInformation ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalYtpDsl.g:80:4: (lv_information_0_0= ruleGeneratorInformation )
                    {
                    // InternalYtpDsl.g:80:4: (lv_information_0_0= ruleGeneratorInformation )
                    // InternalYtpDsl.g:81:5: lv_information_0_0= ruleGeneratorInformation
                    {

                    					newCompositeNode(grammarAccess.getYtpModelAccess().getInformationGeneratorInformationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_information_0_0=ruleGeneratorInformation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getYtpModelRule());
                    					}
                    					set(
                    						current,
                    						"information",
                    						lv_information_0_0,
                    						"fr.ytpdsl.YtpDsl.GeneratorInformation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalYtpDsl.g:98:3: ( (lv_medias_1_0= ruleMedia ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalYtpDsl.g:99:4: (lv_medias_1_0= ruleMedia )
            	    {
            	    // InternalYtpDsl.g:99:4: (lv_medias_1_0= ruleMedia )
            	    // InternalYtpDsl.g:100:5: lv_medias_1_0= ruleMedia
            	    {

            	    					newCompositeNode(grammarAccess.getYtpModelAccess().getMediasMediaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_medias_1_0=ruleMedia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getYtpModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"medias",
            	    						lv_medias_1_0,
            	    						"fr.ytpdsl.YtpDsl.Media");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYtpModel"


    // $ANTLR start "entryRuleGeneratorInformation"
    // InternalYtpDsl.g:121:1: entryRuleGeneratorInformation returns [EObject current=null] : iv_ruleGeneratorInformation= ruleGeneratorInformation EOF ;
    public final EObject entryRuleGeneratorInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorInformation = null;


        try {
            // InternalYtpDsl.g:121:61: (iv_ruleGeneratorInformation= ruleGeneratorInformation EOF )
            // InternalYtpDsl.g:122:2: iv_ruleGeneratorInformation= ruleGeneratorInformation EOF
            {
             newCompositeNode(grammarAccess.getGeneratorInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneratorInformation=ruleGeneratorInformation();

            state._fsp--;

             current =iv_ruleGeneratorInformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneratorInformation"


    // $ANTLR start "ruleGeneratorInformation"
    // InternalYtpDsl.g:128:1: ruleGeneratorInformation returns [EObject current=null] : ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? (otherlv_7= 'FFMPEG_PATH' ( (lv_ffmpeg_8_0= RULE_STRING ) ) ) (otherlv_9= 'FFPROBE_PATH' ( (lv_ffprobe_10_0= RULE_STRING ) ) ) ( (lv_library_11_0= ruleVideoLibrary ) )* ) ;
    public final EObject ruleGeneratorInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_authorName_2_0=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token lv_creationDate_6_0=null;
        Token otherlv_7=null;
        Token lv_ffmpeg_8_0=null;
        Token otherlv_9=null;
        Token lv_ffprobe_10_0=null;
        EObject lv_library_11_0 = null;



        	enterRule();

        try {
            // InternalYtpDsl.g:134:2: ( ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? (otherlv_7= 'FFMPEG_PATH' ( (lv_ffmpeg_8_0= RULE_STRING ) ) ) (otherlv_9= 'FFPROBE_PATH' ( (lv_ffprobe_10_0= RULE_STRING ) ) ) ( (lv_library_11_0= ruleVideoLibrary ) )* ) )
            // InternalYtpDsl.g:135:2: ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? (otherlv_7= 'FFMPEG_PATH' ( (lv_ffmpeg_8_0= RULE_STRING ) ) ) (otherlv_9= 'FFPROBE_PATH' ( (lv_ffprobe_10_0= RULE_STRING ) ) ) ( (lv_library_11_0= ruleVideoLibrary ) )* )
            {
            // InternalYtpDsl.g:135:2: ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? (otherlv_7= 'FFMPEG_PATH' ( (lv_ffmpeg_8_0= RULE_STRING ) ) ) (otherlv_9= 'FFPROBE_PATH' ( (lv_ffprobe_10_0= RULE_STRING ) ) ) ( (lv_library_11_0= ruleVideoLibrary ) )* )
            // InternalYtpDsl.g:136:3: () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? (otherlv_7= 'FFMPEG_PATH' ( (lv_ffmpeg_8_0= RULE_STRING ) ) ) (otherlv_9= 'FFPROBE_PATH' ( (lv_ffprobe_10_0= RULE_STRING ) ) ) ( (lv_library_11_0= ruleVideoLibrary ) )*
            {
            // InternalYtpDsl.g:136:3: ()
            // InternalYtpDsl.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeneratorInformationAccess().getGeneratorInformationAction_0(),
            					current);
            			

            }

            // InternalYtpDsl.g:143:3: (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) )
            // InternalYtpDsl.g:144:4: otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            				newLeafNode(otherlv_1, grammarAccess.getGeneratorInformationAccess().getAuthorKeyword_1_0());
            			
            // InternalYtpDsl.g:148:4: ( (lv_authorName_2_0= RULE_STRING ) )
            // InternalYtpDsl.g:149:5: (lv_authorName_2_0= RULE_STRING )
            {
            // InternalYtpDsl.g:149:5: (lv_authorName_2_0= RULE_STRING )
            // InternalYtpDsl.g:150:6: lv_authorName_2_0= RULE_STRING
            {
            lv_authorName_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            						newLeafNode(lv_authorName_2_0, grammarAccess.getGeneratorInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGeneratorInformationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"authorName",
            							lv_authorName_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalYtpDsl.g:167:3: (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalYtpDsl.g:168:4: otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeneratorInformationAccess().getVersionKeyword_2_0());
                    			
                    // InternalYtpDsl.g:172:4: ( (lv_version_4_0= RULE_STRING ) )
                    // InternalYtpDsl.g:173:5: (lv_version_4_0= RULE_STRING )
                    {
                    // InternalYtpDsl.g:173:5: (lv_version_4_0= RULE_STRING )
                    // InternalYtpDsl.g:174:6: lv_version_4_0= RULE_STRING
                    {
                    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_version_4_0, grammarAccess.getGeneratorInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneratorInformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYtpDsl.g:191:3: (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalYtpDsl.g:192:4: otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeneratorInformationAccess().getCreationKeyword_3_0());
                    			
                    // InternalYtpDsl.g:196:4: ( (lv_creationDate_6_0= RULE_STRING ) )
                    // InternalYtpDsl.g:197:5: (lv_creationDate_6_0= RULE_STRING )
                    {
                    // InternalYtpDsl.g:197:5: (lv_creationDate_6_0= RULE_STRING )
                    // InternalYtpDsl.g:198:6: lv_creationDate_6_0= RULE_STRING
                    {
                    lv_creationDate_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_creationDate_6_0, grammarAccess.getGeneratorInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneratorInformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"creationDate",
                    							lv_creationDate_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYtpDsl.g:215:3: (otherlv_7= 'FFMPEG_PATH' ( (lv_ffmpeg_8_0= RULE_STRING ) ) )
            // InternalYtpDsl.g:216:4: otherlv_7= 'FFMPEG_PATH' ( (lv_ffmpeg_8_0= RULE_STRING ) )
            {
            otherlv_7=(Token)match(input,16,FOLLOW_5); 

            				newLeafNode(otherlv_7, grammarAccess.getGeneratorInformationAccess().getFFMPEG_PATHKeyword_4_0());
            			
            // InternalYtpDsl.g:220:4: ( (lv_ffmpeg_8_0= RULE_STRING ) )
            // InternalYtpDsl.g:221:5: (lv_ffmpeg_8_0= RULE_STRING )
            {
            // InternalYtpDsl.g:221:5: (lv_ffmpeg_8_0= RULE_STRING )
            // InternalYtpDsl.g:222:6: lv_ffmpeg_8_0= RULE_STRING
            {
            lv_ffmpeg_8_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            						newLeafNode(lv_ffmpeg_8_0, grammarAccess.getGeneratorInformationAccess().getFfmpegSTRINGTerminalRuleCall_4_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGeneratorInformationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"ffmpeg",
            							lv_ffmpeg_8_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalYtpDsl.g:239:3: (otherlv_9= 'FFPROBE_PATH' ( (lv_ffprobe_10_0= RULE_STRING ) ) )
            // InternalYtpDsl.g:240:4: otherlv_9= 'FFPROBE_PATH' ( (lv_ffprobe_10_0= RULE_STRING ) )
            {
            otherlv_9=(Token)match(input,17,FOLLOW_5); 

            				newLeafNode(otherlv_9, grammarAccess.getGeneratorInformationAccess().getFFPROBE_PATHKeyword_5_0());
            			
            // InternalYtpDsl.g:244:4: ( (lv_ffprobe_10_0= RULE_STRING ) )
            // InternalYtpDsl.g:245:5: (lv_ffprobe_10_0= RULE_STRING )
            {
            // InternalYtpDsl.g:245:5: (lv_ffprobe_10_0= RULE_STRING )
            // InternalYtpDsl.g:246:6: lv_ffprobe_10_0= RULE_STRING
            {
            lv_ffprobe_10_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            						newLeafNode(lv_ffprobe_10_0, grammarAccess.getGeneratorInformationAccess().getFfprobeSTRINGTerminalRuleCall_5_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGeneratorInformationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"ffprobe",
            							lv_ffprobe_10_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalYtpDsl.g:263:3: ( (lv_library_11_0= ruleVideoLibrary ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalYtpDsl.g:264:4: (lv_library_11_0= ruleVideoLibrary )
            	    {
            	    // InternalYtpDsl.g:264:4: (lv_library_11_0= ruleVideoLibrary )
            	    // InternalYtpDsl.g:265:5: lv_library_11_0= ruleVideoLibrary
            	    {

            	    					newCompositeNode(grammarAccess.getGeneratorInformationAccess().getLibraryVideoLibraryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_library_11_0=ruleVideoLibrary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneratorInformationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"library",
            	    						lv_library_11_0,
            	    						"fr.ytpdsl.YtpDsl.VideoLibrary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneratorInformation"


    // $ANTLR start "entryRuleVideoLibrary"
    // InternalYtpDsl.g:286:1: entryRuleVideoLibrary returns [EObject current=null] : iv_ruleVideoLibrary= ruleVideoLibrary EOF ;
    public final EObject entryRuleVideoLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoLibrary = null;


        try {
            // InternalYtpDsl.g:286:53: (iv_ruleVideoLibrary= ruleVideoLibrary EOF )
            // InternalYtpDsl.g:287:2: iv_ruleVideoLibrary= ruleVideoLibrary EOF
            {
             newCompositeNode(grammarAccess.getVideoLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoLibrary=ruleVideoLibrary();

            state._fsp--;

             current =iv_ruleVideoLibrary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoLibrary"


    // $ANTLR start "ruleVideoLibrary"
    // InternalYtpDsl.g:293:1: ruleVideoLibrary returns [EObject current=null] : (otherlv_0= 'folder' ( (lv_folder_1_0= RULE_STRING ) ) otherlv_2= 'ext' ( (lv_extension_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleVideoLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_folder_1_0=null;
        Token otherlv_2=null;
        Token lv_extension_3_0=null;


        	enterRule();

        try {
            // InternalYtpDsl.g:299:2: ( (otherlv_0= 'folder' ( (lv_folder_1_0= RULE_STRING ) ) otherlv_2= 'ext' ( (lv_extension_3_0= RULE_STRING ) )+ ) )
            // InternalYtpDsl.g:300:2: (otherlv_0= 'folder' ( (lv_folder_1_0= RULE_STRING ) ) otherlv_2= 'ext' ( (lv_extension_3_0= RULE_STRING ) )+ )
            {
            // InternalYtpDsl.g:300:2: (otherlv_0= 'folder' ( (lv_folder_1_0= RULE_STRING ) ) otherlv_2= 'ext' ( (lv_extension_3_0= RULE_STRING ) )+ )
            // InternalYtpDsl.g:301:3: otherlv_0= 'folder' ( (lv_folder_1_0= RULE_STRING ) ) otherlv_2= 'ext' ( (lv_extension_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoLibraryAccess().getFolderKeyword_0());
            		
            // InternalYtpDsl.g:305:3: ( (lv_folder_1_0= RULE_STRING ) )
            // InternalYtpDsl.g:306:4: (lv_folder_1_0= RULE_STRING )
            {
            // InternalYtpDsl.g:306:4: (lv_folder_1_0= RULE_STRING )
            // InternalYtpDsl.g:307:5: lv_folder_1_0= RULE_STRING
            {
            lv_folder_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_folder_1_0, grammarAccess.getVideoLibraryAccess().getFolderSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"folder",
            						lv_folder_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoLibraryAccess().getExtKeyword_2());
            		
            // InternalYtpDsl.g:327:3: ( (lv_extension_3_0= RULE_STRING ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalYtpDsl.g:328:4: (lv_extension_3_0= RULE_STRING )
            	    {
            	    // InternalYtpDsl.g:328:4: (lv_extension_3_0= RULE_STRING )
            	    // InternalYtpDsl.g:329:5: lv_extension_3_0= RULE_STRING
            	    {
            	    lv_extension_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_extension_3_0, grammarAccess.getVideoLibraryAccess().getExtensionSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVideoLibraryRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"extension",
            	    						lv_extension_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoLibrary"


    // $ANTLR start "entryRuleMedia"
    // InternalYtpDsl.g:349:1: entryRuleMedia returns [EObject current=null] : iv_ruleMedia= ruleMedia EOF ;
    public final EObject entryRuleMedia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedia = null;


        try {
            // InternalYtpDsl.g:349:46: (iv_ruleMedia= ruleMedia EOF )
            // InternalYtpDsl.g:350:2: iv_ruleMedia= ruleMedia EOF
            {
             newCompositeNode(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMedia=ruleMedia();

            state._fsp--;

             current =iv_ruleMedia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // InternalYtpDsl.g:356:1: ruleMedia returns [EObject current=null] : (otherlv_0= 'media' ( (lv_description_1_0= ruleMediaDescription ) ) ) ;
    public final EObject ruleMedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalYtpDsl.g:362:2: ( (otherlv_0= 'media' ( (lv_description_1_0= ruleMediaDescription ) ) ) )
            // InternalYtpDsl.g:363:2: (otherlv_0= 'media' ( (lv_description_1_0= ruleMediaDescription ) ) )
            {
            // InternalYtpDsl.g:363:2: (otherlv_0= 'media' ( (lv_description_1_0= ruleMediaDescription ) ) )
            // InternalYtpDsl.g:364:3: otherlv_0= 'media' ( (lv_description_1_0= ruleMediaDescription ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0());
            		
            // InternalYtpDsl.g:368:3: ( (lv_description_1_0= ruleMediaDescription ) )
            // InternalYtpDsl.g:369:4: (lv_description_1_0= ruleMediaDescription )
            {
            // InternalYtpDsl.g:369:4: (lv_description_1_0= ruleMediaDescription )
            // InternalYtpDsl.g:370:5: lv_description_1_0= ruleMediaDescription
            {

            					newCompositeNode(grammarAccess.getMediaAccess().getDescriptionMediaDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_1_0=ruleMediaDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMediaRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_1_0,
            						"fr.ytpdsl.YtpDsl.MediaDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleMediaDescription"
    // InternalYtpDsl.g:391:1: entryRuleMediaDescription returns [EObject current=null] : iv_ruleMediaDescription= ruleMediaDescription EOF ;
    public final EObject entryRuleMediaDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaDescription = null;


        try {
            // InternalYtpDsl.g:391:57: (iv_ruleMediaDescription= ruleMediaDescription EOF )
            // InternalYtpDsl.g:392:2: iv_ruleMediaDescription= ruleMediaDescription EOF
            {
             newCompositeNode(grammarAccess.getMediaDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMediaDescription=ruleMediaDescription();

            state._fsp--;

             current =iv_ruleMediaDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaDescription"


    // $ANTLR start "ruleMediaDescription"
    // InternalYtpDsl.g:398:1: ruleMediaDescription returns [EObject current=null] : (this_ImageDescription_0= ruleImageDescription | this_VideoDescription_1= ruleVideoDescription ) ;
    public final EObject ruleMediaDescription() throws RecognitionException {
        EObject current = null;

        EObject this_ImageDescription_0 = null;

        EObject this_VideoDescription_1 = null;



        	enterRule();

        try {
            // InternalYtpDsl.g:404:2: ( (this_ImageDescription_0= ruleImageDescription | this_VideoDescription_1= ruleVideoDescription ) )
            // InternalYtpDsl.g:405:2: (this_ImageDescription_0= ruleImageDescription | this_VideoDescription_1= ruleVideoDescription )
            {
            // InternalYtpDsl.g:405:2: (this_ImageDescription_0= ruleImageDescription | this_VideoDescription_1= ruleVideoDescription )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalYtpDsl.g:406:3: this_ImageDescription_0= ruleImageDescription
                    {

                    			newCompositeNode(grammarAccess.getMediaDescriptionAccess().getImageDescriptionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageDescription_0=ruleImageDescription();

                    state._fsp--;


                    			current = this_ImageDescription_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:415:3: this_VideoDescription_1= ruleVideoDescription
                    {

                    			newCompositeNode(grammarAccess.getMediaDescriptionAccess().getVideoDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VideoDescription_1=ruleVideoDescription();

                    state._fsp--;


                    			current = this_VideoDescription_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaDescription"


    // $ANTLR start "entryRuleImageDescription"
    // InternalYtpDsl.g:427:1: entryRuleImageDescription returns [EObject current=null] : iv_ruleImageDescription= ruleImageDescription EOF ;
    public final EObject entryRuleImageDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDescription = null;


        try {
            // InternalYtpDsl.g:427:57: (iv_ruleImageDescription= ruleImageDescription EOF )
            // InternalYtpDsl.g:428:2: iv_ruleImageDescription= ruleImageDescription EOF
            {
             newCompositeNode(grammarAccess.getImageDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageDescription=ruleImageDescription();

            state._fsp--;

             current =iv_ruleImageDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageDescription"


    // $ANTLR start "ruleImageDescription"
    // InternalYtpDsl.g:434:1: ruleImageDescription returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? ) ;
    public final EObject ruleImageDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_imageid_1_0=null;
        Token lv_location_2_0=null;
        Token this_LEFT_BRACKET_3=null;
        Token otherlv_4=null;
        Token lv_top_5_0=null;
        Token otherlv_6=null;
        Token lv_bottom_7_0=null;
        Token this_RIGHT_BRACKET_8=null;


        	enterRule();

        try {
            // InternalYtpDsl.g:440:2: ( (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? ) )
            // InternalYtpDsl.g:441:2: (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? )
            {
            // InternalYtpDsl.g:441:2: (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? )
            // InternalYtpDsl.g:442:3: otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getImageDescriptionAccess().getImageKeyword_0());
            		
            // InternalYtpDsl.g:446:3: ( (lv_imageid_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalYtpDsl.g:447:4: (lv_imageid_1_0= RULE_ID )
                    {
                    // InternalYtpDsl.g:447:4: (lv_imageid_1_0= RULE_ID )
                    // InternalYtpDsl.g:448:5: lv_imageid_1_0= RULE_ID
                    {
                    lv_imageid_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_imageid_1_0, grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImageDescriptionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"imageid",
                    						lv_imageid_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalYtpDsl.g:464:3: ( (lv_location_2_0= RULE_STRING ) )
            // InternalYtpDsl.g:465:4: (lv_location_2_0= RULE_STRING )
            {
            // InternalYtpDsl.g:465:4: (lv_location_2_0= RULE_STRING )
            // InternalYtpDsl.g:466:5: lv_location_2_0= RULE_STRING
            {
            lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_location_2_0, grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalYtpDsl.g:482:3: (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LEFT_BRACKET) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalYtpDsl.g:483:4: this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_16); 

                    				newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0());
                    			
                    // InternalYtpDsl.g:487:4: (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) )
                    // InternalYtpDsl.g:488:5: otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0());
                    				
                    // InternalYtpDsl.g:492:5: ( (lv_top_5_0= RULE_STRING ) )
                    // InternalYtpDsl.g:493:6: (lv_top_5_0= RULE_STRING )
                    {
                    // InternalYtpDsl.g:493:6: (lv_top_5_0= RULE_STRING )
                    // InternalYtpDsl.g:494:7: lv_top_5_0= RULE_STRING
                    {
                    lv_top_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    							newLeafNode(lv_top_5_0, grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImageDescriptionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"top",
                    								lv_top_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }

                    // InternalYtpDsl.g:511:4: (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) )
                    // InternalYtpDsl.g:512:5: otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0());
                    				
                    // InternalYtpDsl.g:516:5: ( (lv_bottom_7_0= RULE_STRING ) )
                    // InternalYtpDsl.g:517:6: (lv_bottom_7_0= RULE_STRING )
                    {
                    // InternalYtpDsl.g:517:6: (lv_bottom_7_0= RULE_STRING )
                    // InternalYtpDsl.g:518:7: lv_bottom_7_0= RULE_STRING
                    {
                    lv_bottom_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    							newLeafNode(lv_bottom_7_0, grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImageDescriptionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"bottom",
                    								lv_bottom_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }

                    this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_BRACKET_8, grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageDescription"


    // $ANTLR start "entryRuleVideoDescription"
    // InternalYtpDsl.g:544:1: entryRuleVideoDescription returns [EObject current=null] : iv_ruleVideoDescription= ruleVideoDescription EOF ;
    public final EObject entryRuleVideoDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoDescription = null;


        try {
            // InternalYtpDsl.g:544:57: (iv_ruleVideoDescription= ruleVideoDescription EOF )
            // InternalYtpDsl.g:545:2: iv_ruleVideoDescription= ruleVideoDescription EOF
            {
             newCompositeNode(grammarAccess.getVideoDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoDescription=ruleVideoDescription();

            state._fsp--;

             current =iv_ruleVideoDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoDescription"


    // $ANTLR start "ruleVideoDescription"
    // InternalYtpDsl.g:551:1: ruleVideoDescription returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? ) ;
    public final EObject ruleVideoDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_videoid_1_0=null;
        Token lv_location_2_0=null;
        Token this_LEFT_BRACKET_3=null;
        Token otherlv_4=null;
        Token lv_duration_5_0=null;
        Token otherlv_6=null;
        Token lv_probability_7_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_RIGHT_BRACKET_14=null;
        EObject lv_filter_11_0 = null;

        EObject lv_text_13_0 = null;



        	enterRule();

        try {
            // InternalYtpDsl.g:557:2: ( (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? ) )
            // InternalYtpDsl.g:558:2: (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? )
            {
            // InternalYtpDsl.g:558:2: (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? )
            // InternalYtpDsl.g:559:3: otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0());
            		
            // InternalYtpDsl.g:563:3: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalYtpDsl.g:564:4: (lv_videoid_1_0= RULE_ID )
                    {
                    // InternalYtpDsl.g:564:4: (lv_videoid_1_0= RULE_ID )
                    // InternalYtpDsl.g:565:5: lv_videoid_1_0= RULE_ID
                    {
                    lv_videoid_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_videoid_1_0, grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVideoDescriptionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"videoid",
                    						lv_videoid_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalYtpDsl.g:581:3: ( (lv_location_2_0= RULE_STRING ) )
            // InternalYtpDsl.g:582:4: (lv_location_2_0= RULE_STRING )
            {
            // InternalYtpDsl.g:582:4: (lv_location_2_0= RULE_STRING )
            // InternalYtpDsl.g:583:5: lv_location_2_0= RULE_STRING
            {
            lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_location_2_0, grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalYtpDsl.g:599:3: (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LEFT_BRACKET) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalYtpDsl.g:600:4: this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_19); 

                    				newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0());
                    			
                    // InternalYtpDsl.g:604:4: (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalYtpDsl.g:605:5: otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_20); 

                            					newLeafNode(otherlv_4, grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0());
                            				
                            // InternalYtpDsl.g:609:5: ( (lv_duration_5_0= RULE_INT ) )
                            // InternalYtpDsl.g:610:6: (lv_duration_5_0= RULE_INT )
                            {
                            // InternalYtpDsl.g:610:6: (lv_duration_5_0= RULE_INT )
                            // InternalYtpDsl.g:611:7: lv_duration_5_0= RULE_INT
                            {
                            lv_duration_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                            							newLeafNode(lv_duration_5_0, grammarAccess.getVideoDescriptionAccess().getDurationINTTerminalRuleCall_3_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"duration",
                            								lv_duration_5_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalYtpDsl.g:628:4: (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalYtpDsl.g:629:5: otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) )
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_20); 

                            					newLeafNode(otherlv_6, grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0());
                            				
                            // InternalYtpDsl.g:633:5: ( (lv_probability_7_0= RULE_INT ) )
                            // InternalYtpDsl.g:634:6: (lv_probability_7_0= RULE_INT )
                            {
                            // InternalYtpDsl.g:634:6: (lv_probability_7_0= RULE_INT )
                            // InternalYtpDsl.g:635:7: lv_probability_7_0= RULE_INT
                            {
                            lv_probability_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                            							newLeafNode(lv_probability_7_0, grammarAccess.getVideoDescriptionAccess().getProbabilityINTTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"probability",
                            								lv_probability_7_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalYtpDsl.g:652:4: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalYtpDsl.g:653:5: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_5); 

                            					newLeafNode(otherlv_8, grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0());
                            				
                            // InternalYtpDsl.g:657:5: ( (lv_description_9_0= RULE_STRING ) )
                            // InternalYtpDsl.g:658:6: (lv_description_9_0= RULE_STRING )
                            {
                            // InternalYtpDsl.g:658:6: (lv_description_9_0= RULE_STRING )
                            // InternalYtpDsl.g:659:7: lv_description_9_0= RULE_STRING
                            {
                            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                            							newLeafNode(lv_description_9_0, grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"description",
                            								lv_description_9_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalYtpDsl.g:676:4: (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalYtpDsl.g:677:5: otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) )
                            {
                            otherlv_10=(Token)match(input,28,FOLLOW_24); 

                            					newLeafNode(otherlv_10, grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0());
                            				
                            // InternalYtpDsl.g:681:5: ( (lv_filter_11_0= ruleFilter ) )
                            // InternalYtpDsl.g:682:6: (lv_filter_11_0= ruleFilter )
                            {
                            // InternalYtpDsl.g:682:6: (lv_filter_11_0= ruleFilter )
                            // InternalYtpDsl.g:683:7: lv_filter_11_0= ruleFilter
                            {

                            							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_filter_11_0=ruleFilter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
                            							}
                            							set(
                            								current,
                            								"filter",
                            								lv_filter_11_0,
                            								"fr.ytpdsl.YtpDsl.Filter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalYtpDsl.g:701:4: (otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==29) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalYtpDsl.g:702:5: otherlv_12= 'text' ( (lv_text_13_0= ruleVideoText ) )
                            {
                            otherlv_12=(Token)match(input,29,FOLLOW_26); 

                            					newLeafNode(otherlv_12, grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0());
                            				
                            // InternalYtpDsl.g:706:5: ( (lv_text_13_0= ruleVideoText ) )
                            // InternalYtpDsl.g:707:6: (lv_text_13_0= ruleVideoText )
                            {
                            // InternalYtpDsl.g:707:6: (lv_text_13_0= ruleVideoText )
                            // InternalYtpDsl.g:708:7: lv_text_13_0= ruleVideoText
                            {

                            							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getTextVideoTextParserRuleCall_3_5_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_text_13_0=ruleVideoText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
                            							}
                            							set(
                            								current,
                            								"text",
                            								lv_text_13_0,
                            								"fr.ytpdsl.YtpDsl.VideoText");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_RIGHT_BRACKET_14=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_BRACKET_14, grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoDescription"


    // $ANTLR start "entryRuleVideoText"
    // InternalYtpDsl.g:735:1: entryRuleVideoText returns [EObject current=null] : iv_ruleVideoText= ruleVideoText EOF ;
    public final EObject entryRuleVideoText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoText = null;


        try {
            // InternalYtpDsl.g:735:50: (iv_ruleVideoText= ruleVideoText EOF )
            // InternalYtpDsl.g:736:2: iv_ruleVideoText= ruleVideoText EOF
            {
             newCompositeNode(grammarAccess.getVideoTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoText=ruleVideoText();

            state._fsp--;

             current =iv_ruleVideoText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoText"


    // $ANTLR start "ruleVideoText"
    // InternalYtpDsl.g:742:1: ruleVideoText returns [EObject current=null] : (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleVideoText() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_color_6_0=null;
        Token otherlv_7=null;
        Token lv_size_8_0=null;
        Token this_RIGHT_BRACKET_9=null;
        AntlrDatatypeRuleToken lv_position_4_0 = null;



        	enterRule();

        try {
            // InternalYtpDsl.g:748:2: ( (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) )
            // InternalYtpDsl.g:749:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            {
            // InternalYtpDsl.g:749:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            // InternalYtpDsl.g:750:3: this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET
            {
            this_LEFT_BRACKET_0=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_27); 

            			newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getVideoTextAccess().getLEFT_BRACKETTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoTextAccess().getContentKeyword_1());
            		
            // InternalYtpDsl.g:758:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalYtpDsl.g:759:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalYtpDsl.g:759:4: (lv_content_2_0= RULE_STRING )
            // InternalYtpDsl.g:760:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_content_2_0, grammarAccess.getVideoTextAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getVideoTextAccess().getPositionKeyword_3());
            		
            // InternalYtpDsl.g:780:3: ( (lv_position_4_0= rulePosition ) )
            // InternalYtpDsl.g:781:4: (lv_position_4_0= rulePosition )
            {
            // InternalYtpDsl.g:781:4: (lv_position_4_0= rulePosition )
            // InternalYtpDsl.g:782:5: lv_position_4_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getVideoTextAccess().getPositionPositionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_position_4_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoTextRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_4_0,
            						"fr.ytpdsl.YtpDsl.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalYtpDsl.g:799:3: (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalYtpDsl.g:800:4: otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getVideoTextAccess().getColorKeyword_5_0());
                    			
                    // InternalYtpDsl.g:804:4: ( (lv_color_6_0= RULE_STRING ) )
                    // InternalYtpDsl.g:805:5: (lv_color_6_0= RULE_STRING )
                    {
                    // InternalYtpDsl.g:805:5: (lv_color_6_0= RULE_STRING )
                    // InternalYtpDsl.g:806:6: lv_color_6_0= RULE_STRING
                    {
                    lv_color_6_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    						newLeafNode(lv_color_6_0, grammarAccess.getVideoTextAccess().getColorSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVideoTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"color",
                    							lv_color_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYtpDsl.g:823:3: (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalYtpDsl.g:824:4: otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getVideoTextAccess().getSizeKeyword_6_0());
                    			
                    // InternalYtpDsl.g:828:4: ( (lv_size_8_0= RULE_INT ) )
                    // InternalYtpDsl.g:829:5: (lv_size_8_0= RULE_INT )
                    {
                    // InternalYtpDsl.g:829:5: (lv_size_8_0= RULE_INT )
                    // InternalYtpDsl.g:830:6: lv_size_8_0= RULE_INT
                    {
                    lv_size_8_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_size_8_0, grammarAccess.getVideoTextAccess().getSizeINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVideoTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            this_RIGHT_BRACKET_9=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_9, grammarAccess.getVideoTextAccess().getRIGHT_BRACKETTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoText"


    // $ANTLR start "entryRulePosition"
    // InternalYtpDsl.g:855:1: entryRulePosition returns [String current=null] : iv_rulePosition= rulePosition EOF ;
    public final String entryRulePosition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePosition = null;


        try {
            // InternalYtpDsl.g:855:48: (iv_rulePosition= rulePosition EOF )
            // InternalYtpDsl.g:856:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalYtpDsl.g:862:1: rulePosition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' ) ;
    public final AntlrDatatypeRuleToken rulePosition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalYtpDsl.g:868:2: ( (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' ) )
            // InternalYtpDsl.g:869:2: (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' )
            {
            // InternalYtpDsl.g:869:2: (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalYtpDsl.g:870:3: kw= 'TOP'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getTOPKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:876:3: kw= 'BOTTOM'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getBOTTOMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalYtpDsl.g:882:3: kw= 'CENTER'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getCENTERKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleFilter"
    // InternalYtpDsl.g:891:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalYtpDsl.g:891:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalYtpDsl.g:892:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalYtpDsl.g:898:1: ruleFilter returns [EObject current=null] : (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_FlipFilter_0 = null;

        EObject this_NegateFilter_1 = null;

        EObject this_BlackWhiteFilter_2 = null;



        	enterRule();

        try {
            // InternalYtpDsl.g:904:2: ( (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter ) )
            // InternalYtpDsl.g:905:2: (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter )
            {
            // InternalYtpDsl.g:905:2: (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case 37:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalYtpDsl.g:906:3: this_FlipFilter_0= ruleFlipFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlipFilter_0=ruleFlipFilter();

                    state._fsp--;


                    			current = this_FlipFilter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:915:3: this_NegateFilter_1= ruleNegateFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegateFilter_1=ruleNegateFilter();

                    state._fsp--;


                    			current = this_NegateFilter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalYtpDsl.g:924:3: this_BlackWhiteFilter_2= ruleBlackWhiteFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlackWhiteFilter_2=ruleBlackWhiteFilter();

                    state._fsp--;


                    			current = this_BlackWhiteFilter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBlackWhiteFilter"
    // InternalYtpDsl.g:936:1: entryRuleBlackWhiteFilter returns [EObject current=null] : iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF ;
    public final EObject entryRuleBlackWhiteFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlackWhiteFilter = null;


        try {
            // InternalYtpDsl.g:936:57: (iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF )
            // InternalYtpDsl.g:937:2: iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF
            {
             newCompositeNode(grammarAccess.getBlackWhiteFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlackWhiteFilter=ruleBlackWhiteFilter();

            state._fsp--;

             current =iv_ruleBlackWhiteFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlackWhiteFilter"


    // $ANTLR start "ruleBlackWhiteFilter"
    // InternalYtpDsl.g:943:1: ruleBlackWhiteFilter returns [EObject current=null] : ( () otherlv_1= 'b&w' ) ;
    public final EObject ruleBlackWhiteFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalYtpDsl.g:949:2: ( ( () otherlv_1= 'b&w' ) )
            // InternalYtpDsl.g:950:2: ( () otherlv_1= 'b&w' )
            {
            // InternalYtpDsl.g:950:2: ( () otherlv_1= 'b&w' )
            // InternalYtpDsl.g:951:3: () otherlv_1= 'b&w'
            {
            // InternalYtpDsl.g:951:3: ()
            // InternalYtpDsl.g:952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlackWhiteFilter"


    // $ANTLR start "entryRuleNegateFilter"
    // InternalYtpDsl.g:966:1: entryRuleNegateFilter returns [EObject current=null] : iv_ruleNegateFilter= ruleNegateFilter EOF ;
    public final EObject entryRuleNegateFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegateFilter = null;


        try {
            // InternalYtpDsl.g:966:53: (iv_ruleNegateFilter= ruleNegateFilter EOF )
            // InternalYtpDsl.g:967:2: iv_ruleNegateFilter= ruleNegateFilter EOF
            {
             newCompositeNode(grammarAccess.getNegateFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegateFilter=ruleNegateFilter();

            state._fsp--;

             current =iv_ruleNegateFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegateFilter"


    // $ANTLR start "ruleNegateFilter"
    // InternalYtpDsl.g:973:1: ruleNegateFilter returns [EObject current=null] : ( () otherlv_1= 'negate' ) ;
    public final EObject ruleNegateFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalYtpDsl.g:979:2: ( ( () otherlv_1= 'negate' ) )
            // InternalYtpDsl.g:980:2: ( () otherlv_1= 'negate' )
            {
            // InternalYtpDsl.g:980:2: ( () otherlv_1= 'negate' )
            // InternalYtpDsl.g:981:3: () otherlv_1= 'negate'
            {
            // InternalYtpDsl.g:981:3: ()
            // InternalYtpDsl.g:982:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNegateFilterAccess().getNegateFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNegateFilterAccess().getNegateKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegateFilter"


    // $ANTLR start "entryRuleFlipFilter"
    // InternalYtpDsl.g:996:1: entryRuleFlipFilter returns [EObject current=null] : iv_ruleFlipFilter= ruleFlipFilter EOF ;
    public final EObject entryRuleFlipFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlipFilter = null;


        try {
            // InternalYtpDsl.g:996:51: (iv_ruleFlipFilter= ruleFlipFilter EOF )
            // InternalYtpDsl.g:997:2: iv_ruleFlipFilter= ruleFlipFilter EOF
            {
             newCompositeNode(grammarAccess.getFlipFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlipFilter=ruleFlipFilter();

            state._fsp--;

             current =iv_ruleFlipFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlipFilter"


    // $ANTLR start "ruleFlipFilter"
    // InternalYtpDsl.g:1003:1: ruleFlipFilter returns [EObject current=null] : (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) ) ;
    public final EObject ruleFlipFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_orientation_1_1=null;
        Token lv_orientation_1_2=null;
        Token lv_orientation_1_3=null;
        Token lv_orientation_1_4=null;


        	enterRule();

        try {
            // InternalYtpDsl.g:1009:2: ( (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) ) )
            // InternalYtpDsl.g:1010:2: (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) )
            {
            // InternalYtpDsl.g:1010:2: (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) )
            // InternalYtpDsl.g:1011:3: otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getFlipFilterAccess().getFlipKeyword_0());
            		
            // InternalYtpDsl.g:1015:3: ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) )
            // InternalYtpDsl.g:1016:4: ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) )
            {
            // InternalYtpDsl.g:1016:4: ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) )
            // InternalYtpDsl.g:1017:5: (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' )
            {
            // InternalYtpDsl.g:1017:5: (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            case 43:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalYtpDsl.g:1018:6: lv_orientation_1_1= 'h'
                    {
                    lv_orientation_1_1=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_1, grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:1029:6: lv_orientation_1_2= 'horizontal'
                    {
                    lv_orientation_1_2=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_2, grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalYtpDsl.g:1040:6: lv_orientation_1_3= 'v'
                    {
                    lv_orientation_1_3=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_3, grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalYtpDsl.g:1051:6: lv_orientation_1_4= 'vertical'
                    {
                    lv_orientation_1_4=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_4, grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_4, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlipFilter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003E000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003C000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000038000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000F0000000000L});

}