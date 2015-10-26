package co.edu.uniandes.jsonToSql.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.jsonToSql.services.GrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LITERACONFIG", "RULE_COLON", "RULE_LEFTPARENTESIS", "RULE_LITERACONNECTION", "RULE_RIGHTPARENTESIS", "RULE_LITERALMERGEDFIELDS", "RULE_LEFTBRACKET", "RULE_RIGHTBRACKET", "RULE_COMA", "RULE_LITERALURL", "RULE_LITERALUSERNAME", "RULE_LITERALPASSWORD", "RULE_LITERALFIELDS", "RULE_LITERALATTRIBUTENAMES", "RULE_LITERALTABLENAME", "RULE_SINGLEQUOTE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\'String\\''", "'\\'Integer\\''", "'\\'Float\\''", "'\\'Boolean\\''"
    };
    public static final int RULE_LITERALMERGEDFIELDS=11;
    public static final int RULE_COMA=14;
    public static final int RULE_LITERALUSERNAME=16;
    public static final int RULE_STRING=4;
    public static final int RULE_LITERACONFIG=6;
    public static final int RULE_LITERALFIELDS=18;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_RIGHTBRACKET=13;
    public static final int RULE_SINGLEQUOTE=21;
    public static final int RULE_LITERACONNECTION=9;
    public static final int RULE_LITERALATTRIBUTENAMES=19;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=25;
    public static final int RULE_RIGHTPARENTESIS=10;
    public static final int RULE_LITERALTABLENAME=20;
    public static final int RULE_COLON=7;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_LITERALPASSWORD=17;
    public static final int RULE_LEFTBRACKET=12;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=22;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_LITERALURL=15;
    public static final int RULE_LEFTPARENTESIS=8;

    // delegates
    // delegators


        public InternalGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g"; }


     
     	private GrammarGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GrammarGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleConfig"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:60:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:61:1: ( ruleConfig EOF )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:62:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfig_in_entryRuleConfig61);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfig68); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:69:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:73:2: ( ( ( rule__Config__Group__0 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:74:1: ( ( rule__Config__Group__0 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:74:1: ( ( rule__Config__Group__0 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:75:1: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:76:1: ( rule__Config__Group__0 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:76:2: rule__Config__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__0_in_ruleConfig94);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConnection"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:88:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:89:1: ( ruleConnection EOF )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:90:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_entryRuleConnection121);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnection128); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:97:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:101:2: ( ( ( rule__Connection__Group__0 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:102:1: ( ( rule__Connection__Group__0 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:102:1: ( ( rule__Connection__Group__0 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:103:1: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:104:1: ( rule__Connection__Group__0 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:104:2: rule__Connection__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0_in_ruleConnection154);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleMergedField"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:116:1: entryRuleMergedField : ruleMergedField EOF ;
    public final void entryRuleMergedField() throws RecognitionException {
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:117:1: ( ruleMergedField EOF )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:118:1: ruleMergedField EOF
            {
             before(grammarAccess.getMergedFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_entryRuleMergedField181);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getMergedFieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMergedField188); 

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
    // $ANTLR end "entryRuleMergedField"


    // $ANTLR start "ruleMergedField"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:125:1: ruleMergedField : ( ( rule__MergedField__Group__0 ) ) ;
    public final void ruleMergedField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:129:2: ( ( ( rule__MergedField__Group__0 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:130:1: ( ( rule__MergedField__Group__0 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:130:1: ( ( rule__MergedField__Group__0 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:131:1: ( rule__MergedField__Group__0 )
            {
             before(grammarAccess.getMergedFieldAccess().getGroup()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:132:1: ( rule__MergedField__Group__0 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:132:2: rule__MergedField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__0_in_ruleMergedField214);
            rule__MergedField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleMergedField"


    // $ANTLR start "entryRuleEString"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:145:1: ( ruleEString EOF )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:160:1: ( rule__EString__Alternatives )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttributeName"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:172:1: entryRuleAttributeName : ruleAttributeName EOF ;
    public final void entryRuleAttributeName() throws RecognitionException {
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:173:1: ( ruleAttributeName EOF )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:174:1: ruleAttributeName EOF
            {
             before(grammarAccess.getAttributeNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_entryRuleAttributeName301);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getAttributeNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeName308); 

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
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:181:1: ruleAttributeName : ( ( rule__AttributeName__Group__0 ) ) ;
    public final void ruleAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:185:2: ( ( ( rule__AttributeName__Group__0 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:186:1: ( ( rule__AttributeName__Group__0 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:186:1: ( ( rule__AttributeName__Group__0 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:187:1: ( rule__AttributeName__Group__0 )
            {
             before(grammarAccess.getAttributeNameAccess().getGroup()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:188:1: ( rule__AttributeName__Group__0 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:188:2: rule__AttributeName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__0_in_ruleAttributeName334);
            rule__AttributeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleField"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:200:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:201:1: ( ruleField EOF )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:202:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleField_in_entryRuleField361);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleField368); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:209:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:213:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:214:1: ( ( rule__Field__Group__0 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:214:1: ( ( rule__Field__Group__0 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:215:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:216:1: ( rule__Field__Group__0 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:216:2: rule__Field__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__0_in_ruleField394);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "ruleFieldType"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:229:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:233:1: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:234:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:234:1: ( ( rule__FieldType__Alternatives ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:235:1: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:236:1: ( rule__FieldType__Alternatives )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:236:2: rule__FieldType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType431);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__EString__Alternatives"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:247:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:251:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:252:1: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:252:1: ( RULE_STRING )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:253:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives466); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:258:6: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:258:6: ( RULE_ID )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:259:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives483); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__FieldType__Alternatives"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:269:1: rule__FieldType__Alternatives : ( ( ( '\\'String\\'' ) ) | ( ( '\\'Integer\\'' ) ) | ( ( '\\'Float\\'' ) ) | ( ( '\\'Boolean\\'' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:273:1: ( ( ( '\\'String\\'' ) ) | ( ( '\\'Integer\\'' ) ) | ( ( '\\'Float\\'' ) ) | ( ( '\\'Boolean\\'' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:274:1: ( ( '\\'String\\'' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:274:1: ( ( '\\'String\\'' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:275:1: ( '\\'String\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:276:1: ( '\\'String\\'' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:276:3: '\\'String\\''
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__FieldType__Alternatives516); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:281:6: ( ( '\\'Integer\\'' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:281:6: ( ( '\\'Integer\\'' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:282:1: ( '\\'Integer\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:283:1: ( '\\'Integer\\'' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:283:3: '\\'Integer\\''
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__FieldType__Alternatives537); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:288:6: ( ( '\\'Float\\'' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:288:6: ( ( '\\'Float\\'' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:289:1: ( '\\'Float\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:290:1: ( '\\'Float\\'' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:290:3: '\\'Float\\''
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__FieldType__Alternatives558); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( '\\'Boolean\\'' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( '\\'Boolean\\'' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:296:1: ( '\\'Boolean\\'' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:297:1: ( '\\'Boolean\\'' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:297:3: '\\'Boolean\\''
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__FieldType__Alternatives579); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__Config__Group__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:309:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:313:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:314:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__0612);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__1_in_rule__Config__Group__0615);
            rule__Config__Group__1();

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
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:321:1: rule__Config__Group__0__Impl : ( RULE_LITERACONFIG ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:325:1: ( ( RULE_LITERACONFIG ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:326:1: ( RULE_LITERACONFIG )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:326:1: ( RULE_LITERACONFIG )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:327:1: RULE_LITERACONFIG
            {
             before(grammarAccess.getConfigAccess().getLITERACONFIGTerminalRuleCall_0()); 
            match(input,RULE_LITERACONFIG,FollowSets000.FOLLOW_RULE_LITERACONFIG_in_rule__Config__Group__0__Impl642); 
             after(grammarAccess.getConfigAccess().getLITERACONFIGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:338:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:342:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:343:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1671);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1674);
            rule__Config__Group__2();

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
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:350:1: rule__Config__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:354:1: ( ( RULE_COLON ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:355:1: ( RULE_COLON )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:355:1: ( RULE_COLON )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:356:1: RULE_COLON
            {
             before(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FollowSets000.FOLLOW_RULE_COLON_in_rule__Config__Group__1__Impl701); 
             after(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:367:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:371:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:372:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2730);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2733);
            rule__Config__Group__3();

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
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:379:1: rule__Config__Group__2__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:383:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:384:1: ( RULE_LEFTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:384:1: ( RULE_LEFTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:385:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getConfigAccess().getLEFTPARENTESISTerminalRuleCall_2()); 
            match(input,RULE_LEFTPARENTESIS,FollowSets000.FOLLOW_RULE_LEFTPARENTESIS_in_rule__Config__Group__2__Impl760); 
             after(grammarAccess.getConfigAccess().getLEFTPARENTESISTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:396:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:400:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:401:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3789);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3792);
            rule__Config__Group__4();

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
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:408:1: rule__Config__Group__3__Impl : ( RULE_LITERACONNECTION ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:412:1: ( ( RULE_LITERACONNECTION ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:413:1: ( RULE_LITERACONNECTION )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:413:1: ( RULE_LITERACONNECTION )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:414:1: RULE_LITERACONNECTION
            {
             before(grammarAccess.getConfigAccess().getLITERACONNECTIONTerminalRuleCall_3()); 
            match(input,RULE_LITERACONNECTION,FollowSets000.FOLLOW_RULE_LITERACONNECTION_in_rule__Config__Group__3__Impl819); 
             after(grammarAccess.getConfigAccess().getLITERACONNECTIONTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:425:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:429:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:430:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4848);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4851);
            rule__Config__Group__5();

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
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:437:1: rule__Config__Group__4__Impl : ( RULE_COLON ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:441:1: ( ( RULE_COLON ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:442:1: ( RULE_COLON )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:442:1: ( RULE_COLON )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:443:1: RULE_COLON
            {
             before(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_4()); 
            match(input,RULE_COLON,FollowSets000.FOLLOW_RULE_COLON_in_rule__Config__Group__4__Impl878); 
             after(grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:454:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:458:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:459:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5907);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__6_in_rule__Config__Group__5910);
            rule__Config__Group__6();

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
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:466:1: rule__Config__Group__5__Impl : ( ( rule__Config__ConecctionAssignment_5 ) ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:470:1: ( ( ( rule__Config__ConecctionAssignment_5 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:471:1: ( ( rule__Config__ConecctionAssignment_5 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:471:1: ( ( rule__Config__ConecctionAssignment_5 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:472:1: ( rule__Config__ConecctionAssignment_5 )
            {
             before(grammarAccess.getConfigAccess().getConecctionAssignment_5()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:473:1: ( rule__Config__ConecctionAssignment_5 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:473:2: rule__Config__ConecctionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__ConecctionAssignment_5_in_rule__Config__Group__5__Impl937);
            rule__Config__ConecctionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getConecctionAssignment_5()); 

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
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:483:1: rule__Config__Group__6 : rule__Config__Group__6__Impl rule__Config__Group__7 ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:487:1: ( rule__Config__Group__6__Impl rule__Config__Group__7 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:488:2: rule__Config__Group__6__Impl rule__Config__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__6__Impl_in_rule__Config__Group__6967);
            rule__Config__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__7_in_rule__Config__Group__6970);
            rule__Config__Group__7();

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
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:495:1: rule__Config__Group__6__Impl : ( ( rule__Config__Group_6__0 )? ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:499:1: ( ( ( rule__Config__Group_6__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:500:1: ( ( rule__Config__Group_6__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:500:1: ( ( rule__Config__Group_6__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:501:1: ( rule__Config__Group_6__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_6()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:502:1: ( rule__Config__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LITERALMERGEDFIELDS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:502:2: rule__Config__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__0_in_rule__Config__Group__6__Impl997);
                    rule__Config__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Config__Group__7"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:512:1: rule__Config__Group__7 : rule__Config__Group__7__Impl ;
    public final void rule__Config__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:516:1: ( rule__Config__Group__7__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:517:2: rule__Config__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__7__Impl_in_rule__Config__Group__71028);
            rule__Config__Group__7__Impl();

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
    // $ANTLR end "rule__Config__Group__7"


    // $ANTLR start "rule__Config__Group__7__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:523:1: rule__Config__Group__7__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__Config__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:527:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:528:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:528:1: ( RULE_RIGHTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:529:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getConfigAccess().getRIGHTPARENTESISTerminalRuleCall_7()); 
            match(input,RULE_RIGHTPARENTESIS,FollowSets000.FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Config__Group__7__Impl1055); 
             after(grammarAccess.getConfigAccess().getRIGHTPARENTESISTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Config__Group__7__Impl"


    // $ANTLR start "rule__Config__Group_6__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:556:1: rule__Config__Group_6__0 : rule__Config__Group_6__0__Impl rule__Config__Group_6__1 ;
    public final void rule__Config__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:560:1: ( rule__Config__Group_6__0__Impl rule__Config__Group_6__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:561:2: rule__Config__Group_6__0__Impl rule__Config__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__0__Impl_in_rule__Config__Group_6__01100);
            rule__Config__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__1_in_rule__Config__Group_6__01103);
            rule__Config__Group_6__1();

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
    // $ANTLR end "rule__Config__Group_6__0"


    // $ANTLR start "rule__Config__Group_6__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:568:1: rule__Config__Group_6__0__Impl : ( RULE_LITERALMERGEDFIELDS ) ;
    public final void rule__Config__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:572:1: ( ( RULE_LITERALMERGEDFIELDS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:573:1: ( RULE_LITERALMERGEDFIELDS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:573:1: ( RULE_LITERALMERGEDFIELDS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:574:1: RULE_LITERALMERGEDFIELDS
            {
             before(grammarAccess.getConfigAccess().getLITERALMERGEDFIELDSTerminalRuleCall_6_0()); 
            match(input,RULE_LITERALMERGEDFIELDS,FollowSets000.FOLLOW_RULE_LITERALMERGEDFIELDS_in_rule__Config__Group_6__0__Impl1130); 
             after(grammarAccess.getConfigAccess().getLITERALMERGEDFIELDSTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Config__Group_6__0__Impl"


    // $ANTLR start "rule__Config__Group_6__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:585:1: rule__Config__Group_6__1 : rule__Config__Group_6__1__Impl rule__Config__Group_6__2 ;
    public final void rule__Config__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:589:1: ( rule__Config__Group_6__1__Impl rule__Config__Group_6__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:590:2: rule__Config__Group_6__1__Impl rule__Config__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__1__Impl_in_rule__Config__Group_6__11159);
            rule__Config__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__2_in_rule__Config__Group_6__11162);
            rule__Config__Group_6__2();

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
    // $ANTLR end "rule__Config__Group_6__1"


    // $ANTLR start "rule__Config__Group_6__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:597:1: rule__Config__Group_6__1__Impl : ( RULE_LEFTBRACKET ) ;
    public final void rule__Config__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:601:1: ( ( RULE_LEFTBRACKET ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:602:1: ( RULE_LEFTBRACKET )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:602:1: ( RULE_LEFTBRACKET )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:603:1: RULE_LEFTBRACKET
            {
             before(grammarAccess.getConfigAccess().getLEFTBRACKETTerminalRuleCall_6_1()); 
            match(input,RULE_LEFTBRACKET,FollowSets000.FOLLOW_RULE_LEFTBRACKET_in_rule__Config__Group_6__1__Impl1189); 
             after(grammarAccess.getConfigAccess().getLEFTBRACKETTerminalRuleCall_6_1()); 

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
    // $ANTLR end "rule__Config__Group_6__1__Impl"


    // $ANTLR start "rule__Config__Group_6__2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:614:1: rule__Config__Group_6__2 : rule__Config__Group_6__2__Impl rule__Config__Group_6__3 ;
    public final void rule__Config__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:618:1: ( rule__Config__Group_6__2__Impl rule__Config__Group_6__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:619:2: rule__Config__Group_6__2__Impl rule__Config__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__2__Impl_in_rule__Config__Group_6__21218);
            rule__Config__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__3_in_rule__Config__Group_6__21221);
            rule__Config__Group_6__3();

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
    // $ANTLR end "rule__Config__Group_6__2"


    // $ANTLR start "rule__Config__Group_6__2__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:626:1: rule__Config__Group_6__2__Impl : ( ( rule__Config__MergeFieldsAssignment_6_2 ) ) ;
    public final void rule__Config__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:630:1: ( ( ( rule__Config__MergeFieldsAssignment_6_2 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:631:1: ( ( rule__Config__MergeFieldsAssignment_6_2 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:631:1: ( ( rule__Config__MergeFieldsAssignment_6_2 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:632:1: ( rule__Config__MergeFieldsAssignment_6_2 )
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_2()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:633:1: ( rule__Config__MergeFieldsAssignment_6_2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:633:2: rule__Config__MergeFieldsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__MergeFieldsAssignment_6_2_in_rule__Config__Group_6__2__Impl1248);
            rule__Config__MergeFieldsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_2()); 

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
    // $ANTLR end "rule__Config__Group_6__2__Impl"


    // $ANTLR start "rule__Config__Group_6__3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:643:1: rule__Config__Group_6__3 : rule__Config__Group_6__3__Impl rule__Config__Group_6__4 ;
    public final void rule__Config__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:647:1: ( rule__Config__Group_6__3__Impl rule__Config__Group_6__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:648:2: rule__Config__Group_6__3__Impl rule__Config__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__3__Impl_in_rule__Config__Group_6__31278);
            rule__Config__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__4_in_rule__Config__Group_6__31281);
            rule__Config__Group_6__4();

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
    // $ANTLR end "rule__Config__Group_6__3"


    // $ANTLR start "rule__Config__Group_6__3__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:655:1: rule__Config__Group_6__3__Impl : ( ( rule__Config__Group_6_3__0 )* ) ;
    public final void rule__Config__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:659:1: ( ( ( rule__Config__Group_6_3__0 )* ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:660:1: ( ( rule__Config__Group_6_3__0 )* )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:660:1: ( ( rule__Config__Group_6_3__0 )* )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:661:1: ( rule__Config__Group_6_3__0 )*
            {
             before(grammarAccess.getConfigAccess().getGroup_6_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:662:1: ( rule__Config__Group_6_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:662:2: rule__Config__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6_3__0_in_rule__Config__Group_6__3__Impl1308);
            	    rule__Config__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Config__Group_6__3__Impl"


    // $ANTLR start "rule__Config__Group_6__4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:672:1: rule__Config__Group_6__4 : rule__Config__Group_6__4__Impl ;
    public final void rule__Config__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:676:1: ( rule__Config__Group_6__4__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:677:2: rule__Config__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6__4__Impl_in_rule__Config__Group_6__41339);
            rule__Config__Group_6__4__Impl();

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
    // $ANTLR end "rule__Config__Group_6__4"


    // $ANTLR start "rule__Config__Group_6__4__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:683:1: rule__Config__Group_6__4__Impl : ( RULE_RIGHTBRACKET ) ;
    public final void rule__Config__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:687:1: ( ( RULE_RIGHTBRACKET ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:688:1: ( RULE_RIGHTBRACKET )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:688:1: ( RULE_RIGHTBRACKET )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:689:1: RULE_RIGHTBRACKET
            {
             before(grammarAccess.getConfigAccess().getRIGHTBRACKETTerminalRuleCall_6_4()); 
            match(input,RULE_RIGHTBRACKET,FollowSets000.FOLLOW_RULE_RIGHTBRACKET_in_rule__Config__Group_6__4__Impl1366); 
             after(grammarAccess.getConfigAccess().getRIGHTBRACKETTerminalRuleCall_6_4()); 

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
    // $ANTLR end "rule__Config__Group_6__4__Impl"


    // $ANTLR start "rule__Config__Group_6_3__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:710:1: rule__Config__Group_6_3__0 : rule__Config__Group_6_3__0__Impl rule__Config__Group_6_3__1 ;
    public final void rule__Config__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:714:1: ( rule__Config__Group_6_3__0__Impl rule__Config__Group_6_3__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:715:2: rule__Config__Group_6_3__0__Impl rule__Config__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6_3__0__Impl_in_rule__Config__Group_6_3__01405);
            rule__Config__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6_3__1_in_rule__Config__Group_6_3__01408);
            rule__Config__Group_6_3__1();

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
    // $ANTLR end "rule__Config__Group_6_3__0"


    // $ANTLR start "rule__Config__Group_6_3__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:722:1: rule__Config__Group_6_3__0__Impl : ( RULE_COMA ) ;
    public final void rule__Config__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:726:1: ( ( RULE_COMA ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:727:1: ( RULE_COMA )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:727:1: ( RULE_COMA )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:728:1: RULE_COMA
            {
             before(grammarAccess.getConfigAccess().getCOMATerminalRuleCall_6_3_0()); 
            match(input,RULE_COMA,FollowSets000.FOLLOW_RULE_COMA_in_rule__Config__Group_6_3__0__Impl1435); 
             after(grammarAccess.getConfigAccess().getCOMATerminalRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Config__Group_6_3__0__Impl"


    // $ANTLR start "rule__Config__Group_6_3__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:739:1: rule__Config__Group_6_3__1 : rule__Config__Group_6_3__1__Impl ;
    public final void rule__Config__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:743:1: ( rule__Config__Group_6_3__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:744:2: rule__Config__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_6_3__1__Impl_in_rule__Config__Group_6_3__11464);
            rule__Config__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Config__Group_6_3__1"


    // $ANTLR start "rule__Config__Group_6_3__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:750:1: rule__Config__Group_6_3__1__Impl : ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) ) ;
    public final void rule__Config__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:754:1: ( ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:755:1: ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:755:1: ( ( rule__Config__MergeFieldsAssignment_6_3_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:756:1: ( rule__Config__MergeFieldsAssignment_6_3_1 )
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_3_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:757:1: ( rule__Config__MergeFieldsAssignment_6_3_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:757:2: rule__Config__MergeFieldsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__MergeFieldsAssignment_6_3_1_in_rule__Config__Group_6_3__1__Impl1491);
            rule__Config__MergeFieldsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMergeFieldsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Config__Group_6_3__1__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:771:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:775:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:776:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01525);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01528);
            rule__Connection__Group__1();

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
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:783:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:787:1: ( ( () ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:788:1: ( () )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:788:1: ( () )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:789:1: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:790:1: ()
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:792:1: 
            {
            }

             after(grammarAccess.getConnectionAccess().getConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:802:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:806:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:807:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11586);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11589);
            rule__Connection__Group__2();

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
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:814:1: rule__Connection__Group__1__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:818:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:819:1: ( RULE_LEFTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:819:1: ( RULE_LEFTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:820:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getConnectionAccess().getLEFTPARENTESISTerminalRuleCall_1()); 
            match(input,RULE_LEFTPARENTESIS,FollowSets000.FOLLOW_RULE_LEFTPARENTESIS_in_rule__Connection__Group__1__Impl1616); 
             after(grammarAccess.getConnectionAccess().getLEFTPARENTESISTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:831:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:835:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:836:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21645);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21648);
            rule__Connection__Group__3();

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
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:843:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__Group_2__0 )? ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:847:1: ( ( ( rule__Connection__Group_2__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:848:1: ( ( rule__Connection__Group_2__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:848:1: ( ( rule__Connection__Group_2__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:849:1: ( rule__Connection__Group_2__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_2()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:850:1: ( rule__Connection__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LITERALURL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:850:2: rule__Connection__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl1675);
                    rule__Connection__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:860:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:864:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:865:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31706);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31709);
            rule__Connection__Group__4();

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
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:872:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:876:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:877:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:877:1: ( ( rule__Connection__Group_3__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:878:1: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:879:1: ( rule__Connection__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LITERALUSERNAME) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:879:2: rule__Connection__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl1736);
                    rule__Connection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:889:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:893:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:894:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41767);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__41770);
            rule__Connection__Group__5();

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
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:901:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__Group_4__0 )? ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:905:1: ( ( ( rule__Connection__Group_4__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:906:1: ( ( rule__Connection__Group_4__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:906:1: ( ( rule__Connection__Group_4__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:907:1: ( rule__Connection__Group_4__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_4()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:908:1: ( rule__Connection__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LITERALPASSWORD) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:908:2: rule__Connection__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1797);
                    rule__Connection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:918:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:922:1: ( rule__Connection__Group__5__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:923:2: rule__Connection__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__51828);
            rule__Connection__Group__5__Impl();

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
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:929:1: rule__Connection__Group__5__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:933:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:934:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:934:1: ( RULE_RIGHTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:935:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getConnectionAccess().getRIGHTPARENTESISTerminalRuleCall_5()); 
            match(input,RULE_RIGHTPARENTESIS,FollowSets000.FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Connection__Group__5__Impl1855); 
             after(grammarAccess.getConnectionAccess().getRIGHTPARENTESISTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Connection__Group_2__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:958:1: rule__Connection__Group_2__0 : rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 ;
    public final void rule__Connection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:962:1: ( rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:963:2: rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__01896);
            rule__Connection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__01899);
            rule__Connection__Group_2__1();

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
    // $ANTLR end "rule__Connection__Group_2__0"


    // $ANTLR start "rule__Connection__Group_2__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:970:1: rule__Connection__Group_2__0__Impl : ( RULE_LITERALURL ) ;
    public final void rule__Connection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:974:1: ( ( RULE_LITERALURL ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:975:1: ( RULE_LITERALURL )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:975:1: ( RULE_LITERALURL )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:976:1: RULE_LITERALURL
            {
             before(grammarAccess.getConnectionAccess().getLITERALURLTerminalRuleCall_2_0()); 
            match(input,RULE_LITERALURL,FollowSets000.FOLLOW_RULE_LITERALURL_in_rule__Connection__Group_2__0__Impl1926); 
             after(grammarAccess.getConnectionAccess().getLITERALURLTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Connection__Group_2__0__Impl"


    // $ANTLR start "rule__Connection__Group_2__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:987:1: rule__Connection__Group_2__1 : rule__Connection__Group_2__1__Impl ;
    public final void rule__Connection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:991:1: ( rule__Connection__Group_2__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:992:2: rule__Connection__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__11955);
            rule__Connection__Group_2__1__Impl();

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
    // $ANTLR end "rule__Connection__Group_2__1"


    // $ANTLR start "rule__Connection__Group_2__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:998:1: rule__Connection__Group_2__1__Impl : ( ( rule__Connection__UrlAssignment_2_1 ) ) ;
    public final void rule__Connection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1002:1: ( ( ( rule__Connection__UrlAssignment_2_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1003:1: ( ( rule__Connection__UrlAssignment_2_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1003:1: ( ( rule__Connection__UrlAssignment_2_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1004:1: ( rule__Connection__UrlAssignment_2_1 )
            {
             before(grammarAccess.getConnectionAccess().getUrlAssignment_2_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1005:1: ( rule__Connection__UrlAssignment_2_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1005:2: rule__Connection__UrlAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UrlAssignment_2_1_in_rule__Connection__Group_2__1__Impl1982);
            rule__Connection__UrlAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getUrlAssignment_2_1()); 

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
    // $ANTLR end "rule__Connection__Group_2__1__Impl"


    // $ANTLR start "rule__Connection__Group_3__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1019:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1023:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1024:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__02016);
            rule__Connection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__02019);
            rule__Connection__Group_3__1();

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
    // $ANTLR end "rule__Connection__Group_3__0"


    // $ANTLR start "rule__Connection__Group_3__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1031:1: rule__Connection__Group_3__0__Impl : ( RULE_LITERALUSERNAME ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1035:1: ( ( RULE_LITERALUSERNAME ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1036:1: ( RULE_LITERALUSERNAME )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1036:1: ( RULE_LITERALUSERNAME )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1037:1: RULE_LITERALUSERNAME
            {
             before(grammarAccess.getConnectionAccess().getLITERALUSERNAMETerminalRuleCall_3_0()); 
            match(input,RULE_LITERALUSERNAME,FollowSets000.FOLLOW_RULE_LITERALUSERNAME_in_rule__Connection__Group_3__0__Impl2046); 
             after(grammarAccess.getConnectionAccess().getLITERALUSERNAMETerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Connection__Group_3__0__Impl"


    // $ANTLR start "rule__Connection__Group_3__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1048:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1052:1: ( rule__Connection__Group_3__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1053:2: rule__Connection__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__12075);
            rule__Connection__Group_3__1__Impl();

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
    // $ANTLR end "rule__Connection__Group_3__1"


    // $ANTLR start "rule__Connection__Group_3__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1059:1: rule__Connection__Group_3__1__Impl : ( ( rule__Connection__UsernameAssignment_3_1 ) ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1063:1: ( ( ( rule__Connection__UsernameAssignment_3_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1064:1: ( ( rule__Connection__UsernameAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1064:1: ( ( rule__Connection__UsernameAssignment_3_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1065:1: ( rule__Connection__UsernameAssignment_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getUsernameAssignment_3_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1066:1: ( rule__Connection__UsernameAssignment_3_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1066:2: rule__Connection__UsernameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UsernameAssignment_3_1_in_rule__Connection__Group_3__1__Impl2102);
            rule__Connection__UsernameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getUsernameAssignment_3_1()); 

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
    // $ANTLR end "rule__Connection__Group_3__1__Impl"


    // $ANTLR start "rule__Connection__Group_4__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1080:1: rule__Connection__Group_4__0 : rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 ;
    public final void rule__Connection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1084:1: ( rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1085:2: rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__02136);
            rule__Connection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__02139);
            rule__Connection__Group_4__1();

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
    // $ANTLR end "rule__Connection__Group_4__0"


    // $ANTLR start "rule__Connection__Group_4__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1092:1: rule__Connection__Group_4__0__Impl : ( RULE_LITERALPASSWORD ) ;
    public final void rule__Connection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1096:1: ( ( RULE_LITERALPASSWORD ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1097:1: ( RULE_LITERALPASSWORD )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1097:1: ( RULE_LITERALPASSWORD )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1098:1: RULE_LITERALPASSWORD
            {
             before(grammarAccess.getConnectionAccess().getLITERALPASSWORDTerminalRuleCall_4_0()); 
            match(input,RULE_LITERALPASSWORD,FollowSets000.FOLLOW_RULE_LITERALPASSWORD_in_rule__Connection__Group_4__0__Impl2166); 
             after(grammarAccess.getConnectionAccess().getLITERALPASSWORDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Connection__Group_4__0__Impl"


    // $ANTLR start "rule__Connection__Group_4__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1109:1: rule__Connection__Group_4__1 : rule__Connection__Group_4__1__Impl ;
    public final void rule__Connection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1113:1: ( rule__Connection__Group_4__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1114:2: rule__Connection__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__12195);
            rule__Connection__Group_4__1__Impl();

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
    // $ANTLR end "rule__Connection__Group_4__1"


    // $ANTLR start "rule__Connection__Group_4__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1120:1: rule__Connection__Group_4__1__Impl : ( ( rule__Connection__PasswordAssignment_4_1 ) ) ;
    public final void rule__Connection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1124:1: ( ( ( rule__Connection__PasswordAssignment_4_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1125:1: ( ( rule__Connection__PasswordAssignment_4_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1125:1: ( ( rule__Connection__PasswordAssignment_4_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1126:1: ( rule__Connection__PasswordAssignment_4_1 )
            {
             before(grammarAccess.getConnectionAccess().getPasswordAssignment_4_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1127:1: ( rule__Connection__PasswordAssignment_4_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1127:2: rule__Connection__PasswordAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__PasswordAssignment_4_1_in_rule__Connection__Group_4__1__Impl2222);
            rule__Connection__PasswordAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getPasswordAssignment_4_1()); 

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
    // $ANTLR end "rule__Connection__Group_4__1__Impl"


    // $ANTLR start "rule__MergedField__Group__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1141:1: rule__MergedField__Group__0 : rule__MergedField__Group__0__Impl rule__MergedField__Group__1 ;
    public final void rule__MergedField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1145:1: ( rule__MergedField__Group__0__Impl rule__MergedField__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1146:2: rule__MergedField__Group__0__Impl rule__MergedField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__0__Impl_in_rule__MergedField__Group__02256);
            rule__MergedField__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__1_in_rule__MergedField__Group__02259);
            rule__MergedField__Group__1();

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
    // $ANTLR end "rule__MergedField__Group__0"


    // $ANTLR start "rule__MergedField__Group__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1153:1: rule__MergedField__Group__0__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__MergedField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1157:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1158:1: ( RULE_LEFTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1158:1: ( RULE_LEFTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1159:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getMergedFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
            match(input,RULE_LEFTPARENTESIS,FollowSets000.FOLLOW_RULE_LEFTPARENTESIS_in_rule__MergedField__Group__0__Impl2286); 
             after(grammarAccess.getMergedFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__MergedField__Group__0__Impl"


    // $ANTLR start "rule__MergedField__Group__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1170:1: rule__MergedField__Group__1 : rule__MergedField__Group__1__Impl rule__MergedField__Group__2 ;
    public final void rule__MergedField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1174:1: ( rule__MergedField__Group__1__Impl rule__MergedField__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1175:2: rule__MergedField__Group__1__Impl rule__MergedField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__1__Impl_in_rule__MergedField__Group__12315);
            rule__MergedField__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__2_in_rule__MergedField__Group__12318);
            rule__MergedField__Group__2();

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
    // $ANTLR end "rule__MergedField__Group__1"


    // $ANTLR start "rule__MergedField__Group__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1182:1: rule__MergedField__Group__1__Impl : ( ( rule__MergedField__Group_1__0 )? ) ;
    public final void rule__MergedField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1186:1: ( ( ( rule__MergedField__Group_1__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1187:1: ( ( rule__MergedField__Group_1__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1187:1: ( ( rule__MergedField__Group_1__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1188:1: ( rule__MergedField__Group_1__0 )?
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1189:1: ( rule__MergedField__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LITERALTABLENAME) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1189:2: rule__MergedField__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__0_in_rule__MergedField__Group__1__Impl2345);
                    rule__MergedField__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMergedFieldAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MergedField__Group__1__Impl"


    // $ANTLR start "rule__MergedField__Group__2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1199:1: rule__MergedField__Group__2 : rule__MergedField__Group__2__Impl rule__MergedField__Group__3 ;
    public final void rule__MergedField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1203:1: ( rule__MergedField__Group__2__Impl rule__MergedField__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1204:2: rule__MergedField__Group__2__Impl rule__MergedField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__2__Impl_in_rule__MergedField__Group__22376);
            rule__MergedField__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__3_in_rule__MergedField__Group__22379);
            rule__MergedField__Group__3();

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
    // $ANTLR end "rule__MergedField__Group__2"


    // $ANTLR start "rule__MergedField__Group__2__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1211:1: rule__MergedField__Group__2__Impl : ( RULE_LITERALFIELDS ) ;
    public final void rule__MergedField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1215:1: ( ( RULE_LITERALFIELDS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1216:1: ( RULE_LITERALFIELDS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1216:1: ( RULE_LITERALFIELDS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1217:1: RULE_LITERALFIELDS
            {
             before(grammarAccess.getMergedFieldAccess().getLITERALFIELDSTerminalRuleCall_2()); 
            match(input,RULE_LITERALFIELDS,FollowSets000.FOLLOW_RULE_LITERALFIELDS_in_rule__MergedField__Group__2__Impl2406); 
             after(grammarAccess.getMergedFieldAccess().getLITERALFIELDSTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__MergedField__Group__2__Impl"


    // $ANTLR start "rule__MergedField__Group__3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1228:1: rule__MergedField__Group__3 : rule__MergedField__Group__3__Impl rule__MergedField__Group__4 ;
    public final void rule__MergedField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1232:1: ( rule__MergedField__Group__3__Impl rule__MergedField__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1233:2: rule__MergedField__Group__3__Impl rule__MergedField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__3__Impl_in_rule__MergedField__Group__32435);
            rule__MergedField__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__4_in_rule__MergedField__Group__32438);
            rule__MergedField__Group__4();

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
    // $ANTLR end "rule__MergedField__Group__3"


    // $ANTLR start "rule__MergedField__Group__3__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1240:1: rule__MergedField__Group__3__Impl : ( RULE_LEFTBRACKET ) ;
    public final void rule__MergedField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1244:1: ( ( RULE_LEFTBRACKET ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1245:1: ( RULE_LEFTBRACKET )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1245:1: ( RULE_LEFTBRACKET )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1246:1: RULE_LEFTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_3()); 
            match(input,RULE_LEFTBRACKET,FollowSets000.FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__3__Impl2465); 
             after(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__MergedField__Group__3__Impl"


    // $ANTLR start "rule__MergedField__Group__4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1257:1: rule__MergedField__Group__4 : rule__MergedField__Group__4__Impl rule__MergedField__Group__5 ;
    public final void rule__MergedField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1261:1: ( rule__MergedField__Group__4__Impl rule__MergedField__Group__5 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1262:2: rule__MergedField__Group__4__Impl rule__MergedField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__4__Impl_in_rule__MergedField__Group__42494);
            rule__MergedField__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__5_in_rule__MergedField__Group__42497);
            rule__MergedField__Group__5();

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
    // $ANTLR end "rule__MergedField__Group__4"


    // $ANTLR start "rule__MergedField__Group__4__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1269:1: rule__MergedField__Group__4__Impl : ( ( rule__MergedField__FieldsAssignment_4 ) ) ;
    public final void rule__MergedField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1273:1: ( ( ( rule__MergedField__FieldsAssignment_4 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1274:1: ( ( rule__MergedField__FieldsAssignment_4 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1274:1: ( ( rule__MergedField__FieldsAssignment_4 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1275:1: ( rule__MergedField__FieldsAssignment_4 )
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsAssignment_4()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1276:1: ( rule__MergedField__FieldsAssignment_4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1276:2: rule__MergedField__FieldsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__FieldsAssignment_4_in_rule__MergedField__Group__4__Impl2524);
            rule__MergedField__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getFieldsAssignment_4()); 

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
    // $ANTLR end "rule__MergedField__Group__4__Impl"


    // $ANTLR start "rule__MergedField__Group__5"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1286:1: rule__MergedField__Group__5 : rule__MergedField__Group__5__Impl rule__MergedField__Group__6 ;
    public final void rule__MergedField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1290:1: ( rule__MergedField__Group__5__Impl rule__MergedField__Group__6 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1291:2: rule__MergedField__Group__5__Impl rule__MergedField__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__5__Impl_in_rule__MergedField__Group__52554);
            rule__MergedField__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__6_in_rule__MergedField__Group__52557);
            rule__MergedField__Group__6();

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
    // $ANTLR end "rule__MergedField__Group__5"


    // $ANTLR start "rule__MergedField__Group__5__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1298:1: rule__MergedField__Group__5__Impl : ( ( rule__MergedField__Group_5__0 )* ) ;
    public final void rule__MergedField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1302:1: ( ( ( rule__MergedField__Group_5__0 )* ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1303:1: ( ( rule__MergedField__Group_5__0 )* )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1303:1: ( ( rule__MergedField__Group_5__0 )* )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1304:1: ( rule__MergedField__Group_5__0 )*
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_5()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1305:1: ( rule__MergedField__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1305:2: rule__MergedField__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__0_in_rule__MergedField__Group__5__Impl2584);
            	    rule__MergedField__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMergedFieldAccess().getGroup_5()); 

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
    // $ANTLR end "rule__MergedField__Group__5__Impl"


    // $ANTLR start "rule__MergedField__Group__6"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1315:1: rule__MergedField__Group__6 : rule__MergedField__Group__6__Impl rule__MergedField__Group__7 ;
    public final void rule__MergedField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1319:1: ( rule__MergedField__Group__6__Impl rule__MergedField__Group__7 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1320:2: rule__MergedField__Group__6__Impl rule__MergedField__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__6__Impl_in_rule__MergedField__Group__62615);
            rule__MergedField__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__7_in_rule__MergedField__Group__62618);
            rule__MergedField__Group__7();

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
    // $ANTLR end "rule__MergedField__Group__6"


    // $ANTLR start "rule__MergedField__Group__6__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1327:1: rule__MergedField__Group__6__Impl : ( RULE_RIGHTBRACKET ) ;
    public final void rule__MergedField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1331:1: ( ( RULE_RIGHTBRACKET ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1332:1: ( RULE_RIGHTBRACKET )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1332:1: ( RULE_RIGHTBRACKET )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1333:1: RULE_RIGHTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_6()); 
            match(input,RULE_RIGHTBRACKET,FollowSets000.FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__6__Impl2645); 
             after(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__MergedField__Group__6__Impl"


    // $ANTLR start "rule__MergedField__Group__7"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1344:1: rule__MergedField__Group__7 : rule__MergedField__Group__7__Impl rule__MergedField__Group__8 ;
    public final void rule__MergedField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1348:1: ( rule__MergedField__Group__7__Impl rule__MergedField__Group__8 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1349:2: rule__MergedField__Group__7__Impl rule__MergedField__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__7__Impl_in_rule__MergedField__Group__72674);
            rule__MergedField__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__8_in_rule__MergedField__Group__72677);
            rule__MergedField__Group__8();

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
    // $ANTLR end "rule__MergedField__Group__7"


    // $ANTLR start "rule__MergedField__Group__7__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1356:1: rule__MergedField__Group__7__Impl : ( RULE_LITERALATTRIBUTENAMES ) ;
    public final void rule__MergedField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1360:1: ( ( RULE_LITERALATTRIBUTENAMES ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1361:1: ( RULE_LITERALATTRIBUTENAMES )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1361:1: ( RULE_LITERALATTRIBUTENAMES )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1362:1: RULE_LITERALATTRIBUTENAMES
            {
             before(grammarAccess.getMergedFieldAccess().getLITERALATTRIBUTENAMESTerminalRuleCall_7()); 
            match(input,RULE_LITERALATTRIBUTENAMES,FollowSets000.FOLLOW_RULE_LITERALATTRIBUTENAMES_in_rule__MergedField__Group__7__Impl2704); 
             after(grammarAccess.getMergedFieldAccess().getLITERALATTRIBUTENAMESTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__MergedField__Group__7__Impl"


    // $ANTLR start "rule__MergedField__Group__8"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1373:1: rule__MergedField__Group__8 : rule__MergedField__Group__8__Impl rule__MergedField__Group__9 ;
    public final void rule__MergedField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1377:1: ( rule__MergedField__Group__8__Impl rule__MergedField__Group__9 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1378:2: rule__MergedField__Group__8__Impl rule__MergedField__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__8__Impl_in_rule__MergedField__Group__82733);
            rule__MergedField__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__9_in_rule__MergedField__Group__82736);
            rule__MergedField__Group__9();

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
    // $ANTLR end "rule__MergedField__Group__8"


    // $ANTLR start "rule__MergedField__Group__8__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1385:1: rule__MergedField__Group__8__Impl : ( RULE_LEFTBRACKET ) ;
    public final void rule__MergedField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1389:1: ( ( RULE_LEFTBRACKET ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1390:1: ( RULE_LEFTBRACKET )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1390:1: ( RULE_LEFTBRACKET )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1391:1: RULE_LEFTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_8()); 
            match(input,RULE_LEFTBRACKET,FollowSets000.FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__8__Impl2763); 
             after(grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__MergedField__Group__8__Impl"


    // $ANTLR start "rule__MergedField__Group__9"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1402:1: rule__MergedField__Group__9 : rule__MergedField__Group__9__Impl rule__MergedField__Group__10 ;
    public final void rule__MergedField__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1406:1: ( rule__MergedField__Group__9__Impl rule__MergedField__Group__10 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1407:2: rule__MergedField__Group__9__Impl rule__MergedField__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__9__Impl_in_rule__MergedField__Group__92792);
            rule__MergedField__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__10_in_rule__MergedField__Group__92795);
            rule__MergedField__Group__10();

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
    // $ANTLR end "rule__MergedField__Group__9"


    // $ANTLR start "rule__MergedField__Group__9__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1414:1: rule__MergedField__Group__9__Impl : ( ( rule__MergedField__AttributeNamesAssignment_9 ) ) ;
    public final void rule__MergedField__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1418:1: ( ( ( rule__MergedField__AttributeNamesAssignment_9 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1419:1: ( ( rule__MergedField__AttributeNamesAssignment_9 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1419:1: ( ( rule__MergedField__AttributeNamesAssignment_9 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1420:1: ( rule__MergedField__AttributeNamesAssignment_9 )
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_9()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1421:1: ( rule__MergedField__AttributeNamesAssignment_9 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1421:2: rule__MergedField__AttributeNamesAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__AttributeNamesAssignment_9_in_rule__MergedField__Group__9__Impl2822);
            rule__MergedField__AttributeNamesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_9()); 

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
    // $ANTLR end "rule__MergedField__Group__9__Impl"


    // $ANTLR start "rule__MergedField__Group__10"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1431:1: rule__MergedField__Group__10 : rule__MergedField__Group__10__Impl rule__MergedField__Group__11 ;
    public final void rule__MergedField__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1435:1: ( rule__MergedField__Group__10__Impl rule__MergedField__Group__11 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1436:2: rule__MergedField__Group__10__Impl rule__MergedField__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__10__Impl_in_rule__MergedField__Group__102852);
            rule__MergedField__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__11_in_rule__MergedField__Group__102855);
            rule__MergedField__Group__11();

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
    // $ANTLR end "rule__MergedField__Group__10"


    // $ANTLR start "rule__MergedField__Group__10__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1443:1: rule__MergedField__Group__10__Impl : ( ( rule__MergedField__Group_10__0 )* ) ;
    public final void rule__MergedField__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1447:1: ( ( ( rule__MergedField__Group_10__0 )* ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1448:1: ( ( rule__MergedField__Group_10__0 )* )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1448:1: ( ( rule__MergedField__Group_10__0 )* )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1449:1: ( rule__MergedField__Group_10__0 )*
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_10()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1450:1: ( rule__MergedField__Group_10__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1450:2: rule__MergedField__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__0_in_rule__MergedField__Group__10__Impl2882);
            	    rule__MergedField__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMergedFieldAccess().getGroup_10()); 

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
    // $ANTLR end "rule__MergedField__Group__10__Impl"


    // $ANTLR start "rule__MergedField__Group__11"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1460:1: rule__MergedField__Group__11 : rule__MergedField__Group__11__Impl rule__MergedField__Group__12 ;
    public final void rule__MergedField__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1464:1: ( rule__MergedField__Group__11__Impl rule__MergedField__Group__12 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1465:2: rule__MergedField__Group__11__Impl rule__MergedField__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__11__Impl_in_rule__MergedField__Group__112913);
            rule__MergedField__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__12_in_rule__MergedField__Group__112916);
            rule__MergedField__Group__12();

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
    // $ANTLR end "rule__MergedField__Group__11"


    // $ANTLR start "rule__MergedField__Group__11__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1472:1: rule__MergedField__Group__11__Impl : ( RULE_RIGHTBRACKET ) ;
    public final void rule__MergedField__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1476:1: ( ( RULE_RIGHTBRACKET ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1477:1: ( RULE_RIGHTBRACKET )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1477:1: ( RULE_RIGHTBRACKET )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1478:1: RULE_RIGHTBRACKET
            {
             before(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_11()); 
            match(input,RULE_RIGHTBRACKET,FollowSets000.FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__11__Impl2943); 
             after(grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_11()); 

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
    // $ANTLR end "rule__MergedField__Group__11__Impl"


    // $ANTLR start "rule__MergedField__Group__12"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1489:1: rule__MergedField__Group__12 : rule__MergedField__Group__12__Impl ;
    public final void rule__MergedField__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1493:1: ( rule__MergedField__Group__12__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1494:2: rule__MergedField__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__12__Impl_in_rule__MergedField__Group__122972);
            rule__MergedField__Group__12__Impl();

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
    // $ANTLR end "rule__MergedField__Group__12"


    // $ANTLR start "rule__MergedField__Group__12__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1500:1: rule__MergedField__Group__12__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__MergedField__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1504:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1505:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1505:1: ( RULE_RIGHTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1506:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getMergedFieldAccess().getRIGHTPARENTESISTerminalRuleCall_12()); 
            match(input,RULE_RIGHTPARENTESIS,FollowSets000.FOLLOW_RULE_RIGHTPARENTESIS_in_rule__MergedField__Group__12__Impl2999); 
             after(grammarAccess.getMergedFieldAccess().getRIGHTPARENTESISTerminalRuleCall_12()); 

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
    // $ANTLR end "rule__MergedField__Group__12__Impl"


    // $ANTLR start "rule__MergedField__Group_1__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1543:1: rule__MergedField__Group_1__0 : rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1 ;
    public final void rule__MergedField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1547:1: ( rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1548:2: rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__0__Impl_in_rule__MergedField__Group_1__03054);
            rule__MergedField__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__1_in_rule__MergedField__Group_1__03057);
            rule__MergedField__Group_1__1();

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
    // $ANTLR end "rule__MergedField__Group_1__0"


    // $ANTLR start "rule__MergedField__Group_1__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1555:1: rule__MergedField__Group_1__0__Impl : ( RULE_LITERALTABLENAME ) ;
    public final void rule__MergedField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1559:1: ( ( RULE_LITERALTABLENAME ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1560:1: ( RULE_LITERALTABLENAME )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1560:1: ( RULE_LITERALTABLENAME )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1561:1: RULE_LITERALTABLENAME
            {
             before(grammarAccess.getMergedFieldAccess().getLITERALTABLENAMETerminalRuleCall_1_0()); 
            match(input,RULE_LITERALTABLENAME,FollowSets000.FOLLOW_RULE_LITERALTABLENAME_in_rule__MergedField__Group_1__0__Impl3084); 
             after(grammarAccess.getMergedFieldAccess().getLITERALTABLENAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MergedField__Group_1__0__Impl"


    // $ANTLR start "rule__MergedField__Group_1__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1572:1: rule__MergedField__Group_1__1 : rule__MergedField__Group_1__1__Impl ;
    public final void rule__MergedField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1576:1: ( rule__MergedField__Group_1__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1577:2: rule__MergedField__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__1__Impl_in_rule__MergedField__Group_1__13113);
            rule__MergedField__Group_1__1__Impl();

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
    // $ANTLR end "rule__MergedField__Group_1__1"


    // $ANTLR start "rule__MergedField__Group_1__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1583:1: rule__MergedField__Group_1__1__Impl : ( ( rule__MergedField__TableNameAssignment_1_1 ) ) ;
    public final void rule__MergedField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1587:1: ( ( ( rule__MergedField__TableNameAssignment_1_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1588:1: ( ( rule__MergedField__TableNameAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1588:1: ( ( rule__MergedField__TableNameAssignment_1_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1589:1: ( rule__MergedField__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getTableNameAssignment_1_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1590:1: ( rule__MergedField__TableNameAssignment_1_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1590:2: rule__MergedField__TableNameAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__TableNameAssignment_1_1_in_rule__MergedField__Group_1__1__Impl3140);
            rule__MergedField__TableNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getTableNameAssignment_1_1()); 

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
    // $ANTLR end "rule__MergedField__Group_1__1__Impl"


    // $ANTLR start "rule__MergedField__Group_5__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1604:1: rule__MergedField__Group_5__0 : rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1 ;
    public final void rule__MergedField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1608:1: ( rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1609:2: rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__0__Impl_in_rule__MergedField__Group_5__03174);
            rule__MergedField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__1_in_rule__MergedField__Group_5__03177);
            rule__MergedField__Group_5__1();

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
    // $ANTLR end "rule__MergedField__Group_5__0"


    // $ANTLR start "rule__MergedField__Group_5__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1616:1: rule__MergedField__Group_5__0__Impl : ( RULE_COMA ) ;
    public final void rule__MergedField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1620:1: ( ( RULE_COMA ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1621:1: ( RULE_COMA )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1621:1: ( RULE_COMA )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1622:1: RULE_COMA
            {
             before(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_5_0()); 
            match(input,RULE_COMA,FollowSets000.FOLLOW_RULE_COMA_in_rule__MergedField__Group_5__0__Impl3204); 
             after(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__MergedField__Group_5__0__Impl"


    // $ANTLR start "rule__MergedField__Group_5__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1633:1: rule__MergedField__Group_5__1 : rule__MergedField__Group_5__1__Impl ;
    public final void rule__MergedField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1637:1: ( rule__MergedField__Group_5__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1638:2: rule__MergedField__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__1__Impl_in_rule__MergedField__Group_5__13233);
            rule__MergedField__Group_5__1__Impl();

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
    // $ANTLR end "rule__MergedField__Group_5__1"


    // $ANTLR start "rule__MergedField__Group_5__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1644:1: rule__MergedField__Group_5__1__Impl : ( ( rule__MergedField__FieldsAssignment_5_1 ) ) ;
    public final void rule__MergedField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1648:1: ( ( ( rule__MergedField__FieldsAssignment_5_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1649:1: ( ( rule__MergedField__FieldsAssignment_5_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1649:1: ( ( rule__MergedField__FieldsAssignment_5_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1650:1: ( rule__MergedField__FieldsAssignment_5_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsAssignment_5_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1651:1: ( rule__MergedField__FieldsAssignment_5_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1651:2: rule__MergedField__FieldsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__FieldsAssignment_5_1_in_rule__MergedField__Group_5__1__Impl3260);
            rule__MergedField__FieldsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getFieldsAssignment_5_1()); 

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
    // $ANTLR end "rule__MergedField__Group_5__1__Impl"


    // $ANTLR start "rule__MergedField__Group_10__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1665:1: rule__MergedField__Group_10__0 : rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1 ;
    public final void rule__MergedField__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1669:1: ( rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1670:2: rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__0__Impl_in_rule__MergedField__Group_10__03294);
            rule__MergedField__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__1_in_rule__MergedField__Group_10__03297);
            rule__MergedField__Group_10__1();

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
    // $ANTLR end "rule__MergedField__Group_10__0"


    // $ANTLR start "rule__MergedField__Group_10__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1677:1: rule__MergedField__Group_10__0__Impl : ( RULE_COMA ) ;
    public final void rule__MergedField__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1681:1: ( ( RULE_COMA ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1682:1: ( RULE_COMA )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1682:1: ( RULE_COMA )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1683:1: RULE_COMA
            {
             before(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_10_0()); 
            match(input,RULE_COMA,FollowSets000.FOLLOW_RULE_COMA_in_rule__MergedField__Group_10__0__Impl3324); 
             after(grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__MergedField__Group_10__0__Impl"


    // $ANTLR start "rule__MergedField__Group_10__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1694:1: rule__MergedField__Group_10__1 : rule__MergedField__Group_10__1__Impl ;
    public final void rule__MergedField__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1698:1: ( rule__MergedField__Group_10__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1699:2: rule__MergedField__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__1__Impl_in_rule__MergedField__Group_10__13353);
            rule__MergedField__Group_10__1__Impl();

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
    // $ANTLR end "rule__MergedField__Group_10__1"


    // $ANTLR start "rule__MergedField__Group_10__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1705:1: rule__MergedField__Group_10__1__Impl : ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) ) ;
    public final void rule__MergedField__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1709:1: ( ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1710:1: ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1710:1: ( ( rule__MergedField__AttributeNamesAssignment_10_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1711:1: ( rule__MergedField__AttributeNamesAssignment_10_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_10_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1712:1: ( rule__MergedField__AttributeNamesAssignment_10_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1712:2: rule__MergedField__AttributeNamesAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__AttributeNamesAssignment_10_1_in_rule__MergedField__Group_10__1__Impl3380);
            rule__MergedField__AttributeNamesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_10_1()); 

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
    // $ANTLR end "rule__MergedField__Group_10__1__Impl"


    // $ANTLR start "rule__AttributeName__Group__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1726:1: rule__AttributeName__Group__0 : rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1 ;
    public final void rule__AttributeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1730:1: ( rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1731:2: rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__0__Impl_in_rule__AttributeName__Group__03414);
            rule__AttributeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__1_in_rule__AttributeName__Group__03417);
            rule__AttributeName__Group__1();

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
    // $ANTLR end "rule__AttributeName__Group__0"


    // $ANTLR start "rule__AttributeName__Group__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1738:1: rule__AttributeName__Group__0__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__AttributeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1742:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1743:1: ( RULE_LEFTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1743:1: ( RULE_LEFTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1744:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getAttributeNameAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
            match(input,RULE_LEFTPARENTESIS,FollowSets000.FOLLOW_RULE_LEFTPARENTESIS_in_rule__AttributeName__Group__0__Impl3444); 
             after(grammarAccess.getAttributeNameAccess().getLEFTPARENTESISTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__AttributeName__Group__0__Impl"


    // $ANTLR start "rule__AttributeName__Group__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1755:1: rule__AttributeName__Group__1 : rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2 ;
    public final void rule__AttributeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1759:1: ( rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1760:2: rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__1__Impl_in_rule__AttributeName__Group__13473);
            rule__AttributeName__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__2_in_rule__AttributeName__Group__13476);
            rule__AttributeName__Group__2();

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
    // $ANTLR end "rule__AttributeName__Group__1"


    // $ANTLR start "rule__AttributeName__Group__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1767:1: rule__AttributeName__Group__1__Impl : ( ( rule__AttributeName__OldFieldAssignment_1 )? ) ;
    public final void rule__AttributeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1771:1: ( ( ( rule__AttributeName__OldFieldAssignment_1 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1772:1: ( ( rule__AttributeName__OldFieldAssignment_1 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1772:1: ( ( rule__AttributeName__OldFieldAssignment_1 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1773:1: ( rule__AttributeName__OldFieldAssignment_1 )?
            {
             before(grammarAccess.getAttributeNameAccess().getOldFieldAssignment_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1774:1: ( rule__AttributeName__OldFieldAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1774:2: rule__AttributeName__OldFieldAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AttributeName__OldFieldAssignment_1_in_rule__AttributeName__Group__1__Impl3503);
                    rule__AttributeName__OldFieldAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeNameAccess().getOldFieldAssignment_1()); 

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
    // $ANTLR end "rule__AttributeName__Group__1__Impl"


    // $ANTLR start "rule__AttributeName__Group__2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1784:1: rule__AttributeName__Group__2 : rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3 ;
    public final void rule__AttributeName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1788:1: ( rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1789:2: rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__2__Impl_in_rule__AttributeName__Group__23534);
            rule__AttributeName__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__3_in_rule__AttributeName__Group__23537);
            rule__AttributeName__Group__3();

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
    // $ANTLR end "rule__AttributeName__Group__2"


    // $ANTLR start "rule__AttributeName__Group__2__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1796:1: rule__AttributeName__Group__2__Impl : ( RULE_COMA ) ;
    public final void rule__AttributeName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1800:1: ( ( RULE_COMA ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1801:1: ( RULE_COMA )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1801:1: ( RULE_COMA )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1802:1: RULE_COMA
            {
             before(grammarAccess.getAttributeNameAccess().getCOMATerminalRuleCall_2()); 
            match(input,RULE_COMA,FollowSets000.FOLLOW_RULE_COMA_in_rule__AttributeName__Group__2__Impl3564); 
             after(grammarAccess.getAttributeNameAccess().getCOMATerminalRuleCall_2()); 

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
    // $ANTLR end "rule__AttributeName__Group__2__Impl"


    // $ANTLR start "rule__AttributeName__Group__3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1813:1: rule__AttributeName__Group__3 : rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4 ;
    public final void rule__AttributeName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1817:1: ( rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1818:2: rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__3__Impl_in_rule__AttributeName__Group__33593);
            rule__AttributeName__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__4_in_rule__AttributeName__Group__33596);
            rule__AttributeName__Group__4();

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
    // $ANTLR end "rule__AttributeName__Group__3"


    // $ANTLR start "rule__AttributeName__Group__3__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1825:1: rule__AttributeName__Group__3__Impl : ( ( rule__AttributeName__FinalFieldAssignment_3 ) ) ;
    public final void rule__AttributeName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1829:1: ( ( ( rule__AttributeName__FinalFieldAssignment_3 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1830:1: ( ( rule__AttributeName__FinalFieldAssignment_3 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1830:1: ( ( rule__AttributeName__FinalFieldAssignment_3 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1831:1: ( rule__AttributeName__FinalFieldAssignment_3 )
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldAssignment_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1832:1: ( rule__AttributeName__FinalFieldAssignment_3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1832:2: rule__AttributeName__FinalFieldAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__FinalFieldAssignment_3_in_rule__AttributeName__Group__3__Impl3623);
            rule__AttributeName__FinalFieldAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getFinalFieldAssignment_3()); 

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
    // $ANTLR end "rule__AttributeName__Group__3__Impl"


    // $ANTLR start "rule__AttributeName__Group__4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1842:1: rule__AttributeName__Group__4 : rule__AttributeName__Group__4__Impl ;
    public final void rule__AttributeName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1846:1: ( rule__AttributeName__Group__4__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1847:2: rule__AttributeName__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__4__Impl_in_rule__AttributeName__Group__43653);
            rule__AttributeName__Group__4__Impl();

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
    // $ANTLR end "rule__AttributeName__Group__4"


    // $ANTLR start "rule__AttributeName__Group__4__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1853:1: rule__AttributeName__Group__4__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__AttributeName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1857:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1858:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1858:1: ( RULE_RIGHTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1859:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getAttributeNameAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
            match(input,RULE_RIGHTPARENTESIS,FollowSets000.FOLLOW_RULE_RIGHTPARENTESIS_in_rule__AttributeName__Group__4__Impl3680); 
             after(grammarAccess.getAttributeNameAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__AttributeName__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1880:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1884:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1885:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03719);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03722);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1892:1: rule__Field__Group__0__Impl : ( RULE_LEFTPARENTESIS ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1896:1: ( ( RULE_LEFTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1897:1: ( RULE_LEFTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1897:1: ( RULE_LEFTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1898:1: RULE_LEFTPARENTESIS
            {
             before(grammarAccess.getFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
            match(input,RULE_LEFTPARENTESIS,FollowSets000.FOLLOW_RULE_LEFTPARENTESIS_in_rule__Field__Group__0__Impl3749); 
             after(grammarAccess.getFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1909:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1913:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1914:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13778);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13781);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1921:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1925:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1926:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1926:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1927:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1928:1: ( rule__Field__NameAssignment_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1928:2: rule__Field__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl3808);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1938:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1942:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1943:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23838);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23841);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1950:1: rule__Field__Group__2__Impl : ( RULE_COMA ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1954:1: ( ( RULE_COMA ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1955:1: ( RULE_COMA )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1955:1: ( RULE_COMA )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1956:1: RULE_COMA
            {
             before(grammarAccess.getFieldAccess().getCOMATerminalRuleCall_2()); 
            match(input,RULE_COMA,FollowSets000.FOLLOW_RULE_COMA_in_rule__Field__Group__2__Impl3868); 
             after(grammarAccess.getFieldAccess().getCOMATerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1967:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1971:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1972:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33897);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33900);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1979:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 )? ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1983:1: ( ( ( rule__Field__TypeAssignment_3 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1984:1: ( ( rule__Field__TypeAssignment_3 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1984:1: ( ( rule__Field__TypeAssignment_3 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1985:1: ( rule__Field__TypeAssignment_3 )?
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1986:1: ( rule__Field__TypeAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=27 && LA12_0<=30)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1986:2: rule__Field__TypeAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl3927);
                    rule__Field__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1996:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2000:1: ( rule__Field__Group__4__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2001:2: rule__Field__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43958);
            rule__Field__Group__4__Impl();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2007:1: rule__Field__Group__4__Impl : ( RULE_RIGHTPARENTESIS ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2011:1: ( ( RULE_RIGHTPARENTESIS ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2012:1: ( RULE_RIGHTPARENTESIS )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2012:1: ( RULE_RIGHTPARENTESIS )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2013:1: RULE_RIGHTPARENTESIS
            {
             before(grammarAccess.getFieldAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
            match(input,RULE_RIGHTPARENTESIS,FollowSets000.FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Field__Group__4__Impl3985); 
             after(grammarAccess.getFieldAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Config__ConecctionAssignment_5"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2035:1: rule__Config__ConecctionAssignment_5 : ( ruleConnection ) ;
    public final void rule__Config__ConecctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2039:1: ( ( ruleConnection ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2040:1: ( ruleConnection )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2040:1: ( ruleConnection )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2041:1: ruleConnection
            {
             before(grammarAccess.getConfigAccess().getConecctionConnectionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__Config__ConecctionAssignment_54029);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getConecctionConnectionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Config__ConecctionAssignment_5"


    // $ANTLR start "rule__Config__MergeFieldsAssignment_6_2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2050:1: rule__Config__MergeFieldsAssignment_6_2 : ( ruleMergedField ) ;
    public final void rule__Config__MergeFieldsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2054:1: ( ( ruleMergedField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2055:1: ( ruleMergedField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2055:1: ( ruleMergedField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2056:1: ruleMergedField
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_24060);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Config__MergeFieldsAssignment_6_2"


    // $ANTLR start "rule__Config__MergeFieldsAssignment_6_3_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2065:1: rule__Config__MergeFieldsAssignment_6_3_1 : ( ruleMergedField ) ;
    public final void rule__Config__MergeFieldsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2069:1: ( ( ruleMergedField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2070:1: ( ruleMergedField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2070:1: ( ruleMergedField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2071:1: ruleMergedField
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_3_14091);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__Config__MergeFieldsAssignment_6_3_1"


    // $ANTLR start "rule__Connection__UrlAssignment_2_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2080:1: rule__Connection__UrlAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Connection__UrlAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2084:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2085:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2085:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2086:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Connection__UrlAssignment_2_14122);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Connection__UrlAssignment_2_1"


    // $ANTLR start "rule__Connection__UsernameAssignment_3_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2095:1: rule__Connection__UsernameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Connection__UsernameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2099:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2100:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2100:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2101:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Connection__UsernameAssignment_3_14153);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Connection__UsernameAssignment_3_1"


    // $ANTLR start "rule__Connection__PasswordAssignment_4_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2110:1: rule__Connection__PasswordAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Connection__PasswordAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2114:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2115:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2115:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2116:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Connection__PasswordAssignment_4_14184);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Connection__PasswordAssignment_4_1"


    // $ANTLR start "rule__MergedField__TableNameAssignment_1_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2125:1: rule__MergedField__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__MergedField__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2129:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2130:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2130:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2131:1: ruleEString
            {
             before(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MergedField__TableNameAssignment_1_14215);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MergedField__TableNameAssignment_1_1"


    // $ANTLR start "rule__MergedField__FieldsAssignment_4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2140:1: rule__MergedField__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__MergedField__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2144:1: ( ( ruleField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2145:1: ( ruleField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2145:1: ( ruleField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2146:1: ruleField
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_44246);
            ruleField();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MergedField__FieldsAssignment_4"


    // $ANTLR start "rule__MergedField__FieldsAssignment_5_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2155:1: rule__MergedField__FieldsAssignment_5_1 : ( ruleField ) ;
    public final void rule__MergedField__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2159:1: ( ( ruleField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2160:1: ( ruleField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2160:1: ( ruleField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2161:1: ruleField
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_5_14277);
            ruleField();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__MergedField__FieldsAssignment_5_1"


    // $ANTLR start "rule__MergedField__AttributeNamesAssignment_9"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2170:1: rule__MergedField__AttributeNamesAssignment_9 : ( ruleAttributeName ) ;
    public final void rule__MergedField__AttributeNamesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2174:1: ( ( ruleAttributeName ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2175:1: ( ruleAttributeName )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2175:1: ( ruleAttributeName )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2176:1: ruleAttributeName
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_94308);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__MergedField__AttributeNamesAssignment_9"


    // $ANTLR start "rule__MergedField__AttributeNamesAssignment_10_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2185:1: rule__MergedField__AttributeNamesAssignment_10_1 : ( ruleAttributeName ) ;
    public final void rule__MergedField__AttributeNamesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2189:1: ( ( ruleAttributeName ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2190:1: ( ruleAttributeName )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2190:1: ( ruleAttributeName )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2191:1: ruleAttributeName
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_10_14339);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__MergedField__AttributeNamesAssignment_10_1"


    // $ANTLR start "rule__AttributeName__OldFieldAssignment_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2200:1: rule__AttributeName__OldFieldAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeName__OldFieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2204:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2205:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2205:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2206:1: ruleEString
            {
             before(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AttributeName__OldFieldAssignment_14370);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeName__OldFieldAssignment_1"


    // $ANTLR start "rule__AttributeName__FinalFieldAssignment_3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2215:1: rule__AttributeName__FinalFieldAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AttributeName__FinalFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2219:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2220:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2220:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2221:1: ( ruleEString )
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2222:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2223:1: ruleEString
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldFieldEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AttributeName__FinalFieldAssignment_34405);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeNameAccess().getFinalFieldFieldEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 

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
    // $ANTLR end "rule__AttributeName__FinalFieldAssignment_3"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2234:1: rule__Field__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2238:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2239:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2239:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2240:1: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Field__NameAssignment_14440);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2249:1: rule__Field__TypeAssignment_3 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2253:1: ( ( ruleFieldType ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2254:1: ( ruleFieldType )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2254:1: ( ruleFieldType )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2255:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_34471);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfig68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__0_in_ruleConfig94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnection128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0_in_ruleConnection154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergedField_in_entryRuleMergedField181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMergedField188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__0_in_ruleMergedField214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__0_in_ruleAttributeName334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleField_in_entryRuleField361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleField368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__FieldType__Alternatives516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__FieldType__Alternatives537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__FieldType__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__FieldType__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__0612 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__Config__Group__1_in_rule__Config__Group__0615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERACONFIG_in_rule__Config__Group__0__Impl642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1671 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COLON_in_rule__Config__Group__1__Impl701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2730 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__Config__Group__2__Impl760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3789 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERACONNECTION_in_rule__Config__Group__3__Impl819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4848 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COLON_in_rule__Config__Group__4__Impl878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5907 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_rule__Config__Group__6_in_rule__Config__Group__5910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__ConecctionAssignment_5_in_rule__Config__Group__5__Impl937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__6__Impl_in_rule__Config__Group__6967 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_rule__Config__Group__7_in_rule__Config__Group__6970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6__0_in_rule__Config__Group__6__Impl997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__7__Impl_in_rule__Config__Group__71028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Config__Group__7__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6__0__Impl_in_rule__Config__Group_6__01100 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Config__Group_6__1_in_rule__Config__Group_6__01103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERALMERGEDFIELDS_in_rule__Config__Group_6__0__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6__1__Impl_in_rule__Config__Group_6__11159 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Config__Group_6__2_in_rule__Config__Group_6__11162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_rule__Config__Group_6__1__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6__2__Impl_in_rule__Config__Group_6__21218 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Config__Group_6__3_in_rule__Config__Group_6__21221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__MergeFieldsAssignment_6_2_in_rule__Config__Group_6__2__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6__3__Impl_in_rule__Config__Group_6__31278 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Config__Group_6__4_in_rule__Config__Group_6__31281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6_3__0_in_rule__Config__Group_6__3__Impl1308 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Config__Group_6__4__Impl_in_rule__Config__Group_6__41339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_rule__Config__Group_6__4__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6_3__0__Impl_in_rule__Config__Group_6_3__01405 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Config__Group_6_3__1_in_rule__Config__Group_6_3__01408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMA_in_rule__Config__Group_6_3__0__Impl1435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_6_3__1__Impl_in_rule__Config__Group_6_3__11464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__MergeFieldsAssignment_6_3_1_in_rule__Config__Group_6_3__1__Impl1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01525 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11586 = new BitSet(new long[]{0x0000000000038400L});
        public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__Connection__Group__1__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21645 = new BitSet(new long[]{0x0000000000038400L});
        public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31706 = new BitSet(new long[]{0x0000000000038400L});
        public static final BitSet FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41767 = new BitSet(new long[]{0x0000000000038400L});
        public static final BitSet FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__41770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__51828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Connection__Group__5__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__01896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__01899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERALURL_in_rule__Connection__Group_2__0__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__11955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UrlAssignment_2_1_in_rule__Connection__Group_2__1__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__02016 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__02019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERALUSERNAME_in_rule__Connection__Group_3__0__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__12075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UsernameAssignment_3_1_in_rule__Connection__Group_3__1__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__02136 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__02139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERALPASSWORD_in_rule__Connection__Group_4__0__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__12195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__PasswordAssignment_4_1_in_rule__Connection__Group_4__1__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__0__Impl_in_rule__MergedField__Group__02256 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__1_in_rule__MergedField__Group__02259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__MergedField__Group__0__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__1__Impl_in_rule__MergedField__Group__12315 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__2_in_rule__MergedField__Group__12318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__0_in_rule__MergedField__Group__1__Impl2345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__2__Impl_in_rule__MergedField__Group__22376 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__3_in_rule__MergedField__Group__22379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERALFIELDS_in_rule__MergedField__Group__2__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__3__Impl_in_rule__MergedField__Group__32435 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MergedField__Group__4_in_rule__MergedField__Group__32438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__3__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__4__Impl_in_rule__MergedField__Group__42494 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__5_in_rule__MergedField__Group__42497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__FieldsAssignment_4_in_rule__MergedField__Group__4__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__5__Impl_in_rule__MergedField__Group__52554 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__6_in_rule__MergedField__Group__52557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__0_in_rule__MergedField__Group__5__Impl2584 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__6__Impl_in_rule__MergedField__Group__62615 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__7_in_rule__MergedField__Group__62618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__6__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__7__Impl_in_rule__MergedField__Group__72674 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__8_in_rule__MergedField__Group__72677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERALATTRIBUTENAMES_in_rule__MergedField__Group__7__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__8__Impl_in_rule__MergedField__Group__82733 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MergedField__Group__9_in_rule__MergedField__Group__82736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTBRACKET_in_rule__MergedField__Group__8__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__9__Impl_in_rule__MergedField__Group__92792 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__10_in_rule__MergedField__Group__92795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__AttributeNamesAssignment_9_in_rule__MergedField__Group__9__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__10__Impl_in_rule__MergedField__Group__102852 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__11_in_rule__MergedField__Group__102855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__0_in_rule__MergedField__Group__10__Impl2882 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__11__Impl_in_rule__MergedField__Group__112913 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_rule__MergedField__Group__12_in_rule__MergedField__Group__112916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTBRACKET_in_rule__MergedField__Group__11__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__12__Impl_in_rule__MergedField__Group__122972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__MergedField__Group__12__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__0__Impl_in_rule__MergedField__Group_1__03054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__1_in_rule__MergedField__Group_1__03057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LITERALTABLENAME_in_rule__MergedField__Group_1__0__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__1__Impl_in_rule__MergedField__Group_1__13113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__TableNameAssignment_1_1_in_rule__MergedField__Group_1__1__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__0__Impl_in_rule__MergedField__Group_5__03174 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__1_in_rule__MergedField__Group_5__03177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMA_in_rule__MergedField__Group_5__0__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__1__Impl_in_rule__MergedField__Group_5__13233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__FieldsAssignment_5_1_in_rule__MergedField__Group_5__1__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__0__Impl_in_rule__MergedField__Group_10__03294 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__1_in_rule__MergedField__Group_10__03297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMA_in_rule__MergedField__Group_10__0__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__1__Impl_in_rule__MergedField__Group_10__13353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__AttributeNamesAssignment_10_1_in_rule__MergedField__Group_10__1__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__0__Impl_in_rule__AttributeName__Group__03414 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__1_in_rule__AttributeName__Group__03417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__AttributeName__Group__0__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__1__Impl_in_rule__AttributeName__Group__13473 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__2_in_rule__AttributeName__Group__13476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__OldFieldAssignment_1_in_rule__AttributeName__Group__1__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__2__Impl_in_rule__AttributeName__Group__23534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__3_in_rule__AttributeName__Group__23537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMA_in_rule__AttributeName__Group__2__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__3__Impl_in_rule__AttributeName__Group__33593 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__4_in_rule__AttributeName__Group__33596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__FinalFieldAssignment_3_in_rule__AttributeName__Group__3__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__4__Impl_in_rule__AttributeName__Group__43653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__AttributeName__Group__4__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LEFTPARENTESIS_in_rule__Field__Group__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13778 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23838 = new BitSet(new long[]{0x0000000078000400L});
        public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMA_in_rule__Field__Group__2__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33897 = new BitSet(new long[]{0x0000000078000400L});
        public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RIGHTPARENTESIS_in_rule__Field__Group__4__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_rule__Config__ConecctionAssignment_54029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_24060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_6_3_14091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Connection__UrlAssignment_2_14122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Connection__UsernameAssignment_3_14153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Connection__PasswordAssignment_4_14184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MergedField__TableNameAssignment_1_14215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_44246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_5_14277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_94308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_10_14339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AttributeName__OldFieldAssignment_14370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AttributeName__FinalFieldAssignment_34405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Field__NameAssignment_14440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_34471 = new BitSet(new long[]{0x0000000000000002L});
    }


}