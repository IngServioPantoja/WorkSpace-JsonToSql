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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Float'", "'Boolean'", "'\\'config\\':'", "'{'", "'conecction:'", "'}'", "'\\'mergeFields\\':'", "'['", "']'", "','", "'\\'url\\':'", "'\\'username\\':'", "'\\'password\\':'", "'\\'attributeNames\\':'", "'fields'", "'\\'tableName\\':'", "'finalField'", "'oldField'", "'type'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:269:1: rule__FieldType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Float' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:273:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Float' ) ) | ( ( 'Boolean' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
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
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:274:1: ( ( 'String' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:274:1: ( ( 'String' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:275:1: ( 'String' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:276:1: ( 'String' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:276:3: 'String'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__FieldType__Alternatives516); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:281:6: ( ( 'Integer' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:281:6: ( ( 'Integer' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:282:1: ( 'Integer' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:283:1: ( 'Integer' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:283:3: 'Integer'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FieldType__Alternatives537); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:288:6: ( ( 'Float' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:288:6: ( ( 'Float' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:289:1: ( 'Float' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:290:1: ( 'Float' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:290:3: 'Float'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FieldType__Alternatives558); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( 'Boolean' ) )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:295:6: ( ( 'Boolean' ) )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:296:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:297:1: ( 'Boolean' )
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:297:3: 'Boolean'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__FieldType__Alternatives579); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:321:1: rule__Config__Group__0__Impl : ( '\\'config\\':' ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:325:1: ( ( '\\'config\\':' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:326:1: ( '\\'config\\':' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:326:1: ( '\\'config\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:327:1: '\\'config\\':'
            {
             before(grammarAccess.getConfigAccess().getConfigKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Config__Group__0__Impl643); 
             after(grammarAccess.getConfigAccess().getConfigKeyword_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:340:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:344:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:345:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1674);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1677);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:352:1: rule__Config__Group__1__Impl : ( '{' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:356:1: ( ( '{' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:357:1: ( '{' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:357:1: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:358:1: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Config__Group__1__Impl705); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:371:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:375:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:376:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2736);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2739);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:383:1: rule__Config__Group__2__Impl : ( 'conecction:' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:387:1: ( ( 'conecction:' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:388:1: ( 'conecction:' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:388:1: ( 'conecction:' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:389:1: 'conecction:'
            {
             before(grammarAccess.getConfigAccess().getConecctionKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Config__Group__2__Impl767); 
             after(grammarAccess.getConfigAccess().getConecctionKeyword_2()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:402:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:406:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:407:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3798);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3801);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:414:1: rule__Config__Group__3__Impl : ( ( rule__Config__ConecctionAssignment_3 ) ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:418:1: ( ( ( rule__Config__ConecctionAssignment_3 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:419:1: ( ( rule__Config__ConecctionAssignment_3 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:419:1: ( ( rule__Config__ConecctionAssignment_3 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:420:1: ( rule__Config__ConecctionAssignment_3 )
            {
             before(grammarAccess.getConfigAccess().getConecctionAssignment_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:421:1: ( rule__Config__ConecctionAssignment_3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:421:2: rule__Config__ConecctionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__ConecctionAssignment_3_in_rule__Config__Group__3__Impl828);
            rule__Config__ConecctionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getConecctionAssignment_3()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:431:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:435:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:436:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4858);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4861);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:443:1: rule__Config__Group__4__Impl : ( ( rule__Config__Group_4__0 )? ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:447:1: ( ( ( rule__Config__Group_4__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:448:1: ( ( rule__Config__Group_4__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:448:1: ( ( rule__Config__Group_4__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:449:1: ( rule__Config__Group_4__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_4()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:450:1: ( rule__Config__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:450:2: rule__Config__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__0_in_rule__Config__Group__4__Impl888);
                    rule__Config__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_4()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:460:1: rule__Config__Group__5 : rule__Config__Group__5__Impl ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:464:1: ( rule__Config__Group__5__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:465:2: rule__Config__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5919);
            rule__Config__Group__5__Impl();

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:471:1: rule__Config__Group__5__Impl : ( '}' ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:475:1: ( ( '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:476:1: ( '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:476:1: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:477:1: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Config__Group__5__Impl947); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Config__Group_4__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:502:1: rule__Config__Group_4__0 : rule__Config__Group_4__0__Impl rule__Config__Group_4__1 ;
    public final void rule__Config__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:506:1: ( rule__Config__Group_4__0__Impl rule__Config__Group_4__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:507:2: rule__Config__Group_4__0__Impl rule__Config__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__0__Impl_in_rule__Config__Group_4__0990);
            rule__Config__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__1_in_rule__Config__Group_4__0993);
            rule__Config__Group_4__1();

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
    // $ANTLR end "rule__Config__Group_4__0"


    // $ANTLR start "rule__Config__Group_4__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:514:1: rule__Config__Group_4__0__Impl : ( '\\'mergeFields\\':' ) ;
    public final void rule__Config__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:518:1: ( ( '\\'mergeFields\\':' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:519:1: ( '\\'mergeFields\\':' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:519:1: ( '\\'mergeFields\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:520:1: '\\'mergeFields\\':'
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Config__Group_4__0__Impl1021); 
             after(grammarAccess.getConfigAccess().getMergeFieldsKeyword_4_0()); 

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
    // $ANTLR end "rule__Config__Group_4__0__Impl"


    // $ANTLR start "rule__Config__Group_4__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:533:1: rule__Config__Group_4__1 : rule__Config__Group_4__1__Impl rule__Config__Group_4__2 ;
    public final void rule__Config__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:537:1: ( rule__Config__Group_4__1__Impl rule__Config__Group_4__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:538:2: rule__Config__Group_4__1__Impl rule__Config__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__1__Impl_in_rule__Config__Group_4__11052);
            rule__Config__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__2_in_rule__Config__Group_4__11055);
            rule__Config__Group_4__2();

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
    // $ANTLR end "rule__Config__Group_4__1"


    // $ANTLR start "rule__Config__Group_4__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:545:1: rule__Config__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Config__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:549:1: ( ( '[' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:550:1: ( '[' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:550:1: ( '[' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:551:1: '['
            {
             before(grammarAccess.getConfigAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Config__Group_4__1__Impl1083); 
             after(grammarAccess.getConfigAccess().getLeftSquareBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Config__Group_4__1__Impl"


    // $ANTLR start "rule__Config__Group_4__2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:564:1: rule__Config__Group_4__2 : rule__Config__Group_4__2__Impl rule__Config__Group_4__3 ;
    public final void rule__Config__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:568:1: ( rule__Config__Group_4__2__Impl rule__Config__Group_4__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:569:2: rule__Config__Group_4__2__Impl rule__Config__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__2__Impl_in_rule__Config__Group_4__21114);
            rule__Config__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__3_in_rule__Config__Group_4__21117);
            rule__Config__Group_4__3();

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
    // $ANTLR end "rule__Config__Group_4__2"


    // $ANTLR start "rule__Config__Group_4__2__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:576:1: rule__Config__Group_4__2__Impl : ( ( rule__Config__MergeFieldsAssignment_4_2 ) ) ;
    public final void rule__Config__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:580:1: ( ( ( rule__Config__MergeFieldsAssignment_4_2 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:581:1: ( ( rule__Config__MergeFieldsAssignment_4_2 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:581:1: ( ( rule__Config__MergeFieldsAssignment_4_2 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:582:1: ( rule__Config__MergeFieldsAssignment_4_2 )
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsAssignment_4_2()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:583:1: ( rule__Config__MergeFieldsAssignment_4_2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:583:2: rule__Config__MergeFieldsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__MergeFieldsAssignment_4_2_in_rule__Config__Group_4__2__Impl1144);
            rule__Config__MergeFieldsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMergeFieldsAssignment_4_2()); 

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
    // $ANTLR end "rule__Config__Group_4__2__Impl"


    // $ANTLR start "rule__Config__Group_4__3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:593:1: rule__Config__Group_4__3 : rule__Config__Group_4__3__Impl rule__Config__Group_4__4 ;
    public final void rule__Config__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:597:1: ( rule__Config__Group_4__3__Impl rule__Config__Group_4__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:598:2: rule__Config__Group_4__3__Impl rule__Config__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__3__Impl_in_rule__Config__Group_4__31174);
            rule__Config__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__4_in_rule__Config__Group_4__31177);
            rule__Config__Group_4__4();

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
    // $ANTLR end "rule__Config__Group_4__3"


    // $ANTLR start "rule__Config__Group_4__3__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:605:1: rule__Config__Group_4__3__Impl : ( ( rule__Config__Group_4_3__0 )* ) ;
    public final void rule__Config__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:609:1: ( ( ( rule__Config__Group_4_3__0 )* ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:610:1: ( ( rule__Config__Group_4_3__0 )* )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:610:1: ( ( rule__Config__Group_4_3__0 )* )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:611:1: ( rule__Config__Group_4_3__0 )*
            {
             before(grammarAccess.getConfigAccess().getGroup_4_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:612:1: ( rule__Config__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:612:2: rule__Config__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4_3__0_in_rule__Config__Group_4__3__Impl1204);
            	    rule__Config__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Config__Group_4__3__Impl"


    // $ANTLR start "rule__Config__Group_4__4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:622:1: rule__Config__Group_4__4 : rule__Config__Group_4__4__Impl ;
    public final void rule__Config__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:626:1: ( rule__Config__Group_4__4__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:627:2: rule__Config__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4__4__Impl_in_rule__Config__Group_4__41235);
            rule__Config__Group_4__4__Impl();

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
    // $ANTLR end "rule__Config__Group_4__4"


    // $ANTLR start "rule__Config__Group_4__4__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:633:1: rule__Config__Group_4__4__Impl : ( ']' ) ;
    public final void rule__Config__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:637:1: ( ( ']' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:638:1: ( ']' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:638:1: ( ']' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:639:1: ']'
            {
             before(grammarAccess.getConfigAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Config__Group_4__4__Impl1263); 
             after(grammarAccess.getConfigAccess().getRightSquareBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Config__Group_4__4__Impl"


    // $ANTLR start "rule__Config__Group_4_3__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:662:1: rule__Config__Group_4_3__0 : rule__Config__Group_4_3__0__Impl rule__Config__Group_4_3__1 ;
    public final void rule__Config__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:666:1: ( rule__Config__Group_4_3__0__Impl rule__Config__Group_4_3__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:667:2: rule__Config__Group_4_3__0__Impl rule__Config__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4_3__0__Impl_in_rule__Config__Group_4_3__01304);
            rule__Config__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4_3__1_in_rule__Config__Group_4_3__01307);
            rule__Config__Group_4_3__1();

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
    // $ANTLR end "rule__Config__Group_4_3__0"


    // $ANTLR start "rule__Config__Group_4_3__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:674:1: rule__Config__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Config__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:678:1: ( ( ',' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:679:1: ( ',' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:679:1: ( ',' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:680:1: ','
            {
             before(grammarAccess.getConfigAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Config__Group_4_3__0__Impl1335); 
             after(grammarAccess.getConfigAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Config__Group_4_3__0__Impl"


    // $ANTLR start "rule__Config__Group_4_3__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:693:1: rule__Config__Group_4_3__1 : rule__Config__Group_4_3__1__Impl ;
    public final void rule__Config__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:697:1: ( rule__Config__Group_4_3__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:698:2: rule__Config__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__Group_4_3__1__Impl_in_rule__Config__Group_4_3__11366);
            rule__Config__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Config__Group_4_3__1"


    // $ANTLR start "rule__Config__Group_4_3__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:704:1: rule__Config__Group_4_3__1__Impl : ( ( rule__Config__MergeFieldsAssignment_4_3_1 ) ) ;
    public final void rule__Config__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:708:1: ( ( ( rule__Config__MergeFieldsAssignment_4_3_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:709:1: ( ( rule__Config__MergeFieldsAssignment_4_3_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:709:1: ( ( rule__Config__MergeFieldsAssignment_4_3_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:710:1: ( rule__Config__MergeFieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsAssignment_4_3_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:711:1: ( rule__Config__MergeFieldsAssignment_4_3_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:711:2: rule__Config__MergeFieldsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Config__MergeFieldsAssignment_4_3_1_in_rule__Config__Group_4_3__1__Impl1393);
            rule__Config__MergeFieldsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMergeFieldsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Config__Group_4_3__1__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:725:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:729:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:730:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01427);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01430);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:737:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:741:1: ( ( () ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:742:1: ( () )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:742:1: ( () )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:743:1: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:744:1: ()
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:746:1: 
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:756:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:760:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:761:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11488);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11491);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:768:1: rule__Connection__Group__1__Impl : ( '{' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:772:1: ( ( '{' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:773:1: ( '{' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:773:1: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:774:1: '{'
            {
             before(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Connection__Group__1__Impl1519); 
             after(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:787:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:791:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:792:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21550);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21553);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:799:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__Group_2__0 )? ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:803:1: ( ( ( rule__Connection__Group_2__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:804:1: ( ( rule__Connection__Group_2__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:804:1: ( ( rule__Connection__Group_2__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:805:1: ( rule__Connection__Group_2__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_2()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:806:1: ( rule__Connection__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:806:2: rule__Connection__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl1580);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:816:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:820:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:821:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31611);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31614);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:828:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:832:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:833:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:833:1: ( ( rule__Connection__Group_3__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:834:1: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:835:1: ( rule__Connection__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:835:2: rule__Connection__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl1641);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:845:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:849:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:850:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41672);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__41675);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:857:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__Group_4__0 )? ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:861:1: ( ( ( rule__Connection__Group_4__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:862:1: ( ( rule__Connection__Group_4__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:862:1: ( ( rule__Connection__Group_4__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:863:1: ( rule__Connection__Group_4__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_4()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:864:1: ( rule__Connection__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:864:2: rule__Connection__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1702);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:874:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:878:1: ( rule__Connection__Group__5__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:879:2: rule__Connection__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__51733);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:885:1: rule__Connection__Group__5__Impl : ( '}' ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:889:1: ( ( '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:890:1: ( '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:890:1: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:891:1: '}'
            {
             before(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Connection__Group__5__Impl1761); 
             after(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:916:1: rule__Connection__Group_2__0 : rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 ;
    public final void rule__Connection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:920:1: ( rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:921:2: rule__Connection__Group_2__0__Impl rule__Connection__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__01804);
            rule__Connection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__01807);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:928:1: rule__Connection__Group_2__0__Impl : ( '\\'url\\':' ) ;
    public final void rule__Connection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:932:1: ( ( '\\'url\\':' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:933:1: ( '\\'url\\':' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:933:1: ( '\\'url\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:934:1: '\\'url\\':'
            {
             before(grammarAccess.getConnectionAccess().getUrlKeyword_2_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Connection__Group_2__0__Impl1835); 
             after(grammarAccess.getConnectionAccess().getUrlKeyword_2_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:947:1: rule__Connection__Group_2__1 : rule__Connection__Group_2__1__Impl ;
    public final void rule__Connection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:951:1: ( rule__Connection__Group_2__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:952:2: rule__Connection__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__11866);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:958:1: rule__Connection__Group_2__1__Impl : ( ( rule__Connection__UrlAssignment_2_1 ) ) ;
    public final void rule__Connection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:962:1: ( ( ( rule__Connection__UrlAssignment_2_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:963:1: ( ( rule__Connection__UrlAssignment_2_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:963:1: ( ( rule__Connection__UrlAssignment_2_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:964:1: ( rule__Connection__UrlAssignment_2_1 )
            {
             before(grammarAccess.getConnectionAccess().getUrlAssignment_2_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:965:1: ( rule__Connection__UrlAssignment_2_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:965:2: rule__Connection__UrlAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UrlAssignment_2_1_in_rule__Connection__Group_2__1__Impl1893);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:979:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:983:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:984:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__01927);
            rule__Connection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__01930);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:991:1: rule__Connection__Group_3__0__Impl : ( '\\'username\\':' ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:995:1: ( ( '\\'username\\':' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:996:1: ( '\\'username\\':' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:996:1: ( '\\'username\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:997:1: '\\'username\\':'
            {
             before(grammarAccess.getConnectionAccess().getUsernameKeyword_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Connection__Group_3__0__Impl1958); 
             after(grammarAccess.getConnectionAccess().getUsernameKeyword_3_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1010:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1014:1: ( rule__Connection__Group_3__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1015:2: rule__Connection__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__11989);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1021:1: rule__Connection__Group_3__1__Impl : ( ( rule__Connection__UsernameAssignment_3_1 ) ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1025:1: ( ( ( rule__Connection__UsernameAssignment_3_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1026:1: ( ( rule__Connection__UsernameAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1026:1: ( ( rule__Connection__UsernameAssignment_3_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1027:1: ( rule__Connection__UsernameAssignment_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getUsernameAssignment_3_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1028:1: ( rule__Connection__UsernameAssignment_3_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1028:2: rule__Connection__UsernameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UsernameAssignment_3_1_in_rule__Connection__Group_3__1__Impl2016);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1042:1: rule__Connection__Group_4__0 : rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 ;
    public final void rule__Connection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1046:1: ( rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1047:2: rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__02050);
            rule__Connection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__02053);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1054:1: rule__Connection__Group_4__0__Impl : ( '\\'password\\':' ) ;
    public final void rule__Connection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1058:1: ( ( '\\'password\\':' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1059:1: ( '\\'password\\':' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1059:1: ( '\\'password\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1060:1: '\\'password\\':'
            {
             before(grammarAccess.getConnectionAccess().getPasswordKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Connection__Group_4__0__Impl2081); 
             after(grammarAccess.getConnectionAccess().getPasswordKeyword_4_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1073:1: rule__Connection__Group_4__1 : rule__Connection__Group_4__1__Impl ;
    public final void rule__Connection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1077:1: ( rule__Connection__Group_4__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1078:2: rule__Connection__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__12112);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1084:1: rule__Connection__Group_4__1__Impl : ( ( rule__Connection__PasswordAssignment_4_1 ) ) ;
    public final void rule__Connection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1088:1: ( ( ( rule__Connection__PasswordAssignment_4_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1089:1: ( ( rule__Connection__PasswordAssignment_4_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1089:1: ( ( rule__Connection__PasswordAssignment_4_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1090:1: ( rule__Connection__PasswordAssignment_4_1 )
            {
             before(grammarAccess.getConnectionAccess().getPasswordAssignment_4_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1091:1: ( rule__Connection__PasswordAssignment_4_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1091:2: rule__Connection__PasswordAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__PasswordAssignment_4_1_in_rule__Connection__Group_4__1__Impl2139);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1105:1: rule__MergedField__Group__0 : rule__MergedField__Group__0__Impl rule__MergedField__Group__1 ;
    public final void rule__MergedField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1109:1: ( rule__MergedField__Group__0__Impl rule__MergedField__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1110:2: rule__MergedField__Group__0__Impl rule__MergedField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__0__Impl_in_rule__MergedField__Group__02173);
            rule__MergedField__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__1_in_rule__MergedField__Group__02176);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1117:1: rule__MergedField__Group__0__Impl : ( '{' ) ;
    public final void rule__MergedField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1121:1: ( ( '{' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1122:1: ( '{' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1122:1: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1123:1: '{'
            {
             before(grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MergedField__Group__0__Impl2204); 
             after(grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1136:1: rule__MergedField__Group__1 : rule__MergedField__Group__1__Impl rule__MergedField__Group__2 ;
    public final void rule__MergedField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1140:1: ( rule__MergedField__Group__1__Impl rule__MergedField__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1141:2: rule__MergedField__Group__1__Impl rule__MergedField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__1__Impl_in_rule__MergedField__Group__12235);
            rule__MergedField__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__2_in_rule__MergedField__Group__12238);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1148:1: rule__MergedField__Group__1__Impl : ( ( rule__MergedField__Group_1__0 )? ) ;
    public final void rule__MergedField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1152:1: ( ( ( rule__MergedField__Group_1__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1153:1: ( ( rule__MergedField__Group_1__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1153:1: ( ( rule__MergedField__Group_1__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1154:1: ( rule__MergedField__Group_1__0 )?
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1155:1: ( rule__MergedField__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1155:2: rule__MergedField__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__0_in_rule__MergedField__Group__1__Impl2265);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1165:1: rule__MergedField__Group__2 : rule__MergedField__Group__2__Impl rule__MergedField__Group__3 ;
    public final void rule__MergedField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1169:1: ( rule__MergedField__Group__2__Impl rule__MergedField__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1170:2: rule__MergedField__Group__2__Impl rule__MergedField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__2__Impl_in_rule__MergedField__Group__22296);
            rule__MergedField__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__3_in_rule__MergedField__Group__22299);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1177:1: rule__MergedField__Group__2__Impl : ( '\\'attributeNames\\':' ) ;
    public final void rule__MergedField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1181:1: ( ( '\\'attributeNames\\':' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1182:1: ( '\\'attributeNames\\':' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1182:1: ( '\\'attributeNames\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1183:1: '\\'attributeNames\\':'
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MergedField__Group__2__Impl2327); 
             after(grammarAccess.getMergedFieldAccess().getAttributeNamesKeyword_2()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1196:1: rule__MergedField__Group__3 : rule__MergedField__Group__3__Impl rule__MergedField__Group__4 ;
    public final void rule__MergedField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1200:1: ( rule__MergedField__Group__3__Impl rule__MergedField__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1201:2: rule__MergedField__Group__3__Impl rule__MergedField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__3__Impl_in_rule__MergedField__Group__32358);
            rule__MergedField__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__4_in_rule__MergedField__Group__32361);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1208:1: rule__MergedField__Group__3__Impl : ( '{' ) ;
    public final void rule__MergedField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1212:1: ( ( '{' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1213:1: ( '{' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1213:1: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1214:1: '{'
            {
             before(grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MergedField__Group__3__Impl2389); 
             after(grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1227:1: rule__MergedField__Group__4 : rule__MergedField__Group__4__Impl rule__MergedField__Group__5 ;
    public final void rule__MergedField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1231:1: ( rule__MergedField__Group__4__Impl rule__MergedField__Group__5 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1232:2: rule__MergedField__Group__4__Impl rule__MergedField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__4__Impl_in_rule__MergedField__Group__42420);
            rule__MergedField__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__5_in_rule__MergedField__Group__42423);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1239:1: rule__MergedField__Group__4__Impl : ( ( rule__MergedField__AttributeNamesAssignment_4 ) ) ;
    public final void rule__MergedField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1243:1: ( ( ( rule__MergedField__AttributeNamesAssignment_4 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1244:1: ( ( rule__MergedField__AttributeNamesAssignment_4 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1244:1: ( ( rule__MergedField__AttributeNamesAssignment_4 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1245:1: ( rule__MergedField__AttributeNamesAssignment_4 )
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_4()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1246:1: ( rule__MergedField__AttributeNamesAssignment_4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1246:2: rule__MergedField__AttributeNamesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__AttributeNamesAssignment_4_in_rule__MergedField__Group__4__Impl2450);
            rule__MergedField__AttributeNamesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_4()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1256:1: rule__MergedField__Group__5 : rule__MergedField__Group__5__Impl rule__MergedField__Group__6 ;
    public final void rule__MergedField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1260:1: ( rule__MergedField__Group__5__Impl rule__MergedField__Group__6 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1261:2: rule__MergedField__Group__5__Impl rule__MergedField__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__5__Impl_in_rule__MergedField__Group__52480);
            rule__MergedField__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__6_in_rule__MergedField__Group__52483);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1268:1: rule__MergedField__Group__5__Impl : ( ( rule__MergedField__Group_5__0 )* ) ;
    public final void rule__MergedField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1272:1: ( ( ( rule__MergedField__Group_5__0 )* ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1273:1: ( ( rule__MergedField__Group_5__0 )* )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1273:1: ( ( rule__MergedField__Group_5__0 )* )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1274:1: ( rule__MergedField__Group_5__0 )*
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_5()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1275:1: ( rule__MergedField__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1275:2: rule__MergedField__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__0_in_rule__MergedField__Group__5__Impl2510);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1285:1: rule__MergedField__Group__6 : rule__MergedField__Group__6__Impl rule__MergedField__Group__7 ;
    public final void rule__MergedField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1289:1: ( rule__MergedField__Group__6__Impl rule__MergedField__Group__7 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1290:2: rule__MergedField__Group__6__Impl rule__MergedField__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__6__Impl_in_rule__MergedField__Group__62541);
            rule__MergedField__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__7_in_rule__MergedField__Group__62544);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1297:1: rule__MergedField__Group__6__Impl : ( '}' ) ;
    public final void rule__MergedField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1301:1: ( ( '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1302:1: ( '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1302:1: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1303:1: '}'
            {
             before(grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MergedField__Group__6__Impl2572); 
             after(grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_6()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1316:1: rule__MergedField__Group__7 : rule__MergedField__Group__7__Impl rule__MergedField__Group__8 ;
    public final void rule__MergedField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1320:1: ( rule__MergedField__Group__7__Impl rule__MergedField__Group__8 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1321:2: rule__MergedField__Group__7__Impl rule__MergedField__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__7__Impl_in_rule__MergedField__Group__72603);
            rule__MergedField__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__8_in_rule__MergedField__Group__72606);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1328:1: rule__MergedField__Group__7__Impl : ( 'fields' ) ;
    public final void rule__MergedField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1332:1: ( ( 'fields' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1333:1: ( 'fields' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1333:1: ( 'fields' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1334:1: 'fields'
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsKeyword_7()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MergedField__Group__7__Impl2634); 
             after(grammarAccess.getMergedFieldAccess().getFieldsKeyword_7()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1347:1: rule__MergedField__Group__8 : rule__MergedField__Group__8__Impl rule__MergedField__Group__9 ;
    public final void rule__MergedField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1351:1: ( rule__MergedField__Group__8__Impl rule__MergedField__Group__9 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1352:2: rule__MergedField__Group__8__Impl rule__MergedField__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__8__Impl_in_rule__MergedField__Group__82665);
            rule__MergedField__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__9_in_rule__MergedField__Group__82668);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1359:1: rule__MergedField__Group__8__Impl : ( '{' ) ;
    public final void rule__MergedField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1363:1: ( ( '{' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1364:1: ( '{' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1364:1: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1365:1: '{'
            {
             before(grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MergedField__Group__8__Impl2696); 
             after(grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_8()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1378:1: rule__MergedField__Group__9 : rule__MergedField__Group__9__Impl rule__MergedField__Group__10 ;
    public final void rule__MergedField__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1382:1: ( rule__MergedField__Group__9__Impl rule__MergedField__Group__10 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1383:2: rule__MergedField__Group__9__Impl rule__MergedField__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__9__Impl_in_rule__MergedField__Group__92727);
            rule__MergedField__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__10_in_rule__MergedField__Group__92730);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1390:1: rule__MergedField__Group__9__Impl : ( ( rule__MergedField__FieldsAssignment_9 ) ) ;
    public final void rule__MergedField__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1394:1: ( ( ( rule__MergedField__FieldsAssignment_9 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1395:1: ( ( rule__MergedField__FieldsAssignment_9 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1395:1: ( ( rule__MergedField__FieldsAssignment_9 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1396:1: ( rule__MergedField__FieldsAssignment_9 )
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsAssignment_9()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1397:1: ( rule__MergedField__FieldsAssignment_9 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1397:2: rule__MergedField__FieldsAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__FieldsAssignment_9_in_rule__MergedField__Group__9__Impl2757);
            rule__MergedField__FieldsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getFieldsAssignment_9()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1407:1: rule__MergedField__Group__10 : rule__MergedField__Group__10__Impl rule__MergedField__Group__11 ;
    public final void rule__MergedField__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1411:1: ( rule__MergedField__Group__10__Impl rule__MergedField__Group__11 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1412:2: rule__MergedField__Group__10__Impl rule__MergedField__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__10__Impl_in_rule__MergedField__Group__102787);
            rule__MergedField__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__11_in_rule__MergedField__Group__102790);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1419:1: rule__MergedField__Group__10__Impl : ( ( rule__MergedField__Group_10__0 )* ) ;
    public final void rule__MergedField__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1423:1: ( ( ( rule__MergedField__Group_10__0 )* ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1424:1: ( ( rule__MergedField__Group_10__0 )* )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1424:1: ( ( rule__MergedField__Group_10__0 )* )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1425:1: ( rule__MergedField__Group_10__0 )*
            {
             before(grammarAccess.getMergedFieldAccess().getGroup_10()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1426:1: ( rule__MergedField__Group_10__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1426:2: rule__MergedField__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__0_in_rule__MergedField__Group__10__Impl2817);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1436:1: rule__MergedField__Group__11 : rule__MergedField__Group__11__Impl rule__MergedField__Group__12 ;
    public final void rule__MergedField__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1440:1: ( rule__MergedField__Group__11__Impl rule__MergedField__Group__12 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1441:2: rule__MergedField__Group__11__Impl rule__MergedField__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__11__Impl_in_rule__MergedField__Group__112848);
            rule__MergedField__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__12_in_rule__MergedField__Group__112851);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1448:1: rule__MergedField__Group__11__Impl : ( '}' ) ;
    public final void rule__MergedField__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1452:1: ( ( '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1453:1: ( '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1453:1: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1454:1: '}'
            {
             before(grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MergedField__Group__11__Impl2879); 
             after(grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_11()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1467:1: rule__MergedField__Group__12 : rule__MergedField__Group__12__Impl ;
    public final void rule__MergedField__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1471:1: ( rule__MergedField__Group__12__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1472:2: rule__MergedField__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group__12__Impl_in_rule__MergedField__Group__122910);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1478:1: rule__MergedField__Group__12__Impl : ( '}' ) ;
    public final void rule__MergedField__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1482:1: ( ( '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1483:1: ( '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1483:1: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1484:1: '}'
            {
             before(grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MergedField__Group__12__Impl2938); 
             after(grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_12()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1523:1: rule__MergedField__Group_1__0 : rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1 ;
    public final void rule__MergedField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1527:1: ( rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1528:2: rule__MergedField__Group_1__0__Impl rule__MergedField__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__0__Impl_in_rule__MergedField__Group_1__02995);
            rule__MergedField__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__1_in_rule__MergedField__Group_1__02998);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1535:1: rule__MergedField__Group_1__0__Impl : ( '\\'tableName\\':' ) ;
    public final void rule__MergedField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1539:1: ( ( '\\'tableName\\':' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1540:1: ( '\\'tableName\\':' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1540:1: ( '\\'tableName\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1541:1: '\\'tableName\\':'
            {
             before(grammarAccess.getMergedFieldAccess().getTableNameKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MergedField__Group_1__0__Impl3026); 
             after(grammarAccess.getMergedFieldAccess().getTableNameKeyword_1_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1554:1: rule__MergedField__Group_1__1 : rule__MergedField__Group_1__1__Impl ;
    public final void rule__MergedField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1558:1: ( rule__MergedField__Group_1__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1559:2: rule__MergedField__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_1__1__Impl_in_rule__MergedField__Group_1__13057);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1565:1: rule__MergedField__Group_1__1__Impl : ( ( rule__MergedField__TableNameAssignment_1_1 ) ) ;
    public final void rule__MergedField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1569:1: ( ( ( rule__MergedField__TableNameAssignment_1_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1570:1: ( ( rule__MergedField__TableNameAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1570:1: ( ( rule__MergedField__TableNameAssignment_1_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1571:1: ( rule__MergedField__TableNameAssignment_1_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getTableNameAssignment_1_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1572:1: ( rule__MergedField__TableNameAssignment_1_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1572:2: rule__MergedField__TableNameAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__TableNameAssignment_1_1_in_rule__MergedField__Group_1__1__Impl3084);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1586:1: rule__MergedField__Group_5__0 : rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1 ;
    public final void rule__MergedField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1590:1: ( rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1591:2: rule__MergedField__Group_5__0__Impl rule__MergedField__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__0__Impl_in_rule__MergedField__Group_5__03118);
            rule__MergedField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__1_in_rule__MergedField__Group_5__03121);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1598:1: rule__MergedField__Group_5__0__Impl : ( ',' ) ;
    public final void rule__MergedField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1602:1: ( ( ',' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1603:1: ( ',' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1603:1: ( ',' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1604:1: ','
            {
             before(grammarAccess.getMergedFieldAccess().getCommaKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MergedField__Group_5__0__Impl3149); 
             after(grammarAccess.getMergedFieldAccess().getCommaKeyword_5_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1617:1: rule__MergedField__Group_5__1 : rule__MergedField__Group_5__1__Impl ;
    public final void rule__MergedField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1621:1: ( rule__MergedField__Group_5__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1622:2: rule__MergedField__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_5__1__Impl_in_rule__MergedField__Group_5__13180);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1628:1: rule__MergedField__Group_5__1__Impl : ( ( rule__MergedField__AttributeNamesAssignment_5_1 ) ) ;
    public final void rule__MergedField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1632:1: ( ( ( rule__MergedField__AttributeNamesAssignment_5_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1633:1: ( ( rule__MergedField__AttributeNamesAssignment_5_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1633:1: ( ( rule__MergedField__AttributeNamesAssignment_5_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1634:1: ( rule__MergedField__AttributeNamesAssignment_5_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_5_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1635:1: ( rule__MergedField__AttributeNamesAssignment_5_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1635:2: rule__MergedField__AttributeNamesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__AttributeNamesAssignment_5_1_in_rule__MergedField__Group_5__1__Impl3207);
            rule__MergedField__AttributeNamesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAssignment_5_1()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1649:1: rule__MergedField__Group_10__0 : rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1 ;
    public final void rule__MergedField__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1653:1: ( rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1654:2: rule__MergedField__Group_10__0__Impl rule__MergedField__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__0__Impl_in_rule__MergedField__Group_10__03241);
            rule__MergedField__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__1_in_rule__MergedField__Group_10__03244);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1661:1: rule__MergedField__Group_10__0__Impl : ( ',' ) ;
    public final void rule__MergedField__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1665:1: ( ( ',' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1666:1: ( ',' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1666:1: ( ',' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1667:1: ','
            {
             before(grammarAccess.getMergedFieldAccess().getCommaKeyword_10_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MergedField__Group_10__0__Impl3272); 
             after(grammarAccess.getMergedFieldAccess().getCommaKeyword_10_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1680:1: rule__MergedField__Group_10__1 : rule__MergedField__Group_10__1__Impl ;
    public final void rule__MergedField__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1684:1: ( rule__MergedField__Group_10__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1685:2: rule__MergedField__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__Group_10__1__Impl_in_rule__MergedField__Group_10__13303);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1691:1: rule__MergedField__Group_10__1__Impl : ( ( rule__MergedField__FieldsAssignment_10_1 ) ) ;
    public final void rule__MergedField__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1695:1: ( ( ( rule__MergedField__FieldsAssignment_10_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1696:1: ( ( rule__MergedField__FieldsAssignment_10_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1696:1: ( ( rule__MergedField__FieldsAssignment_10_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1697:1: ( rule__MergedField__FieldsAssignment_10_1 )
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsAssignment_10_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1698:1: ( rule__MergedField__FieldsAssignment_10_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1698:2: rule__MergedField__FieldsAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergedField__FieldsAssignment_10_1_in_rule__MergedField__Group_10__1__Impl3330);
            rule__MergedField__FieldsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMergedFieldAccess().getFieldsAssignment_10_1()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1712:1: rule__AttributeName__Group__0 : rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1 ;
    public final void rule__AttributeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1716:1: ( rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1717:2: rule__AttributeName__Group__0__Impl rule__AttributeName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__0__Impl_in_rule__AttributeName__Group__03364);
            rule__AttributeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__1_in_rule__AttributeName__Group__03367);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1724:1: rule__AttributeName__Group__0__Impl : ( '{' ) ;
    public final void rule__AttributeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1728:1: ( ( '{' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1729:1: ( '{' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1729:1: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1730:1: '{'
            {
             before(grammarAccess.getAttributeNameAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__AttributeName__Group__0__Impl3395); 
             after(grammarAccess.getAttributeNameAccess().getLeftCurlyBracketKeyword_0()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1743:1: rule__AttributeName__Group__1 : rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2 ;
    public final void rule__AttributeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1747:1: ( rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1748:2: rule__AttributeName__Group__1__Impl rule__AttributeName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__1__Impl_in_rule__AttributeName__Group__13426);
            rule__AttributeName__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__2_in_rule__AttributeName__Group__13429);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1755:1: rule__AttributeName__Group__1__Impl : ( ( rule__AttributeName__Group_1__0 )? ) ;
    public final void rule__AttributeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1759:1: ( ( ( rule__AttributeName__Group_1__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1760:1: ( ( rule__AttributeName__Group_1__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1760:1: ( ( rule__AttributeName__Group_1__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1761:1: ( rule__AttributeName__Group_1__0 )?
            {
             before(grammarAccess.getAttributeNameAccess().getGroup_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1762:1: ( rule__AttributeName__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1762:2: rule__AttributeName__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Group__1__Impl3456);
                    rule__AttributeName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeNameAccess().getGroup_1()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1772:1: rule__AttributeName__Group__2 : rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3 ;
    public final void rule__AttributeName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1776:1: ( rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1777:2: rule__AttributeName__Group__2__Impl rule__AttributeName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__2__Impl_in_rule__AttributeName__Group__23487);
            rule__AttributeName__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__3_in_rule__AttributeName__Group__23490);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1784:1: rule__AttributeName__Group__2__Impl : ( 'finalField' ) ;
    public final void rule__AttributeName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1788:1: ( ( 'finalField' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1789:1: ( 'finalField' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1789:1: ( 'finalField' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1790:1: 'finalField'
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AttributeName__Group__2__Impl3518); 
             after(grammarAccess.getAttributeNameAccess().getFinalFieldKeyword_2()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1803:1: rule__AttributeName__Group__3 : rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4 ;
    public final void rule__AttributeName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1807:1: ( rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1808:2: rule__AttributeName__Group__3__Impl rule__AttributeName__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__3__Impl_in_rule__AttributeName__Group__33549);
            rule__AttributeName__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__4_in_rule__AttributeName__Group__33552);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1815:1: rule__AttributeName__Group__3__Impl : ( ( rule__AttributeName__FinalFieldAssignment_3 ) ) ;
    public final void rule__AttributeName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1819:1: ( ( ( rule__AttributeName__FinalFieldAssignment_3 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1820:1: ( ( rule__AttributeName__FinalFieldAssignment_3 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1820:1: ( ( rule__AttributeName__FinalFieldAssignment_3 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1821:1: ( rule__AttributeName__FinalFieldAssignment_3 )
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldAssignment_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1822:1: ( rule__AttributeName__FinalFieldAssignment_3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1822:2: rule__AttributeName__FinalFieldAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__FinalFieldAssignment_3_in_rule__AttributeName__Group__3__Impl3579);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1832:1: rule__AttributeName__Group__4 : rule__AttributeName__Group__4__Impl ;
    public final void rule__AttributeName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1836:1: ( rule__AttributeName__Group__4__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1837:2: rule__AttributeName__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group__4__Impl_in_rule__AttributeName__Group__43609);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1843:1: rule__AttributeName__Group__4__Impl : ( '}' ) ;
    public final void rule__AttributeName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1847:1: ( ( '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1848:1: ( '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1848:1: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1849:1: '}'
            {
             before(grammarAccess.getAttributeNameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__AttributeName__Group__4__Impl3637); 
             after(grammarAccess.getAttributeNameAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__AttributeName__Group_1__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1872:1: rule__AttributeName__Group_1__0 : rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 ;
    public final void rule__AttributeName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1876:1: ( rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1877:2: rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__03678);
            rule__AttributeName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__03681);
            rule__AttributeName__Group_1__1();

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
    // $ANTLR end "rule__AttributeName__Group_1__0"


    // $ANTLR start "rule__AttributeName__Group_1__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1884:1: rule__AttributeName__Group_1__0__Impl : ( 'oldField' ) ;
    public final void rule__AttributeName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1888:1: ( ( 'oldField' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1889:1: ( 'oldField' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1889:1: ( 'oldField' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1890:1: 'oldField'
            {
             before(grammarAccess.getAttributeNameAccess().getOldFieldKeyword_1_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AttributeName__Group_1__0__Impl3709); 
             after(grammarAccess.getAttributeNameAccess().getOldFieldKeyword_1_0()); 

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
    // $ANTLR end "rule__AttributeName__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_1__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1903:1: rule__AttributeName__Group_1__1 : rule__AttributeName__Group_1__1__Impl ;
    public final void rule__AttributeName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1907:1: ( rule__AttributeName__Group_1__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1908:2: rule__AttributeName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__13740);
            rule__AttributeName__Group_1__1__Impl();

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
    // $ANTLR end "rule__AttributeName__Group_1__1"


    // $ANTLR start "rule__AttributeName__Group_1__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1914:1: rule__AttributeName__Group_1__1__Impl : ( ( rule__AttributeName__OldFieldAssignment_1_1 ) ) ;
    public final void rule__AttributeName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1918:1: ( ( ( rule__AttributeName__OldFieldAssignment_1_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1919:1: ( ( rule__AttributeName__OldFieldAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1919:1: ( ( rule__AttributeName__OldFieldAssignment_1_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1920:1: ( rule__AttributeName__OldFieldAssignment_1_1 )
            {
             before(grammarAccess.getAttributeNameAccess().getOldFieldAssignment_1_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1921:1: ( rule__AttributeName__OldFieldAssignment_1_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1921:2: rule__AttributeName__OldFieldAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeName__OldFieldAssignment_1_1_in_rule__AttributeName__Group_1__1__Impl3767);
            rule__AttributeName__OldFieldAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getOldFieldAssignment_1_1()); 

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
    // $ANTLR end "rule__AttributeName__Group_1__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1935:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1939:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1940:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03801);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03804);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1947:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1951:1: ( ( () ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1952:1: ( () )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1952:1: ( () )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1953:1: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1954:1: ()
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1956:1: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1966:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1970:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1971:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13862);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13865);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1978:1: rule__Field__Group__1__Impl : ( '{' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1982:1: ( ( '{' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1983:1: ( '{' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1983:1: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1984:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Field__Group__1__Impl3893); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1997:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2001:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2002:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23924);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23927);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2009:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2013:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2014:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2014:1: ( ( rule__Field__NameAssignment_2 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2015:1: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2016:1: ( rule__Field__NameAssignment_2 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2016:2: rule__Field__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__NameAssignment_2_in_rule__Field__Group__2__Impl3954);
            rule__Field__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_2()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2026:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2030:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2031:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33984);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33987);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2038:1: rule__Field__Group__3__Impl : ( ( rule__Field__Group_3__0 )? ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2042:1: ( ( ( rule__Field__Group_3__0 )? ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2043:1: ( ( rule__Field__Group_3__0 )? )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2043:1: ( ( rule__Field__Group_3__0 )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2044:1: ( rule__Field__Group_3__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2045:1: ( rule__Field__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2045:2: rule__Field__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Field__Group_3__0_in_rule__Field__Group__3__Impl4014);
                    rule__Field__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_3()); 

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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2055:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2059:1: ( rule__Field__Group__4__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2060:2: rule__Field__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__44045);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2066:1: rule__Field__Group__4__Impl : ( '}' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2070:1: ( ( '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2071:1: ( '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2071:1: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2072:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Field__Group__4__Impl4073); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Field__Group_3__0"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2095:1: rule__Field__Group_3__0 : rule__Field__Group_3__0__Impl rule__Field__Group_3__1 ;
    public final void rule__Field__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2099:1: ( rule__Field__Group_3__0__Impl rule__Field__Group_3__1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2100:2: rule__Field__Group_3__0__Impl rule__Field__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group_3__0__Impl_in_rule__Field__Group_3__04114);
            rule__Field__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Field__Group_3__1_in_rule__Field__Group_3__04117);
            rule__Field__Group_3__1();

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
    // $ANTLR end "rule__Field__Group_3__0"


    // $ANTLR start "rule__Field__Group_3__0__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2107:1: rule__Field__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Field__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2111:1: ( ( 'type' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2112:1: ( 'type' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2112:1: ( 'type' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2113:1: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Field__Group_3__0__Impl4145); 
             after(grammarAccess.getFieldAccess().getTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__Field__Group_3__0__Impl"


    // $ANTLR start "rule__Field__Group_3__1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2126:1: rule__Field__Group_3__1 : rule__Field__Group_3__1__Impl ;
    public final void rule__Field__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2130:1: ( rule__Field__Group_3__1__Impl )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2131:2: rule__Field__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__Group_3__1__Impl_in_rule__Field__Group_3__14176);
            rule__Field__Group_3__1__Impl();

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
    // $ANTLR end "rule__Field__Group_3__1"


    // $ANTLR start "rule__Field__Group_3__1__Impl"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2137:1: rule__Field__Group_3__1__Impl : ( ( rule__Field__TypeAssignment_3_1 ) ) ;
    public final void rule__Field__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2141:1: ( ( ( rule__Field__TypeAssignment_3_1 ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2142:1: ( ( rule__Field__TypeAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2142:1: ( ( rule__Field__TypeAssignment_3_1 ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2143:1: ( rule__Field__TypeAssignment_3_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3_1()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2144:1: ( rule__Field__TypeAssignment_3_1 )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2144:2: rule__Field__TypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Field__TypeAssignment_3_1_in_rule__Field__Group_3__1__Impl4203);
            rule__Field__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Field__Group_3__1__Impl"


    // $ANTLR start "rule__Config__ConecctionAssignment_3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2159:1: rule__Config__ConecctionAssignment_3 : ( ruleConnection ) ;
    public final void rule__Config__ConecctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2163:1: ( ( ruleConnection ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2164:1: ( ruleConnection )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2164:1: ( ruleConnection )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2165:1: ruleConnection
            {
             before(grammarAccess.getConfigAccess().getConecctionConnectionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__Config__ConecctionAssignment_34242);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getConecctionConnectionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Config__ConecctionAssignment_3"


    // $ANTLR start "rule__Config__MergeFieldsAssignment_4_2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2174:1: rule__Config__MergeFieldsAssignment_4_2 : ( ruleMergedField ) ;
    public final void rule__Config__MergeFieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2178:1: ( ( ruleMergedField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2179:1: ( ruleMergedField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2179:1: ( ruleMergedField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2180:1: ruleMergedField
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_4_24273);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Config__MergeFieldsAssignment_4_2"


    // $ANTLR start "rule__Config__MergeFieldsAssignment_4_3_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2189:1: rule__Config__MergeFieldsAssignment_4_3_1 : ( ruleMergedField ) ;
    public final void rule__Config__MergeFieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2193:1: ( ( ruleMergedField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2194:1: ( ruleMergedField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2194:1: ( ruleMergedField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2195:1: ruleMergedField
            {
             before(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_4_3_14304);
            ruleMergedField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Config__MergeFieldsAssignment_4_3_1"


    // $ANTLR start "rule__Connection__UrlAssignment_2_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2204:1: rule__Connection__UrlAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Connection__UrlAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2208:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2209:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2209:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2210:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Connection__UrlAssignment_2_14335);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2219:1: rule__Connection__UsernameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Connection__UsernameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2223:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2224:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2224:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2225:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Connection__UsernameAssignment_3_14366);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2234:1: rule__Connection__PasswordAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Connection__PasswordAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2238:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2239:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2239:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2240:1: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Connection__PasswordAssignment_4_14397);
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
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2249:1: rule__MergedField__TableNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__MergedField__TableNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2253:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2254:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2254:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2255:1: ruleEString
            {
             before(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MergedField__TableNameAssignment_1_14428);
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


    // $ANTLR start "rule__MergedField__AttributeNamesAssignment_4"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2264:1: rule__MergedField__AttributeNamesAssignment_4 : ( ruleAttributeName ) ;
    public final void rule__MergedField__AttributeNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2268:1: ( ( ruleAttributeName ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2269:1: ( ruleAttributeName )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2269:1: ( ruleAttributeName )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2270:1: ruleAttributeName
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_44459);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MergedField__AttributeNamesAssignment_4"


    // $ANTLR start "rule__MergedField__AttributeNamesAssignment_5_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2279:1: rule__MergedField__AttributeNamesAssignment_5_1 : ( ruleAttributeName ) ;
    public final void rule__MergedField__AttributeNamesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2283:1: ( ( ruleAttributeName ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2284:1: ( ruleAttributeName )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2284:1: ( ruleAttributeName )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2285:1: ruleAttributeName
            {
             before(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_5_14490);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__MergedField__AttributeNamesAssignment_5_1"


    // $ANTLR start "rule__MergedField__FieldsAssignment_9"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2294:1: rule__MergedField__FieldsAssignment_9 : ( ruleField ) ;
    public final void rule__MergedField__FieldsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2298:1: ( ( ruleField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2299:1: ( ruleField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2299:1: ( ruleField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2300:1: ruleField
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_94521);
            ruleField();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__MergedField__FieldsAssignment_9"


    // $ANTLR start "rule__MergedField__FieldsAssignment_10_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2309:1: rule__MergedField__FieldsAssignment_10_1 : ( ruleField ) ;
    public final void rule__MergedField__FieldsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2313:1: ( ( ruleField ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2314:1: ( ruleField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2314:1: ( ruleField )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2315:1: ruleField
            {
             before(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_10_14552);
            ruleField();

            state._fsp--;

             after(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__MergedField__FieldsAssignment_10_1"


    // $ANTLR start "rule__AttributeName__OldFieldAssignment_1_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2324:1: rule__AttributeName__OldFieldAssignment_1_1 : ( ruleEString ) ;
    public final void rule__AttributeName__OldFieldAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2328:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2329:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2329:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2330:1: ruleEString
            {
             before(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AttributeName__OldFieldAssignment_1_14583);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AttributeName__OldFieldAssignment_1_1"


    // $ANTLR start "rule__AttributeName__FinalFieldAssignment_3"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2339:1: rule__AttributeName__FinalFieldAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AttributeName__FinalFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2343:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2344:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2344:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2345:1: ( ruleEString )
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2346:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2347:1: ruleEString
            {
             before(grammarAccess.getAttributeNameAccess().getFinalFieldFieldEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AttributeName__FinalFieldAssignment_34618);
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


    // $ANTLR start "rule__Field__NameAssignment_2"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2358:1: rule__Field__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2362:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2363:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2363:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2364:1: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Field__NameAssignment_24653);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__TypeAssignment_3_1"
    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2373:1: rule__Field__TypeAssignment_3_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2377:1: ( ( ruleFieldType ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2378:1: ( ruleFieldType )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2378:1: ( ruleFieldType )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2379:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_3_14684);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_3_1"

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
        public static final BitSet FOLLOW_11_in_rule__FieldType__Alternatives516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FieldType__Alternatives537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FieldType__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FieldType__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__0612 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Config__Group__1_in_rule__Config__Group__0615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Config__Group__0__Impl643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1674 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Config__Group__1__Impl705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2736 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Config__Group__2__Impl767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3798 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__ConecctionAssignment_3_in_rule__Config__Group__3__Impl828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4858 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4__0_in_rule__Config__Group__4__Impl888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Config__Group__5__Impl947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4__0__Impl_in_rule__Config__Group_4__0990 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Config__Group_4__1_in_rule__Config__Group_4__0993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Config__Group_4__0__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4__1__Impl_in_rule__Config__Group_4__11052 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Config__Group_4__2_in_rule__Config__Group_4__11055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Config__Group_4__1__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4__2__Impl_in_rule__Config__Group_4__21114 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Config__Group_4__3_in_rule__Config__Group_4__21117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__MergeFieldsAssignment_4_2_in_rule__Config__Group_4__2__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4__3__Impl_in_rule__Config__Group_4__31174 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Config__Group_4__4_in_rule__Config__Group_4__31177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4_3__0_in_rule__Config__Group_4__3__Impl1204 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Config__Group_4__4__Impl_in_rule__Config__Group_4__41235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Config__Group_4__4__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4_3__0__Impl_in_rule__Config__Group_4_3__01304 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Config__Group_4_3__1_in_rule__Config__Group_4_3__01307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Config__Group_4_3__0__Impl1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__Group_4_3__1__Impl_in_rule__Config__Group_4_3__11366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Config__MergeFieldsAssignment_4_3_1_in_rule__Config__Group_4_3__1__Impl1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01427 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11488 = new BitSet(new long[]{0x0000000003840000L});
        public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Connection__Group__1__Impl1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21550 = new BitSet(new long[]{0x0000000003840000L});
        public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__0_in_rule__Connection__Group__2__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31611 = new BitSet(new long[]{0x0000000003840000L});
        public static final BitSet FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41672 = new BitSet(new long[]{0x0000000003840000L});
        public static final BitSet FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__41675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__51733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Connection__Group__5__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__0__Impl_in_rule__Connection__Group_2__01804 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__1_in_rule__Connection__Group_2__01807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Connection__Group_2__0__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_2__1__Impl_in_rule__Connection__Group_2__11866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UrlAssignment_2_1_in_rule__Connection__Group_2__1__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__01927 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__01930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Connection__Group_3__0__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__11989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UsernameAssignment_3_1_in_rule__Connection__Group_3__1__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__02050 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__02053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Connection__Group_4__0__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__12112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__PasswordAssignment_4_1_in_rule__Connection__Group_4__1__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__0__Impl_in_rule__MergedField__Group__02173 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__1_in_rule__MergedField__Group__02176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MergedField__Group__0__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__1__Impl_in_rule__MergedField__Group__12235 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__2_in_rule__MergedField__Group__12238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__0_in_rule__MergedField__Group__1__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__2__Impl_in_rule__MergedField__Group__22296 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__3_in_rule__MergedField__Group__22299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MergedField__Group__2__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__3__Impl_in_rule__MergedField__Group__32358 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__4_in_rule__MergedField__Group__32361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MergedField__Group__3__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__4__Impl_in_rule__MergedField__Group__42420 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__5_in_rule__MergedField__Group__42423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__AttributeNamesAssignment_4_in_rule__MergedField__Group__4__Impl2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__5__Impl_in_rule__MergedField__Group__52480 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__6_in_rule__MergedField__Group__52483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__0_in_rule__MergedField__Group__5__Impl2510 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__6__Impl_in_rule__MergedField__Group__62541 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__7_in_rule__MergedField__Group__62544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MergedField__Group__6__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__7__Impl_in_rule__MergedField__Group__72603 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__8_in_rule__MergedField__Group__72606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MergedField__Group__7__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__8__Impl_in_rule__MergedField__Group__82665 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__9_in_rule__MergedField__Group__82668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MergedField__Group__8__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__9__Impl_in_rule__MergedField__Group__92727 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__10_in_rule__MergedField__Group__92730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__FieldsAssignment_9_in_rule__MergedField__Group__9__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__10__Impl_in_rule__MergedField__Group__102787 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__11_in_rule__MergedField__Group__102790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__0_in_rule__MergedField__Group__10__Impl2817 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__11__Impl_in_rule__MergedField__Group__112848 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MergedField__Group__12_in_rule__MergedField__Group__112851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MergedField__Group__11__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group__12__Impl_in_rule__MergedField__Group__122910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MergedField__Group__12__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__0__Impl_in_rule__MergedField__Group_1__02995 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__1_in_rule__MergedField__Group_1__02998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MergedField__Group_1__0__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_1__1__Impl_in_rule__MergedField__Group_1__13057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__TableNameAssignment_1_1_in_rule__MergedField__Group_1__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__0__Impl_in_rule__MergedField__Group_5__03118 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__1_in_rule__MergedField__Group_5__03121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MergedField__Group_5__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_5__1__Impl_in_rule__MergedField__Group_5__13180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__AttributeNamesAssignment_5_1_in_rule__MergedField__Group_5__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__0__Impl_in_rule__MergedField__Group_10__03241 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__1_in_rule__MergedField__Group_10__03244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MergedField__Group_10__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__Group_10__1__Impl_in_rule__MergedField__Group_10__13303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergedField__FieldsAssignment_10_1_in_rule__MergedField__Group_10__1__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__0__Impl_in_rule__AttributeName__Group__03364 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__1_in_rule__AttributeName__Group__03367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AttributeName__Group__0__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__1__Impl_in_rule__AttributeName__Group__13426 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__2_in_rule__AttributeName__Group__13429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Group__1__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__2__Impl_in_rule__AttributeName__Group__23487 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__3_in_rule__AttributeName__Group__23490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AttributeName__Group__2__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__3__Impl_in_rule__AttributeName__Group__33549 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__4_in_rule__AttributeName__Group__33552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__FinalFieldAssignment_3_in_rule__AttributeName__Group__3__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group__4__Impl_in_rule__AttributeName__Group__43609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AttributeName__Group__4__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__03678 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__03681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AttributeName__Group_1__0__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__13740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeName__OldFieldAssignment_1_1_in_rule__AttributeName__Group_1__1__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03801 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13862 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Field__Group__1__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23924 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__NameAssignment_2_in_rule__Field__Group__2__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33984 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group_3__0_in_rule__Field__Group__3__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__44045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Field__Group__4__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group_3__0__Impl_in_rule__Field__Group_3__04114 = new BitSet(new long[]{0x0000000000007800L});
        public static final BitSet FOLLOW_rule__Field__Group_3__1_in_rule__Field__Group_3__04117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Field__Group_3__0__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__Group_3__1__Impl_in_rule__Field__Group_3__14176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Field__TypeAssignment_3_1_in_rule__Field__Group_3__1__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_rule__Config__ConecctionAssignment_34242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_4_24273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergedField_in_rule__Config__MergeFieldsAssignment_4_3_14304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Connection__UrlAssignment_2_14335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Connection__UsernameAssignment_3_14366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Connection__PasswordAssignment_4_14397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MergedField__TableNameAssignment_1_14428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_44459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeName_in_rule__MergedField__AttributeNamesAssignment_5_14490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_94521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleField_in_rule__MergedField__FieldsAssignment_10_14552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AttributeName__OldFieldAssignment_1_14583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AttributeName__FinalFieldAssignment_34618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Field__NameAssignment_24653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_3_14684 = new BitSet(new long[]{0x0000000000000002L});
    }


}