package co.edu.uniandes.jsonToSql.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarLexer extends Lexer {
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

    public InternalGrammarLexer() {;} 
    public InternalGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:11:7: ( '\\'config\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:11:9: '\\'config\\':'
            {
            match("'config':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:12:7: ( '{' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:13:7: ( 'conecction:' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:13:9: 'conecction:'
            {
            match("conecction:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:14:7: ( '\\'mergeFields\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:14:9: '\\'mergeFields\\':'
            {
            match("'mergeFields':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:15:7: ( '[' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:16:7: ( ',' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:17:7: ( ']' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:18:7: ( '}' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:19:7: ( '\\'url\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:19:9: '\\'url\\':'
            {
            match("'url':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:20:7: ( '\\'username\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:20:9: '\\'username\\':'
            {
            match("'username':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:21:7: ( '\\'password\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:21:9: '\\'password\\':'
            {
            match("'password':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:22:7: ( '\\'tableName\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:22:9: '\\'tableName\\':'
            {
            match("'tableName':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:23:7: ( '\\'attributeNames\\':' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:23:9: '\\'attributeNames\\':'
            {
            match("'attributeNames':"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:24:7: ( 'fields' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:24:9: 'fields'
            {
            match("fields"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:25:7: ( 'oldField' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:25:9: 'oldField'
            {
            match("oldField"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:26:7: ( 'finalField' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:26:9: 'finalField'
            {
            match("finalField"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:27:7: ( 'type' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:27:9: 'type'
            {
            match("type"); 


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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:28:7: ( 'String' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:28:9: 'String'
            {
            match("String"); 


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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:29:7: ( 'Integer' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:29:9: 'Integer'
            {
            match("Integer"); 


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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:30:7: ( 'Float' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:30:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:31:7: ( 'Boolean' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:31:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:642:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:642:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:642:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:642:11: '^'
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

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:642:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:
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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:644:10: ( ( '0' .. '9' )+ )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:644:12: ( '0' .. '9' )+
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:644:12: ( '0' .. '9' )+
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
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:644:13: '0' .. '9'
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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:646:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:648:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:648:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:648:24: ( options {greedy=false; } : . )*
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
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:648:52: .
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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:41: ( '\\r' )? '\\n'
                    {
                    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:650:41: '\\r'
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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:652:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:652:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:652:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:
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
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:654:16: ( . )
            // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:654:18: .
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
        // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:136: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:144: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:153: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:165: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:181: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:197: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../co.edu.uniandes.jsonToSql.grammar/src-gen/co/edu/uniandes/jsonToSql/parser/antlr/internal/InternalGrammar.g:1:205: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\25\1\uffff\1\37\4\uffff\7\37\1\25\2\uffff\2\25\12\uffff"+
        "\1\37\5\uffff\7\37\13\uffff\11\37\7\uffff\4\37\1\132\4\37\2\uffff"+
        "\1\34\4\uffff\4\37\1\uffff\2\37\1\154\1\37\7\uffff\1\37\1\165\2"+
        "\37\1\170\1\37\1\uffff\1\37\6\uffff\1\37\1\uffff\2\37\1\uffff\1"+
        "\u0084\1\u0085\1\34\5\uffff\2\37\1\u008e\10\uffff\2\37\2\uffff\2"+
        "\34\2\uffff\1\37\1\u009c\3\uffff\1\34\6\uffff\1\34\4\uffff\1\34"+
        "\1\uffff";
    static final String DFA12_eofS =
        "\u00a7\uffff";
    static final String DFA12_minS =
        "\2\0\1\uffff\1\157\4\uffff\1\151\1\154\1\171\1\164\1\156\1\154"+
        "\1\157\1\101\2\uffff\1\0\1\52\2\uffff\6\0\2\uffff\1\156\5\uffff"+
        "\1\145\1\144\1\160\1\162\1\164\2\157\4\uffff\7\0\1\145\1\154\1\141"+
        "\1\106\1\145\1\151\1\145\1\141\1\154\7\0\1\143\1\144\1\154\1\151"+
        "\1\60\1\156\1\147\1\164\1\145\2\0\1\72\4\0\1\143\1\163\1\106\1\145"+
        "\1\uffff\1\147\1\145\1\60\1\141\2\0\1\uffff\4\0\1\164\1\60\1\151"+
        "\1\154\1\60\1\162\1\uffff\1\156\6\0\1\151\1\uffff\1\145\1\144\1"+
        "\uffff\2\60\1\72\5\0\1\157\1\154\1\60\3\uffff\5\0\1\156\1\144\1"+
        "\uffff\1\0\2\72\2\0\1\72\1\60\1\0\2\uffff\1\72\1\0\2\uffff\1\0\1"+
        "\uffff\1\0\1\72\1\0\1\uffff\2\0\1\72\1\uffff";
    static final String DFA12_maxS =
        "\2\uffff\1\uffff\1\157\4\uffff\1\151\1\154\1\171\1\164\1\156\1"+
        "\154\1\157\1\172\2\uffff\1\uffff\1\57\2\uffff\6\uffff\2\uffff\1"+
        "\156\5\uffff\1\156\1\144\1\160\1\162\1\164\2\157\4\uffff\7\uffff"+
        "\1\145\1\154\1\141\1\106\1\145\1\151\1\145\1\141\1\154\7\uffff\1"+
        "\143\1\144\1\154\1\151\1\172\1\156\1\147\1\164\1\145\2\uffff\1\72"+
        "\4\uffff\1\143\1\163\1\106\1\145\1\uffff\1\147\1\145\1\172\1\141"+
        "\2\uffff\1\uffff\4\uffff\1\164\1\172\1\151\1\154\1\172\1\162\1\uffff"+
        "\1\156\6\uffff\1\151\1\uffff\1\145\1\144\1\uffff\2\172\1\72\5\uffff"+
        "\1\157\1\154\1\172\3\uffff\5\uffff\1\156\1\144\1\uffff\1\uffff\2"+
        "\72\2\uffff\1\72\1\172\1\uffff\2\uffff\1\72\1\uffff\2\uffff\1\uffff"+
        "\1\uffff\1\uffff\1\72\1\uffff\1\uffff\2\uffff\1\72\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\6\1\7\1\10\10\uffff\1\26\1\27\2\uffff"+
        "\1\33\1\34\6\uffff\1\30\1\2\1\uffff\1\26\1\5\1\6\1\7\1\10\7\uffff"+
        "\1\27\1\31\1\32\1\33\53\uffff\1\21\6\uffff\1\11\12\uffff\1\24\10"+
        "\uffff\1\16\2\uffff\1\22\13\uffff\1\23\1\25\1\1\7\uffff\1\17\10"+
        "\uffff\1\12\1\13\2\uffff\1\3\1\20\1\uffff\1\14\3\uffff\1\4\3\uffff"+
        "\1\15";
    static final String DFA12_specialS =
        "\1\36\1\7\20\uffff\1\3\3\uffff\1\0\1\10\1\74\1\34\1\45\1\56\23"+
        "\uffff\1\1\1\11\1\23\1\25\1\35\1\46\1\57\11\uffff\1\2\1\12\1\24"+
        "\1\26\1\37\1\47\1\60\11\uffff\1\4\1\13\1\uffff\1\27\1\40\1\50\1"+
        "\61\11\uffff\1\5\1\14\1\uffff\1\30\1\41\1\51\1\62\10\uffff\1\6\1"+
        "\15\1\31\1\42\1\52\1\63\10\uffff\1\16\1\32\1\43\1\53\1\64\6\uffff"+
        "\1\17\1\33\1\44\1\54\1\65\3\uffff\1\20\2\uffff\1\55\1\66\2\uffff"+
        "\1\21\3\uffff\1\67\2\uffff\1\22\1\uffff\1\70\1\uffff\1\71\1\uffff"+
        "\1\72\1\73\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\22\4\25\1\1\4\25\1"+
            "\5\2\25\1\23\12\21\7\25\1\20\1\16\3\20\1\15\2\20\1\14\11\20"+
            "\1\13\7\20\1\4\1\25\1\6\1\17\1\20\1\25\2\20\1\3\2\20\1\10\10"+
            "\20\1\11\4\20\1\12\6\20\1\2\1\25\1\7\uff82\25",
            "\141\34\1\33\1\34\1\26\11\34\1\27\2\34\1\31\3\34\1\32\1\30"+
            "\uff8a\34",
            "",
            "\1\36",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\34",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\157\34\1\57\uff90\34",
            "\145\34\1\60\uff9a\34",
            "\162\34\1\61\1\62\uff8c\34",
            "\141\34\1\63\uff9e\34",
            "\141\34\1\64\uff9e\34",
            "\164\34\1\65\uff8b\34",
            "",
            "",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\67\10\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "\156\34\1\77\uff91\34",
            "\162\34\1\100\uff8d\34",
            "\154\34\1\101\uff93\34",
            "\145\34\1\102\uff9a\34",
            "\163\34\1\103\uff8c\34",
            "\142\34\1\104\uff9d\34",
            "\164\34\1\105\uff8b\34",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\146\34\1\117\uff99\34",
            "\147\34\1\120\uff98\34",
            "\47\34\1\121\uffd8\34",
            "\162\34\1\122\uff8d\34",
            "\163\34\1\123\uff8c\34",
            "\154\34\1\124\uff93\34",
            "\162\34\1\125\uff8d\34",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\151\34\1\137\uff96\34",
            "\145\34\1\140\uff9a\34",
            "\1\141",
            "\156\34\1\142\uff91\34",
            "\167\34\1\143\uff88\34",
            "\145\34\1\144\uff9a\34",
            "\151\34\1\145\uff96\34",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\155",
            "\147\34\1\156\uff98\34",
            "\106\34\1\157\uffb9\34",
            "",
            "\141\34\1\160\uff9e\34",
            "\157\34\1\161\uff90\34",
            "\116\34\1\162\uffb1\34",
            "\142\34\1\163\uff9d\34",
            "\1\164",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "\1\167",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\171",
            "",
            "\1\172",
            "\47\34\1\173\uffd8\34",
            "\151\34\1\174\uff96\34",
            "\155\34\1\175\uff92\34",
            "\162\34\1\176\uff8d\34",
            "\141\34\1\177\uff9e\34",
            "\165\34\1\u0080\uff8a\34",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0086",
            "\145\34\1\u0087\uff9a\34",
            "\145\34\1\u0088\uff9a\34",
            "\144\34\1\u0089\uff9b\34",
            "\155\34\1\u008a\uff92\34",
            "\164\34\1\u008b\uff8b\34",
            "\1\u008c",
            "\1\u008d",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\154\34\1\u008f\uff93\34",
            "\47\34\1\u0090\uffd8\34",
            "\47\34\1\u0091\uffd8\34",
            "\145\34\1\u0092\uff9a\34",
            "\145\34\1\u0093\uff9a\34",
            "\1\u0094",
            "\1\u0095",
            "",
            "\144\34\1\u0096\uff9b\34",
            "\1\u0097",
            "\1\u0098",
            "\47\34\1\u0099\uffd8\34",
            "\116\34\1\u009a\uffb1\34",
            "\1\u009b",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\163\34\1\u009d\uff8c\34",
            "",
            "",
            "\1\u009e",
            "\141\34\1\u009f\uff9e\34",
            "",
            "",
            "\47\34\1\u00a0\uffd8\34",
            "",
            "\155\34\1\u00a1\uff92\34",
            "\1\u00a2",
            "\145\34\1\u00a3\uff9a\34",
            "",
            "\163\34\1\u00a4\uff8c\34",
            "\47\34\1\u00a5\uffd8\34",
            "\1\u00a6",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( (LA12_22=='o') ) {s = 47;}

                        else if ( ((LA12_22>='\u0000' && LA12_22<='n')||(LA12_22>='p' && LA12_22<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='n') ) {s = 63;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='m')||(LA12_47>='o' && LA12_47<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_63 = input.LA(1);

                        s = -1;
                        if ( (LA12_63=='f') ) {s = 79;}

                        else if ( ((LA12_63>='\u0000' && LA12_63<='e')||(LA12_63>='g' && LA12_63<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 28;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='i') ) {s = 95;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='h')||(LA12_79>='j' && LA12_79<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='g') ) {s = 110;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='f')||(LA12_95>='h' && LA12_95<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_110 = input.LA(1);

                        s = -1;
                        if ( (LA12_110=='\'') ) {s = 123;}

                        else if ( ((LA12_110>='\u0000' && LA12_110<='&')||(LA12_110>='(' && LA12_110<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_1 = input.LA(1);

                        s = -1;
                        if ( (LA12_1=='c') ) {s = 22;}

                        else if ( (LA12_1=='m') ) {s = 23;}

                        else if ( (LA12_1=='u') ) {s = 24;}

                        else if ( (LA12_1=='p') ) {s = 25;}

                        else if ( (LA12_1=='t') ) {s = 26;}

                        else if ( (LA12_1=='a') ) {s = 27;}

                        else if ( ((LA12_1>='\u0000' && LA12_1<='`')||LA12_1=='b'||(LA12_1>='d' && LA12_1<='l')||(LA12_1>='n' && LA12_1<='o')||(LA12_1>='q' && LA12_1<='s')||(LA12_1>='v' && LA12_1<='\uFFFF')) ) {s = 28;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='e') ) {s = 48;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='d')||(LA12_23>='f' && LA12_23<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='r') ) {s = 64;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='q')||(LA12_48>='s' && LA12_48<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='g') ) {s = 80;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='f')||(LA12_64>='h' && LA12_64<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='e') ) {s = 96;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='d')||(LA12_80>='f' && LA12_80<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='F') ) {s = 111;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='E')||(LA12_96>='G' && LA12_96<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='i') ) {s = 124;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='h')||(LA12_111>='j' && LA12_111<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_124 = input.LA(1);

                        s = -1;
                        if ( (LA12_124=='e') ) {s = 135;}

                        else if ( ((LA12_124>='\u0000' && LA12_124<='d')||(LA12_124>='f' && LA12_124<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_135 = input.LA(1);

                        s = -1;
                        if ( (LA12_135=='l') ) {s = 143;}

                        else if ( ((LA12_135>='\u0000' && LA12_135<='k')||(LA12_135>='m' && LA12_135<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_143 = input.LA(1);

                        s = -1;
                        if ( (LA12_143=='d') ) {s = 150;}

                        else if ( ((LA12_143>='\u0000' && LA12_143<='c')||(LA12_143>='e' && LA12_143<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_150 = input.LA(1);

                        s = -1;
                        if ( (LA12_150=='s') ) {s = 157;}

                        else if ( ((LA12_150>='\u0000' && LA12_150<='r')||(LA12_150>='t' && LA12_150<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_157 = input.LA(1);

                        s = -1;
                        if ( (LA12_157=='\'') ) {s = 160;}

                        else if ( ((LA12_157>='\u0000' && LA12_157<='&')||(LA12_157>='(' && LA12_157<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( (LA12_49=='l') ) {s = 65;}

                        else if ( ((LA12_49>='\u0000' && LA12_49<='k')||(LA12_49>='m' && LA12_49<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='\'') ) {s = 81;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='&')||(LA12_65>='(' && LA12_65<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( (LA12_50=='e') ) {s = 66;}

                        else if ( ((LA12_50>='\u0000' && LA12_50<='d')||(LA12_50>='f' && LA12_50<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='r') ) {s = 82;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='q')||(LA12_66>='s' && LA12_66<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_82 = input.LA(1);

                        s = -1;
                        if ( (LA12_82=='n') ) {s = 98;}

                        else if ( ((LA12_82>='\u0000' && LA12_82<='m')||(LA12_82>='o' && LA12_82<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='a') ) {s = 112;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='`')||(LA12_98>='b' && LA12_98<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='m') ) {s = 125;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='l')||(LA12_112>='n' && LA12_112<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='e') ) {s = 136;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='d')||(LA12_125>='f' && LA12_125<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='\'') ) {s = 144;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='&')||(LA12_136>='(' && LA12_136<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( (LA12_25=='a') ) {s = 51;}

                        else if ( ((LA12_25>='\u0000' && LA12_25<='`')||(LA12_25>='b' && LA12_25<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( (LA12_51=='s') ) {s = 67;}

                        else if ( ((LA12_51>='\u0000' && LA12_51<='r')||(LA12_51>='t' && LA12_51<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='\'') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='c') ) {s = 3;}

                        else if ( (LA12_0=='[') ) {s = 4;}

                        else if ( (LA12_0==',') ) {s = 5;}

                        else if ( (LA12_0==']') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='f') ) {s = 8;}

                        else if ( (LA12_0=='o') ) {s = 9;}

                        else if ( (LA12_0=='t') ) {s = 10;}

                        else if ( (LA12_0=='S') ) {s = 11;}

                        else if ( (LA12_0=='I') ) {s = 12;}

                        else if ( (LA12_0=='F') ) {s = 13;}

                        else if ( (LA12_0=='B') ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( (LA12_0=='A'||(LA12_0>='C' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='d' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 16;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 17;}

                        else if ( (LA12_0=='\"') ) {s = 18;}

                        else if ( (LA12_0=='/') ) {s = 19;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 20;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_67 = input.LA(1);

                        s = -1;
                        if ( (LA12_67=='s') ) {s = 83;}

                        else if ( ((LA12_67>='\u0000' && LA12_67<='r')||(LA12_67>='t' && LA12_67<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='w') ) {s = 99;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='v')||(LA12_83>='x' && LA12_83<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='o') ) {s = 113;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<='n')||(LA12_99>='p' && LA12_99<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='r') ) {s = 126;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='q')||(LA12_113>='s' && LA12_113<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_126 = input.LA(1);

                        s = -1;
                        if ( (LA12_126=='d') ) {s = 137;}

                        else if ( ((LA12_126>='\u0000' && LA12_126<='c')||(LA12_126>='e' && LA12_126<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='\'') ) {s = 145;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='&')||(LA12_137>='(' && LA12_137<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( (LA12_26=='a') ) {s = 52;}

                        else if ( ((LA12_26>='\u0000' && LA12_26<='`')||(LA12_26>='b' && LA12_26<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_52 = input.LA(1);

                        s = -1;
                        if ( (LA12_52=='b') ) {s = 68;}

                        else if ( ((LA12_52>='\u0000' && LA12_52<='a')||(LA12_52>='c' && LA12_52<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='l') ) {s = 84;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='k')||(LA12_68>='m' && LA12_68<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='e') ) {s = 100;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='d')||(LA12_84>='f' && LA12_84<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_100 = input.LA(1);

                        s = -1;
                        if ( (LA12_100=='N') ) {s = 114;}

                        else if ( ((LA12_100>='\u0000' && LA12_100<='M')||(LA12_100>='O' && LA12_100<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='a') ) {s = 127;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='`')||(LA12_114>='b' && LA12_114<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='m') ) {s = 138;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='l')||(LA12_127>='n' && LA12_127<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_138 = input.LA(1);

                        s = -1;
                        if ( (LA12_138=='e') ) {s = 146;}

                        else if ( ((LA12_138>='\u0000' && LA12_138<='d')||(LA12_138>='f' && LA12_138<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_146 = input.LA(1);

                        s = -1;
                        if ( (LA12_146=='\'') ) {s = 153;}

                        else if ( ((LA12_146>='\u0000' && LA12_146<='&')||(LA12_146>='(' && LA12_146<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( (LA12_27=='t') ) {s = 53;}

                        else if ( ((LA12_27>='\u0000' && LA12_27<='s')||(LA12_27>='u' && LA12_27<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( (LA12_53=='t') ) {s = 69;}

                        else if ( ((LA12_53>='\u0000' && LA12_53<='s')||(LA12_53>='u' && LA12_53<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_69 = input.LA(1);

                        s = -1;
                        if ( (LA12_69=='r') ) {s = 85;}

                        else if ( ((LA12_69>='\u0000' && LA12_69<='q')||(LA12_69>='s' && LA12_69<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_85 = input.LA(1);

                        s = -1;
                        if ( (LA12_85=='i') ) {s = 101;}

                        else if ( ((LA12_85>='\u0000' && LA12_85<='h')||(LA12_85>='j' && LA12_85<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_101 = input.LA(1);

                        s = -1;
                        if ( (LA12_101=='b') ) {s = 115;}

                        else if ( ((LA12_101>='\u0000' && LA12_101<='a')||(LA12_101>='c' && LA12_101<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_115 = input.LA(1);

                        s = -1;
                        if ( (LA12_115=='u') ) {s = 128;}

                        else if ( ((LA12_115>='\u0000' && LA12_115<='t')||(LA12_115>='v' && LA12_115<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='t') ) {s = 139;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='s')||(LA12_128>='u' && LA12_128<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='e') ) {s = 147;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='d')||(LA12_139>='f' && LA12_139<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_147 = input.LA(1);

                        s = -1;
                        if ( (LA12_147=='N') ) {s = 154;}

                        else if ( ((LA12_147>='\u0000' && LA12_147<='M')||(LA12_147>='O' && LA12_147<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_154 = input.LA(1);

                        s = -1;
                        if ( (LA12_154=='a') ) {s = 159;}

                        else if ( ((LA12_154>='\u0000' && LA12_154<='`')||(LA12_154>='b' && LA12_154<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_159 = input.LA(1);

                        s = -1;
                        if ( (LA12_159=='m') ) {s = 161;}

                        else if ( ((LA12_159>='\u0000' && LA12_159<='l')||(LA12_159>='n' && LA12_159<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_161 = input.LA(1);

                        s = -1;
                        if ( (LA12_161=='e') ) {s = 163;}

                        else if ( ((LA12_161>='\u0000' && LA12_161<='d')||(LA12_161>='f' && LA12_161<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_163 = input.LA(1);

                        s = -1;
                        if ( (LA12_163=='s') ) {s = 164;}

                        else if ( ((LA12_163>='\u0000' && LA12_163<='r')||(LA12_163>='t' && LA12_163<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_164 = input.LA(1);

                        s = -1;
                        if ( (LA12_164=='\'') ) {s = 165;}

                        else if ( ((LA12_164>='\u0000' && LA12_164<='&')||(LA12_164>='(' && LA12_164<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='r') ) {s = 49;}

                        else if ( (LA12_24=='s') ) {s = 50;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='q')||(LA12_24>='t' && LA12_24<='\uFFFF')) ) {s = 28;}

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