package co.edu.uniandes.jsonToSql.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.jsonToSql.services.GrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\'config\\':'", "'{'", "'conecction:'", "'\\'mergeFields\\':'", "'['", "','", "']'", "'}'", "'\\'url\\':'", "'\\'username\\':'", "'\\'password\\':'", "'\\'tableName\\':'", "'\\'attributeNames\\':'", "'fields'", "'oldField'", "'finalField'", "'type'", "'String'", "'Integer'", "'Float'", "'Boolean'"
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
    public String getGrammarFileName() { return "../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g"; }



     	private GrammarGrammarAccess grammarAccess;
     	
        public InternalGrammarParser(TokenStream input, GrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Config";	
       	}
       	
       	@Override
       	protected GrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfig"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:68:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:69:2: (iv_ruleConfig= ruleConfig EOF )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:70:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfig_in_entryRuleConfig75);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfig85); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:77:1: ruleConfig returns [EObject current=null] : (otherlv_0= '\\'config\\':' otherlv_1= '{' otherlv_2= 'conecction:' ( (lv_conecction_3_0= ruleConnection ) ) (otherlv_4= '\\'mergeFields\\':' otherlv_5= '[' ( (lv_mergeFields_6_0= ruleMergedField ) ) (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )* otherlv_9= ']' )? otherlv_10= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_conecction_3_0 = null;

        EObject lv_mergeFields_6_0 = null;

        EObject lv_mergeFields_8_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:80:28: ( (otherlv_0= '\\'config\\':' otherlv_1= '{' otherlv_2= 'conecction:' ( (lv_conecction_3_0= ruleConnection ) ) (otherlv_4= '\\'mergeFields\\':' otherlv_5= '[' ( (lv_mergeFields_6_0= ruleMergedField ) ) (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )* otherlv_9= ']' )? otherlv_10= '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:81:1: (otherlv_0= '\\'config\\':' otherlv_1= '{' otherlv_2= 'conecction:' ( (lv_conecction_3_0= ruleConnection ) ) (otherlv_4= '\\'mergeFields\\':' otherlv_5= '[' ( (lv_mergeFields_6_0= ruleMergedField ) ) (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )* otherlv_9= ']' )? otherlv_10= '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:81:1: (otherlv_0= '\\'config\\':' otherlv_1= '{' otherlv_2= 'conecction:' ( (lv_conecction_3_0= ruleConnection ) ) (otherlv_4= '\\'mergeFields\\':' otherlv_5= '[' ( (lv_mergeFields_6_0= ruleMergedField ) ) (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )* otherlv_9= ']' )? otherlv_10= '}' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:81:3: otherlv_0= '\\'config\\':' otherlv_1= '{' otherlv_2= 'conecction:' ( (lv_conecction_3_0= ruleConnection ) ) (otherlv_4= '\\'mergeFields\\':' otherlv_5= '[' ( (lv_mergeFields_6_0= ruleMergedField ) ) (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )* otherlv_9= ']' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConfig122); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfig134); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfig146); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getConecctionKeyword_2());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:93:1: ( (lv_conecction_3_0= ruleConnection ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:94:1: (lv_conecction_3_0= ruleConnection )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:94:1: (lv_conecction_3_0= ruleConnection )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:95:3: lv_conecction_3_0= ruleConnection
            {
             
            	        newCompositeNode(grammarAccess.getConfigAccess().getConecctionConnectionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_ruleConfig167);
            lv_conecction_3_0=ruleConnection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigRule());
            	        }
                   		set(
                   			current, 
                   			"conecction",
                    		lv_conecction_3_0, 
                    		"Connection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:111:2: (otherlv_4= '\\'mergeFields\\':' otherlv_5= '[' ( (lv_mergeFields_6_0= ruleMergedField ) ) (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )* otherlv_9= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:111:4: otherlv_4= '\\'mergeFields\\':' otherlv_5= '[' ( (lv_mergeFields_6_0= ruleMergedField ) ) (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfig180); 

                        	newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getMergeFieldsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfig192); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getLeftSquareBracketKeyword_4_1());
                        
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:119:1: ( (lv_mergeFields_6_0= ruleMergedField ) )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:120:1: (lv_mergeFields_6_0= ruleMergedField )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:120:1: (lv_mergeFields_6_0= ruleMergedField )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:121:3: lv_mergeFields_6_0= ruleMergedField
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_ruleConfig213);
                    lv_mergeFields_6_0=ruleMergedField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigRule());
                    	        }
                           		add(
                           			current, 
                           			"mergeFields",
                            		lv_mergeFields_6_0, 
                            		"MergedField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:137:2: (otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:137:4: otherlv_7= ',' ( (lv_mergeFields_8_0= ruleMergedField ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfig226); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getConfigAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:141:1: ( (lv_mergeFields_8_0= ruleMergedField ) )
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:142:1: (lv_mergeFields_8_0= ruleMergedField )
                    	    {
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:142:1: (lv_mergeFields_8_0= ruleMergedField )
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:143:3: lv_mergeFields_8_0= ruleMergedField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_ruleConfig247);
                    	    lv_mergeFields_8_0=ruleMergedField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfigRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mergeFields",
                    	            		lv_mergeFields_8_0, 
                    	            		"MergedField");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConfig261); 

                        	newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConfig275); 

                	newLeafNode(otherlv_10, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConnection"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:175:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:176:2: (iv_ruleConnection= ruleConnection EOF )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:177:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_entryRuleConnection311);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnection321); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:184:1: ruleConnection returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '\\'url\\':' ( (lv_url_3_0= ruleEString ) ) )? (otherlv_4= '\\'username\\':' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= '\\'password\\':' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:187:28: ( ( () otherlv_1= '{' (otherlv_2= '\\'url\\':' ( (lv_url_3_0= ruleEString ) ) )? (otherlv_4= '\\'username\\':' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= '\\'password\\':' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:188:1: ( () otherlv_1= '{' (otherlv_2= '\\'url\\':' ( (lv_url_3_0= ruleEString ) ) )? (otherlv_4= '\\'username\\':' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= '\\'password\\':' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:188:1: ( () otherlv_1= '{' (otherlv_2= '\\'url\\':' ( (lv_url_3_0= ruleEString ) ) )? (otherlv_4= '\\'username\\':' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= '\\'password\\':' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:188:2: () otherlv_1= '{' (otherlv_2= '\\'url\\':' ( (lv_url_3_0= ruleEString ) ) )? (otherlv_4= '\\'username\\':' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= '\\'password\\':' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:188:2: ()
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:189:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectionAccess().getConnectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConnection367); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:198:1: (otherlv_2= '\\'url\\':' ( (lv_url_3_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:198:3: otherlv_2= '\\'url\\':' ( (lv_url_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConnection380); 

                        	newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getUrlKeyword_2_0());
                        
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:202:1: ( (lv_url_3_0= ruleEString ) )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:203:1: (lv_url_3_0= ruleEString )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:203:1: (lv_url_3_0= ruleEString )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:204:3: lv_url_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnection401);
                    lv_url_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	        }
                           		set(
                           			current, 
                           			"url",
                            		lv_url_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:220:4: (otherlv_4= '\\'username\\':' ( (lv_username_5_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:220:6: otherlv_4= '\\'username\\':' ( (lv_username_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConnection416); 

                        	newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getUsernameKeyword_3_0());
                        
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:224:1: ( (lv_username_5_0= ruleEString ) )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:225:1: (lv_username_5_0= ruleEString )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:225:1: (lv_username_5_0= ruleEString )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:226:3: lv_username_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnection437);
                    lv_username_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	        }
                           		set(
                           			current, 
                           			"username",
                            		lv_username_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:242:4: (otherlv_6= '\\'password\\':' ( (lv_password_7_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:242:6: otherlv_6= '\\'password\\':' ( (lv_password_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConnection452); 

                        	newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getPasswordKeyword_4_0());
                        
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:246:1: ( (lv_password_7_0= ruleEString ) )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:247:1: (lv_password_7_0= ruleEString )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:247:1: (lv_password_7_0= ruleEString )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:248:3: lv_password_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnection473);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	        }
                           		set(
                           			current, 
                           			"password",
                            		lv_password_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConnection487); 

                	newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleMergedField"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:276:1: entryRuleMergedField returns [EObject current=null] : iv_ruleMergedField= ruleMergedField EOF ;
    public final EObject entryRuleMergedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergedField = null;


        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:277:2: (iv_ruleMergedField= ruleMergedField EOF )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:278:2: iv_ruleMergedField= ruleMergedField EOF
            {
             newCompositeNode(grammarAccess.getMergedFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergedField_in_entryRuleMergedField523);
            iv_ruleMergedField=ruleMergedField();

            state._fsp--;

             current =iv_ruleMergedField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMergedField533); 

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
    // $ANTLR end "entryRuleMergedField"


    // $ANTLR start "ruleMergedField"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:285:1: ruleMergedField returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '\\'tableName\\':' ( (lv_tableName_2_0= ruleEString ) ) )? otherlv_3= '\\'attributeNames\\':' otherlv_4= '{' ( (lv_attributeNames_5_0= ruleAttributeName ) ) (otherlv_6= ',' ( (lv_attributeNames_7_0= ruleAttributeName ) ) )* otherlv_8= '}' otherlv_9= 'fields' otherlv_10= '{' ( (lv_fields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_fields_13_0= ruleField ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleMergedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_tableName_2_0 = null;

        EObject lv_attributeNames_5_0 = null;

        EObject lv_attributeNames_7_0 = null;

        EObject lv_fields_11_0 = null;

        EObject lv_fields_13_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:288:28: ( (otherlv_0= '{' (otherlv_1= '\\'tableName\\':' ( (lv_tableName_2_0= ruleEString ) ) )? otherlv_3= '\\'attributeNames\\':' otherlv_4= '{' ( (lv_attributeNames_5_0= ruleAttributeName ) ) (otherlv_6= ',' ( (lv_attributeNames_7_0= ruleAttributeName ) ) )* otherlv_8= '}' otherlv_9= 'fields' otherlv_10= '{' ( (lv_fields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_fields_13_0= ruleField ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:289:1: (otherlv_0= '{' (otherlv_1= '\\'tableName\\':' ( (lv_tableName_2_0= ruleEString ) ) )? otherlv_3= '\\'attributeNames\\':' otherlv_4= '{' ( (lv_attributeNames_5_0= ruleAttributeName ) ) (otherlv_6= ',' ( (lv_attributeNames_7_0= ruleAttributeName ) ) )* otherlv_8= '}' otherlv_9= 'fields' otherlv_10= '{' ( (lv_fields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_fields_13_0= ruleField ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:289:1: (otherlv_0= '{' (otherlv_1= '\\'tableName\\':' ( (lv_tableName_2_0= ruleEString ) ) )? otherlv_3= '\\'attributeNames\\':' otherlv_4= '{' ( (lv_attributeNames_5_0= ruleAttributeName ) ) (otherlv_6= ',' ( (lv_attributeNames_7_0= ruleAttributeName ) ) )* otherlv_8= '}' otherlv_9= 'fields' otherlv_10= '{' ( (lv_fields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_fields_13_0= ruleField ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:289:3: otherlv_0= '{' (otherlv_1= '\\'tableName\\':' ( (lv_tableName_2_0= ruleEString ) ) )? otherlv_3= '\\'attributeNames\\':' otherlv_4= '{' ( (lv_attributeNames_5_0= ruleAttributeName ) ) (otherlv_6= ',' ( (lv_attributeNames_7_0= ruleAttributeName ) ) )* otherlv_8= '}' otherlv_9= 'fields' otherlv_10= '{' ( (lv_fields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_fields_13_0= ruleField ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMergedField570); 

                	newLeafNode(otherlv_0, grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_0());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:293:1: (otherlv_1= '\\'tableName\\':' ( (lv_tableName_2_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:293:3: otherlv_1= '\\'tableName\\':' ( (lv_tableName_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMergedField583); 

                        	newLeafNode(otherlv_1, grammarAccess.getMergedFieldAccess().getTableNameKeyword_1_0());
                        
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:297:1: ( (lv_tableName_2_0= ruleEString ) )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:298:1: (lv_tableName_2_0= ruleEString )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:298:1: (lv_tableName_2_0= ruleEString )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:299:3: lv_tableName_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMergedField604);
                    lv_tableName_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"tableName",
                            		lv_tableName_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMergedField618); 

                	newLeafNode(otherlv_3, grammarAccess.getMergedFieldAccess().getAttributeNamesKeyword_2());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMergedField630); 

                	newLeafNode(otherlv_4, grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:323:1: ( (lv_attributeNames_5_0= ruleAttributeName ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:324:1: (lv_attributeNames_5_0= ruleAttributeName )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:324:1: (lv_attributeNames_5_0= ruleAttributeName )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:325:3: lv_attributeNames_5_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_ruleMergedField651);
            lv_attributeNames_5_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	        }
                   		add(
                   			current, 
                   			"attributeNames",
                    		lv_attributeNames_5_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:341:2: (otherlv_6= ',' ( (lv_attributeNames_7_0= ruleAttributeName ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:341:4: otherlv_6= ',' ( (lv_attributeNames_7_0= ruleAttributeName ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMergedField664); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMergedFieldAccess().getCommaKeyword_5_0());
            	        
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:345:1: ( (lv_attributeNames_7_0= ruleAttributeName ) )
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:346:1: (lv_attributeNames_7_0= ruleAttributeName )
            	    {
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:346:1: (lv_attributeNames_7_0= ruleAttributeName )
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:347:3: lv_attributeNames_7_0= ruleAttributeName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_ruleMergedField685);
            	    lv_attributeNames_7_0=ruleAttributeName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributeNames",
            	            		lv_attributeNames_7_0, 
            	            		"AttributeName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMergedField699); 

                	newLeafNode(otherlv_8, grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMergedField711); 

                	newLeafNode(otherlv_9, grammarAccess.getMergedFieldAccess().getFieldsKeyword_7());
                
            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMergedField723); 

                	newLeafNode(otherlv_10, grammarAccess.getMergedFieldAccess().getLeftCurlyBracketKeyword_8());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:375:1: ( (lv_fields_11_0= ruleField ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:376:1: (lv_fields_11_0= ruleField )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:376:1: (lv_fields_11_0= ruleField )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:377:3: lv_fields_11_0= ruleField
            {
             
            	        newCompositeNode(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleField_in_ruleMergedField744);
            lv_fields_11_0=ruleField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	        }
                   		add(
                   			current, 
                   			"fields",
                    		lv_fields_11_0, 
                    		"Field");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:393:2: (otherlv_12= ',' ( (lv_fields_13_0= ruleField ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:393:4: otherlv_12= ',' ( (lv_fields_13_0= ruleField ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMergedField757); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMergedFieldAccess().getCommaKeyword_10_0());
            	        
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:397:1: ( (lv_fields_13_0= ruleField ) )
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:398:1: (lv_fields_13_0= ruleField )
            	    {
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:398:1: (lv_fields_13_0= ruleField )
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:399:3: lv_fields_13_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleField_in_ruleMergedField778);
            	    lv_fields_13_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMergedFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_13_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMergedField792); 

                	newLeafNode(otherlv_14, grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMergedField804); 

                	newLeafNode(otherlv_15, grammarAccess.getMergedFieldAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleMergedField"


    // $ANTLR start "entryRuleEString"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:431:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:432:2: (iv_ruleEString= ruleEString EOF )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:433:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString841);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString852); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:440:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:443:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:444:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:444:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:444:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString892); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:452:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString918); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttributeName"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:467:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:468:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:469:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeName_in_entryRuleAttributeName963);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeName973); 

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
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:476:1: ruleAttributeName returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'oldField' ( (lv_oldField_2_0= ruleEString ) ) )? otherlv_3= 'finalField' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_oldField_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:479:28: ( (otherlv_0= '{' (otherlv_1= 'oldField' ( (lv_oldField_2_0= ruleEString ) ) )? otherlv_3= 'finalField' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:480:1: (otherlv_0= '{' (otherlv_1= 'oldField' ( (lv_oldField_2_0= ruleEString ) ) )? otherlv_3= 'finalField' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:480:1: (otherlv_0= '{' (otherlv_1= 'oldField' ( (lv_oldField_2_0= ruleEString ) ) )? otherlv_3= 'finalField' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:480:3: otherlv_0= '{' (otherlv_1= 'oldField' ( (lv_oldField_2_0= ruleEString ) ) )? otherlv_3= 'finalField' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttributeName1010); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeNameAccess().getLeftCurlyBracketKeyword_0());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:484:1: (otherlv_1= 'oldField' ( (lv_oldField_2_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:484:3: otherlv_1= 'oldField' ( (lv_oldField_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAttributeName1023); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeNameAccess().getOldFieldKeyword_1_0());
                        
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:488:1: ( (lv_oldField_2_0= ruleEString ) )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:489:1: (lv_oldField_2_0= ruleEString )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:489:1: (lv_oldField_2_0= ruleEString )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:490:3: lv_oldField_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttributeName1044);
                    lv_oldField_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeNameRule());
                    	        }
                           		set(
                           			current, 
                           			"oldField",
                            		lv_oldField_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAttributeName1058); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeNameAccess().getFinalFieldKeyword_2());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:510:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:511:1: ( ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:511:1: ( ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:512:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeNameRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttributeName1081);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttributeName1093); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeNameAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleField"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:537:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:538:2: (iv_ruleField= ruleField EOF )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:539:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleField_in_entryRuleField1129);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleField1139); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:546:1: ruleField returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleFieldType ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:549:28: ( ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleFieldType ) ) )? otherlv_5= '}' ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:550:1: ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleFieldType ) ) )? otherlv_5= '}' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:550:1: ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleFieldType ) ) )? otherlv_5= '}' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:550:2: () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_type_4_0= ruleFieldType ) ) )? otherlv_5= '}'
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:550:2: ()
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:551:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFieldAccess().getFieldAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleField1185); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_1());
                
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:560:1: ( (lv_name_2_0= ruleEString ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:561:1: (lv_name_2_0= ruleEString )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:561:1: (lv_name_2_0= ruleEString )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:562:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleField1206);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:578:2: (otherlv_3= 'type' ( (lv_type_4_0= ruleFieldType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:578:4: otherlv_3= 'type' ( (lv_type_4_0= ruleFieldType ) )
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleField1219); 

                        	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getTypeKeyword_3_0());
                        
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:582:1: ( (lv_type_4_0= ruleFieldType ) )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:583:1: (lv_type_4_0= ruleFieldType )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:583:1: (lv_type_4_0= ruleFieldType )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:584:3: lv_type_4_0= ruleFieldType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFieldType_in_ruleField1240);
                    lv_type_4_0=ruleFieldType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"FieldType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleField1254); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleField"


    // $ANTLR start "ruleFieldType"
    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:612:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:614:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:615:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:615:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Boolean' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:615:2: (enumLiteral_0= 'String' )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:615:2: (enumLiteral_0= 'String' )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:615:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFieldType1304); 

                            current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:621:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:621:6: (enumLiteral_1= 'Integer' )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:621:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFieldType1321); 

                            current = grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:627:6: (enumLiteral_2= 'Float' )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:627:6: (enumLiteral_2= 'Float' )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:627:8: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFieldType1338); 

                            current = grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:633:6: (enumLiteral_3= 'Boolean' )
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:633:6: (enumLiteral_3= 'Boolean' )
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:633:8: enumLiteral_3= 'Boolean'
                    {
                    enumLiteral_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFieldType1355); 

                            current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfig85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConfig122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfig134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConfig146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleConnection_in_ruleConfig167 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_14_in_ruleConfig180 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConfig192 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleMergedField_in_ruleConfig213 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleConfig226 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleMergedField_in_ruleConfig247 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleConfig261 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConfig275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection311 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnection321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleConnection367 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_19_in_ruleConnection380 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnection401 = new BitSet(new long[]{0x0000000000340000L});
        public static final BitSet FOLLOW_20_in_ruleConnection416 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnection437 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleConnection452 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnection473 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConnection487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergedField_in_entryRuleMergedField523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMergedField533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMergedField570 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleMergedField583 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMergedField604 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMergedField618 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMergedField630 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleAttributeName_in_ruleMergedField651 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleMergedField664 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleAttributeName_in_ruleMergedField685 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleMergedField699 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMergedField711 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMergedField723 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleField_in_ruleMergedField744 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleMergedField757 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleField_in_ruleMergedField778 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleMergedField792 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMergedField804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleAttributeName1010 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_25_in_ruleAttributeName1023 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttributeName1044 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleAttributeName1058 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttributeName1081 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAttributeName1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleField_in_entryRuleField1129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleField1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleField1185 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleField1206 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_27_in_ruleField1219 = new BitSet(new long[]{0x00000000F0000000L});
        public static final BitSet FOLLOW_ruleFieldType_in_ruleField1240 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleField1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleFieldType1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFieldType1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleFieldType1338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFieldType1355 = new BitSet(new long[]{0x0000000000000002L});
    }


}