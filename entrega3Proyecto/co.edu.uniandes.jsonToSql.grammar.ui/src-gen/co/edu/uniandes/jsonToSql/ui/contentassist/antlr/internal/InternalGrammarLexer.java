package co.edu.uniandes.jsonToSql.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarLexer extends Lexer {
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

    public InternalGrammarLexer() {;} 
    public InternalGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:11:7: ( '\\'String\\'' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:11:9: '\\'String\\''
            {
            match("'String'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:12:7: ( '\\'Integer\\'' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:12:9: '\\'Integer\\''
            {
            match("'Integer'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:13:7: ( '\\'Float\\'' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:13:9: '\\'Float\\''
            {
            match("'Float'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:14:7: ( '\\'Boolean\\'' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:14:9: '\\'Boolean\\''
            {
            match("'Boolean'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_LITERACONFIG"
    public final void mRULE_LITERACONFIG() throws RecognitionException {
        try {
            int _type = RULE_LITERACONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2265:19: ( '\\'config\\'' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2265:21: '\\'config\\''
            {
            match("'config'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERACONFIG"

    // $ANTLR start "RULE_LITERACONNECTION"
    public final void mRULE_LITERACONNECTION() throws RecognitionException {
        try {
            int _type = RULE_LITERACONNECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2267:23: ( '\\'connection\\'' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2267:25: '\\'connection\\''
            {
            match("'connection'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERACONNECTION"

    // $ANTLR start "RULE_LITERALMERGEDFIELDS"
    public final void mRULE_LITERALMERGEDFIELDS() throws RecognitionException {
        try {
            int _type = RULE_LITERALMERGEDFIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2269:26: ( '\\'mergeFields\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2269:28: '\\'mergeFields\\':'
            {
            match("'mergeFields':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALMERGEDFIELDS"

    // $ANTLR start "RULE_LITERALTABLENAME"
    public final void mRULE_LITERALTABLENAME() throws RecognitionException {
        try {
            int _type = RULE_LITERALTABLENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2271:23: ( '\\'tableName\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2271:25: '\\'tableName\\':'
            {
            match("'tableName':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALTABLENAME"

    // $ANTLR start "RULE_LITERALFIELDS"
    public final void mRULE_LITERALFIELDS() throws RecognitionException {
        try {
            int _type = RULE_LITERALFIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2273:20: ( '\\'fields\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2273:22: '\\'fields\\':'
            {
            match("'fields':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALFIELDS"

    // $ANTLR start "RULE_LITERALATTRIBUTENAMES"
    public final void mRULE_LITERALATTRIBUTENAMES() throws RecognitionException {
        try {
            int _type = RULE_LITERALATTRIBUTENAMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2275:28: ( '\\'attributeNames\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2275:30: '\\'attributeNames\\':'
            {
            match("'attributeNames':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALATTRIBUTENAMES"

    // $ANTLR start "RULE_LITERALURL"
    public final void mRULE_LITERALURL() throws RecognitionException {
        try {
            int _type = RULE_LITERALURL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2277:17: ( '\\'url\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2277:19: '\\'url\\':'
            {
            match("'url':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALURL"

    // $ANTLR start "RULE_LITERALUSERNAME"
    public final void mRULE_LITERALUSERNAME() throws RecognitionException {
        try {
            int _type = RULE_LITERALUSERNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2279:22: ( '\\'username\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2279:24: '\\'username\\':'
            {
            match("'username':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALUSERNAME"

    // $ANTLR start "RULE_LITERALPASSWORD"
    public final void mRULE_LITERALPASSWORD() throws RecognitionException {
        try {
            int _type = RULE_LITERALPASSWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2281:22: ( '\\'password\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2281:24: '\\'password\\':'
            {
            match("'password':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALPASSWORD"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2283:12: ( ':' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2283:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2285:11: ( ',' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2285:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMA"

    // $ANTLR start "RULE_LEFTPARENTESIS"
    public final void mRULE_LEFTPARENTESIS() throws RecognitionException {
        try {
            int _type = RULE_LEFTPARENTESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2287:21: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2287:23: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFTPARENTESIS"

    // $ANTLR start "RULE_LEFTBRACKET"
    public final void mRULE_LEFTBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LEFTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2289:18: ( '[' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2289:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFTBRACKET"

    // $ANTLR start "RULE_RIGHTBRACKET"
    public final void mRULE_RIGHTBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RIGHTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2291:19: ( ']' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2291:21: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHTBRACKET"

    // $ANTLR start "RULE_RIGHTPARENTESIS"
    public final void mRULE_RIGHTPARENTESIS() throws RecognitionException {
        try {
            int _type = RULE_RIGHTPARENTESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2293:22: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2293:24: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHTPARENTESIS"

    // $ANTLR start "RULE_SINGLEQUOTE"
    public final void mRULE_SINGLEQUOTE() throws RecognitionException {
        try {
            int _type = RULE_SINGLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2295:18: ( '\\'' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2295:20: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLEQUOTE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2297:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2297:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2297:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2297:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2297:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2299:10: ( ( '0' .. '9' )+ )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2299:12: ( '0' .. '9' )+
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2299:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2299:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2301:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2303:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2303:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2303:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2303:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:41: ( '\\r' )? '\\n'
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2305:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2307:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2309:16: ( . )
            // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:2309:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:8: ( T__27 | T__28 | T__29 | T__30 | RULE_LITERACONFIG | RULE_LITERACONNECTION | RULE_LITERALMERGEDFIELDS | RULE_LITERALTABLENAME | RULE_LITERALFIELDS | RULE_LITERALATTRIBUTENAMES | RULE_LITERALURL | RULE_LITERALUSERNAME | RULE_LITERALPASSWORD | RULE_COLON | RULE_COMA | RULE_LEFTPARENTESIS | RULE_LEFTBRACKET | RULE_RIGHTBRACKET | RULE_RIGHTPARENTESIS | RULE_SINGLEQUOTE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=27;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:34: RULE_LITERACONFIG
                {
                mRULE_LITERACONFIG(); 

                }
                break;
            case 6 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:52: RULE_LITERACONNECTION
                {
                mRULE_LITERACONNECTION(); 

                }
                break;
            case 7 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:74: RULE_LITERALMERGEDFIELDS
                {
                mRULE_LITERALMERGEDFIELDS(); 

                }
                break;
            case 8 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:99: RULE_LITERALTABLENAME
                {
                mRULE_LITERALTABLENAME(); 

                }
                break;
            case 9 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:121: RULE_LITERALFIELDS
                {
                mRULE_LITERALFIELDS(); 

                }
                break;
            case 10 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:140: RULE_LITERALATTRIBUTENAMES
                {
                mRULE_LITERALATTRIBUTENAMES(); 

                }
                break;
            case 11 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:167: RULE_LITERALURL
                {
                mRULE_LITERALURL(); 

                }
                break;
            case 12 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:183: RULE_LITERALUSERNAME
                {
                mRULE_LITERALUSERNAME(); 

                }
                break;
            case 13 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:204: RULE_LITERALPASSWORD
                {
                mRULE_LITERALPASSWORD(); 

                }
                break;
            case 14 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:225: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 15 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:236: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 16 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:246: RULE_LEFTPARENTESIS
                {
                mRULE_LEFTPARENTESIS(); 

                }
                break;
            case 17 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:266: RULE_LEFTBRACKET
                {
                mRULE_LEFTBRACKET(); 

                }
                break;
            case 18 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:283: RULE_RIGHTBRACKET
                {
                mRULE_RIGHTBRACKET(); 

                }
                break;
            case 19 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:301: RULE_RIGHTPARENTESIS
                {
                mRULE_RIGHTPARENTESIS(); 

                }
                break;
            case 20 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:322: RULE_SINGLEQUOTE
                {
                mRULE_SINGLEQUOTE(); 

                }
                break;
            case 21 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:339: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:347: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:356: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:368: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:384: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:400: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // ../co.edu.uniandes.jsonToSql.grammar.ui/src-gen/co/edu/uniandes/jsonToSql/ui/contentassist/antlr/internal/InternalGrammar.g:1:408: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\32\6\uffff\1\16\2\uffff\2\16\74\uffff\1\33\43\uffff"+
        "\1\33\24\uffff\2\33\2\uffff\1\33\10\uffff\1\33\4\uffff\1\33\1\uffff";
    static final String DFA12_eofS =
        "\u0096\uffff";
    static final String DFA12_minS =
        "\2\0\6\uffff\1\101\2\uffff\1\0\1\52\2\uffff\13\0\15\uffff\42\0"+
        "\1\72\14\0\1\uffff\4\0\1\uffff\11\0\1\uffff\1\0\1\uffff\1\0\1\uffff"+
        "\3\0\1\72\3\0\4\uffff\3\0\1\uffff\3\0\2\uffff\4\0\2\72\2\0\1\72"+
        "\1\0\3\uffff\1\0\1\uffff\1\0\1\uffff\1\72\1\0\1\uffff\2\0\1\72\1"+
        "\uffff";
    static final String DFA12_maxS =
        "\2\uffff\6\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\13\uffff\15"+
        "\uffff\42\uffff\1\72\14\uffff\1\uffff\4\uffff\1\uffff\11\uffff\1"+
        "\uffff\1\uffff\1\uffff\1\uffff\1\uffff\3\uffff\1\72\3\uffff\4\uffff"+
        "\3\uffff\1\uffff\3\uffff\2\uffff\4\uffff\2\72\2\uffff\1\72\1\uffff"+
        "\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\72\1\uffff\1\uffff\2"+
        "\uffff\1\72\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\uffff\1\25\1\26\2\uffff"+
        "\1\32\1\33\13\uffff\1\24\1\27\1\16\1\17\1\20\1\21\1\22\1\23\1\25"+
        "\1\26\1\30\1\31\1\32\57\uffff\1\13\4\uffff\1\3\11\uffff\1\1\1\uffff"+
        "\1\3\1\uffff\1\5\7\uffff\1\1\1\2\1\4\1\5\3\uffff\1\11\3\uffff\1"+
        "\2\1\4\12\uffff\1\14\1\15\1\6\1\uffff\1\10\1\uffff\1\6\2\uffff\1"+
        "\7\3\uffff\1\12";
    static final String DFA12_specialS =
        "\1\74\1\75\11\uffff\1\73\3\uffff\1\76\1\104\1\113\1\120\1\62\1"+
        "\141\1\12\1\23\1\31\1\11\1\60\15\uffff\1\77\1\105\1\114\1\121\1"+
        "\65\1\142\1\13\1\24\1\32\1\47\1\51\1\61\1\100\1\106\1\115\1\122"+
        "\1\70\1\0\1\14\1\25\1\33\1\50\1\52\1\63\1\101\1\107\1\116\1\123"+
        "\1\127\1\132\1\1\1\15\1\26\1\34\1\uffff\1\53\1\64\1\102\1\110\1"+
        "\117\1\124\1\130\1\133\1\2\1\16\1\27\1\35\1\uffff\1\54\1\66\1\103"+
        "\1\111\1\uffff\1\125\1\131\1\134\1\3\1\17\1\30\1\36\1\55\1\67\1"+
        "\uffff\1\112\1\uffff\1\126\1\uffff\1\135\1\4\1\20\1\uffff\1\37\1"+
        "\56\1\71\4\uffff\1\136\1\5\1\21\1\uffff\1\40\1\57\1\72\2\uffff\1"+
        "\137\1\6\1\22\1\41\2\uffff\1\140\1\7\1\uffff\1\42\3\uffff\1\10\1"+
        "\uffff\1\43\2\uffff\1\44\1\uffff\1\45\1\46\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\13\4\16\1\1\4\16\1"+
            "\3\2\16\1\14\12\12\1\2\6\16\32\11\1\5\1\16\1\6\1\10\1\11\1\16"+
            "\32\11\1\4\1\16\1\7\uff82\16",
            "\102\33\1\22\3\33\1\21\2\33\1\20\11\33\1\17\15\33\1\27\1\33"+
            "\1\23\2\33\1\26\6\33\1\24\2\33\1\31\3\33\1\25\1\30\uff8a\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\33",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "\164\33\1\47\uff8b\33",
            "\156\33\1\50\uff91\33",
            "\154\33\1\51\uff93\33",
            "\157\33\1\52\uff90\33",
            "\157\33\1\53\uff90\33",
            "\145\33\1\54\uff9a\33",
            "\141\33\1\55\uff9e\33",
            "\151\33\1\56\uff96\33",
            "\164\33\1\57\uff8b\33",
            "\162\33\1\60\1\61\uff8c\33",
            "\141\33\1\62\uff9e\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\162\33\1\63\uff8d\33",
            "\164\33\1\64\uff8b\33",
            "\157\33\1\65\uff90\33",
            "\157\33\1\66\uff90\33",
            "\156\33\1\67\uff91\33",
            "\162\33\1\70\uff8d\33",
            "\142\33\1\71\uff9d\33",
            "\145\33\1\72\uff9a\33",
            "\164\33\1\73\uff8b\33",
            "\154\33\1\74\uff93\33",
            "\145\33\1\75\uff9a\33",
            "\163\33\1\76\uff8c\33",
            "\151\33\1\77\uff96\33",
            "\145\33\1\100\uff9a\33",
            "\141\33\1\101\uff9e\33",
            "\154\33\1\102\uff93\33",
            "\146\33\1\103\7\33\1\104\uff91\33",
            "\147\33\1\105\uff98\33",
            "\154\33\1\106\uff93\33",
            "\154\33\1\107\uff93\33",
            "\162\33\1\110\uff8d\33",
            "\47\33\1\111\uffd8\33",
            "\162\33\1\112\uff8d\33",
            "\163\33\1\113\uff8c\33",
            "\156\33\1\114\uff91\33",
            "\147\33\1\115\uff98\33",
            "\164\33\1\116\uff8b\33",
            "\145\33\1\117\uff9a\33",
            "\151\33\1\120\uff96\33",
            "\145\33\1\121\uff9a\33",
            "\145\33\1\122\uff9a\33",
            "\145\33\1\123\uff9a\33",
            "\144\33\1\124\uff9b\33",
            "\151\33\1\125\uff96\33",
            "\1\126",
            "\156\33\1\127\uff91\33",
            "\167\33\1\130\uff88\33",
            "\147\33\1\131\uff98\33",
            "\145\33\1\132\uff9a\33",
            "\47\33\1\133\uffd8\33",
            "\141\33\1\134\uff9e\33",
            "\147\33\1\135\uff98\33",
            "\143\33\1\136\uff9c\33",
            "\106\33\1\137\uffb9\33",
            "\116\33\1\140\uffb1\33",
            "\163\33\1\141\uff8c\33",
            "\142\33\1\142\uff9d\33",
            "",
            "\141\33\1\143\uff9e\33",
            "\157\33\1\144\uff90\33",
            "\47\33\1\145\uffd8\33",
            "\162\33\1\146\uff8d\33",
            "",
            "\156\33\1\150\uff91\33",
            "\47\33\1\151\uffd8\33",
            "\164\33\1\152\uff8b\33",
            "\151\33\1\153\uff96\33",
            "\141\33\1\154\uff9e\33",
            "\47\33\1\155\uffd8\33",
            "\165\33\1\156\uff8a\33",
            "\155\33\1\157\uff92\33",
            "\162\33\1\160\uff8d\33",
            "",
            "\47\33\1\162\uffd8\33",
            "",
            "\47\33\1\163\uffd8\33",
            "",
            "\151\33\1\165\uff96\33",
            "\145\33\1\166\uff9a\33",
            "\155\33\1\167\uff92\33",
            "\1\170",
            "\164\33\1\171\uff8b\33",
            "\145\33\1\172\uff9a\33",
            "\144\33\1\173\uff9b\33",
            "",
            "",
            "",
            "",
            "\157\33\1\176\uff90\33",
            "\154\33\1\177\uff93\33",
            "\145\33\1\u0080\uff9a\33",
            "",
            "\145\33\1\u0081\uff9a\33",
            "\47\33\1\u0082\uffd8\33",
            "\47\33\1\u0083\uffd8\33",
            "",
            "",
            "\156\33\1\u0084\uff91\33",
            "\144\33\1\u0085\uff9b\33",
            "\47\33\1\u0086\uffd8\33",
            "\116\33\1\u0087\uffb1\33",
            "\1\u0088",
            "\1\u0089",
            "\47\33\1\u008a\uffd8\33",
            "\163\33\1\u008b\uff8c\33",
            "\1\u008c",
            "\141\33\1\u008d\uff9e\33",
            "",
            "",
            "",
            "\47\33\1\u008f\uffd8\33",
            "",
            "\155\33\1\u0090\uff92\33",
            "",
            "\1\u0091",
            "\145\33\1\u0092\uff9a\33",
            "",
            "\163\33\1\u0093\uff8c\33",
            "\47\33\1\u0094\uffd8\33",
            "\1\u0095",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | RULE_LITERACONFIG | RULE_LITERACONNECTION | RULE_LITERALMERGEDFIELDS | RULE_LITERALTABLENAME | RULE_LITERALFIELDS | RULE_LITERALATTRIBUTENAMES | RULE_LITERALURL | RULE_LITERALUSERNAME | RULE_LITERALPASSWORD | RULE_COLON | RULE_COMA | RULE_LEFTPARENTESIS | RULE_LEFTBRACKET | RULE_RIGHTBRACKET | RULE_RIGHTPARENTESIS | RULE_SINGLEQUOTE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='g') ) {s = 69;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='f')||(LA12_56>='h' && LA12_56<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_69 = input.LA(1);

                        s = -1;
                        if ( (LA12_69=='e') ) {s = 82;}

                        else if ( ((LA12_69>='\u0000' && LA12_69<='d')||(LA12_69>='f' && LA12_69<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_82 = input.LA(1);

                        s = -1;
                        if ( (LA12_82=='F') ) {s = 95;}

                        else if ( ((LA12_82>='\u0000' && LA12_82<='E')||(LA12_82>='G' && LA12_82<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='i') ) {s = 107;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='h')||(LA12_95>='j' && LA12_95<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_107 = input.LA(1);

                        s = -1;
                        if ( (LA12_107=='e') ) {s = 118;}

                        else if ( ((LA12_107>='\u0000' && LA12_107<='d')||(LA12_107>='f' && LA12_107<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='l') ) {s = 127;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='k')||(LA12_118>='m' && LA12_118<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='d') ) {s = 133;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='c')||(LA12_127>='e' && LA12_127<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_133 = input.LA(1);

                        s = -1;
                        if ( (LA12_133=='s') ) {s = 139;}

                        else if ( ((LA12_133>='\u0000' && LA12_133<='r')||(LA12_133>='t' && LA12_133<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='\'') ) {s = 143;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='&')||(LA12_139>='(' && LA12_139<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='r') ) {s = 48;}

                        else if ( (LA12_24=='s') ) {s = 49;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='q')||(LA12_24>='t' && LA12_24<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( (LA12_21=='a') ) {s = 45;}

                        else if ( ((LA12_21>='\u0000' && LA12_21<='`')||(LA12_21>='b' && LA12_21<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( (LA12_45=='b') ) {s = 57;}

                        else if ( ((LA12_45>='\u0000' && LA12_45<='a')||(LA12_45>='c' && LA12_45<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='l') ) {s = 70;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='k')||(LA12_57>='m' && LA12_57<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_70 = input.LA(1);

                        s = -1;
                        if ( (LA12_70=='e') ) {s = 83;}

                        else if ( ((LA12_70>='\u0000' && LA12_70<='d')||(LA12_70>='f' && LA12_70<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='N') ) {s = 96;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='M')||(LA12_83>='O' && LA12_83<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='a') ) {s = 108;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='`')||(LA12_96>='b' && LA12_96<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_108 = input.LA(1);

                        s = -1;
                        if ( (LA12_108=='m') ) {s = 119;}

                        else if ( ((LA12_108>='\u0000' && LA12_108<='l')||(LA12_108>='n' && LA12_108<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='e') ) {s = 128;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='d')||(LA12_119>='f' && LA12_119<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='\'') ) {s = 134;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='&')||(LA12_128>='(' && LA12_128<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( (LA12_22=='i') ) {s = 46;}

                        else if ( ((LA12_22>='\u0000' && LA12_22<='h')||(LA12_22>='j' && LA12_22<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='e') ) {s = 58;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='d')||(LA12_46>='f' && LA12_46<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='l') ) {s = 71;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='k')||(LA12_58>='m' && LA12_58<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_71 = input.LA(1);

                        s = -1;
                        if ( (LA12_71=='d') ) {s = 84;}

                        else if ( ((LA12_71>='\u0000' && LA12_71<='c')||(LA12_71>='e' && LA12_71<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='s') ) {s = 97;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='r')||(LA12_84>='t' && LA12_84<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='\'') ) {s = 109;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='&')||(LA12_97>='(' && LA12_97<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='t') ) {s = 47;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='s')||(LA12_23>='u' && LA12_23<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='t') ) {s = 59;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='s')||(LA12_47>='u' && LA12_47<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='r') ) {s = 72;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='q')||(LA12_59>='s' && LA12_59<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72=='i') ) {s = 85;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='h')||(LA12_72>='j' && LA12_72<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_85 = input.LA(1);

                        s = -1;
                        if ( (LA12_85=='b') ) {s = 98;}

                        else if ( ((LA12_85>='\u0000' && LA12_85<='a')||(LA12_85>='c' && LA12_85<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='u') ) {s = 110;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='t')||(LA12_98>='v' && LA12_98<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_110 = input.LA(1);

                        s = -1;
                        if ( (LA12_110=='t') ) {s = 121;}

                        else if ( ((LA12_110>='\u0000' && LA12_110<='s')||(LA12_110>='u' && LA12_110<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_121 = input.LA(1);

                        s = -1;
                        if ( (LA12_121=='e') ) {s = 129;}

                        else if ( ((LA12_121>='\u0000' && LA12_121<='d')||(LA12_121>='f' && LA12_121<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_129 = input.LA(1);

                        s = -1;
                        if ( (LA12_129=='N') ) {s = 135;}

                        else if ( ((LA12_129>='\u0000' && LA12_129<='M')||(LA12_129>='O' && LA12_129<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_135 = input.LA(1);

                        s = -1;
                        if ( (LA12_135=='a') ) {s = 141;}

                        else if ( ((LA12_135>='\u0000' && LA12_135<='`')||(LA12_135>='b' && LA12_135<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_141 = input.LA(1);

                        s = -1;
                        if ( (LA12_141=='m') ) {s = 144;}

                        else if ( ((LA12_141>='\u0000' && LA12_141<='l')||(LA12_141>='n' && LA12_141<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='e') ) {s = 146;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='d')||(LA12_144>='f' && LA12_144<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_146 = input.LA(1);

                        s = -1;
                        if ( (LA12_146=='s') ) {s = 147;}

                        else if ( ((LA12_146>='\u0000' && LA12_146<='r')||(LA12_146>='t' && LA12_146<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_147 = input.LA(1);

                        s = -1;
                        if ( (LA12_147=='\'') ) {s = 148;}

                        else if ( ((LA12_147>='\u0000' && LA12_147<='&')||(LA12_147>='(' && LA12_147<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='l') ) {s = 60;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='k')||(LA12_48>='m' && LA12_48<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='\'') ) {s = 73;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='&')||(LA12_60>='(' && LA12_60<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( (LA12_49=='e') ) {s = 61;}

                        else if ( ((LA12_49>='\u0000' && LA12_49<='d')||(LA12_49>='f' && LA12_49<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_61 = input.LA(1);

                        s = -1;
                        if ( (LA12_61=='r') ) {s = 74;}

                        else if ( ((LA12_61>='\u0000' && LA12_61<='q')||(LA12_61>='s' && LA12_61<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_74 = input.LA(1);

                        s = -1;
                        if ( (LA12_74=='n') ) {s = 87;}

                        else if ( ((LA12_74>='\u0000' && LA12_74<='m')||(LA12_74>='o' && LA12_74<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='a') ) {s = 99;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='`')||(LA12_87>='b' && LA12_87<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='m') ) {s = 111;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<='l')||(LA12_99>='n' && LA12_99<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='e') ) {s = 122;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='d')||(LA12_111>='f' && LA12_111<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_122 = input.LA(1);

                        s = -1;
                        if ( (LA12_122=='\'') ) {s = 130;}

                        else if ( ((LA12_122>='\u0000' && LA12_122<='&')||(LA12_122>='(' && LA12_122<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( (LA12_25=='a') ) {s = 50;}

                        else if ( ((LA12_25>='\u0000' && LA12_25<='`')||(LA12_25>='b' && LA12_25<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( (LA12_50=='s') ) {s = 62;}

                        else if ( ((LA12_50>='\u0000' && LA12_50<='r')||(LA12_50>='t' && LA12_50<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='o') ) {s = 43;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='n')||(LA12_19>='p' && LA12_19<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_62 = input.LA(1);

                        s = -1;
                        if ( (LA12_62=='s') ) {s = 75;}

                        else if ( ((LA12_62>='\u0000' && LA12_62<='r')||(LA12_62>='t' && LA12_62<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_75 = input.LA(1);

                        s = -1;
                        if ( (LA12_75=='w') ) {s = 88;}

                        else if ( ((LA12_75>='\u0000' && LA12_75<='v')||(LA12_75>='x' && LA12_75<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( (LA12_43=='n') ) {s = 55;}

                        else if ( ((LA12_43>='\u0000' && LA12_43<='m')||(LA12_43>='o' && LA12_43<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_88 = input.LA(1);

                        s = -1;
                        if ( (LA12_88=='o') ) {s = 100;}

                        else if ( ((LA12_88>='\u0000' && LA12_88<='n')||(LA12_88>='p' && LA12_88<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_100 = input.LA(1);

                        s = -1;
                        if ( (LA12_100=='r') ) {s = 112;}

                        else if ( ((LA12_100>='\u0000' && LA12_100<='q')||(LA12_100>='s' && LA12_100<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_55 = input.LA(1);

                        s = -1;
                        if ( (LA12_55=='f') ) {s = 67;}

                        else if ( (LA12_55=='n') ) {s = 68;}

                        else if ( ((LA12_55>='\u0000' && LA12_55<='e')||(LA12_55>='g' && LA12_55<='m')||(LA12_55>='o' && LA12_55<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='d') ) {s = 123;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='c')||(LA12_112>='e' && LA12_112<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_123 = input.LA(1);

                        s = -1;
                        if ( (LA12_123=='\'') ) {s = 131;}

                        else if ( ((LA12_123>='\u0000' && LA12_123<='&')||(LA12_123>='(' && LA12_123<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 27;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='\'') ) {s = 1;}

                        else if ( (LA12_0==':') ) {s = 2;}

                        else if ( (LA12_0==',') ) {s = 3;}

                        else if ( (LA12_0=='{') ) {s = 4;}

                        else if ( (LA12_0=='[') ) {s = 5;}

                        else if ( (LA12_0==']') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='^') ) {s = 8;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 9;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 10;}

                        else if ( (LA12_0=='\"') ) {s = 11;}

                        else if ( (LA12_0=='/') ) {s = 12;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 13;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_1 = input.LA(1);

                        s = -1;
                        if ( (LA12_1=='S') ) {s = 15;}

                        else if ( (LA12_1=='I') ) {s = 16;}

                        else if ( (LA12_1=='F') ) {s = 17;}

                        else if ( (LA12_1=='B') ) {s = 18;}

                        else if ( (LA12_1=='c') ) {s = 19;}

                        else if ( (LA12_1=='m') ) {s = 20;}

                        else if ( (LA12_1=='t') ) {s = 21;}

                        else if ( (LA12_1=='f') ) {s = 22;}

                        else if ( (LA12_1=='a') ) {s = 23;}

                        else if ( (LA12_1=='u') ) {s = 24;}

                        else if ( (LA12_1=='p') ) {s = 25;}

                        else if ( ((LA12_1>='\u0000' && LA12_1<='A')||(LA12_1>='C' && LA12_1<='E')||(LA12_1>='G' && LA12_1<='H')||(LA12_1>='J' && LA12_1<='R')||(LA12_1>='T' && LA12_1<='`')||LA12_1=='b'||(LA12_1>='d' && LA12_1<='e')||(LA12_1>='g' && LA12_1<='l')||(LA12_1>='n' && LA12_1<='o')||(LA12_1>='q' && LA12_1<='s')||(LA12_1>='v' && LA12_1<='\uFFFF')) ) {s = 27;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( (LA12_15=='t') ) {s = 39;}

                        else if ( ((LA12_15>='\u0000' && LA12_15<='s')||(LA12_15>='u' && LA12_15<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( (LA12_39=='r') ) {s = 51;}

                        else if ( ((LA12_39>='\u0000' && LA12_39<='q')||(LA12_39>='s' && LA12_39<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( (LA12_51=='i') ) {s = 63;}

                        else if ( ((LA12_51>='\u0000' && LA12_51<='h')||(LA12_51>='j' && LA12_51<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_63 = input.LA(1);

                        s = -1;
                        if ( (LA12_63=='n') ) {s = 76;}

                        else if ( ((LA12_63>='\u0000' && LA12_63<='m')||(LA12_63>='o' && LA12_63<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( (LA12_76=='g') ) {s = 89;}

                        else if ( ((LA12_76>='\u0000' && LA12_76<='f')||(LA12_76>='h' && LA12_76<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='\'') ) {s = 101;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='&')||(LA12_89>='(' && LA12_89<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( (LA12_16=='n') ) {s = 40;}

                        else if ( ((LA12_16>='\u0000' && LA12_16<='m')||(LA12_16>='o' && LA12_16<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='t') ) {s = 52;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='s')||(LA12_40>='u' && LA12_40<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_52 = input.LA(1);

                        s = -1;
                        if ( (LA12_52=='e') ) {s = 64;}

                        else if ( ((LA12_52>='\u0000' && LA12_52<='d')||(LA12_52>='f' && LA12_52<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='g') ) {s = 77;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='f')||(LA12_64>='h' && LA12_64<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='e') ) {s = 90;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='d')||(LA12_77>='f' && LA12_77<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_90 = input.LA(1);

                        s = -1;
                        if ( (LA12_90=='r') ) {s = 102;}

                        else if ( ((LA12_90>='\u0000' && LA12_90<='q')||(LA12_90>='s' && LA12_90<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='\'') ) {s = 114;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<='&')||(LA12_102>='(' && LA12_102<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( (LA12_17=='l') ) {s = 41;}

                        else if ( ((LA12_17>='\u0000' && LA12_17<='k')||(LA12_17>='m' && LA12_17<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( (LA12_41=='o') ) {s = 53;}

                        else if ( ((LA12_41>='\u0000' && LA12_41<='n')||(LA12_41>='p' && LA12_41<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( (LA12_53=='a') ) {s = 65;}

                        else if ( ((LA12_53>='\u0000' && LA12_53<='`')||(LA12_53>='b' && LA12_53<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='t') ) {s = 78;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='s')||(LA12_65>='u' && LA12_65<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='\'') ) {s = 91;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='&')||(LA12_78>='(' && LA12_78<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( (LA12_18=='o') ) {s = 42;}

                        else if ( ((LA12_18>='\u0000' && LA12_18<='n')||(LA12_18>='p' && LA12_18<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='o') ) {s = 54;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='n')||(LA12_42>='p' && LA12_42<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( (LA12_54=='l') ) {s = 66;}

                        else if ( ((LA12_54>='\u0000' && LA12_54<='k')||(LA12_54>='m' && LA12_54<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='e') ) {s = 79;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='d')||(LA12_66>='f' && LA12_66<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='a') ) {s = 92;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='`')||(LA12_79>='b' && LA12_79<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='n') ) {s = 104;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='m')||(LA12_92>='o' && LA12_92<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='\'') ) {s = 115;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='&')||(LA12_104>='(' && LA12_104<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_67 = input.LA(1);

                        s = -1;
                        if ( (LA12_67=='i') ) {s = 80;}

                        else if ( ((LA12_67>='\u0000' && LA12_67<='h')||(LA12_67>='j' && LA12_67<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='g') ) {s = 93;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='f')||(LA12_80>='h' && LA12_80<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_93 = input.LA(1);

                        s = -1;
                        if ( (LA12_93=='\'') ) {s = 105;}

                        else if ( ((LA12_93>='\u0000' && LA12_93<='&')||(LA12_93>='(' && LA12_93<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='e') ) {s = 81;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='d')||(LA12_68>='f' && LA12_68<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_81 = input.LA(1);

                        s = -1;
                        if ( (LA12_81=='c') ) {s = 94;}

                        else if ( ((LA12_81>='\u0000' && LA12_81<='b')||(LA12_81>='d' && LA12_81<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_94 = input.LA(1);

                        s = -1;
                        if ( (LA12_94=='t') ) {s = 106;}

                        else if ( ((LA12_94>='\u0000' && LA12_94<='s')||(LA12_94>='u' && LA12_94<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='i') ) {s = 117;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='h')||(LA12_106>='j' && LA12_106<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='o') ) {s = 126;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='n')||(LA12_117>='p' && LA12_117<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_126 = input.LA(1);

                        s = -1;
                        if ( (LA12_126=='n') ) {s = 132;}

                        else if ( ((LA12_126>='\u0000' && LA12_126<='m')||(LA12_126>='o' && LA12_126<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_132 = input.LA(1);

                        s = -1;
                        if ( (LA12_132=='\'') ) {s = 138;}

                        else if ( ((LA12_132>='\u0000' && LA12_132<='&')||(LA12_132>='(' && LA12_132<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( (LA12_20=='e') ) {s = 44;}

                        else if ( ((LA12_20>='\u0000' && LA12_20<='d')||(LA12_20>='f' && LA12_20<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( (LA12_44=='r') ) {s = 56;}

                        else if ( ((LA12_44>='\u0000' && LA12_44<='q')||(LA12_44>='s' && LA12_44<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}