package fr.ytpdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.ytpdsl.services.YtpDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalYtpDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TOP'", "'BOTTOM'", "'CENTER'", "'h'", "'horizontal'", "'v'", "'vertical'", "'@author'", "'@version'", "'@creation'", "'FFMPEG_PATH'", "'FFPROBE_PATH'", "'folder'", "'ext'", "'media'", "'image'", "'toptext'", "'bottomtext'", "'videoseq'", "'duration'", "'probability'", "'description'", "'filter'", "'text'", "'content'", "'position'", "'color'", "'size'", "'b&w'", "'negate'", "'flip'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=5;
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
    public static final int RULE_LEFT_BRACKET=4;
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

    	public void setGrammarAccess(YtpDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleYtpModel"
    // InternalYtpDsl.g:53:1: entryRuleYtpModel : ruleYtpModel EOF ;
    public final void entryRuleYtpModel() throws RecognitionException {
        try {
            // InternalYtpDsl.g:54:1: ( ruleYtpModel EOF )
            // InternalYtpDsl.g:55:1: ruleYtpModel EOF
            {
             before(grammarAccess.getYtpModelRule()); 
            pushFollow(FOLLOW_1);
            ruleYtpModel();

            state._fsp--;

             after(grammarAccess.getYtpModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYtpModel"


    // $ANTLR start "ruleYtpModel"
    // InternalYtpDsl.g:62:1: ruleYtpModel : ( ( rule__YtpModel__Group__0 ) ) ;
    public final void ruleYtpModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:66:2: ( ( ( rule__YtpModel__Group__0 ) ) )
            // InternalYtpDsl.g:67:2: ( ( rule__YtpModel__Group__0 ) )
            {
            // InternalYtpDsl.g:67:2: ( ( rule__YtpModel__Group__0 ) )
            // InternalYtpDsl.g:68:3: ( rule__YtpModel__Group__0 )
            {
             before(grammarAccess.getYtpModelAccess().getGroup()); 
            // InternalYtpDsl.g:69:3: ( rule__YtpModel__Group__0 )
            // InternalYtpDsl.g:69:4: rule__YtpModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YtpModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYtpModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYtpModel"


    // $ANTLR start "entryRuleGeneratorInformation"
    // InternalYtpDsl.g:78:1: entryRuleGeneratorInformation : ruleGeneratorInformation EOF ;
    public final void entryRuleGeneratorInformation() throws RecognitionException {
        try {
            // InternalYtpDsl.g:79:1: ( ruleGeneratorInformation EOF )
            // InternalYtpDsl.g:80:1: ruleGeneratorInformation EOF
            {
             before(grammarAccess.getGeneratorInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneratorInformation();

            state._fsp--;

             after(grammarAccess.getGeneratorInformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneratorInformation"


    // $ANTLR start "ruleGeneratorInformation"
    // InternalYtpDsl.g:87:1: ruleGeneratorInformation : ( ( rule__GeneratorInformation__Group__0 ) ) ;
    public final void ruleGeneratorInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:91:2: ( ( ( rule__GeneratorInformation__Group__0 ) ) )
            // InternalYtpDsl.g:92:2: ( ( rule__GeneratorInformation__Group__0 ) )
            {
            // InternalYtpDsl.g:92:2: ( ( rule__GeneratorInformation__Group__0 ) )
            // InternalYtpDsl.g:93:3: ( rule__GeneratorInformation__Group__0 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getGroup()); 
            // InternalYtpDsl.g:94:3: ( rule__GeneratorInformation__Group__0 )
            // InternalYtpDsl.g:94:4: rule__GeneratorInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratorInformation"


    // $ANTLR start "entryRuleVideoLibrary"
    // InternalYtpDsl.g:103:1: entryRuleVideoLibrary : ruleVideoLibrary EOF ;
    public final void entryRuleVideoLibrary() throws RecognitionException {
        try {
            // InternalYtpDsl.g:104:1: ( ruleVideoLibrary EOF )
            // InternalYtpDsl.g:105:1: ruleVideoLibrary EOF
            {
             before(grammarAccess.getVideoLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoLibrary();

            state._fsp--;

             after(grammarAccess.getVideoLibraryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoLibrary"


    // $ANTLR start "ruleVideoLibrary"
    // InternalYtpDsl.g:112:1: ruleVideoLibrary : ( ( rule__VideoLibrary__Group__0 ) ) ;
    public final void ruleVideoLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:116:2: ( ( ( rule__VideoLibrary__Group__0 ) ) )
            // InternalYtpDsl.g:117:2: ( ( rule__VideoLibrary__Group__0 ) )
            {
            // InternalYtpDsl.g:117:2: ( ( rule__VideoLibrary__Group__0 ) )
            // InternalYtpDsl.g:118:3: ( rule__VideoLibrary__Group__0 )
            {
             before(grammarAccess.getVideoLibraryAccess().getGroup()); 
            // InternalYtpDsl.g:119:3: ( rule__VideoLibrary__Group__0 )
            // InternalYtpDsl.g:119:4: rule__VideoLibrary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoLibrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoLibrary"


    // $ANTLR start "entryRuleMedia"
    // InternalYtpDsl.g:128:1: entryRuleMedia : ruleMedia EOF ;
    public final void entryRuleMedia() throws RecognitionException {
        try {
            // InternalYtpDsl.g:129:1: ( ruleMedia EOF )
            // InternalYtpDsl.g:130:1: ruleMedia EOF
            {
             before(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_1);
            ruleMedia();

            state._fsp--;

             after(grammarAccess.getMediaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // InternalYtpDsl.g:137:1: ruleMedia : ( ( rule__Media__Group__0 ) ) ;
    public final void ruleMedia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:141:2: ( ( ( rule__Media__Group__0 ) ) )
            // InternalYtpDsl.g:142:2: ( ( rule__Media__Group__0 ) )
            {
            // InternalYtpDsl.g:142:2: ( ( rule__Media__Group__0 ) )
            // InternalYtpDsl.g:143:3: ( rule__Media__Group__0 )
            {
             before(grammarAccess.getMediaAccess().getGroup()); 
            // InternalYtpDsl.g:144:3: ( rule__Media__Group__0 )
            // InternalYtpDsl.g:144:4: rule__Media__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Media__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleMediaDescription"
    // InternalYtpDsl.g:153:1: entryRuleMediaDescription : ruleMediaDescription EOF ;
    public final void entryRuleMediaDescription() throws RecognitionException {
        try {
            // InternalYtpDsl.g:154:1: ( ruleMediaDescription EOF )
            // InternalYtpDsl.g:155:1: ruleMediaDescription EOF
            {
             before(grammarAccess.getMediaDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleMediaDescription();

            state._fsp--;

             after(grammarAccess.getMediaDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMediaDescription"


    // $ANTLR start "ruleMediaDescription"
    // InternalYtpDsl.g:162:1: ruleMediaDescription : ( ( rule__MediaDescription__Alternatives ) ) ;
    public final void ruleMediaDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:166:2: ( ( ( rule__MediaDescription__Alternatives ) ) )
            // InternalYtpDsl.g:167:2: ( ( rule__MediaDescription__Alternatives ) )
            {
            // InternalYtpDsl.g:167:2: ( ( rule__MediaDescription__Alternatives ) )
            // InternalYtpDsl.g:168:3: ( rule__MediaDescription__Alternatives )
            {
             before(grammarAccess.getMediaDescriptionAccess().getAlternatives()); 
            // InternalYtpDsl.g:169:3: ( rule__MediaDescription__Alternatives )
            // InternalYtpDsl.g:169:4: rule__MediaDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MediaDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMediaDescriptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMediaDescription"


    // $ANTLR start "entryRuleImageDescription"
    // InternalYtpDsl.g:178:1: entryRuleImageDescription : ruleImageDescription EOF ;
    public final void entryRuleImageDescription() throws RecognitionException {
        try {
            // InternalYtpDsl.g:179:1: ( ruleImageDescription EOF )
            // InternalYtpDsl.g:180:1: ruleImageDescription EOF
            {
             before(grammarAccess.getImageDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageDescription();

            state._fsp--;

             after(grammarAccess.getImageDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImageDescription"


    // $ANTLR start "ruleImageDescription"
    // InternalYtpDsl.g:187:1: ruleImageDescription : ( ( rule__ImageDescription__Group__0 ) ) ;
    public final void ruleImageDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:191:2: ( ( ( rule__ImageDescription__Group__0 ) ) )
            // InternalYtpDsl.g:192:2: ( ( rule__ImageDescription__Group__0 ) )
            {
            // InternalYtpDsl.g:192:2: ( ( rule__ImageDescription__Group__0 ) )
            // InternalYtpDsl.g:193:3: ( rule__ImageDescription__Group__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup()); 
            // InternalYtpDsl.g:194:3: ( rule__ImageDescription__Group__0 )
            // InternalYtpDsl.g:194:4: rule__ImageDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageDescription"


    // $ANTLR start "entryRuleVideoDescription"
    // InternalYtpDsl.g:203:1: entryRuleVideoDescription : ruleVideoDescription EOF ;
    public final void entryRuleVideoDescription() throws RecognitionException {
        try {
            // InternalYtpDsl.g:204:1: ( ruleVideoDescription EOF )
            // InternalYtpDsl.g:205:1: ruleVideoDescription EOF
            {
             before(grammarAccess.getVideoDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoDescription();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoDescription"


    // $ANTLR start "ruleVideoDescription"
    // InternalYtpDsl.g:212:1: ruleVideoDescription : ( ( rule__VideoDescription__Group__0 ) ) ;
    public final void ruleVideoDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:216:2: ( ( ( rule__VideoDescription__Group__0 ) ) )
            // InternalYtpDsl.g:217:2: ( ( rule__VideoDescription__Group__0 ) )
            {
            // InternalYtpDsl.g:217:2: ( ( rule__VideoDescription__Group__0 ) )
            // InternalYtpDsl.g:218:3: ( rule__VideoDescription__Group__0 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup()); 
            // InternalYtpDsl.g:219:3: ( rule__VideoDescription__Group__0 )
            // InternalYtpDsl.g:219:4: rule__VideoDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoDescription"


    // $ANTLR start "entryRuleVideoText"
    // InternalYtpDsl.g:228:1: entryRuleVideoText : ruleVideoText EOF ;
    public final void entryRuleVideoText() throws RecognitionException {
        try {
            // InternalYtpDsl.g:229:1: ( ruleVideoText EOF )
            // InternalYtpDsl.g:230:1: ruleVideoText EOF
            {
             before(grammarAccess.getVideoTextRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoText();

            state._fsp--;

             after(grammarAccess.getVideoTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoText"


    // $ANTLR start "ruleVideoText"
    // InternalYtpDsl.g:237:1: ruleVideoText : ( ( rule__VideoText__Group__0 ) ) ;
    public final void ruleVideoText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:241:2: ( ( ( rule__VideoText__Group__0 ) ) )
            // InternalYtpDsl.g:242:2: ( ( rule__VideoText__Group__0 ) )
            {
            // InternalYtpDsl.g:242:2: ( ( rule__VideoText__Group__0 ) )
            // InternalYtpDsl.g:243:3: ( rule__VideoText__Group__0 )
            {
             before(grammarAccess.getVideoTextAccess().getGroup()); 
            // InternalYtpDsl.g:244:3: ( rule__VideoText__Group__0 )
            // InternalYtpDsl.g:244:4: rule__VideoText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoText"


    // $ANTLR start "entryRulePosition"
    // InternalYtpDsl.g:253:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalYtpDsl.g:254:1: ( rulePosition EOF )
            // InternalYtpDsl.g:255:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalYtpDsl.g:262:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:266:2: ( ( ( rule__Position__Alternatives ) ) )
            // InternalYtpDsl.g:267:2: ( ( rule__Position__Alternatives ) )
            {
            // InternalYtpDsl.g:267:2: ( ( rule__Position__Alternatives ) )
            // InternalYtpDsl.g:268:3: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // InternalYtpDsl.g:269:3: ( rule__Position__Alternatives )
            // InternalYtpDsl.g:269:4: rule__Position__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Position__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleFilter"
    // InternalYtpDsl.g:278:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalYtpDsl.g:279:1: ( ruleFilter EOF )
            // InternalYtpDsl.g:280:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalYtpDsl.g:287:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:291:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalYtpDsl.g:292:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalYtpDsl.g:292:2: ( ( rule__Filter__Alternatives ) )
            // InternalYtpDsl.g:293:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalYtpDsl.g:294:3: ( rule__Filter__Alternatives )
            // InternalYtpDsl.g:294:4: rule__Filter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBlackWhiteFilter"
    // InternalYtpDsl.g:303:1: entryRuleBlackWhiteFilter : ruleBlackWhiteFilter EOF ;
    public final void entryRuleBlackWhiteFilter() throws RecognitionException {
        try {
            // InternalYtpDsl.g:304:1: ( ruleBlackWhiteFilter EOF )
            // InternalYtpDsl.g:305:1: ruleBlackWhiteFilter EOF
            {
             before(grammarAccess.getBlackWhiteFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleBlackWhiteFilter();

            state._fsp--;

             after(grammarAccess.getBlackWhiteFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlackWhiteFilter"


    // $ANTLR start "ruleBlackWhiteFilter"
    // InternalYtpDsl.g:312:1: ruleBlackWhiteFilter : ( ( rule__BlackWhiteFilter__Group__0 ) ) ;
    public final void ruleBlackWhiteFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:316:2: ( ( ( rule__BlackWhiteFilter__Group__0 ) ) )
            // InternalYtpDsl.g:317:2: ( ( rule__BlackWhiteFilter__Group__0 ) )
            {
            // InternalYtpDsl.g:317:2: ( ( rule__BlackWhiteFilter__Group__0 ) )
            // InternalYtpDsl.g:318:3: ( rule__BlackWhiteFilter__Group__0 )
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getGroup()); 
            // InternalYtpDsl.g:319:3: ( rule__BlackWhiteFilter__Group__0 )
            // InternalYtpDsl.g:319:4: rule__BlackWhiteFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlackWhiteFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlackWhiteFilter"


    // $ANTLR start "entryRuleNegateFilter"
    // InternalYtpDsl.g:328:1: entryRuleNegateFilter : ruleNegateFilter EOF ;
    public final void entryRuleNegateFilter() throws RecognitionException {
        try {
            // InternalYtpDsl.g:329:1: ( ruleNegateFilter EOF )
            // InternalYtpDsl.g:330:1: ruleNegateFilter EOF
            {
             before(grammarAccess.getNegateFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleNegateFilter();

            state._fsp--;

             after(grammarAccess.getNegateFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegateFilter"


    // $ANTLR start "ruleNegateFilter"
    // InternalYtpDsl.g:337:1: ruleNegateFilter : ( ( rule__NegateFilter__Group__0 ) ) ;
    public final void ruleNegateFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:341:2: ( ( ( rule__NegateFilter__Group__0 ) ) )
            // InternalYtpDsl.g:342:2: ( ( rule__NegateFilter__Group__0 ) )
            {
            // InternalYtpDsl.g:342:2: ( ( rule__NegateFilter__Group__0 ) )
            // InternalYtpDsl.g:343:3: ( rule__NegateFilter__Group__0 )
            {
             before(grammarAccess.getNegateFilterAccess().getGroup()); 
            // InternalYtpDsl.g:344:3: ( rule__NegateFilter__Group__0 )
            // InternalYtpDsl.g:344:4: rule__NegateFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegateFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegateFilter"


    // $ANTLR start "entryRuleFlipFilter"
    // InternalYtpDsl.g:353:1: entryRuleFlipFilter : ruleFlipFilter EOF ;
    public final void entryRuleFlipFilter() throws RecognitionException {
        try {
            // InternalYtpDsl.g:354:1: ( ruleFlipFilter EOF )
            // InternalYtpDsl.g:355:1: ruleFlipFilter EOF
            {
             before(grammarAccess.getFlipFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFlipFilter();

            state._fsp--;

             after(grammarAccess.getFlipFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlipFilter"


    // $ANTLR start "ruleFlipFilter"
    // InternalYtpDsl.g:362:1: ruleFlipFilter : ( ( rule__FlipFilter__Group__0 ) ) ;
    public final void ruleFlipFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:366:2: ( ( ( rule__FlipFilter__Group__0 ) ) )
            // InternalYtpDsl.g:367:2: ( ( rule__FlipFilter__Group__0 ) )
            {
            // InternalYtpDsl.g:367:2: ( ( rule__FlipFilter__Group__0 ) )
            // InternalYtpDsl.g:368:3: ( rule__FlipFilter__Group__0 )
            {
             before(grammarAccess.getFlipFilterAccess().getGroup()); 
            // InternalYtpDsl.g:369:3: ( rule__FlipFilter__Group__0 )
            // InternalYtpDsl.g:369:4: rule__FlipFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlipFilter"


    // $ANTLR start "rule__MediaDescription__Alternatives"
    // InternalYtpDsl.g:377:1: rule__MediaDescription__Alternatives : ( ( ruleImageDescription ) | ( ruleVideoDescription ) );
    public final void rule__MediaDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:381:1: ( ( ruleImageDescription ) | ( ruleVideoDescription ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==31) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalYtpDsl.g:382:2: ( ruleImageDescription )
                    {
                    // InternalYtpDsl.g:382:2: ( ruleImageDescription )
                    // InternalYtpDsl.g:383:3: ruleImageDescription
                    {
                     before(grammarAccess.getMediaDescriptionAccess().getImageDescriptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImageDescription();

                    state._fsp--;

                     after(grammarAccess.getMediaDescriptionAccess().getImageDescriptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:388:2: ( ruleVideoDescription )
                    {
                    // InternalYtpDsl.g:388:2: ( ruleVideoDescription )
                    // InternalYtpDsl.g:389:3: ruleVideoDescription
                    {
                     before(grammarAccess.getMediaDescriptionAccess().getVideoDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVideoDescription();

                    state._fsp--;

                     after(grammarAccess.getMediaDescriptionAccess().getVideoDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaDescription__Alternatives"


    // $ANTLR start "rule__Position__Alternatives"
    // InternalYtpDsl.g:398:1: rule__Position__Alternatives : ( ( 'TOP' ) | ( 'BOTTOM' ) | ( 'CENTER' ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:402:1: ( ( 'TOP' ) | ( 'BOTTOM' ) | ( 'CENTER' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalYtpDsl.g:403:2: ( 'TOP' )
                    {
                    // InternalYtpDsl.g:403:2: ( 'TOP' )
                    // InternalYtpDsl.g:404:3: 'TOP'
                    {
                     before(grammarAccess.getPositionAccess().getTOPKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getTOPKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:409:2: ( 'BOTTOM' )
                    {
                    // InternalYtpDsl.g:409:2: ( 'BOTTOM' )
                    // InternalYtpDsl.g:410:3: 'BOTTOM'
                    {
                     before(grammarAccess.getPositionAccess().getBOTTOMKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getBOTTOMKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalYtpDsl.g:415:2: ( 'CENTER' )
                    {
                    // InternalYtpDsl.g:415:2: ( 'CENTER' )
                    // InternalYtpDsl.g:416:3: 'CENTER'
                    {
                     before(grammarAccess.getPositionAccess().getCENTERKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getCENTERKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Alternatives"


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalYtpDsl.g:425:1: rule__Filter__Alternatives : ( ( ruleFlipFilter ) | ( ruleNegateFilter ) | ( ruleBlackWhiteFilter ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:429:1: ( ( ruleFlipFilter ) | ( ruleNegateFilter ) | ( ruleBlackWhiteFilter ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt3=1;
                }
                break;
            case 42:
                {
                alt3=2;
                }
                break;
            case 41:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalYtpDsl.g:430:2: ( ruleFlipFilter )
                    {
                    // InternalYtpDsl.g:430:2: ( ruleFlipFilter )
                    // InternalYtpDsl.g:431:3: ruleFlipFilter
                    {
                     before(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFlipFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:436:2: ( ruleNegateFilter )
                    {
                    // InternalYtpDsl.g:436:2: ( ruleNegateFilter )
                    // InternalYtpDsl.g:437:3: ruleNegateFilter
                    {
                     before(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNegateFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalYtpDsl.g:442:2: ( ruleBlackWhiteFilter )
                    {
                    // InternalYtpDsl.g:442:2: ( ruleBlackWhiteFilter )
                    // InternalYtpDsl.g:443:3: ruleBlackWhiteFilter
                    {
                     before(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBlackWhiteFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Alternatives"


    // $ANTLR start "rule__FlipFilter__OrientationAlternatives_1_0"
    // InternalYtpDsl.g:452:1: rule__FlipFilter__OrientationAlternatives_1_0 : ( ( 'h' ) | ( 'horizontal' ) | ( 'v' ) | ( 'vertical' ) );
    public final void rule__FlipFilter__OrientationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:456:1: ( ( 'h' ) | ( 'horizontal' ) | ( 'v' ) | ( 'vertical' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalYtpDsl.g:457:2: ( 'h' )
                    {
                    // InternalYtpDsl.g:457:2: ( 'h' )
                    // InternalYtpDsl.g:458:3: 'h'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalYtpDsl.g:463:2: ( 'horizontal' )
                    {
                    // InternalYtpDsl.g:463:2: ( 'horizontal' )
                    // InternalYtpDsl.g:464:3: 'horizontal'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalYtpDsl.g:469:2: ( 'v' )
                    {
                    // InternalYtpDsl.g:469:2: ( 'v' )
                    // InternalYtpDsl.g:470:3: 'v'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalYtpDsl.g:475:2: ( 'vertical' )
                    {
                    // InternalYtpDsl.g:475:2: ( 'vertical' )
                    // InternalYtpDsl.g:476:3: 'vertical'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__OrientationAlternatives_1_0"


    // $ANTLR start "rule__YtpModel__Group__0"
    // InternalYtpDsl.g:485:1: rule__YtpModel__Group__0 : rule__YtpModel__Group__0__Impl rule__YtpModel__Group__1 ;
    public final void rule__YtpModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:489:1: ( rule__YtpModel__Group__0__Impl rule__YtpModel__Group__1 )
            // InternalYtpDsl.g:490:2: rule__YtpModel__Group__0__Impl rule__YtpModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__YtpModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__YtpModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YtpModel__Group__0"


    // $ANTLR start "rule__YtpModel__Group__0__Impl"
    // InternalYtpDsl.g:497:1: rule__YtpModel__Group__0__Impl : ( ( rule__YtpModel__InformationAssignment_0 )? ) ;
    public final void rule__YtpModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:501:1: ( ( ( rule__YtpModel__InformationAssignment_0 )? ) )
            // InternalYtpDsl.g:502:1: ( ( rule__YtpModel__InformationAssignment_0 )? )
            {
            // InternalYtpDsl.g:502:1: ( ( rule__YtpModel__InformationAssignment_0 )? )
            // InternalYtpDsl.g:503:2: ( rule__YtpModel__InformationAssignment_0 )?
            {
             before(grammarAccess.getYtpModelAccess().getInformationAssignment_0()); 
            // InternalYtpDsl.g:504:2: ( rule__YtpModel__InformationAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalYtpDsl.g:504:3: rule__YtpModel__InformationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YtpModel__InformationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getYtpModelAccess().getInformationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YtpModel__Group__0__Impl"


    // $ANTLR start "rule__YtpModel__Group__1"
    // InternalYtpDsl.g:512:1: rule__YtpModel__Group__1 : rule__YtpModel__Group__1__Impl ;
    public final void rule__YtpModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:516:1: ( rule__YtpModel__Group__1__Impl )
            // InternalYtpDsl.g:517:2: rule__YtpModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YtpModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YtpModel__Group__1"


    // $ANTLR start "rule__YtpModel__Group__1__Impl"
    // InternalYtpDsl.g:523:1: rule__YtpModel__Group__1__Impl : ( ( ( rule__YtpModel__MediasAssignment_1 ) ) ( ( rule__YtpModel__MediasAssignment_1 )* ) ) ;
    public final void rule__YtpModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:527:1: ( ( ( ( rule__YtpModel__MediasAssignment_1 ) ) ( ( rule__YtpModel__MediasAssignment_1 )* ) ) )
            // InternalYtpDsl.g:528:1: ( ( ( rule__YtpModel__MediasAssignment_1 ) ) ( ( rule__YtpModel__MediasAssignment_1 )* ) )
            {
            // InternalYtpDsl.g:528:1: ( ( ( rule__YtpModel__MediasAssignment_1 ) ) ( ( rule__YtpModel__MediasAssignment_1 )* ) )
            // InternalYtpDsl.g:529:2: ( ( rule__YtpModel__MediasAssignment_1 ) ) ( ( rule__YtpModel__MediasAssignment_1 )* )
            {
            // InternalYtpDsl.g:529:2: ( ( rule__YtpModel__MediasAssignment_1 ) )
            // InternalYtpDsl.g:530:3: ( rule__YtpModel__MediasAssignment_1 )
            {
             before(grammarAccess.getYtpModelAccess().getMediasAssignment_1()); 
            // InternalYtpDsl.g:531:3: ( rule__YtpModel__MediasAssignment_1 )
            // InternalYtpDsl.g:531:4: rule__YtpModel__MediasAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__YtpModel__MediasAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getYtpModelAccess().getMediasAssignment_1()); 

            }

            // InternalYtpDsl.g:534:2: ( ( rule__YtpModel__MediasAssignment_1 )* )
            // InternalYtpDsl.g:535:3: ( rule__YtpModel__MediasAssignment_1 )*
            {
             before(grammarAccess.getYtpModelAccess().getMediasAssignment_1()); 
            // InternalYtpDsl.g:536:3: ( rule__YtpModel__MediasAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalYtpDsl.g:536:4: rule__YtpModel__MediasAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__YtpModel__MediasAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getYtpModelAccess().getMediasAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YtpModel__Group__1__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group__0"
    // InternalYtpDsl.g:546:1: rule__GeneratorInformation__Group__0 : rule__GeneratorInformation__Group__0__Impl rule__GeneratorInformation__Group__1 ;
    public final void rule__GeneratorInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:550:1: ( rule__GeneratorInformation__Group__0__Impl rule__GeneratorInformation__Group__1 )
            // InternalYtpDsl.g:551:2: rule__GeneratorInformation__Group__0__Impl rule__GeneratorInformation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GeneratorInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__0"


    // $ANTLR start "rule__GeneratorInformation__Group__0__Impl"
    // InternalYtpDsl.g:558:1: rule__GeneratorInformation__Group__0__Impl : ( () ) ;
    public final void rule__GeneratorInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:562:1: ( ( () ) )
            // InternalYtpDsl.g:563:1: ( () )
            {
            // InternalYtpDsl.g:563:1: ( () )
            // InternalYtpDsl.g:564:2: ()
            {
             before(grammarAccess.getGeneratorInformationAccess().getGeneratorInformationAction_0()); 
            // InternalYtpDsl.g:565:2: ()
            // InternalYtpDsl.g:565:3: 
            {
            }

             after(grammarAccess.getGeneratorInformationAccess().getGeneratorInformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__0__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group__1"
    // InternalYtpDsl.g:573:1: rule__GeneratorInformation__Group__1 : rule__GeneratorInformation__Group__1__Impl rule__GeneratorInformation__Group__2 ;
    public final void rule__GeneratorInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:577:1: ( rule__GeneratorInformation__Group__1__Impl rule__GeneratorInformation__Group__2 )
            // InternalYtpDsl.g:578:2: rule__GeneratorInformation__Group__1__Impl rule__GeneratorInformation__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GeneratorInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__1"


    // $ANTLR start "rule__GeneratorInformation__Group__1__Impl"
    // InternalYtpDsl.g:585:1: rule__GeneratorInformation__Group__1__Impl : ( ( rule__GeneratorInformation__Group_1__0 ) ) ;
    public final void rule__GeneratorInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:589:1: ( ( ( rule__GeneratorInformation__Group_1__0 ) ) )
            // InternalYtpDsl.g:590:1: ( ( rule__GeneratorInformation__Group_1__0 ) )
            {
            // InternalYtpDsl.g:590:1: ( ( rule__GeneratorInformation__Group_1__0 ) )
            // InternalYtpDsl.g:591:2: ( rule__GeneratorInformation__Group_1__0 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getGroup_1()); 
            // InternalYtpDsl.g:592:2: ( rule__GeneratorInformation__Group_1__0 )
            // InternalYtpDsl.g:592:3: rule__GeneratorInformation__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__1__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group__2"
    // InternalYtpDsl.g:600:1: rule__GeneratorInformation__Group__2 : rule__GeneratorInformation__Group__2__Impl rule__GeneratorInformation__Group__3 ;
    public final void rule__GeneratorInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:604:1: ( rule__GeneratorInformation__Group__2__Impl rule__GeneratorInformation__Group__3 )
            // InternalYtpDsl.g:605:2: rule__GeneratorInformation__Group__2__Impl rule__GeneratorInformation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__GeneratorInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__2"


    // $ANTLR start "rule__GeneratorInformation__Group__2__Impl"
    // InternalYtpDsl.g:612:1: rule__GeneratorInformation__Group__2__Impl : ( ( rule__GeneratorInformation__Group_2__0 )? ) ;
    public final void rule__GeneratorInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:616:1: ( ( ( rule__GeneratorInformation__Group_2__0 )? ) )
            // InternalYtpDsl.g:617:1: ( ( rule__GeneratorInformation__Group_2__0 )? )
            {
            // InternalYtpDsl.g:617:1: ( ( rule__GeneratorInformation__Group_2__0 )? )
            // InternalYtpDsl.g:618:2: ( rule__GeneratorInformation__Group_2__0 )?
            {
             before(grammarAccess.getGeneratorInformationAccess().getGroup_2()); 
            // InternalYtpDsl.g:619:2: ( rule__GeneratorInformation__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalYtpDsl.g:619:3: rule__GeneratorInformation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneratorInformation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneratorInformationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__2__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group__3"
    // InternalYtpDsl.g:627:1: rule__GeneratorInformation__Group__3 : rule__GeneratorInformation__Group__3__Impl rule__GeneratorInformation__Group__4 ;
    public final void rule__GeneratorInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:631:1: ( rule__GeneratorInformation__Group__3__Impl rule__GeneratorInformation__Group__4 )
            // InternalYtpDsl.g:632:2: rule__GeneratorInformation__Group__3__Impl rule__GeneratorInformation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__GeneratorInformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__3"


    // $ANTLR start "rule__GeneratorInformation__Group__3__Impl"
    // InternalYtpDsl.g:639:1: rule__GeneratorInformation__Group__3__Impl : ( ( rule__GeneratorInformation__Group_3__0 )? ) ;
    public final void rule__GeneratorInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:643:1: ( ( ( rule__GeneratorInformation__Group_3__0 )? ) )
            // InternalYtpDsl.g:644:1: ( ( rule__GeneratorInformation__Group_3__0 )? )
            {
            // InternalYtpDsl.g:644:1: ( ( rule__GeneratorInformation__Group_3__0 )? )
            // InternalYtpDsl.g:645:2: ( rule__GeneratorInformation__Group_3__0 )?
            {
             before(grammarAccess.getGeneratorInformationAccess().getGroup_3()); 
            // InternalYtpDsl.g:646:2: ( rule__GeneratorInformation__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalYtpDsl.g:646:3: rule__GeneratorInformation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneratorInformation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneratorInformationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__3__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group__4"
    // InternalYtpDsl.g:654:1: rule__GeneratorInformation__Group__4 : rule__GeneratorInformation__Group__4__Impl rule__GeneratorInformation__Group__5 ;
    public final void rule__GeneratorInformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:658:1: ( rule__GeneratorInformation__Group__4__Impl rule__GeneratorInformation__Group__5 )
            // InternalYtpDsl.g:659:2: rule__GeneratorInformation__Group__4__Impl rule__GeneratorInformation__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__GeneratorInformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__4"


    // $ANTLR start "rule__GeneratorInformation__Group__4__Impl"
    // InternalYtpDsl.g:666:1: rule__GeneratorInformation__Group__4__Impl : ( ( rule__GeneratorInformation__Group_4__0 ) ) ;
    public final void rule__GeneratorInformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:670:1: ( ( ( rule__GeneratorInformation__Group_4__0 ) ) )
            // InternalYtpDsl.g:671:1: ( ( rule__GeneratorInformation__Group_4__0 ) )
            {
            // InternalYtpDsl.g:671:1: ( ( rule__GeneratorInformation__Group_4__0 ) )
            // InternalYtpDsl.g:672:2: ( rule__GeneratorInformation__Group_4__0 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getGroup_4()); 
            // InternalYtpDsl.g:673:2: ( rule__GeneratorInformation__Group_4__0 )
            // InternalYtpDsl.g:673:3: rule__GeneratorInformation__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__4__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group__5"
    // InternalYtpDsl.g:681:1: rule__GeneratorInformation__Group__5 : rule__GeneratorInformation__Group__5__Impl rule__GeneratorInformation__Group__6 ;
    public final void rule__GeneratorInformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:685:1: ( rule__GeneratorInformation__Group__5__Impl rule__GeneratorInformation__Group__6 )
            // InternalYtpDsl.g:686:2: rule__GeneratorInformation__Group__5__Impl rule__GeneratorInformation__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__GeneratorInformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__5"


    // $ANTLR start "rule__GeneratorInformation__Group__5__Impl"
    // InternalYtpDsl.g:693:1: rule__GeneratorInformation__Group__5__Impl : ( ( rule__GeneratorInformation__Group_5__0 ) ) ;
    public final void rule__GeneratorInformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:697:1: ( ( ( rule__GeneratorInformation__Group_5__0 ) ) )
            // InternalYtpDsl.g:698:1: ( ( rule__GeneratorInformation__Group_5__0 ) )
            {
            // InternalYtpDsl.g:698:1: ( ( rule__GeneratorInformation__Group_5__0 ) )
            // InternalYtpDsl.g:699:2: ( rule__GeneratorInformation__Group_5__0 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getGroup_5()); 
            // InternalYtpDsl.g:700:2: ( rule__GeneratorInformation__Group_5__0 )
            // InternalYtpDsl.g:700:3: rule__GeneratorInformation__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__5__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group__6"
    // InternalYtpDsl.g:708:1: rule__GeneratorInformation__Group__6 : rule__GeneratorInformation__Group__6__Impl ;
    public final void rule__GeneratorInformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:712:1: ( rule__GeneratorInformation__Group__6__Impl )
            // InternalYtpDsl.g:713:2: rule__GeneratorInformation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__6"


    // $ANTLR start "rule__GeneratorInformation__Group__6__Impl"
    // InternalYtpDsl.g:719:1: rule__GeneratorInformation__Group__6__Impl : ( ( rule__GeneratorInformation__LibraryAssignment_6 )* ) ;
    public final void rule__GeneratorInformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:723:1: ( ( ( rule__GeneratorInformation__LibraryAssignment_6 )* ) )
            // InternalYtpDsl.g:724:1: ( ( rule__GeneratorInformation__LibraryAssignment_6 )* )
            {
            // InternalYtpDsl.g:724:1: ( ( rule__GeneratorInformation__LibraryAssignment_6 )* )
            // InternalYtpDsl.g:725:2: ( rule__GeneratorInformation__LibraryAssignment_6 )*
            {
             before(grammarAccess.getGeneratorInformationAccess().getLibraryAssignment_6()); 
            // InternalYtpDsl.g:726:2: ( rule__GeneratorInformation__LibraryAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalYtpDsl.g:726:3: rule__GeneratorInformation__LibraryAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__GeneratorInformation__LibraryAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGeneratorInformationAccess().getLibraryAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group__6__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_1__0"
    // InternalYtpDsl.g:735:1: rule__GeneratorInformation__Group_1__0 : rule__GeneratorInformation__Group_1__0__Impl rule__GeneratorInformation__Group_1__1 ;
    public final void rule__GeneratorInformation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:739:1: ( rule__GeneratorInformation__Group_1__0__Impl rule__GeneratorInformation__Group_1__1 )
            // InternalYtpDsl.g:740:2: rule__GeneratorInformation__Group_1__0__Impl rule__GeneratorInformation__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__GeneratorInformation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_1__0"


    // $ANTLR start "rule__GeneratorInformation__Group_1__0__Impl"
    // InternalYtpDsl.g:747:1: rule__GeneratorInformation__Group_1__0__Impl : ( '@author' ) ;
    public final void rule__GeneratorInformation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:751:1: ( ( '@author' ) )
            // InternalYtpDsl.g:752:1: ( '@author' )
            {
            // InternalYtpDsl.g:752:1: ( '@author' )
            // InternalYtpDsl.g:753:2: '@author'
            {
             before(grammarAccess.getGeneratorInformationAccess().getAuthorKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getAuthorKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_1__0__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_1__1"
    // InternalYtpDsl.g:762:1: rule__GeneratorInformation__Group_1__1 : rule__GeneratorInformation__Group_1__1__Impl ;
    public final void rule__GeneratorInformation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:766:1: ( rule__GeneratorInformation__Group_1__1__Impl )
            // InternalYtpDsl.g:767:2: rule__GeneratorInformation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_1__1"


    // $ANTLR start "rule__GeneratorInformation__Group_1__1__Impl"
    // InternalYtpDsl.g:773:1: rule__GeneratorInformation__Group_1__1__Impl : ( ( rule__GeneratorInformation__AuthorNameAssignment_1_1 ) ) ;
    public final void rule__GeneratorInformation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:777:1: ( ( ( rule__GeneratorInformation__AuthorNameAssignment_1_1 ) ) )
            // InternalYtpDsl.g:778:1: ( ( rule__GeneratorInformation__AuthorNameAssignment_1_1 ) )
            {
            // InternalYtpDsl.g:778:1: ( ( rule__GeneratorInformation__AuthorNameAssignment_1_1 ) )
            // InternalYtpDsl.g:779:2: ( rule__GeneratorInformation__AuthorNameAssignment_1_1 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getAuthorNameAssignment_1_1()); 
            // InternalYtpDsl.g:780:2: ( rule__GeneratorInformation__AuthorNameAssignment_1_1 )
            // InternalYtpDsl.g:780:3: rule__GeneratorInformation__AuthorNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__AuthorNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getAuthorNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_1__1__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_2__0"
    // InternalYtpDsl.g:789:1: rule__GeneratorInformation__Group_2__0 : rule__GeneratorInformation__Group_2__0__Impl rule__GeneratorInformation__Group_2__1 ;
    public final void rule__GeneratorInformation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:793:1: ( rule__GeneratorInformation__Group_2__0__Impl rule__GeneratorInformation__Group_2__1 )
            // InternalYtpDsl.g:794:2: rule__GeneratorInformation__Group_2__0__Impl rule__GeneratorInformation__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__GeneratorInformation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_2__0"


    // $ANTLR start "rule__GeneratorInformation__Group_2__0__Impl"
    // InternalYtpDsl.g:801:1: rule__GeneratorInformation__Group_2__0__Impl : ( '@version' ) ;
    public final void rule__GeneratorInformation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:805:1: ( ( '@version' ) )
            // InternalYtpDsl.g:806:1: ( '@version' )
            {
            // InternalYtpDsl.g:806:1: ( '@version' )
            // InternalYtpDsl.g:807:2: '@version'
            {
             before(grammarAccess.getGeneratorInformationAccess().getVersionKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getVersionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_2__0__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_2__1"
    // InternalYtpDsl.g:816:1: rule__GeneratorInformation__Group_2__1 : rule__GeneratorInformation__Group_2__1__Impl ;
    public final void rule__GeneratorInformation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:820:1: ( rule__GeneratorInformation__Group_2__1__Impl )
            // InternalYtpDsl.g:821:2: rule__GeneratorInformation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_2__1"


    // $ANTLR start "rule__GeneratorInformation__Group_2__1__Impl"
    // InternalYtpDsl.g:827:1: rule__GeneratorInformation__Group_2__1__Impl : ( ( rule__GeneratorInformation__VersionAssignment_2_1 ) ) ;
    public final void rule__GeneratorInformation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:831:1: ( ( ( rule__GeneratorInformation__VersionAssignment_2_1 ) ) )
            // InternalYtpDsl.g:832:1: ( ( rule__GeneratorInformation__VersionAssignment_2_1 ) )
            {
            // InternalYtpDsl.g:832:1: ( ( rule__GeneratorInformation__VersionAssignment_2_1 ) )
            // InternalYtpDsl.g:833:2: ( rule__GeneratorInformation__VersionAssignment_2_1 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getVersionAssignment_2_1()); 
            // InternalYtpDsl.g:834:2: ( rule__GeneratorInformation__VersionAssignment_2_1 )
            // InternalYtpDsl.g:834:3: rule__GeneratorInformation__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getVersionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_2__1__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_3__0"
    // InternalYtpDsl.g:843:1: rule__GeneratorInformation__Group_3__0 : rule__GeneratorInformation__Group_3__0__Impl rule__GeneratorInformation__Group_3__1 ;
    public final void rule__GeneratorInformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:847:1: ( rule__GeneratorInformation__Group_3__0__Impl rule__GeneratorInformation__Group_3__1 )
            // InternalYtpDsl.g:848:2: rule__GeneratorInformation__Group_3__0__Impl rule__GeneratorInformation__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__GeneratorInformation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_3__0"


    // $ANTLR start "rule__GeneratorInformation__Group_3__0__Impl"
    // InternalYtpDsl.g:855:1: rule__GeneratorInformation__Group_3__0__Impl : ( '@creation' ) ;
    public final void rule__GeneratorInformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:859:1: ( ( '@creation' ) )
            // InternalYtpDsl.g:860:1: ( '@creation' )
            {
            // InternalYtpDsl.g:860:1: ( '@creation' )
            // InternalYtpDsl.g:861:2: '@creation'
            {
             before(grammarAccess.getGeneratorInformationAccess().getCreationKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getCreationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_3__0__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_3__1"
    // InternalYtpDsl.g:870:1: rule__GeneratorInformation__Group_3__1 : rule__GeneratorInformation__Group_3__1__Impl ;
    public final void rule__GeneratorInformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:874:1: ( rule__GeneratorInformation__Group_3__1__Impl )
            // InternalYtpDsl.g:875:2: rule__GeneratorInformation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_3__1"


    // $ANTLR start "rule__GeneratorInformation__Group_3__1__Impl"
    // InternalYtpDsl.g:881:1: rule__GeneratorInformation__Group_3__1__Impl : ( ( rule__GeneratorInformation__CreationDateAssignment_3_1 ) ) ;
    public final void rule__GeneratorInformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:885:1: ( ( ( rule__GeneratorInformation__CreationDateAssignment_3_1 ) ) )
            // InternalYtpDsl.g:886:1: ( ( rule__GeneratorInformation__CreationDateAssignment_3_1 ) )
            {
            // InternalYtpDsl.g:886:1: ( ( rule__GeneratorInformation__CreationDateAssignment_3_1 ) )
            // InternalYtpDsl.g:887:2: ( rule__GeneratorInformation__CreationDateAssignment_3_1 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getCreationDateAssignment_3_1()); 
            // InternalYtpDsl.g:888:2: ( rule__GeneratorInformation__CreationDateAssignment_3_1 )
            // InternalYtpDsl.g:888:3: rule__GeneratorInformation__CreationDateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__CreationDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getCreationDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_3__1__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_4__0"
    // InternalYtpDsl.g:897:1: rule__GeneratorInformation__Group_4__0 : rule__GeneratorInformation__Group_4__0__Impl rule__GeneratorInformation__Group_4__1 ;
    public final void rule__GeneratorInformation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:901:1: ( rule__GeneratorInformation__Group_4__0__Impl rule__GeneratorInformation__Group_4__1 )
            // InternalYtpDsl.g:902:2: rule__GeneratorInformation__Group_4__0__Impl rule__GeneratorInformation__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__GeneratorInformation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_4__0"


    // $ANTLR start "rule__GeneratorInformation__Group_4__0__Impl"
    // InternalYtpDsl.g:909:1: rule__GeneratorInformation__Group_4__0__Impl : ( 'FFMPEG_PATH' ) ;
    public final void rule__GeneratorInformation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:913:1: ( ( 'FFMPEG_PATH' ) )
            // InternalYtpDsl.g:914:1: ( 'FFMPEG_PATH' )
            {
            // InternalYtpDsl.g:914:1: ( 'FFMPEG_PATH' )
            // InternalYtpDsl.g:915:2: 'FFMPEG_PATH'
            {
             before(grammarAccess.getGeneratorInformationAccess().getFFMPEG_PATHKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getFFMPEG_PATHKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_4__0__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_4__1"
    // InternalYtpDsl.g:924:1: rule__GeneratorInformation__Group_4__1 : rule__GeneratorInformation__Group_4__1__Impl ;
    public final void rule__GeneratorInformation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:928:1: ( rule__GeneratorInformation__Group_4__1__Impl )
            // InternalYtpDsl.g:929:2: rule__GeneratorInformation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_4__1"


    // $ANTLR start "rule__GeneratorInformation__Group_4__1__Impl"
    // InternalYtpDsl.g:935:1: rule__GeneratorInformation__Group_4__1__Impl : ( ( rule__GeneratorInformation__FfmpegAssignment_4_1 ) ) ;
    public final void rule__GeneratorInformation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:939:1: ( ( ( rule__GeneratorInformation__FfmpegAssignment_4_1 ) ) )
            // InternalYtpDsl.g:940:1: ( ( rule__GeneratorInformation__FfmpegAssignment_4_1 ) )
            {
            // InternalYtpDsl.g:940:1: ( ( rule__GeneratorInformation__FfmpegAssignment_4_1 ) )
            // InternalYtpDsl.g:941:2: ( rule__GeneratorInformation__FfmpegAssignment_4_1 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getFfmpegAssignment_4_1()); 
            // InternalYtpDsl.g:942:2: ( rule__GeneratorInformation__FfmpegAssignment_4_1 )
            // InternalYtpDsl.g:942:3: rule__GeneratorInformation__FfmpegAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__FfmpegAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getFfmpegAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_4__1__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_5__0"
    // InternalYtpDsl.g:951:1: rule__GeneratorInformation__Group_5__0 : rule__GeneratorInformation__Group_5__0__Impl rule__GeneratorInformation__Group_5__1 ;
    public final void rule__GeneratorInformation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:955:1: ( rule__GeneratorInformation__Group_5__0__Impl rule__GeneratorInformation__Group_5__1 )
            // InternalYtpDsl.g:956:2: rule__GeneratorInformation__Group_5__0__Impl rule__GeneratorInformation__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__GeneratorInformation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_5__0"


    // $ANTLR start "rule__GeneratorInformation__Group_5__0__Impl"
    // InternalYtpDsl.g:963:1: rule__GeneratorInformation__Group_5__0__Impl : ( 'FFPROBE_PATH' ) ;
    public final void rule__GeneratorInformation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:967:1: ( ( 'FFPROBE_PATH' ) )
            // InternalYtpDsl.g:968:1: ( 'FFPROBE_PATH' )
            {
            // InternalYtpDsl.g:968:1: ( 'FFPROBE_PATH' )
            // InternalYtpDsl.g:969:2: 'FFPROBE_PATH'
            {
             before(grammarAccess.getGeneratorInformationAccess().getFFPROBE_PATHKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getFFPROBE_PATHKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_5__0__Impl"


    // $ANTLR start "rule__GeneratorInformation__Group_5__1"
    // InternalYtpDsl.g:978:1: rule__GeneratorInformation__Group_5__1 : rule__GeneratorInformation__Group_5__1__Impl ;
    public final void rule__GeneratorInformation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:982:1: ( rule__GeneratorInformation__Group_5__1__Impl )
            // InternalYtpDsl.g:983:2: rule__GeneratorInformation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_5__1"


    // $ANTLR start "rule__GeneratorInformation__Group_5__1__Impl"
    // InternalYtpDsl.g:989:1: rule__GeneratorInformation__Group_5__1__Impl : ( ( rule__GeneratorInformation__FfprobeAssignment_5_1 ) ) ;
    public final void rule__GeneratorInformation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:993:1: ( ( ( rule__GeneratorInformation__FfprobeAssignment_5_1 ) ) )
            // InternalYtpDsl.g:994:1: ( ( rule__GeneratorInformation__FfprobeAssignment_5_1 ) )
            {
            // InternalYtpDsl.g:994:1: ( ( rule__GeneratorInformation__FfprobeAssignment_5_1 ) )
            // InternalYtpDsl.g:995:2: ( rule__GeneratorInformation__FfprobeAssignment_5_1 )
            {
             before(grammarAccess.getGeneratorInformationAccess().getFfprobeAssignment_5_1()); 
            // InternalYtpDsl.g:996:2: ( rule__GeneratorInformation__FfprobeAssignment_5_1 )
            // InternalYtpDsl.g:996:3: rule__GeneratorInformation__FfprobeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorInformation__FfprobeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorInformationAccess().getFfprobeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__Group_5__1__Impl"


    // $ANTLR start "rule__VideoLibrary__Group__0"
    // InternalYtpDsl.g:1005:1: rule__VideoLibrary__Group__0 : rule__VideoLibrary__Group__0__Impl rule__VideoLibrary__Group__1 ;
    public final void rule__VideoLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1009:1: ( rule__VideoLibrary__Group__0__Impl rule__VideoLibrary__Group__1 )
            // InternalYtpDsl.g:1010:2: rule__VideoLibrary__Group__0__Impl rule__VideoLibrary__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoLibrary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__0"


    // $ANTLR start "rule__VideoLibrary__Group__0__Impl"
    // InternalYtpDsl.g:1017:1: rule__VideoLibrary__Group__0__Impl : ( 'folder' ) ;
    public final void rule__VideoLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1021:1: ( ( 'folder' ) )
            // InternalYtpDsl.g:1022:1: ( 'folder' )
            {
            // InternalYtpDsl.g:1022:1: ( 'folder' )
            // InternalYtpDsl.g:1023:2: 'folder'
            {
             before(grammarAccess.getVideoLibraryAccess().getFolderKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVideoLibraryAccess().getFolderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__0__Impl"


    // $ANTLR start "rule__VideoLibrary__Group__1"
    // InternalYtpDsl.g:1032:1: rule__VideoLibrary__Group__1 : rule__VideoLibrary__Group__1__Impl rule__VideoLibrary__Group__2 ;
    public final void rule__VideoLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1036:1: ( rule__VideoLibrary__Group__1__Impl rule__VideoLibrary__Group__2 )
            // InternalYtpDsl.g:1037:2: rule__VideoLibrary__Group__1__Impl rule__VideoLibrary__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VideoLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoLibrary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__1"


    // $ANTLR start "rule__VideoLibrary__Group__1__Impl"
    // InternalYtpDsl.g:1044:1: rule__VideoLibrary__Group__1__Impl : ( ( rule__VideoLibrary__FolderAssignment_1 ) ) ;
    public final void rule__VideoLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1048:1: ( ( ( rule__VideoLibrary__FolderAssignment_1 ) ) )
            // InternalYtpDsl.g:1049:1: ( ( rule__VideoLibrary__FolderAssignment_1 ) )
            {
            // InternalYtpDsl.g:1049:1: ( ( rule__VideoLibrary__FolderAssignment_1 ) )
            // InternalYtpDsl.g:1050:2: ( rule__VideoLibrary__FolderAssignment_1 )
            {
             before(grammarAccess.getVideoLibraryAccess().getFolderAssignment_1()); 
            // InternalYtpDsl.g:1051:2: ( rule__VideoLibrary__FolderAssignment_1 )
            // InternalYtpDsl.g:1051:3: rule__VideoLibrary__FolderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoLibrary__FolderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoLibraryAccess().getFolderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__1__Impl"


    // $ANTLR start "rule__VideoLibrary__Group__2"
    // InternalYtpDsl.g:1059:1: rule__VideoLibrary__Group__2 : rule__VideoLibrary__Group__2__Impl rule__VideoLibrary__Group__3 ;
    public final void rule__VideoLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1063:1: ( rule__VideoLibrary__Group__2__Impl rule__VideoLibrary__Group__3 )
            // InternalYtpDsl.g:1064:2: rule__VideoLibrary__Group__2__Impl rule__VideoLibrary__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__VideoLibrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoLibrary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__2"


    // $ANTLR start "rule__VideoLibrary__Group__2__Impl"
    // InternalYtpDsl.g:1071:1: rule__VideoLibrary__Group__2__Impl : ( 'ext' ) ;
    public final void rule__VideoLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1075:1: ( ( 'ext' ) )
            // InternalYtpDsl.g:1076:1: ( 'ext' )
            {
            // InternalYtpDsl.g:1076:1: ( 'ext' )
            // InternalYtpDsl.g:1077:2: 'ext'
            {
             before(grammarAccess.getVideoLibraryAccess().getExtKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVideoLibraryAccess().getExtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__2__Impl"


    // $ANTLR start "rule__VideoLibrary__Group__3"
    // InternalYtpDsl.g:1086:1: rule__VideoLibrary__Group__3 : rule__VideoLibrary__Group__3__Impl ;
    public final void rule__VideoLibrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1090:1: ( rule__VideoLibrary__Group__3__Impl )
            // InternalYtpDsl.g:1091:2: rule__VideoLibrary__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoLibrary__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__3"


    // $ANTLR start "rule__VideoLibrary__Group__3__Impl"
    // InternalYtpDsl.g:1097:1: rule__VideoLibrary__Group__3__Impl : ( ( ( rule__VideoLibrary__ExtensionAssignment_3 ) ) ( ( rule__VideoLibrary__ExtensionAssignment_3 )* ) ) ;
    public final void rule__VideoLibrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1101:1: ( ( ( ( rule__VideoLibrary__ExtensionAssignment_3 ) ) ( ( rule__VideoLibrary__ExtensionAssignment_3 )* ) ) )
            // InternalYtpDsl.g:1102:1: ( ( ( rule__VideoLibrary__ExtensionAssignment_3 ) ) ( ( rule__VideoLibrary__ExtensionAssignment_3 )* ) )
            {
            // InternalYtpDsl.g:1102:1: ( ( ( rule__VideoLibrary__ExtensionAssignment_3 ) ) ( ( rule__VideoLibrary__ExtensionAssignment_3 )* ) )
            // InternalYtpDsl.g:1103:2: ( ( rule__VideoLibrary__ExtensionAssignment_3 ) ) ( ( rule__VideoLibrary__ExtensionAssignment_3 )* )
            {
            // InternalYtpDsl.g:1103:2: ( ( rule__VideoLibrary__ExtensionAssignment_3 ) )
            // InternalYtpDsl.g:1104:3: ( rule__VideoLibrary__ExtensionAssignment_3 )
            {
             before(grammarAccess.getVideoLibraryAccess().getExtensionAssignment_3()); 
            // InternalYtpDsl.g:1105:3: ( rule__VideoLibrary__ExtensionAssignment_3 )
            // InternalYtpDsl.g:1105:4: rule__VideoLibrary__ExtensionAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__VideoLibrary__ExtensionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVideoLibraryAccess().getExtensionAssignment_3()); 

            }

            // InternalYtpDsl.g:1108:2: ( ( rule__VideoLibrary__ExtensionAssignment_3 )* )
            // InternalYtpDsl.g:1109:3: ( rule__VideoLibrary__ExtensionAssignment_3 )*
            {
             before(grammarAccess.getVideoLibraryAccess().getExtensionAssignment_3()); 
            // InternalYtpDsl.g:1110:3: ( rule__VideoLibrary__ExtensionAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalYtpDsl.g:1110:4: rule__VideoLibrary__ExtensionAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__VideoLibrary__ExtensionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVideoLibraryAccess().getExtensionAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__Group__3__Impl"


    // $ANTLR start "rule__Media__Group__0"
    // InternalYtpDsl.g:1120:1: rule__Media__Group__0 : rule__Media__Group__0__Impl rule__Media__Group__1 ;
    public final void rule__Media__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1124:1: ( rule__Media__Group__0__Impl rule__Media__Group__1 )
            // InternalYtpDsl.g:1125:2: rule__Media__Group__0__Impl rule__Media__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Media__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Media__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__0"


    // $ANTLR start "rule__Media__Group__0__Impl"
    // InternalYtpDsl.g:1132:1: rule__Media__Group__0__Impl : ( 'media' ) ;
    public final void rule__Media__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1136:1: ( ( 'media' ) )
            // InternalYtpDsl.g:1137:1: ( 'media' )
            {
            // InternalYtpDsl.g:1137:1: ( 'media' )
            // InternalYtpDsl.g:1138:2: 'media'
            {
             before(grammarAccess.getMediaAccess().getMediaKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMediaAccess().getMediaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__0__Impl"


    // $ANTLR start "rule__Media__Group__1"
    // InternalYtpDsl.g:1147:1: rule__Media__Group__1 : rule__Media__Group__1__Impl ;
    public final void rule__Media__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1151:1: ( rule__Media__Group__1__Impl )
            // InternalYtpDsl.g:1152:2: rule__Media__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Media__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__1"


    // $ANTLR start "rule__Media__Group__1__Impl"
    // InternalYtpDsl.g:1158:1: rule__Media__Group__1__Impl : ( ( rule__Media__DescriptionAssignment_1 ) ) ;
    public final void rule__Media__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1162:1: ( ( ( rule__Media__DescriptionAssignment_1 ) ) )
            // InternalYtpDsl.g:1163:1: ( ( rule__Media__DescriptionAssignment_1 ) )
            {
            // InternalYtpDsl.g:1163:1: ( ( rule__Media__DescriptionAssignment_1 ) )
            // InternalYtpDsl.g:1164:2: ( rule__Media__DescriptionAssignment_1 )
            {
             before(grammarAccess.getMediaAccess().getDescriptionAssignment_1()); 
            // InternalYtpDsl.g:1165:2: ( rule__Media__DescriptionAssignment_1 )
            // InternalYtpDsl.g:1165:3: rule__Media__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Media__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group__0"
    // InternalYtpDsl.g:1174:1: rule__ImageDescription__Group__0 : rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1 ;
    public final void rule__ImageDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1178:1: ( rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1 )
            // InternalYtpDsl.g:1179:2: rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ImageDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__0"


    // $ANTLR start "rule__ImageDescription__Group__0__Impl"
    // InternalYtpDsl.g:1186:1: rule__ImageDescription__Group__0__Impl : ( 'image' ) ;
    public final void rule__ImageDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1190:1: ( ( 'image' ) )
            // InternalYtpDsl.g:1191:1: ( 'image' )
            {
            // InternalYtpDsl.g:1191:1: ( 'image' )
            // InternalYtpDsl.g:1192:2: 'image'
            {
             before(grammarAccess.getImageDescriptionAccess().getImageKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getImageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group__1"
    // InternalYtpDsl.g:1201:1: rule__ImageDescription__Group__1 : rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2 ;
    public final void rule__ImageDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1205:1: ( rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2 )
            // InternalYtpDsl.g:1206:2: rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ImageDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__1"


    // $ANTLR start "rule__ImageDescription__Group__1__Impl"
    // InternalYtpDsl.g:1213:1: rule__ImageDescription__Group__1__Impl : ( ( rule__ImageDescription__ImageidAssignment_1 )? ) ;
    public final void rule__ImageDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1217:1: ( ( ( rule__ImageDescription__ImageidAssignment_1 )? ) )
            // InternalYtpDsl.g:1218:1: ( ( rule__ImageDescription__ImageidAssignment_1 )? )
            {
            // InternalYtpDsl.g:1218:1: ( ( rule__ImageDescription__ImageidAssignment_1 )? )
            // InternalYtpDsl.g:1219:2: ( rule__ImageDescription__ImageidAssignment_1 )?
            {
             before(grammarAccess.getImageDescriptionAccess().getImageidAssignment_1()); 
            // InternalYtpDsl.g:1220:2: ( rule__ImageDescription__ImageidAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalYtpDsl.g:1220:3: rule__ImageDescription__ImageidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageDescription__ImageidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageDescriptionAccess().getImageidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group__2"
    // InternalYtpDsl.g:1228:1: rule__ImageDescription__Group__2 : rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3 ;
    public final void rule__ImageDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1232:1: ( rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3 )
            // InternalYtpDsl.g:1233:2: rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ImageDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__2"


    // $ANTLR start "rule__ImageDescription__Group__2__Impl"
    // InternalYtpDsl.g:1240:1: rule__ImageDescription__Group__2__Impl : ( ( rule__ImageDescription__LocationAssignment_2 ) ) ;
    public final void rule__ImageDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1244:1: ( ( ( rule__ImageDescription__LocationAssignment_2 ) ) )
            // InternalYtpDsl.g:1245:1: ( ( rule__ImageDescription__LocationAssignment_2 ) )
            {
            // InternalYtpDsl.g:1245:1: ( ( rule__ImageDescription__LocationAssignment_2 ) )
            // InternalYtpDsl.g:1246:2: ( rule__ImageDescription__LocationAssignment_2 )
            {
             before(grammarAccess.getImageDescriptionAccess().getLocationAssignment_2()); 
            // InternalYtpDsl.g:1247:2: ( rule__ImageDescription__LocationAssignment_2 )
            // InternalYtpDsl.g:1247:3: rule__ImageDescription__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getLocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__2__Impl"


    // $ANTLR start "rule__ImageDescription__Group__3"
    // InternalYtpDsl.g:1255:1: rule__ImageDescription__Group__3 : rule__ImageDescription__Group__3__Impl ;
    public final void rule__ImageDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1259:1: ( rule__ImageDescription__Group__3__Impl )
            // InternalYtpDsl.g:1260:2: rule__ImageDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__3"


    // $ANTLR start "rule__ImageDescription__Group__3__Impl"
    // InternalYtpDsl.g:1266:1: rule__ImageDescription__Group__3__Impl : ( ( rule__ImageDescription__Group_3__0 )? ) ;
    public final void rule__ImageDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1270:1: ( ( ( rule__ImageDescription__Group_3__0 )? ) )
            // InternalYtpDsl.g:1271:1: ( ( rule__ImageDescription__Group_3__0 )? )
            {
            // InternalYtpDsl.g:1271:1: ( ( rule__ImageDescription__Group_3__0 )? )
            // InternalYtpDsl.g:1272:2: ( rule__ImageDescription__Group_3__0 )?
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3()); 
            // InternalYtpDsl.g:1273:2: ( rule__ImageDescription__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LEFT_BRACKET) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalYtpDsl.g:1273:3: rule__ImageDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__3__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__0"
    // InternalYtpDsl.g:1282:1: rule__ImageDescription__Group_3__0 : rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1 ;
    public final void rule__ImageDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1286:1: ( rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1 )
            // InternalYtpDsl.g:1287:2: rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ImageDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__0"


    // $ANTLR start "rule__ImageDescription__Group_3__0__Impl"
    // InternalYtpDsl.g:1294:1: rule__ImageDescription__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__ImageDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1298:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalYtpDsl.g:1299:1: ( RULE_LEFT_BRACKET )
            {
            // InternalYtpDsl.g:1299:1: ( RULE_LEFT_BRACKET )
            // InternalYtpDsl.g:1300:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__1"
    // InternalYtpDsl.g:1309:1: rule__ImageDescription__Group_3__1 : rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2 ;
    public final void rule__ImageDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1313:1: ( rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2 )
            // InternalYtpDsl.g:1314:2: rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__ImageDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__1"


    // $ANTLR start "rule__ImageDescription__Group_3__1__Impl"
    // InternalYtpDsl.g:1321:1: rule__ImageDescription__Group_3__1__Impl : ( ( rule__ImageDescription__Group_3_1__0 ) ) ;
    public final void rule__ImageDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1325:1: ( ( ( rule__ImageDescription__Group_3_1__0 ) ) )
            // InternalYtpDsl.g:1326:1: ( ( rule__ImageDescription__Group_3_1__0 ) )
            {
            // InternalYtpDsl.g:1326:1: ( ( rule__ImageDescription__Group_3_1__0 ) )
            // InternalYtpDsl.g:1327:2: ( rule__ImageDescription__Group_3_1__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3_1()); 
            // InternalYtpDsl.g:1328:2: ( rule__ImageDescription__Group_3_1__0 )
            // InternalYtpDsl.g:1328:3: rule__ImageDescription__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__2"
    // InternalYtpDsl.g:1336:1: rule__ImageDescription__Group_3__2 : rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3 ;
    public final void rule__ImageDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1340:1: ( rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3 )
            // InternalYtpDsl.g:1341:2: rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__ImageDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__2"


    // $ANTLR start "rule__ImageDescription__Group_3__2__Impl"
    // InternalYtpDsl.g:1348:1: rule__ImageDescription__Group_3__2__Impl : ( ( rule__ImageDescription__Group_3_2__0 ) ) ;
    public final void rule__ImageDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1352:1: ( ( ( rule__ImageDescription__Group_3_2__0 ) ) )
            // InternalYtpDsl.g:1353:1: ( ( rule__ImageDescription__Group_3_2__0 ) )
            {
            // InternalYtpDsl.g:1353:1: ( ( rule__ImageDescription__Group_3_2__0 ) )
            // InternalYtpDsl.g:1354:2: ( rule__ImageDescription__Group_3_2__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3_2()); 
            // InternalYtpDsl.g:1355:2: ( rule__ImageDescription__Group_3_2__0 )
            // InternalYtpDsl.g:1355:3: rule__ImageDescription__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__2__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__3"
    // InternalYtpDsl.g:1363:1: rule__ImageDescription__Group_3__3 : rule__ImageDescription__Group_3__3__Impl ;
    public final void rule__ImageDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1367:1: ( rule__ImageDescription__Group_3__3__Impl )
            // InternalYtpDsl.g:1368:2: rule__ImageDescription__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__3"


    // $ANTLR start "rule__ImageDescription__Group_3__3__Impl"
    // InternalYtpDsl.g:1374:1: rule__ImageDescription__Group_3__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__ImageDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1378:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalYtpDsl.g:1379:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalYtpDsl.g:1379:1: ( RULE_RIGHT_BRACKET )
            // InternalYtpDsl.g:1380:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__3__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_1__0"
    // InternalYtpDsl.g:1390:1: rule__ImageDescription__Group_3_1__0 : rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1 ;
    public final void rule__ImageDescription__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1394:1: ( rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1 )
            // InternalYtpDsl.g:1395:2: rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ImageDescription__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__0"


    // $ANTLR start "rule__ImageDescription__Group_3_1__0__Impl"
    // InternalYtpDsl.g:1402:1: rule__ImageDescription__Group_3_1__0__Impl : ( 'toptext' ) ;
    public final void rule__ImageDescription__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1406:1: ( ( 'toptext' ) )
            // InternalYtpDsl.g:1407:1: ( 'toptext' )
            {
            // InternalYtpDsl.g:1407:1: ( 'toptext' )
            // InternalYtpDsl.g:1408:2: 'toptext'
            {
             before(grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_1__1"
    // InternalYtpDsl.g:1417:1: rule__ImageDescription__Group_3_1__1 : rule__ImageDescription__Group_3_1__1__Impl ;
    public final void rule__ImageDescription__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1421:1: ( rule__ImageDescription__Group_3_1__1__Impl )
            // InternalYtpDsl.g:1422:2: rule__ImageDescription__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__1"


    // $ANTLR start "rule__ImageDescription__Group_3_1__1__Impl"
    // InternalYtpDsl.g:1428:1: rule__ImageDescription__Group_3_1__1__Impl : ( ( rule__ImageDescription__TopAssignment_3_1_1 ) ) ;
    public final void rule__ImageDescription__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1432:1: ( ( ( rule__ImageDescription__TopAssignment_3_1_1 ) ) )
            // InternalYtpDsl.g:1433:1: ( ( rule__ImageDescription__TopAssignment_3_1_1 ) )
            {
            // InternalYtpDsl.g:1433:1: ( ( rule__ImageDescription__TopAssignment_3_1_1 ) )
            // InternalYtpDsl.g:1434:2: ( rule__ImageDescription__TopAssignment_3_1_1 )
            {
             before(grammarAccess.getImageDescriptionAccess().getTopAssignment_3_1_1()); 
            // InternalYtpDsl.g:1435:2: ( rule__ImageDescription__TopAssignment_3_1_1 )
            // InternalYtpDsl.g:1435:3: rule__ImageDescription__TopAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__TopAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getTopAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_2__0"
    // InternalYtpDsl.g:1444:1: rule__ImageDescription__Group_3_2__0 : rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1 ;
    public final void rule__ImageDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1448:1: ( rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1 )
            // InternalYtpDsl.g:1449:2: rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ImageDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__0"


    // $ANTLR start "rule__ImageDescription__Group_3_2__0__Impl"
    // InternalYtpDsl.g:1456:1: rule__ImageDescription__Group_3_2__0__Impl : ( 'bottomtext' ) ;
    public final void rule__ImageDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1460:1: ( ( 'bottomtext' ) )
            // InternalYtpDsl.g:1461:1: ( 'bottomtext' )
            {
            // InternalYtpDsl.g:1461:1: ( 'bottomtext' )
            // InternalYtpDsl.g:1462:2: 'bottomtext'
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_2__1"
    // InternalYtpDsl.g:1471:1: rule__ImageDescription__Group_3_2__1 : rule__ImageDescription__Group_3_2__1__Impl ;
    public final void rule__ImageDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1475:1: ( rule__ImageDescription__Group_3_2__1__Impl )
            // InternalYtpDsl.g:1476:2: rule__ImageDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__1"


    // $ANTLR start "rule__ImageDescription__Group_3_2__1__Impl"
    // InternalYtpDsl.g:1482:1: rule__ImageDescription__Group_3_2__1__Impl : ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) ) ;
    public final void rule__ImageDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1486:1: ( ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) ) )
            // InternalYtpDsl.g:1487:1: ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) )
            {
            // InternalYtpDsl.g:1487:1: ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) )
            // InternalYtpDsl.g:1488:2: ( rule__ImageDescription__BottomAssignment_3_2_1 )
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomAssignment_3_2_1()); 
            // InternalYtpDsl.g:1489:2: ( rule__ImageDescription__BottomAssignment_3_2_1 )
            // InternalYtpDsl.g:1489:3: rule__ImageDescription__BottomAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__BottomAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getBottomAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group__0"
    // InternalYtpDsl.g:1498:1: rule__VideoDescription__Group__0 : rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1 ;
    public final void rule__VideoDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1502:1: ( rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1 )
            // InternalYtpDsl.g:1503:2: rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__VideoDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__0"


    // $ANTLR start "rule__VideoDescription__Group__0__Impl"
    // InternalYtpDsl.g:1510:1: rule__VideoDescription__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__VideoDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1514:1: ( ( 'videoseq' ) )
            // InternalYtpDsl.g:1515:1: ( 'videoseq' )
            {
            // InternalYtpDsl.g:1515:1: ( 'videoseq' )
            // InternalYtpDsl.g:1516:2: 'videoseq'
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group__1"
    // InternalYtpDsl.g:1525:1: rule__VideoDescription__Group__1 : rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2 ;
    public final void rule__VideoDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1529:1: ( rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2 )
            // InternalYtpDsl.g:1530:2: rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VideoDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__1"


    // $ANTLR start "rule__VideoDescription__Group__1__Impl"
    // InternalYtpDsl.g:1537:1: rule__VideoDescription__Group__1__Impl : ( ( rule__VideoDescription__VideoidAssignment_1 )? ) ;
    public final void rule__VideoDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1541:1: ( ( ( rule__VideoDescription__VideoidAssignment_1 )? ) )
            // InternalYtpDsl.g:1542:1: ( ( rule__VideoDescription__VideoidAssignment_1 )? )
            {
            // InternalYtpDsl.g:1542:1: ( ( rule__VideoDescription__VideoidAssignment_1 )? )
            // InternalYtpDsl.g:1543:2: ( rule__VideoDescription__VideoidAssignment_1 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1()); 
            // InternalYtpDsl.g:1544:2: ( rule__VideoDescription__VideoidAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalYtpDsl.g:1544:3: rule__VideoDescription__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__VideoidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group__2"
    // InternalYtpDsl.g:1552:1: rule__VideoDescription__Group__2 : rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3 ;
    public final void rule__VideoDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1556:1: ( rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3 )
            // InternalYtpDsl.g:1557:2: rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__VideoDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__2"


    // $ANTLR start "rule__VideoDescription__Group__2__Impl"
    // InternalYtpDsl.g:1564:1: rule__VideoDescription__Group__2__Impl : ( ( rule__VideoDescription__LocationAssignment_2 ) ) ;
    public final void rule__VideoDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1568:1: ( ( ( rule__VideoDescription__LocationAssignment_2 ) ) )
            // InternalYtpDsl.g:1569:1: ( ( rule__VideoDescription__LocationAssignment_2 ) )
            {
            // InternalYtpDsl.g:1569:1: ( ( rule__VideoDescription__LocationAssignment_2 ) )
            // InternalYtpDsl.g:1570:2: ( rule__VideoDescription__LocationAssignment_2 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2()); 
            // InternalYtpDsl.g:1571:2: ( rule__VideoDescription__LocationAssignment_2 )
            // InternalYtpDsl.g:1571:3: rule__VideoDescription__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__2__Impl"


    // $ANTLR start "rule__VideoDescription__Group__3"
    // InternalYtpDsl.g:1579:1: rule__VideoDescription__Group__3 : rule__VideoDescription__Group__3__Impl ;
    public final void rule__VideoDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1583:1: ( rule__VideoDescription__Group__3__Impl )
            // InternalYtpDsl.g:1584:2: rule__VideoDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__3"


    // $ANTLR start "rule__VideoDescription__Group__3__Impl"
    // InternalYtpDsl.g:1590:1: rule__VideoDescription__Group__3__Impl : ( ( rule__VideoDescription__Group_3__0 )? ) ;
    public final void rule__VideoDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1594:1: ( ( ( rule__VideoDescription__Group_3__0 )? ) )
            // InternalYtpDsl.g:1595:1: ( ( rule__VideoDescription__Group_3__0 )? )
            {
            // InternalYtpDsl.g:1595:1: ( ( rule__VideoDescription__Group_3__0 )? )
            // InternalYtpDsl.g:1596:2: ( rule__VideoDescription__Group_3__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3()); 
            // InternalYtpDsl.g:1597:2: ( rule__VideoDescription__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LEFT_BRACKET) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalYtpDsl.g:1597:3: rule__VideoDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__3__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__0"
    // InternalYtpDsl.g:1606:1: rule__VideoDescription__Group_3__0 : rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1 ;
    public final void rule__VideoDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1610:1: ( rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1 )
            // InternalYtpDsl.g:1611:2: rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__0"


    // $ANTLR start "rule__VideoDescription__Group_3__0__Impl"
    // InternalYtpDsl.g:1618:1: rule__VideoDescription__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1622:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalYtpDsl.g:1623:1: ( RULE_LEFT_BRACKET )
            {
            // InternalYtpDsl.g:1623:1: ( RULE_LEFT_BRACKET )
            // InternalYtpDsl.g:1624:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__1"
    // InternalYtpDsl.g:1633:1: rule__VideoDescription__Group_3__1 : rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2 ;
    public final void rule__VideoDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1637:1: ( rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2 )
            // InternalYtpDsl.g:1638:2: rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__1"


    // $ANTLR start "rule__VideoDescription__Group_3__1__Impl"
    // InternalYtpDsl.g:1645:1: rule__VideoDescription__Group_3__1__Impl : ( ( rule__VideoDescription__Group_3_1__0 )? ) ;
    public final void rule__VideoDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1649:1: ( ( ( rule__VideoDescription__Group_3_1__0 )? ) )
            // InternalYtpDsl.g:1650:1: ( ( rule__VideoDescription__Group_3_1__0 )? )
            {
            // InternalYtpDsl.g:1650:1: ( ( rule__VideoDescription__Group_3_1__0 )? )
            // InternalYtpDsl.g:1651:2: ( rule__VideoDescription__Group_3_1__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_1()); 
            // InternalYtpDsl.g:1652:2: ( rule__VideoDescription__Group_3_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalYtpDsl.g:1652:3: rule__VideoDescription__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__2"
    // InternalYtpDsl.g:1660:1: rule__VideoDescription__Group_3__2 : rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3 ;
    public final void rule__VideoDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1664:1: ( rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3 )
            // InternalYtpDsl.g:1665:2: rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__2"


    // $ANTLR start "rule__VideoDescription__Group_3__2__Impl"
    // InternalYtpDsl.g:1672:1: rule__VideoDescription__Group_3__2__Impl : ( ( rule__VideoDescription__Group_3_2__0 )? ) ;
    public final void rule__VideoDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1676:1: ( ( ( rule__VideoDescription__Group_3_2__0 )? ) )
            // InternalYtpDsl.g:1677:1: ( ( rule__VideoDescription__Group_3_2__0 )? )
            {
            // InternalYtpDsl.g:1677:1: ( ( rule__VideoDescription__Group_3_2__0 )? )
            // InternalYtpDsl.g:1678:2: ( rule__VideoDescription__Group_3_2__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_2()); 
            // InternalYtpDsl.g:1679:2: ( rule__VideoDescription__Group_3_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalYtpDsl.g:1679:3: rule__VideoDescription__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__2__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__3"
    // InternalYtpDsl.g:1687:1: rule__VideoDescription__Group_3__3 : rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4 ;
    public final void rule__VideoDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1691:1: ( rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4 )
            // InternalYtpDsl.g:1692:2: rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__3"


    // $ANTLR start "rule__VideoDescription__Group_3__3__Impl"
    // InternalYtpDsl.g:1699:1: rule__VideoDescription__Group_3__3__Impl : ( ( rule__VideoDescription__Group_3_3__0 )? ) ;
    public final void rule__VideoDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1703:1: ( ( ( rule__VideoDescription__Group_3_3__0 )? ) )
            // InternalYtpDsl.g:1704:1: ( ( rule__VideoDescription__Group_3_3__0 )? )
            {
            // InternalYtpDsl.g:1704:1: ( ( rule__VideoDescription__Group_3_3__0 )? )
            // InternalYtpDsl.g:1705:2: ( rule__VideoDescription__Group_3_3__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_3()); 
            // InternalYtpDsl.g:1706:2: ( rule__VideoDescription__Group_3_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalYtpDsl.g:1706:3: rule__VideoDescription__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__3__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__4"
    // InternalYtpDsl.g:1714:1: rule__VideoDescription__Group_3__4 : rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5 ;
    public final void rule__VideoDescription__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1718:1: ( rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5 )
            // InternalYtpDsl.g:1719:2: rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__4"


    // $ANTLR start "rule__VideoDescription__Group_3__4__Impl"
    // InternalYtpDsl.g:1726:1: rule__VideoDescription__Group_3__4__Impl : ( ( rule__VideoDescription__Group_3_4__0 )? ) ;
    public final void rule__VideoDescription__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1730:1: ( ( ( rule__VideoDescription__Group_3_4__0 )? ) )
            // InternalYtpDsl.g:1731:1: ( ( rule__VideoDescription__Group_3_4__0 )? )
            {
            // InternalYtpDsl.g:1731:1: ( ( rule__VideoDescription__Group_3_4__0 )? )
            // InternalYtpDsl.g:1732:2: ( rule__VideoDescription__Group_3_4__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_4()); 
            // InternalYtpDsl.g:1733:2: ( rule__VideoDescription__Group_3_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalYtpDsl.g:1733:3: rule__VideoDescription__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__4__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__5"
    // InternalYtpDsl.g:1741:1: rule__VideoDescription__Group_3__5 : rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6 ;
    public final void rule__VideoDescription__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1745:1: ( rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6 )
            // InternalYtpDsl.g:1746:2: rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__5"


    // $ANTLR start "rule__VideoDescription__Group_3__5__Impl"
    // InternalYtpDsl.g:1753:1: rule__VideoDescription__Group_3__5__Impl : ( ( rule__VideoDescription__Group_3_5__0 )? ) ;
    public final void rule__VideoDescription__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1757:1: ( ( ( rule__VideoDescription__Group_3_5__0 )? ) )
            // InternalYtpDsl.g:1758:1: ( ( rule__VideoDescription__Group_3_5__0 )? )
            {
            // InternalYtpDsl.g:1758:1: ( ( rule__VideoDescription__Group_3_5__0 )? )
            // InternalYtpDsl.g:1759:2: ( rule__VideoDescription__Group_3_5__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_5()); 
            // InternalYtpDsl.g:1760:2: ( rule__VideoDescription__Group_3_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalYtpDsl.g:1760:3: rule__VideoDescription__Group_3_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__5__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__6"
    // InternalYtpDsl.g:1768:1: rule__VideoDescription__Group_3__6 : rule__VideoDescription__Group_3__6__Impl ;
    public final void rule__VideoDescription__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1772:1: ( rule__VideoDescription__Group_3__6__Impl )
            // InternalYtpDsl.g:1773:2: rule__VideoDescription__Group_3__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__6"


    // $ANTLR start "rule__VideoDescription__Group_3__6__Impl"
    // InternalYtpDsl.g:1779:1: rule__VideoDescription__Group_3__6__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoDescription__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1783:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalYtpDsl.g:1784:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalYtpDsl.g:1784:1: ( RULE_RIGHT_BRACKET )
            // InternalYtpDsl.g:1785:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__6__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_1__0"
    // InternalYtpDsl.g:1795:1: rule__VideoDescription__Group_3_1__0 : rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1 ;
    public final void rule__VideoDescription__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1799:1: ( rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1 )
            // InternalYtpDsl.g:1800:2: rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__VideoDescription__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__0"


    // $ANTLR start "rule__VideoDescription__Group_3_1__0__Impl"
    // InternalYtpDsl.g:1807:1: rule__VideoDescription__Group_3_1__0__Impl : ( 'duration' ) ;
    public final void rule__VideoDescription__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1811:1: ( ( 'duration' ) )
            // InternalYtpDsl.g:1812:1: ( 'duration' )
            {
            // InternalYtpDsl.g:1812:1: ( 'duration' )
            // InternalYtpDsl.g:1813:2: 'duration'
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_1__1"
    // InternalYtpDsl.g:1822:1: rule__VideoDescription__Group_3_1__1 : rule__VideoDescription__Group_3_1__1__Impl ;
    public final void rule__VideoDescription__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1826:1: ( rule__VideoDescription__Group_3_1__1__Impl )
            // InternalYtpDsl.g:1827:2: rule__VideoDescription__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__1"


    // $ANTLR start "rule__VideoDescription__Group_3_1__1__Impl"
    // InternalYtpDsl.g:1833:1: rule__VideoDescription__Group_3_1__1__Impl : ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) ) ;
    public final void rule__VideoDescription__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1837:1: ( ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) ) )
            // InternalYtpDsl.g:1838:1: ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) )
            {
            // InternalYtpDsl.g:1838:1: ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) )
            // InternalYtpDsl.g:1839:2: ( rule__VideoDescription__DurationAssignment_3_1_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1()); 
            // InternalYtpDsl.g:1840:2: ( rule__VideoDescription__DurationAssignment_3_1_1 )
            // InternalYtpDsl.g:1840:3: rule__VideoDescription__DurationAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__DurationAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_2__0"
    // InternalYtpDsl.g:1849:1: rule__VideoDescription__Group_3_2__0 : rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1 ;
    public final void rule__VideoDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1853:1: ( rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1 )
            // InternalYtpDsl.g:1854:2: rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_20);
            rule__VideoDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__0"


    // $ANTLR start "rule__VideoDescription__Group_3_2__0__Impl"
    // InternalYtpDsl.g:1861:1: rule__VideoDescription__Group_3_2__0__Impl : ( 'probability' ) ;
    public final void rule__VideoDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1865:1: ( ( 'probability' ) )
            // InternalYtpDsl.g:1866:1: ( 'probability' )
            {
            // InternalYtpDsl.g:1866:1: ( 'probability' )
            // InternalYtpDsl.g:1867:2: 'probability'
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_2__1"
    // InternalYtpDsl.g:1876:1: rule__VideoDescription__Group_3_2__1 : rule__VideoDescription__Group_3_2__1__Impl ;
    public final void rule__VideoDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1880:1: ( rule__VideoDescription__Group_3_2__1__Impl )
            // InternalYtpDsl.g:1881:2: rule__VideoDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__1"


    // $ANTLR start "rule__VideoDescription__Group_3_2__1__Impl"
    // InternalYtpDsl.g:1887:1: rule__VideoDescription__Group_3_2__1__Impl : ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) ) ;
    public final void rule__VideoDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1891:1: ( ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) ) )
            // InternalYtpDsl.g:1892:1: ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) )
            {
            // InternalYtpDsl.g:1892:1: ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) )
            // InternalYtpDsl.g:1893:2: ( rule__VideoDescription__ProbabilityAssignment_3_2_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1()); 
            // InternalYtpDsl.g:1894:2: ( rule__VideoDescription__ProbabilityAssignment_3_2_1 )
            // InternalYtpDsl.g:1894:3: rule__VideoDescription__ProbabilityAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__ProbabilityAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_3__0"
    // InternalYtpDsl.g:1903:1: rule__VideoDescription__Group_3_3__0 : rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1 ;
    public final void rule__VideoDescription__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1907:1: ( rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1 )
            // InternalYtpDsl.g:1908:2: rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoDescription__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__0"


    // $ANTLR start "rule__VideoDescription__Group_3_3__0__Impl"
    // InternalYtpDsl.g:1915:1: rule__VideoDescription__Group_3_3__0__Impl : ( 'description' ) ;
    public final void rule__VideoDescription__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1919:1: ( ( 'description' ) )
            // InternalYtpDsl.g:1920:1: ( 'description' )
            {
            // InternalYtpDsl.g:1920:1: ( 'description' )
            // InternalYtpDsl.g:1921:2: 'description'
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_3__1"
    // InternalYtpDsl.g:1930:1: rule__VideoDescription__Group_3_3__1 : rule__VideoDescription__Group_3_3__1__Impl ;
    public final void rule__VideoDescription__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1934:1: ( rule__VideoDescription__Group_3_3__1__Impl )
            // InternalYtpDsl.g:1935:2: rule__VideoDescription__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__1"


    // $ANTLR start "rule__VideoDescription__Group_3_3__1__Impl"
    // InternalYtpDsl.g:1941:1: rule__VideoDescription__Group_3_3__1__Impl : ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) ) ;
    public final void rule__VideoDescription__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1945:1: ( ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) ) )
            // InternalYtpDsl.g:1946:1: ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) )
            {
            // InternalYtpDsl.g:1946:1: ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) )
            // InternalYtpDsl.g:1947:2: ( rule__VideoDescription__DescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_3_1()); 
            // InternalYtpDsl.g:1948:2: ( rule__VideoDescription__DescriptionAssignment_3_3_1 )
            // InternalYtpDsl.g:1948:3: rule__VideoDescription__DescriptionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__DescriptionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_4__0"
    // InternalYtpDsl.g:1957:1: rule__VideoDescription__Group_3_4__0 : rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1 ;
    public final void rule__VideoDescription__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1961:1: ( rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1 )
            // InternalYtpDsl.g:1962:2: rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1
            {
            pushFollow(FOLLOW_21);
            rule__VideoDescription__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__0"


    // $ANTLR start "rule__VideoDescription__Group_3_4__0__Impl"
    // InternalYtpDsl.g:1969:1: rule__VideoDescription__Group_3_4__0__Impl : ( 'filter' ) ;
    public final void rule__VideoDescription__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1973:1: ( ( 'filter' ) )
            // InternalYtpDsl.g:1974:1: ( 'filter' )
            {
            // InternalYtpDsl.g:1974:1: ( 'filter' )
            // InternalYtpDsl.g:1975:2: 'filter'
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_4__1"
    // InternalYtpDsl.g:1984:1: rule__VideoDescription__Group_3_4__1 : rule__VideoDescription__Group_3_4__1__Impl ;
    public final void rule__VideoDescription__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1988:1: ( rule__VideoDescription__Group_3_4__1__Impl )
            // InternalYtpDsl.g:1989:2: rule__VideoDescription__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__1"


    // $ANTLR start "rule__VideoDescription__Group_3_4__1__Impl"
    // InternalYtpDsl.g:1995:1: rule__VideoDescription__Group_3_4__1__Impl : ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) ) ;
    public final void rule__VideoDescription__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:1999:1: ( ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) ) )
            // InternalYtpDsl.g:2000:1: ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) )
            {
            // InternalYtpDsl.g:2000:1: ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) )
            // InternalYtpDsl.g:2001:2: ( rule__VideoDescription__FilterAssignment_3_4_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_4_1()); 
            // InternalYtpDsl.g:2002:2: ( rule__VideoDescription__FilterAssignment_3_4_1 )
            // InternalYtpDsl.g:2002:3: rule__VideoDescription__FilterAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__FilterAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_5__0"
    // InternalYtpDsl.g:2011:1: rule__VideoDescription__Group_3_5__0 : rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1 ;
    public final void rule__VideoDescription__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2015:1: ( rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1 )
            // InternalYtpDsl.g:2016:2: rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1
            {
            pushFollow(FOLLOW_15);
            rule__VideoDescription__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__0"


    // $ANTLR start "rule__VideoDescription__Group_3_5__0__Impl"
    // InternalYtpDsl.g:2023:1: rule__VideoDescription__Group_3_5__0__Impl : ( 'text' ) ;
    public final void rule__VideoDescription__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2027:1: ( ( 'text' ) )
            // InternalYtpDsl.g:2028:1: ( 'text' )
            {
            // InternalYtpDsl.g:2028:1: ( 'text' )
            // InternalYtpDsl.g:2029:2: 'text'
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_5__1"
    // InternalYtpDsl.g:2038:1: rule__VideoDescription__Group_3_5__1 : rule__VideoDescription__Group_3_5__1__Impl ;
    public final void rule__VideoDescription__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2042:1: ( rule__VideoDescription__Group_3_5__1__Impl )
            // InternalYtpDsl.g:2043:2: rule__VideoDescription__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__1"


    // $ANTLR start "rule__VideoDescription__Group_3_5__1__Impl"
    // InternalYtpDsl.g:2049:1: rule__VideoDescription__Group_3_5__1__Impl : ( ( rule__VideoDescription__TextAssignment_3_5_1 ) ) ;
    public final void rule__VideoDescription__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2053:1: ( ( ( rule__VideoDescription__TextAssignment_3_5_1 ) ) )
            // InternalYtpDsl.g:2054:1: ( ( rule__VideoDescription__TextAssignment_3_5_1 ) )
            {
            // InternalYtpDsl.g:2054:1: ( ( rule__VideoDescription__TextAssignment_3_5_1 ) )
            // InternalYtpDsl.g:2055:2: ( rule__VideoDescription__TextAssignment_3_5_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextAssignment_3_5_1()); 
            // InternalYtpDsl.g:2056:2: ( rule__VideoDescription__TextAssignment_3_5_1 )
            // InternalYtpDsl.g:2056:3: rule__VideoDescription__TextAssignment_3_5_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__TextAssignment_3_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getTextAssignment_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__1__Impl"


    // $ANTLR start "rule__VideoText__Group__0"
    // InternalYtpDsl.g:2065:1: rule__VideoText__Group__0 : rule__VideoText__Group__0__Impl rule__VideoText__Group__1 ;
    public final void rule__VideoText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2069:1: ( rule__VideoText__Group__0__Impl rule__VideoText__Group__1 )
            // InternalYtpDsl.g:2070:2: rule__VideoText__Group__0__Impl rule__VideoText__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VideoText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__0"


    // $ANTLR start "rule__VideoText__Group__0__Impl"
    // InternalYtpDsl.g:2077:1: rule__VideoText__Group__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2081:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalYtpDsl.g:2082:1: ( RULE_LEFT_BRACKET )
            {
            // InternalYtpDsl.g:2082:1: ( RULE_LEFT_BRACKET )
            // InternalYtpDsl.g:2083:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoTextAccess().getLEFT_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getLEFT_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__0__Impl"


    // $ANTLR start "rule__VideoText__Group__1"
    // InternalYtpDsl.g:2092:1: rule__VideoText__Group__1 : rule__VideoText__Group__1__Impl rule__VideoText__Group__2 ;
    public final void rule__VideoText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2096:1: ( rule__VideoText__Group__1__Impl rule__VideoText__Group__2 )
            // InternalYtpDsl.g:2097:2: rule__VideoText__Group__1__Impl rule__VideoText__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VideoText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__1"


    // $ANTLR start "rule__VideoText__Group__1__Impl"
    // InternalYtpDsl.g:2104:1: rule__VideoText__Group__1__Impl : ( 'content' ) ;
    public final void rule__VideoText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2108:1: ( ( 'content' ) )
            // InternalYtpDsl.g:2109:1: ( 'content' )
            {
            // InternalYtpDsl.g:2109:1: ( 'content' )
            // InternalYtpDsl.g:2110:2: 'content'
            {
             before(grammarAccess.getVideoTextAccess().getContentKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getContentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__1__Impl"


    // $ANTLR start "rule__VideoText__Group__2"
    // InternalYtpDsl.g:2119:1: rule__VideoText__Group__2 : rule__VideoText__Group__2__Impl rule__VideoText__Group__3 ;
    public final void rule__VideoText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2123:1: ( rule__VideoText__Group__2__Impl rule__VideoText__Group__3 )
            // InternalYtpDsl.g:2124:2: rule__VideoText__Group__2__Impl rule__VideoText__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__VideoText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__2"


    // $ANTLR start "rule__VideoText__Group__2__Impl"
    // InternalYtpDsl.g:2131:1: rule__VideoText__Group__2__Impl : ( ( rule__VideoText__ContentAssignment_2 ) ) ;
    public final void rule__VideoText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2135:1: ( ( ( rule__VideoText__ContentAssignment_2 ) ) )
            // InternalYtpDsl.g:2136:1: ( ( rule__VideoText__ContentAssignment_2 ) )
            {
            // InternalYtpDsl.g:2136:1: ( ( rule__VideoText__ContentAssignment_2 ) )
            // InternalYtpDsl.g:2137:2: ( rule__VideoText__ContentAssignment_2 )
            {
             before(grammarAccess.getVideoTextAccess().getContentAssignment_2()); 
            // InternalYtpDsl.g:2138:2: ( rule__VideoText__ContentAssignment_2 )
            // InternalYtpDsl.g:2138:3: rule__VideoText__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__2__Impl"


    // $ANTLR start "rule__VideoText__Group__3"
    // InternalYtpDsl.g:2146:1: rule__VideoText__Group__3 : rule__VideoText__Group__3__Impl rule__VideoText__Group__4 ;
    public final void rule__VideoText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2150:1: ( rule__VideoText__Group__3__Impl rule__VideoText__Group__4 )
            // InternalYtpDsl.g:2151:2: rule__VideoText__Group__3__Impl rule__VideoText__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__VideoText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__3"


    // $ANTLR start "rule__VideoText__Group__3__Impl"
    // InternalYtpDsl.g:2158:1: rule__VideoText__Group__3__Impl : ( 'position' ) ;
    public final void rule__VideoText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2162:1: ( ( 'position' ) )
            // InternalYtpDsl.g:2163:1: ( 'position' )
            {
            // InternalYtpDsl.g:2163:1: ( 'position' )
            // InternalYtpDsl.g:2164:2: 'position'
            {
             before(grammarAccess.getVideoTextAccess().getPositionKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getPositionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__3__Impl"


    // $ANTLR start "rule__VideoText__Group__4"
    // InternalYtpDsl.g:2173:1: rule__VideoText__Group__4 : rule__VideoText__Group__4__Impl rule__VideoText__Group__5 ;
    public final void rule__VideoText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2177:1: ( rule__VideoText__Group__4__Impl rule__VideoText__Group__5 )
            // InternalYtpDsl.g:2178:2: rule__VideoText__Group__4__Impl rule__VideoText__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__VideoText__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__4"


    // $ANTLR start "rule__VideoText__Group__4__Impl"
    // InternalYtpDsl.g:2185:1: rule__VideoText__Group__4__Impl : ( ( rule__VideoText__PositionAssignment_4 ) ) ;
    public final void rule__VideoText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2189:1: ( ( ( rule__VideoText__PositionAssignment_4 ) ) )
            // InternalYtpDsl.g:2190:1: ( ( rule__VideoText__PositionAssignment_4 ) )
            {
            // InternalYtpDsl.g:2190:1: ( ( rule__VideoText__PositionAssignment_4 ) )
            // InternalYtpDsl.g:2191:2: ( rule__VideoText__PositionAssignment_4 )
            {
             before(grammarAccess.getVideoTextAccess().getPositionAssignment_4()); 
            // InternalYtpDsl.g:2192:2: ( rule__VideoText__PositionAssignment_4 )
            // InternalYtpDsl.g:2192:3: rule__VideoText__PositionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__PositionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getPositionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__4__Impl"


    // $ANTLR start "rule__VideoText__Group__5"
    // InternalYtpDsl.g:2200:1: rule__VideoText__Group__5 : rule__VideoText__Group__5__Impl rule__VideoText__Group__6 ;
    public final void rule__VideoText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2204:1: ( rule__VideoText__Group__5__Impl rule__VideoText__Group__6 )
            // InternalYtpDsl.g:2205:2: rule__VideoText__Group__5__Impl rule__VideoText__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__VideoText__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__5"


    // $ANTLR start "rule__VideoText__Group__5__Impl"
    // InternalYtpDsl.g:2212:1: rule__VideoText__Group__5__Impl : ( ( rule__VideoText__Group_5__0 )? ) ;
    public final void rule__VideoText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2216:1: ( ( ( rule__VideoText__Group_5__0 )? ) )
            // InternalYtpDsl.g:2217:1: ( ( rule__VideoText__Group_5__0 )? )
            {
            // InternalYtpDsl.g:2217:1: ( ( rule__VideoText__Group_5__0 )? )
            // InternalYtpDsl.g:2218:2: ( rule__VideoText__Group_5__0 )?
            {
             before(grammarAccess.getVideoTextAccess().getGroup_5()); 
            // InternalYtpDsl.g:2219:2: ( rule__VideoText__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalYtpDsl.g:2219:3: rule__VideoText__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoText__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoTextAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__5__Impl"


    // $ANTLR start "rule__VideoText__Group__6"
    // InternalYtpDsl.g:2227:1: rule__VideoText__Group__6 : rule__VideoText__Group__6__Impl rule__VideoText__Group__7 ;
    public final void rule__VideoText__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2231:1: ( rule__VideoText__Group__6__Impl rule__VideoText__Group__7 )
            // InternalYtpDsl.g:2232:2: rule__VideoText__Group__6__Impl rule__VideoText__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__VideoText__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__6"


    // $ANTLR start "rule__VideoText__Group__6__Impl"
    // InternalYtpDsl.g:2239:1: rule__VideoText__Group__6__Impl : ( ( rule__VideoText__Group_6__0 )? ) ;
    public final void rule__VideoText__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2243:1: ( ( ( rule__VideoText__Group_6__0 )? ) )
            // InternalYtpDsl.g:2244:1: ( ( rule__VideoText__Group_6__0 )? )
            {
            // InternalYtpDsl.g:2244:1: ( ( rule__VideoText__Group_6__0 )? )
            // InternalYtpDsl.g:2245:2: ( rule__VideoText__Group_6__0 )?
            {
             before(grammarAccess.getVideoTextAccess().getGroup_6()); 
            // InternalYtpDsl.g:2246:2: ( rule__VideoText__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalYtpDsl.g:2246:3: rule__VideoText__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoText__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoTextAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__6__Impl"


    // $ANTLR start "rule__VideoText__Group__7"
    // InternalYtpDsl.g:2254:1: rule__VideoText__Group__7 : rule__VideoText__Group__7__Impl ;
    public final void rule__VideoText__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2258:1: ( rule__VideoText__Group__7__Impl )
            // InternalYtpDsl.g:2259:2: rule__VideoText__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__7"


    // $ANTLR start "rule__VideoText__Group__7__Impl"
    // InternalYtpDsl.g:2265:1: rule__VideoText__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoText__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2269:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalYtpDsl.g:2270:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalYtpDsl.g:2270:1: ( RULE_RIGHT_BRACKET )
            // InternalYtpDsl.g:2271:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoTextAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group__7__Impl"


    // $ANTLR start "rule__VideoText__Group_5__0"
    // InternalYtpDsl.g:2281:1: rule__VideoText__Group_5__0 : rule__VideoText__Group_5__0__Impl rule__VideoText__Group_5__1 ;
    public final void rule__VideoText__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2285:1: ( rule__VideoText__Group_5__0__Impl rule__VideoText__Group_5__1 )
            // InternalYtpDsl.g:2286:2: rule__VideoText__Group_5__0__Impl rule__VideoText__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoText__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_5__0"


    // $ANTLR start "rule__VideoText__Group_5__0__Impl"
    // InternalYtpDsl.g:2293:1: rule__VideoText__Group_5__0__Impl : ( 'color' ) ;
    public final void rule__VideoText__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2297:1: ( ( 'color' ) )
            // InternalYtpDsl.g:2298:1: ( 'color' )
            {
            // InternalYtpDsl.g:2298:1: ( 'color' )
            // InternalYtpDsl.g:2299:2: 'color'
            {
             before(grammarAccess.getVideoTextAccess().getColorKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getColorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_5__0__Impl"


    // $ANTLR start "rule__VideoText__Group_5__1"
    // InternalYtpDsl.g:2308:1: rule__VideoText__Group_5__1 : rule__VideoText__Group_5__1__Impl ;
    public final void rule__VideoText__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2312:1: ( rule__VideoText__Group_5__1__Impl )
            // InternalYtpDsl.g:2313:2: rule__VideoText__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_5__1"


    // $ANTLR start "rule__VideoText__Group_5__1__Impl"
    // InternalYtpDsl.g:2319:1: rule__VideoText__Group_5__1__Impl : ( ( rule__VideoText__ColorAssignment_5_1 ) ) ;
    public final void rule__VideoText__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2323:1: ( ( ( rule__VideoText__ColorAssignment_5_1 ) ) )
            // InternalYtpDsl.g:2324:1: ( ( rule__VideoText__ColorAssignment_5_1 ) )
            {
            // InternalYtpDsl.g:2324:1: ( ( rule__VideoText__ColorAssignment_5_1 ) )
            // InternalYtpDsl.g:2325:2: ( rule__VideoText__ColorAssignment_5_1 )
            {
             before(grammarAccess.getVideoTextAccess().getColorAssignment_5_1()); 
            // InternalYtpDsl.g:2326:2: ( rule__VideoText__ColorAssignment_5_1 )
            // InternalYtpDsl.g:2326:3: rule__VideoText__ColorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__ColorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getColorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_5__1__Impl"


    // $ANTLR start "rule__VideoText__Group_6__0"
    // InternalYtpDsl.g:2335:1: rule__VideoText__Group_6__0 : rule__VideoText__Group_6__0__Impl rule__VideoText__Group_6__1 ;
    public final void rule__VideoText__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2339:1: ( rule__VideoText__Group_6__0__Impl rule__VideoText__Group_6__1 )
            // InternalYtpDsl.g:2340:2: rule__VideoText__Group_6__0__Impl rule__VideoText__Group_6__1
            {
            pushFollow(FOLLOW_20);
            rule__VideoText__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_6__0"


    // $ANTLR start "rule__VideoText__Group_6__0__Impl"
    // InternalYtpDsl.g:2347:1: rule__VideoText__Group_6__0__Impl : ( 'size' ) ;
    public final void rule__VideoText__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2351:1: ( ( 'size' ) )
            // InternalYtpDsl.g:2352:1: ( 'size' )
            {
            // InternalYtpDsl.g:2352:1: ( 'size' )
            // InternalYtpDsl.g:2353:2: 'size'
            {
             before(grammarAccess.getVideoTextAccess().getSizeKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getSizeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_6__0__Impl"


    // $ANTLR start "rule__VideoText__Group_6__1"
    // InternalYtpDsl.g:2362:1: rule__VideoText__Group_6__1 : rule__VideoText__Group_6__1__Impl ;
    public final void rule__VideoText__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2366:1: ( rule__VideoText__Group_6__1__Impl )
            // InternalYtpDsl.g:2367:2: rule__VideoText__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_6__1"


    // $ANTLR start "rule__VideoText__Group_6__1__Impl"
    // InternalYtpDsl.g:2373:1: rule__VideoText__Group_6__1__Impl : ( ( rule__VideoText__SizeAssignment_6_1 ) ) ;
    public final void rule__VideoText__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2377:1: ( ( ( rule__VideoText__SizeAssignment_6_1 ) ) )
            // InternalYtpDsl.g:2378:1: ( ( rule__VideoText__SizeAssignment_6_1 ) )
            {
            // InternalYtpDsl.g:2378:1: ( ( rule__VideoText__SizeAssignment_6_1 ) )
            // InternalYtpDsl.g:2379:2: ( rule__VideoText__SizeAssignment_6_1 )
            {
             before(grammarAccess.getVideoTextAccess().getSizeAssignment_6_1()); 
            // InternalYtpDsl.g:2380:2: ( rule__VideoText__SizeAssignment_6_1 )
            // InternalYtpDsl.g:2380:3: rule__VideoText__SizeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__SizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getSizeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__Group_6__1__Impl"


    // $ANTLR start "rule__BlackWhiteFilter__Group__0"
    // InternalYtpDsl.g:2389:1: rule__BlackWhiteFilter__Group__0 : rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1 ;
    public final void rule__BlackWhiteFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2393:1: ( rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1 )
            // InternalYtpDsl.g:2394:2: rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__BlackWhiteFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__0"


    // $ANTLR start "rule__BlackWhiteFilter__Group__0__Impl"
    // InternalYtpDsl.g:2401:1: rule__BlackWhiteFilter__Group__0__Impl : ( () ) ;
    public final void rule__BlackWhiteFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2405:1: ( ( () ) )
            // InternalYtpDsl.g:2406:1: ( () )
            {
            // InternalYtpDsl.g:2406:1: ( () )
            // InternalYtpDsl.g:2407:2: ()
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0()); 
            // InternalYtpDsl.g:2408:2: ()
            // InternalYtpDsl.g:2408:3: 
            {
            }

             after(grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__0__Impl"


    // $ANTLR start "rule__BlackWhiteFilter__Group__1"
    // InternalYtpDsl.g:2416:1: rule__BlackWhiteFilter__Group__1 : rule__BlackWhiteFilter__Group__1__Impl ;
    public final void rule__BlackWhiteFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2420:1: ( rule__BlackWhiteFilter__Group__1__Impl )
            // InternalYtpDsl.g:2421:2: rule__BlackWhiteFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__1"


    // $ANTLR start "rule__BlackWhiteFilter__Group__1__Impl"
    // InternalYtpDsl.g:2427:1: rule__BlackWhiteFilter__Group__1__Impl : ( 'b&w' ) ;
    public final void rule__BlackWhiteFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2431:1: ( ( 'b&w' ) )
            // InternalYtpDsl.g:2432:1: ( 'b&w' )
            {
            // InternalYtpDsl.g:2432:1: ( 'b&w' )
            // InternalYtpDsl.g:2433:2: 'b&w'
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__1__Impl"


    // $ANTLR start "rule__NegateFilter__Group__0"
    // InternalYtpDsl.g:2443:1: rule__NegateFilter__Group__0 : rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1 ;
    public final void rule__NegateFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2447:1: ( rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1 )
            // InternalYtpDsl.g:2448:2: rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__NegateFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__0"


    // $ANTLR start "rule__NegateFilter__Group__0__Impl"
    // InternalYtpDsl.g:2455:1: rule__NegateFilter__Group__0__Impl : ( () ) ;
    public final void rule__NegateFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2459:1: ( ( () ) )
            // InternalYtpDsl.g:2460:1: ( () )
            {
            // InternalYtpDsl.g:2460:1: ( () )
            // InternalYtpDsl.g:2461:2: ()
            {
             before(grammarAccess.getNegateFilterAccess().getNegateFilterAction_0()); 
            // InternalYtpDsl.g:2462:2: ()
            // InternalYtpDsl.g:2462:3: 
            {
            }

             after(grammarAccess.getNegateFilterAccess().getNegateFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__0__Impl"


    // $ANTLR start "rule__NegateFilter__Group__1"
    // InternalYtpDsl.g:2470:1: rule__NegateFilter__Group__1 : rule__NegateFilter__Group__1__Impl ;
    public final void rule__NegateFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2474:1: ( rule__NegateFilter__Group__1__Impl )
            // InternalYtpDsl.g:2475:2: rule__NegateFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__1"


    // $ANTLR start "rule__NegateFilter__Group__1__Impl"
    // InternalYtpDsl.g:2481:1: rule__NegateFilter__Group__1__Impl : ( 'negate' ) ;
    public final void rule__NegateFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2485:1: ( ( 'negate' ) )
            // InternalYtpDsl.g:2486:1: ( 'negate' )
            {
            // InternalYtpDsl.g:2486:1: ( 'negate' )
            // InternalYtpDsl.g:2487:2: 'negate'
            {
             before(grammarAccess.getNegateFilterAccess().getNegateKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNegateFilterAccess().getNegateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__1__Impl"


    // $ANTLR start "rule__FlipFilter__Group__0"
    // InternalYtpDsl.g:2497:1: rule__FlipFilter__Group__0 : rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1 ;
    public final void rule__FlipFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2501:1: ( rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1 )
            // InternalYtpDsl.g:2502:2: rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FlipFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__0"


    // $ANTLR start "rule__FlipFilter__Group__0__Impl"
    // InternalYtpDsl.g:2509:1: rule__FlipFilter__Group__0__Impl : ( 'flip' ) ;
    public final void rule__FlipFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2513:1: ( ( 'flip' ) )
            // InternalYtpDsl.g:2514:1: ( 'flip' )
            {
            // InternalYtpDsl.g:2514:1: ( 'flip' )
            // InternalYtpDsl.g:2515:2: 'flip'
            {
             before(grammarAccess.getFlipFilterAccess().getFlipKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFlipFilterAccess().getFlipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__0__Impl"


    // $ANTLR start "rule__FlipFilter__Group__1"
    // InternalYtpDsl.g:2524:1: rule__FlipFilter__Group__1 : rule__FlipFilter__Group__1__Impl ;
    public final void rule__FlipFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2528:1: ( rule__FlipFilter__Group__1__Impl )
            // InternalYtpDsl.g:2529:2: rule__FlipFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__1"


    // $ANTLR start "rule__FlipFilter__Group__1__Impl"
    // InternalYtpDsl.g:2535:1: rule__FlipFilter__Group__1__Impl : ( ( rule__FlipFilter__OrientationAssignment_1 ) ) ;
    public final void rule__FlipFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2539:1: ( ( ( rule__FlipFilter__OrientationAssignment_1 ) ) )
            // InternalYtpDsl.g:2540:1: ( ( rule__FlipFilter__OrientationAssignment_1 ) )
            {
            // InternalYtpDsl.g:2540:1: ( ( rule__FlipFilter__OrientationAssignment_1 ) )
            // InternalYtpDsl.g:2541:2: ( rule__FlipFilter__OrientationAssignment_1 )
            {
             before(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1()); 
            // InternalYtpDsl.g:2542:2: ( rule__FlipFilter__OrientationAssignment_1 )
            // InternalYtpDsl.g:2542:3: rule__FlipFilter__OrientationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__OrientationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__1__Impl"


    // $ANTLR start "rule__YtpModel__InformationAssignment_0"
    // InternalYtpDsl.g:2551:1: rule__YtpModel__InformationAssignment_0 : ( ruleGeneratorInformation ) ;
    public final void rule__YtpModel__InformationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2555:1: ( ( ruleGeneratorInformation ) )
            // InternalYtpDsl.g:2556:2: ( ruleGeneratorInformation )
            {
            // InternalYtpDsl.g:2556:2: ( ruleGeneratorInformation )
            // InternalYtpDsl.g:2557:3: ruleGeneratorInformation
            {
             before(grammarAccess.getYtpModelAccess().getInformationGeneratorInformationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneratorInformation();

            state._fsp--;

             after(grammarAccess.getYtpModelAccess().getInformationGeneratorInformationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YtpModel__InformationAssignment_0"


    // $ANTLR start "rule__YtpModel__MediasAssignment_1"
    // InternalYtpDsl.g:2566:1: rule__YtpModel__MediasAssignment_1 : ( ruleMedia ) ;
    public final void rule__YtpModel__MediasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2570:1: ( ( ruleMedia ) )
            // InternalYtpDsl.g:2571:2: ( ruleMedia )
            {
            // InternalYtpDsl.g:2571:2: ( ruleMedia )
            // InternalYtpDsl.g:2572:3: ruleMedia
            {
             before(grammarAccess.getYtpModelAccess().getMediasMediaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMedia();

            state._fsp--;

             after(grammarAccess.getYtpModelAccess().getMediasMediaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YtpModel__MediasAssignment_1"


    // $ANTLR start "rule__GeneratorInformation__AuthorNameAssignment_1_1"
    // InternalYtpDsl.g:2581:1: rule__GeneratorInformation__AuthorNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__GeneratorInformation__AuthorNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2585:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2586:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2586:2: ( RULE_STRING )
            // InternalYtpDsl.g:2587:3: RULE_STRING
            {
             before(grammarAccess.getGeneratorInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__AuthorNameAssignment_1_1"


    // $ANTLR start "rule__GeneratorInformation__VersionAssignment_2_1"
    // InternalYtpDsl.g:2596:1: rule__GeneratorInformation__VersionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__GeneratorInformation__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2600:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2601:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2601:2: ( RULE_STRING )
            // InternalYtpDsl.g:2602:3: RULE_STRING
            {
             before(grammarAccess.getGeneratorInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__VersionAssignment_2_1"


    // $ANTLR start "rule__GeneratorInformation__CreationDateAssignment_3_1"
    // InternalYtpDsl.g:2611:1: rule__GeneratorInformation__CreationDateAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__GeneratorInformation__CreationDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2615:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2616:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2616:2: ( RULE_STRING )
            // InternalYtpDsl.g:2617:3: RULE_STRING
            {
             before(grammarAccess.getGeneratorInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__CreationDateAssignment_3_1"


    // $ANTLR start "rule__GeneratorInformation__FfmpegAssignment_4_1"
    // InternalYtpDsl.g:2626:1: rule__GeneratorInformation__FfmpegAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__GeneratorInformation__FfmpegAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2630:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2631:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2631:2: ( RULE_STRING )
            // InternalYtpDsl.g:2632:3: RULE_STRING
            {
             before(grammarAccess.getGeneratorInformationAccess().getFfmpegSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getFfmpegSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__FfmpegAssignment_4_1"


    // $ANTLR start "rule__GeneratorInformation__FfprobeAssignment_5_1"
    // InternalYtpDsl.g:2641:1: rule__GeneratorInformation__FfprobeAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__GeneratorInformation__FfprobeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2645:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2646:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2646:2: ( RULE_STRING )
            // InternalYtpDsl.g:2647:3: RULE_STRING
            {
             before(grammarAccess.getGeneratorInformationAccess().getFfprobeSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneratorInformationAccess().getFfprobeSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__FfprobeAssignment_5_1"


    // $ANTLR start "rule__GeneratorInformation__LibraryAssignment_6"
    // InternalYtpDsl.g:2656:1: rule__GeneratorInformation__LibraryAssignment_6 : ( ruleVideoLibrary ) ;
    public final void rule__GeneratorInformation__LibraryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2660:1: ( ( ruleVideoLibrary ) )
            // InternalYtpDsl.g:2661:2: ( ruleVideoLibrary )
            {
            // InternalYtpDsl.g:2661:2: ( ruleVideoLibrary )
            // InternalYtpDsl.g:2662:3: ruleVideoLibrary
            {
             before(grammarAccess.getGeneratorInformationAccess().getLibraryVideoLibraryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoLibrary();

            state._fsp--;

             after(grammarAccess.getGeneratorInformationAccess().getLibraryVideoLibraryParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorInformation__LibraryAssignment_6"


    // $ANTLR start "rule__VideoLibrary__FolderAssignment_1"
    // InternalYtpDsl.g:2671:1: rule__VideoLibrary__FolderAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VideoLibrary__FolderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2675:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2676:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2676:2: ( RULE_STRING )
            // InternalYtpDsl.g:2677:3: RULE_STRING
            {
             before(grammarAccess.getVideoLibraryAccess().getFolderSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoLibraryAccess().getFolderSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__FolderAssignment_1"


    // $ANTLR start "rule__VideoLibrary__ExtensionAssignment_3"
    // InternalYtpDsl.g:2686:1: rule__VideoLibrary__ExtensionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VideoLibrary__ExtensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2690:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2691:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2691:2: ( RULE_STRING )
            // InternalYtpDsl.g:2692:3: RULE_STRING
            {
             before(grammarAccess.getVideoLibraryAccess().getExtensionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoLibraryAccess().getExtensionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoLibrary__ExtensionAssignment_3"


    // $ANTLR start "rule__Media__DescriptionAssignment_1"
    // InternalYtpDsl.g:2701:1: rule__Media__DescriptionAssignment_1 : ( ruleMediaDescription ) ;
    public final void rule__Media__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2705:1: ( ( ruleMediaDescription ) )
            // InternalYtpDsl.g:2706:2: ( ruleMediaDescription )
            {
            // InternalYtpDsl.g:2706:2: ( ruleMediaDescription )
            // InternalYtpDsl.g:2707:3: ruleMediaDescription
            {
             before(grammarAccess.getMediaAccess().getDescriptionMediaDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMediaDescription();

            state._fsp--;

             after(grammarAccess.getMediaAccess().getDescriptionMediaDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__DescriptionAssignment_1"


    // $ANTLR start "rule__ImageDescription__ImageidAssignment_1"
    // InternalYtpDsl.g:2716:1: rule__ImageDescription__ImageidAssignment_1 : ( RULE_ID ) ;
    public final void rule__ImageDescription__ImageidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2720:1: ( ( RULE_ID ) )
            // InternalYtpDsl.g:2721:2: ( RULE_ID )
            {
            // InternalYtpDsl.g:2721:2: ( RULE_ID )
            // InternalYtpDsl.g:2722:3: RULE_ID
            {
             before(grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__ImageidAssignment_1"


    // $ANTLR start "rule__ImageDescription__LocationAssignment_2"
    // InternalYtpDsl.g:2731:1: rule__ImageDescription__LocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2735:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2736:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2736:2: ( RULE_STRING )
            // InternalYtpDsl.g:2737:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__LocationAssignment_2"


    // $ANTLR start "rule__ImageDescription__TopAssignment_3_1_1"
    // InternalYtpDsl.g:2746:1: rule__ImageDescription__TopAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__TopAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2750:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2751:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2751:2: ( RULE_STRING )
            // InternalYtpDsl.g:2752:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__TopAssignment_3_1_1"


    // $ANTLR start "rule__ImageDescription__BottomAssignment_3_2_1"
    // InternalYtpDsl.g:2761:1: rule__ImageDescription__BottomAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__BottomAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2765:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2766:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2766:2: ( RULE_STRING )
            // InternalYtpDsl.g:2767:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__BottomAssignment_3_2_1"


    // $ANTLR start "rule__VideoDescription__VideoidAssignment_1"
    // InternalYtpDsl.g:2776:1: rule__VideoDescription__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoDescription__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2780:1: ( ( RULE_ID ) )
            // InternalYtpDsl.g:2781:2: ( RULE_ID )
            {
            // InternalYtpDsl.g:2781:2: ( RULE_ID )
            // InternalYtpDsl.g:2782:3: RULE_ID
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__VideoidAssignment_1"


    // $ANTLR start "rule__VideoDescription__LocationAssignment_2"
    // InternalYtpDsl.g:2791:1: rule__VideoDescription__LocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoDescription__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2795:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2796:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2796:2: ( RULE_STRING )
            // InternalYtpDsl.g:2797:3: RULE_STRING
            {
             before(grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__LocationAssignment_2"


    // $ANTLR start "rule__VideoDescription__DurationAssignment_3_1_1"
    // InternalYtpDsl.g:2806:1: rule__VideoDescription__DurationAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__VideoDescription__DurationAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2810:1: ( ( RULE_INT ) )
            // InternalYtpDsl.g:2811:2: ( RULE_INT )
            {
            // InternalYtpDsl.g:2811:2: ( RULE_INT )
            // InternalYtpDsl.g:2812:3: RULE_INT
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDurationINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__DurationAssignment_3_1_1"


    // $ANTLR start "rule__VideoDescription__ProbabilityAssignment_3_2_1"
    // InternalYtpDsl.g:2821:1: rule__VideoDescription__ProbabilityAssignment_3_2_1 : ( RULE_INT ) ;
    public final void rule__VideoDescription__ProbabilityAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2825:1: ( ( RULE_INT ) )
            // InternalYtpDsl.g:2826:2: ( RULE_INT )
            {
            // InternalYtpDsl.g:2826:2: ( RULE_INT )
            // InternalYtpDsl.g:2827:3: RULE_INT
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityINTTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getProbabilityINTTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__ProbabilityAssignment_3_2_1"


    // $ANTLR start "rule__VideoDescription__DescriptionAssignment_3_3_1"
    // InternalYtpDsl.g:2836:1: rule__VideoDescription__DescriptionAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__VideoDescription__DescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2840:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2841:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2841:2: ( RULE_STRING )
            // InternalYtpDsl.g:2842:3: RULE_STRING
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__DescriptionAssignment_3_3_1"


    // $ANTLR start "rule__VideoDescription__FilterAssignment_3_4_1"
    // InternalYtpDsl.g:2851:1: rule__VideoDescription__FilterAssignment_3_4_1 : ( ruleFilter ) ;
    public final void rule__VideoDescription__FilterAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2855:1: ( ( ruleFilter ) )
            // InternalYtpDsl.g:2856:2: ( ruleFilter )
            {
            // InternalYtpDsl.g:2856:2: ( ruleFilter )
            // InternalYtpDsl.g:2857:3: ruleFilter
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__FilterAssignment_3_4_1"


    // $ANTLR start "rule__VideoDescription__TextAssignment_3_5_1"
    // InternalYtpDsl.g:2866:1: rule__VideoDescription__TextAssignment_3_5_1 : ( ruleVideoText ) ;
    public final void rule__VideoDescription__TextAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2870:1: ( ( ruleVideoText ) )
            // InternalYtpDsl.g:2871:2: ( ruleVideoText )
            {
            // InternalYtpDsl.g:2871:2: ( ruleVideoText )
            // InternalYtpDsl.g:2872:3: ruleVideoText
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextVideoTextParserRuleCall_3_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoText();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getTextVideoTextParserRuleCall_3_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__TextAssignment_3_5_1"


    // $ANTLR start "rule__VideoText__ContentAssignment_2"
    // InternalYtpDsl.g:2881:1: rule__VideoText__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoText__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2885:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2886:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2886:2: ( RULE_STRING )
            // InternalYtpDsl.g:2887:3: RULE_STRING
            {
             before(grammarAccess.getVideoTextAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getContentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__ContentAssignment_2"


    // $ANTLR start "rule__VideoText__PositionAssignment_4"
    // InternalYtpDsl.g:2896:1: rule__VideoText__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__VideoText__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2900:1: ( ( rulePosition ) )
            // InternalYtpDsl.g:2901:2: ( rulePosition )
            {
            // InternalYtpDsl.g:2901:2: ( rulePosition )
            // InternalYtpDsl.g:2902:3: rulePosition
            {
             before(grammarAccess.getVideoTextAccess().getPositionPositionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getVideoTextAccess().getPositionPositionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__PositionAssignment_4"


    // $ANTLR start "rule__VideoText__ColorAssignment_5_1"
    // InternalYtpDsl.g:2911:1: rule__VideoText__ColorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__VideoText__ColorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2915:1: ( ( RULE_STRING ) )
            // InternalYtpDsl.g:2916:2: ( RULE_STRING )
            {
            // InternalYtpDsl.g:2916:2: ( RULE_STRING )
            // InternalYtpDsl.g:2917:3: RULE_STRING
            {
             before(grammarAccess.getVideoTextAccess().getColorSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getColorSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__ColorAssignment_5_1"


    // $ANTLR start "rule__VideoText__SizeAssignment_6_1"
    // InternalYtpDsl.g:2926:1: rule__VideoText__SizeAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__VideoText__SizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2930:1: ( ( RULE_INT ) )
            // InternalYtpDsl.g:2931:2: ( RULE_INT )
            {
            // InternalYtpDsl.g:2931:2: ( RULE_INT )
            // InternalYtpDsl.g:2932:3: RULE_INT
            {
             before(grammarAccess.getVideoTextAccess().getSizeINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getSizeINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoText__SizeAssignment_6_1"


    // $ANTLR start "rule__FlipFilter__OrientationAssignment_1"
    // InternalYtpDsl.g:2941:1: rule__FlipFilter__OrientationAssignment_1 : ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) ) ;
    public final void rule__FlipFilter__OrientationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalYtpDsl.g:2945:1: ( ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) ) )
            // InternalYtpDsl.g:2946:2: ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) )
            {
            // InternalYtpDsl.g:2946:2: ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) )
            // InternalYtpDsl.g:2947:3: ( rule__FlipFilter__OrientationAlternatives_1_0 )
            {
             before(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0()); 
            // InternalYtpDsl.g:2948:3: ( rule__FlipFilter__OrientationAlternatives_1_0 )
            // InternalYtpDsl.g:2948:4: rule__FlipFilter__OrientationAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__OrientationAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__OrientationAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001F00000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000018000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000F0000L});

}