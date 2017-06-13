package nl.tno.torxakis.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTorXakisDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_SMALLID=5;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_OPERATOR=8;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_CAPSID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalTorXakisDslLexer() {;} 
    public InternalTorXakisDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTorXakisDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTorXakisDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:11:7: ( 'TYPEDEF' )
            // InternalTorXakisDsl.g:11:9: 'TYPEDEF'
            {
            match("TYPEDEF"); 


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
            // InternalTorXakisDsl.g:12:7: ( ';' )
            // InternalTorXakisDsl.g:12:9: ';'
            {
            match(';'); 

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
            // InternalTorXakisDsl.g:13:7: ( 'ENDDEF' )
            // InternalTorXakisDsl.g:13:9: 'ENDDEF'
            {
            match("ENDDEF"); 


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
            // InternalTorXakisDsl.g:14:7: ( '::=' )
            // InternalTorXakisDsl.g:14:9: '::='
            {
            match("::="); 


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
            // InternalTorXakisDsl.g:15:7: ( 'FUNCDEF' )
            // InternalTorXakisDsl.g:15:9: 'FUNCDEF'
            {
            match("FUNCDEF"); 


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
            // InternalTorXakisDsl.g:16:7: ( '(' )
            // InternalTorXakisDsl.g:16:9: '('
            {
            match('('); 

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
            // InternalTorXakisDsl.g:17:7: ( ')' )
            // InternalTorXakisDsl.g:17:9: ')'
            {
            match(')'); 

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
            // InternalTorXakisDsl.g:18:7: ( '::' )
            // InternalTorXakisDsl.g:18:9: '::'
            {
            match("::"); 


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
            // InternalTorXakisDsl.g:19:7: ( 'CONSTDEF' )
            // InternalTorXakisDsl.g:19:9: 'CONSTDEF'
            {
            match("CONSTDEF"); 


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
            // InternalTorXakisDsl.g:20:7: ( 'PROCDEF' )
            // InternalTorXakisDsl.g:20:9: 'PROCDEF'
            {
            match("PROCDEF"); 


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
            // InternalTorXakisDsl.g:21:7: ( '[' )
            // InternalTorXakisDsl.g:21:9: '['
            {
            match('['); 

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
            // InternalTorXakisDsl.g:22:7: ( ']' )
            // InternalTorXakisDsl.g:22:9: ']'
            {
            match(']'); 

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
            // InternalTorXakisDsl.g:23:7: ( 'STAUTDEF' )
            // InternalTorXakisDsl.g:23:9: 'STAUTDEF'
            {
            match("STAUTDEF"); 


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
            // InternalTorXakisDsl.g:24:7: ( 'CHANDEF' )
            // InternalTorXakisDsl.g:24:9: 'CHANDEF'
            {
            match("CHANDEF"); 


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
            // InternalTorXakisDsl.g:25:7: ( 'MODELDEF' )
            // InternalTorXakisDsl.g:25:9: 'MODELDEF'
            {
            match("MODELDEF"); 


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
            // InternalTorXakisDsl.g:26:7: ( 'CHAN' )
            // InternalTorXakisDsl.g:26:9: 'CHAN'
            {
            match("CHAN"); 


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
            // InternalTorXakisDsl.g:27:7: ( 'IN' )
            // InternalTorXakisDsl.g:27:9: 'IN'
            {
            match("IN"); 


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
            // InternalTorXakisDsl.g:28:7: ( 'OUT' )
            // InternalTorXakisDsl.g:28:9: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:29:7: ( 'BEHAVIOUR' )
            // InternalTorXakisDsl.g:29:9: 'BEHAVIOUR'
            {
            match("BEHAVIOUR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:30:7: ( 'MAPPERDEF' )
            // InternalTorXakisDsl.g:30:9: 'MAPPERDEF'
            {
            match("MAPPERDEF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:31:7: ( 'CNECTDEF' )
            // InternalTorXakisDsl.g:31:9: 'CNECTDEF'
            {
            match("CNECTDEF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:32:7: ( 'CLIENTSOCK' )
            // InternalTorXakisDsl.g:32:9: 'CLIENTSOCK'
            {
            match("CLIENTSOCK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:33:7: ( 'SERVERSOCK' )
            // InternalTorXakisDsl.g:33:9: 'SERVERSOCK'
            {
            match("SERVERSOCK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:34:7: ( 'STATE' )
            // InternalTorXakisDsl.g:34:9: 'STATE'
            {
            match("STATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:35:7: ( 'VAR' )
            // InternalTorXakisDsl.g:35:9: 'VAR'
            {
            match("VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:36:7: ( 'INIT' )
            // InternalTorXakisDsl.g:36:9: 'INIT'
            {
            match("INIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:37:7: ( 'TRANS' )
            // InternalTorXakisDsl.g:37:9: 'TRANS'
            {
            match("TRANS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:38:7: ( '->' )
            // InternalTorXakisDsl.g:38:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:39:7: ( '{' )
            // InternalTorXakisDsl.g:39:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:40:7: ( '}' )
            // InternalTorXakisDsl.g:40:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:41:7: ( ':=' )
            // InternalTorXakisDsl.g:41:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:42:7: ( '|' )
            // InternalTorXakisDsl.g:42:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:43:7: ( ',' )
            // InternalTorXakisDsl.g:43:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:44:7: ( 'EXIT' )
            // InternalTorXakisDsl.g:44:9: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:45:7: ( 'HOST' )
            // InternalTorXakisDsl.g:45:9: 'HOST'
            {
            match("HOST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:46:7: ( 'PORT' )
            // InternalTorXakisDsl.g:46:9: 'PORT'
            {
            match("PORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:47:7: ( 'ENCODE' )
            // InternalTorXakisDsl.g:47:9: 'ENCODE'
            {
            match("ENCODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:48:7: ( 'DECODE' )
            // InternalTorXakisDsl.g:48:9: 'DECODE'
            {
            match("DECODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:49:7: ( '<-' )
            // InternalTorXakisDsl.g:49:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:50:7: ( '#' )
            // InternalTorXakisDsl.g:50:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:51:7: ( '>>>' )
            // InternalTorXakisDsl.g:51:9: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:52:7: ( 'ACCEPT' )
            // InternalTorXakisDsl.g:52:9: 'ACCEPT'
            {
            match("ACCEPT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:53:7: ( '?' )
            // InternalTorXakisDsl.g:53:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:54:7: ( '!' )
            // InternalTorXakisDsl.g:54:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:55:7: ( 'NI' )
            // InternalTorXakisDsl.g:55:9: 'NI'
            {
            match("NI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:56:7: ( '[>>' )
            // InternalTorXakisDsl.g:56:9: '[>>'
            {
            match("[>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:57:7: ( '[><' )
            // InternalTorXakisDsl.g:57:9: '[><'
            {
            match("[><"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:58:7: ( '||' )
            // InternalTorXakisDsl.g:58:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:59:7: ( '|||' )
            // InternalTorXakisDsl.g:59:9: '|||'
            {
            match("|||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:60:7: ( '##' )
            // InternalTorXakisDsl.g:60:9: '##'
            {
            match("##"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:61:7: ( 'HIDE' )
            // InternalTorXakisDsl.g:61:9: 'HIDE'
            {
            match("HIDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:62:7: ( 'LET' )
            // InternalTorXakisDsl.g:62:9: 'LET'
            {
            match("LET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:63:7: ( '>->' )
            // InternalTorXakisDsl.g:63:9: '>->'
            {
            match(">->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:64:7: ( '=>>' )
            // InternalTorXakisDsl.g:64:9: '=>>'
            {
            match("=>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:65:7: ( 'STOP' )
            // InternalTorXakisDsl.g:65:9: 'STOP'
            {
            match("STOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:66:7: ( '|[' )
            // InternalTorXakisDsl.g:66:9: '|['
            {
            match("|["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:67:7: ( ']|' )
            // InternalTorXakisDsl.g:67:9: ']|'
            {
            match("]|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:68:7: ( '[[' )
            // InternalTorXakisDsl.g:68:9: '[['
            {
            match("[["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:69:7: ( ']]' )
            // InternalTorXakisDsl.g:69:9: ']]'
            {
            match("]]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:70:7: ( '=' )
            // InternalTorXakisDsl.g:70:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:71:7: ( 'ERROR' )
            // InternalTorXakisDsl.g:71:9: 'ERROR'
            {
            match("ERROR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:72:7: ( 'IF' )
            // InternalTorXakisDsl.g:72:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:73:7: ( 'THEN' )
            // InternalTorXakisDsl.g:73:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:74:7: ( 'ELSE' )
            // InternalTorXakisDsl.g:74:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:75:7: ( 'FI' )
            // InternalTorXakisDsl.g:75:9: 'FI'
            {
            match("FI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:76:7: ( 'REGEX' )
            // InternalTorXakisDsl.g:76:9: 'REGEX'
            {
            match("REGEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:6633:15: ( ( '=' | '+' | '-' | '*' | '^' | '/' | '\\\\' | '<' | '>' | '@' | '|' | '&' | '%' )+ )
            // InternalTorXakisDsl.g:6633:17: ( '=' | '+' | '-' | '*' | '^' | '/' | '\\\\' | '<' | '>' | '@' | '|' | '&' | '%' )+
            {
            // InternalTorXakisDsl.g:6633:17: ( '=' | '+' | '-' | '*' | '^' | '/' | '\\\\' | '<' | '>' | '@' | '|' | '&' | '%' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='%' && LA1_0<='&')||(LA1_0>='*' && LA1_0<='+')||LA1_0=='-'||LA1_0=='/'||(LA1_0>='<' && LA1_0<='>')||LA1_0=='@'||LA1_0=='\\'||LA1_0=='^'||LA1_0=='|') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTorXakisDsl.g:
            	    {
            	    if ( (input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='<' && input.LA(1)<='>')||input.LA(1)=='@'||input.LA(1)=='\\'||input.LA(1)=='^'||input.LA(1)=='|' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_CAPSID"
    public final void mRULE_CAPSID() throws RecognitionException {
        try {
            int _type = RULE_CAPSID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:6635:13: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // InternalTorXakisDsl.g:6635:15: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            matchRange('A','Z'); 
            // InternalTorXakisDsl.g:6635:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTorXakisDsl.g:
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
    // $ANTLR end "RULE_CAPSID"

    // $ANTLR start "RULE_SMALLID"
    public final void mRULE_SMALLID() throws RecognitionException {
        try {
            int _type = RULE_SMALLID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:6637:14: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // InternalTorXakisDsl.g:6637:16: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            matchRange('a','z'); 
            // InternalTorXakisDsl.g:6637:25: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTorXakisDsl.g:
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SMALLID"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:6639:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTorXakisDsl.g:6639:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalTorXakisDsl.g:6639:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTorXakisDsl.g:6639:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalTorXakisDsl.g:6639:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTorXakisDsl.g:6639:41: ( '\\r' )? '\\n'
                    {
                    // InternalTorXakisDsl.g:6639:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalTorXakisDsl.g:6639:41: '\\r'
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:6641:17: ( '{-' ( options {greedy=false; } : . )* '-}' )
            // InternalTorXakisDsl.g:6641:19: '{-' ( options {greedy=false; } : . )* '-}'
            {
            match("{-"); 

            // InternalTorXakisDsl.g:6641:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='}') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='|')||(LA7_1>='~' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=',')||(LA7_0>='.' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTorXakisDsl.g:6641:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("-}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:6643:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTorXakisDsl.g:6643:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTorXakisDsl.g:6643:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTorXakisDsl.g:6643:11: '^'
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

            // InternalTorXakisDsl.g:6643:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTorXakisDsl.g:
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
            	    break loop9;
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
            // InternalTorXakisDsl.g:6645:10: ( ( '0' .. '9' )+ )
            // InternalTorXakisDsl.g:6645:12: ( '0' .. '9' )+
            {
            // InternalTorXakisDsl.g:6645:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTorXakisDsl.g:6645:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalTorXakisDsl.g:6647:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTorXakisDsl.g:6647:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTorXakisDsl.g:6647:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTorXakisDsl.g:6647:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTorXakisDsl.g:6647:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalTorXakisDsl.g:6647:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTorXakisDsl.g:6647:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTorXakisDsl.g:6647:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTorXakisDsl.g:6647:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalTorXakisDsl.g:6647:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTorXakisDsl.g:6647:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTorXakisDsl.g:6649:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTorXakisDsl.g:6649:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTorXakisDsl.g:6649:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTorXakisDsl.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalTorXakisDsl.g:6651:16: ( . )
            // InternalTorXakisDsl.g:6651:18: .
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
        // InternalTorXakisDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_OPERATOR | RULE_CAPSID | RULE_SMALLID | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt15=76;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalTorXakisDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalTorXakisDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalTorXakisDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalTorXakisDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalTorXakisDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalTorXakisDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalTorXakisDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalTorXakisDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalTorXakisDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalTorXakisDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalTorXakisDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalTorXakisDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalTorXakisDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalTorXakisDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalTorXakisDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalTorXakisDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalTorXakisDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalTorXakisDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalTorXakisDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalTorXakisDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalTorXakisDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalTorXakisDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalTorXakisDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalTorXakisDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalTorXakisDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalTorXakisDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalTorXakisDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalTorXakisDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalTorXakisDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalTorXakisDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalTorXakisDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalTorXakisDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalTorXakisDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalTorXakisDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalTorXakisDsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalTorXakisDsl.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalTorXakisDsl.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalTorXakisDsl.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalTorXakisDsl.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalTorXakisDsl.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalTorXakisDsl.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalTorXakisDsl.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalTorXakisDsl.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalTorXakisDsl.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalTorXakisDsl.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalTorXakisDsl.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalTorXakisDsl.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalTorXakisDsl.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalTorXakisDsl.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalTorXakisDsl.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalTorXakisDsl.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalTorXakisDsl.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalTorXakisDsl.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalTorXakisDsl.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalTorXakisDsl.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalTorXakisDsl.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalTorXakisDsl.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalTorXakisDsl.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalTorXakisDsl.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalTorXakisDsl.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalTorXakisDsl.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalTorXakisDsl.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalTorXakisDsl.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalTorXakisDsl.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalTorXakisDsl.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalTorXakisDsl.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalTorXakisDsl.g:1:406: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 68 :
                // InternalTorXakisDsl.g:1:420: RULE_CAPSID
                {
                mRULE_CAPSID(); 

                }
                break;
            case 69 :
                // InternalTorXakisDsl.g:1:432: RULE_SMALLID
                {
                mRULE_SMALLID(); 

                }
                break;
            case 70 :
                // InternalTorXakisDsl.g:1:445: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 71 :
                // InternalTorXakisDsl.g:1:461: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // InternalTorXakisDsl.g:1:477: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // InternalTorXakisDsl.g:1:485: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // InternalTorXakisDsl.g:1:494: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // InternalTorXakisDsl.g:1:506: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // InternalTorXakisDsl.g:1:514: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\61\1\uffff\1\61\1\54\1\61\2\uffff\2\61\1\105\1\110\6\61\1\124\1\126\1\uffff\1\132\1\uffff\2\61\1\124\1\141\1\124\1\61\2\uffff\2\61\1\152\1\61\1\124\1\61\1\156\3\uffff\2\54\2\uffff\4\61\2\uffff\4\61\1\173\1\uffff\1\61\1\175\2\uffff\6\61\6\uffff\4\61\1\u008c\1\u008d\3\61\1\u0091\1\124\4\uffff\1\u0095\3\uffff\3\61\1\u0099\2\uffff\2\124\1\61\2\uffff\1\u009d\1\61\1\124\1\uffff\1\61\1\uffff\1\156\4\uffff\10\61\2\uffff\1\61\1\uffff\6\61\2\uffff\6\61\2\uffff\1\u00b7\1\61\1\u00b9\1\uffff\1\124\1\uffff\1\u00ba\1\uffff\3\61\1\uffff\1\u00be\1\u00bf\1\61\1\uffff\1\u00c1\1\u00c2\3\61\1\u00c6\2\61\1\u00c9\1\61\1\u00cb\2\61\1\u00cf\3\61\1\u00d3\2\61\1\u00d6\3\61\1\u00da\1\uffff\1\61\2\uffff\1\u00dc\1\u00dd\1\61\2\uffff\1\61\2\uffff\2\61\1\u00e2\1\uffff\2\61\1\uffff\1\u00e5\1\uffff\3\61\1\uffff\3\61\1\uffff\1\61\1\u00ed\1\uffff\3\61\1\uffff\1\61\2\uffff\2\61\1\u00f4\1\61\1\uffff\1\u00f6\1\u00f7\1\uffff\7\61\1\uffff\4\61\1\u0103\1\u0104\1\uffff\1\u0105\2\uffff\1\u0106\1\61\1\u0108\2\61\1\u010b\5\61\4\uffff\1\u0111\1\uffff\1\u0112\1\61\1\uffff\1\u0114\1\61\1\u0116\2\61\2\uffff\1\61\1\uffff\1\61\1\uffff\1\u011b\1\u011c\1\u011d\1\u011e\4\uffff";
    static final String DFA15_eofS =
        "\u011f\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\1\uffff\1\60\1\72\1\60\2\uffff\2\60\1\76\1\135\6\60\2\55\1\uffff\1\45\1\uffff\2\60\1\55\1\43\1\55\1\60\2\uffff\2\60\1\45\1\60\1\101\2\60\3\uffff\2\0\2\uffff\4\60\2\uffff\4\60\1\75\1\uffff\2\60\2\uffff\6\60\1\74\5\uffff\11\60\1\45\1\0\4\uffff\1\45\3\uffff\3\60\1\45\2\uffff\2\76\1\60\2\uffff\2\60\1\76\1\uffff\1\60\1\uffff\1\60\4\uffff\10\60\2\uffff\1\60\1\uffff\6\60\2\uffff\6\60\2\uffff\3\60\1\uffff\1\0\1\uffff\1\45\1\uffff\3\60\1\uffff\2\45\1\60\1\uffff\1\60\1\45\27\60\1\uffff\1\60\2\uffff\3\60\2\uffff\1\60\2\uffff\3\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\3\60\1\uffff\2\60\1\uffff\3\60\1\uffff\1\60\2\uffff\4\60\1\uffff\2\60\1\uffff\7\60\1\uffff\6\60\1\uffff\1\60\2\uffff\13\60\4\uffff\1\60\1\uffff\2\60\1\uffff\5\60\2\uffff\1\60\1\uffff\1\60\1\uffff\4\60\4\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\1\uffff\1\172\1\75\1\172\2\uffff\2\172\1\133\1\174\6\172\1\76\1\55\1\uffff\1\174\1\uffff\2\172\1\55\1\43\1\76\1\172\2\uffff\2\172\1\174\4\172\3\uffff\2\uffff\2\uffff\4\172\2\uffff\4\172\1\75\1\uffff\2\172\2\uffff\6\172\1\76\5\uffff\11\172\1\174\1\uffff\4\uffff\1\174\3\uffff\3\172\1\174\2\uffff\2\76\1\172\2\uffff\2\172\1\76\1\uffff\1\172\1\uffff\1\172\4\uffff\10\172\2\uffff\1\172\1\uffff\6\172\2\uffff\6\172\2\uffff\3\172\1\uffff\1\uffff\1\uffff\1\174\1\uffff\3\172\1\uffff\2\174\1\172\1\uffff\1\172\1\174\27\172\1\uffff\1\172\2\uffff\3\172\2\uffff\1\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1\uffff\3\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\2\uffff\4\172\1\uffff\2\172\1\uffff\7\172\1\uffff\6\172\1\uffff\1\172\2\uffff\13\172\4\uffff\1\172\1\uffff\2\172\1\uffff\5\172\2\uffff\1\172\1\uffff\1\172\1\uffff\4\172\4\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\14\uffff\1\36\1\uffff\1\41\6\uffff\1\53\1\54\7\uffff\1\103\1\110\1\111\2\uffff\1\113\1\114\4\uffff\1\104\1\2\5\uffff\1\37\2\uffff\1\6\1\7\7\uffff\1\72\1\13\1\71\1\73\1\14\13\uffff\1\103\1\107\1\35\1\36\1\uffff\1\70\1\40\1\41\4\uffff\1\62\1\50\3\uffff\1\53\1\54\3\uffff\1\74\1\uffff\1\110\1\uffff\1\105\1\111\1\112\1\113\10\uffff\1\4\1\10\1\uffff\1\101\6\uffff\1\56\1\57\6\uffff\1\21\1\76\3\uffff\1\34\1\uffff\1\106\1\uffff\1\60\3\uffff\1\47\3\uffff\1\55\31\uffff\1\22\1\uffff\1\31\1\61\3\uffff\1\51\1\65\1\uffff\1\64\1\66\3\uffff\1\77\2\uffff\1\42\1\uffff\1\100\3\uffff\1\20\3\uffff\1\44\2\uffff\1\67\3\uffff\1\32\1\uffff\1\43\1\63\4\uffff\1\33\2\uffff\1\75\7\uffff\1\30\6\uffff\1\102\1\uffff\1\3\1\45\13\uffff\1\46\1\52\1\1\1\5\1\uffff\1\16\2\uffff\1\12\5\uffff\1\11\1\25\1\uffff\1\15\1\uffff\1\17\4\uffff\1\24\1\23\1\26\1\27";
    static final String DFA15_specialS =
        "\1\2\50\uffff\1\4\1\1\50\uffff\1\3\76\uffff\1\0\u008c\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\36\1\51\1\32\1\54\2\46\1\52\1\6\1\7\2\46\1\26\1\22\1\54\1\46\12\50\1\4\1\2\1\31\1\41\1\33\1\35\1\46\1\34\1\20\1\10\1\30\1\3\1\5\1\44\1\27\1\16\2\44\1\40\1\15\1\37\1\17\1\11\1\44\1\42\1\14\1\1\1\44\1\21\4\44\1\12\1\46\1\13\1\43\1\47\1\54\32\45\1\23\1\25\1\24\uff82\54",
            "\12\60\7\uffff\7\60\1\57\11\60\1\56\6\60\1\55\1\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\13\60\1\66\1\60\1\63\3\60\1\65\5\60\1\64\2\60\4\uffff\1\60\1\uffff\32\60",
            "\1\67\2\uffff\1\70",
            "\12\60\7\uffff\10\60\1\72\13\60\1\71\5\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\7\60\1\76\3\60\1\100\1\60\1\77\1\75\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\102\2\60\1\101\10\60\4\uffff\1\60\1\uffff\32\60",
            "\1\103\34\uffff\1\104",
            "\1\107\36\uffff\1\106",
            "\12\60\7\uffff\4\60\1\112\16\60\1\111\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\1\114\15\60\1\113\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\116\7\60\1\115\14\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\24\60\1\117\5\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\120\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\1\121\31\60\4\uffff\1\60\1\uffff\32\60",
            "\1\123\20\uffff\1\122",
            "\1\125",
            "",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\32\uffff\1\131\1\124\1\uffff\1\124\35\uffff\1\130",
            "",
            "\12\60\7\uffff\10\60\1\135\5\60\1\134\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\136\25\60\4\uffff\1\60\1\uffff\32\60",
            "\1\137",
            "\1\140",
            "\1\143\20\uffff\1\142",
            "\12\60\7\uffff\2\60\1\144\27\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\10\60\1\147\21\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\150\25\60\4\uffff\1\60\1\uffff\32\60",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\2\124\1\151\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\124",
            "\12\60\7\uffff\4\60\1\153\25\60\4\uffff\1\60\1\uffff\32\60",
            "\32\154\4\uffff\1\154\1\uffff\32\154",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\155\7\uffff\32\155\4\uffff\1\155\1\uffff\32\155",
            "",
            "",
            "",
            "\0\160",
            "\0\160",
            "",
            "",
            "\12\60\7\uffff\17\60\1\162\12\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\1\163\31\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\164\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\2\60\1\166\1\165\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\10\60\1\167\21\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\21\60\1\170\10\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\22\60\1\171\7\60\4\uffff\1\60\1\uffff\32\60",
            "\1\172",
            "",
            "\12\60\7\uffff\15\60\1\174\14\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\15\60\1\176\14\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\1\177\31\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u0080\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\10\60\1\u0081\21\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\u0082\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\21\60\1\u0083\10\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0085\1\uffff\1\u0084",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\1\u0086\15\60\1\u0087\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\21\60\1\u0088\10\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u0089\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\17\60\1\u008a\12\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\10\60\1\u008b\21\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u008e\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\7\60\1\u008f\22\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\21\60\1\u0090\10\60\4\uffff\1\60\1\uffff\32\60",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\124",
            "\45\u0093\2\u0092\3\u0093\2\u0092\1\u0093\1\u0092\1\u0093\1\u0092\14\u0093\3\u0092\1\u0093\1\u0092\33\u0093\1\u0092\1\u0093\1\u0092\35\u0093\1\u0092\uff83\u0093",
            "",
            "",
            "",
            "",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\u0094",
            "",
            "",
            "",
            "\12\60\7\uffff\22\60\1\u0096\7\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u0097\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\2\60\1\u0098\27\60\4\uffff\1\60\1\uffff\32\60",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\124",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\12\60\7\uffff\2\60\1\u009c\27\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u009e\6\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u009f",
            "",
            "\12\60\7\uffff\6\60\1\u00a0\23\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\155\7\uffff\32\155\4\uffff\1\155\1\uffff\32\155",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\4\60\1\u00a1\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\15\60\1\u00a2\14\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\15\60\1\u00a3\14\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00a4\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\u00a5\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00a6\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\u00a7\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00a8\25\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\2\60\1\u00a9\27\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\22\60\1\u00aa\7\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\15\60\1\u00ab\14\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\2\60\1\u00ac\27\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00ad\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\2\60\1\u00ae\27\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00af\6\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\23\60\1\u00b1\1\u00b0\5\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\17\60\1\u00b2\12\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\25\60\1\u00b3\4\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00b4\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\17\60\1\u00b5\12\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00b6\6\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\1\u00b8\31\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\45\u0093\2\u0092\3\u0093\2\u0092\1\u0093\1\u0092\1\u0093\1\u0092\14\u0093\3\u0092\1\u0093\1\u0092\33\u0093\1\u0092\1\u0093\1\u0092\35\u0093\1\u0092\uff83\u0093",
            "",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\124",
            "",
            "\12\60\7\uffff\23\60\1\u00bb\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00bc\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\u00bd\13\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\124",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\124",
            "\12\60\7\uffff\4\60\1\u00c0\25\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\2\124\3\uffff\2\124\1\uffff\1\124\1\uffff\1\124\14\uffff\3\124\1\uffff\1\124\33\uffff\1\124\1\uffff\1\124\35\uffff\1\124",
            "\12\60\7\uffff\4\60\1\u00c3\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00c4\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\22\60\1\u00c5\7\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00c7\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00c8\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\21\60\1\u00ca\10\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00cc\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00cd\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00ce\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00d0\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\15\60\1\u00d1\14\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00d2\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00d4\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00d5\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00d7\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\13\60\1\u00d8\16\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00d9\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\25\60\1\u00db\4\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00de\26\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\17\60\1\u00df\12\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\27\60\1\u00e0\2\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00e1\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\5\60\1\u00e3\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00e4\25\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\4\60\1\u00e6\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00e7\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00e8\25\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\3\60\1\u00e9\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00ea\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00eb\25\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\3\60\1\u00ec\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\21\60\1\u00ee\10\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u00ef\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\21\60\1\u00f0\10\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\10\60\1\u00f1\21\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\4\60\1\u00f2\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\23\60\1\u00f3\6\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u00f5\24\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\5\60\1\u00f8\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00f9\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u00fa\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00fb\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\22\60\1\u00fc\7\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u00fd\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u00fe\25\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\22\60\1\u00ff\7\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u0100\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\3\60\1\u0101\26\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\u0102\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u0107\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u0109\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\u010a\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u010c\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\16\60\1\u010d\13\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u010e\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\4\60\1\u010f\25\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\24\60\1\u0110\5\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\2\60\1\u0113\27\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\2\60\1\u0115\27\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\5\60\1\u0117\24\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\21\60\1\u0118\10\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\12\60\1\u0119\17\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\12\60\1\u011a\17\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_OPERATOR | RULE_CAPSID | RULE_SMALLID | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_146 = input.LA(1);

                        s = -1;
                        if ( ((LA15_146>='\u0000' && LA15_146<='$')||(LA15_146>='\'' && LA15_146<=')')||LA15_146==','||LA15_146=='.'||(LA15_146>='0' && LA15_146<=';')||LA15_146=='?'||(LA15_146>='A' && LA15_146<='[')||LA15_146==']'||(LA15_146>='_' && LA15_146<='{')||(LA15_146>='}' && LA15_146<='\uFFFF')) ) {s = 147;}

                        else if ( ((LA15_146>='%' && LA15_146<='&')||(LA15_146>='*' && LA15_146<='+')||LA15_146=='-'||LA15_146=='/'||(LA15_146>='<' && LA15_146<='>')||LA15_146=='@'||LA15_146=='\\'||LA15_146=='^'||LA15_146=='|') ) {s = 146;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_42 = input.LA(1);

                        s = -1;
                        if ( ((LA15_42>='\u0000' && LA15_42<='\uFFFF')) ) {s = 112;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='T') ) {s = 1;}

                        else if ( (LA15_0==';') ) {s = 2;}

                        else if ( (LA15_0=='E') ) {s = 3;}

                        else if ( (LA15_0==':') ) {s = 4;}

                        else if ( (LA15_0=='F') ) {s = 5;}

                        else if ( (LA15_0=='(') ) {s = 6;}

                        else if ( (LA15_0==')') ) {s = 7;}

                        else if ( (LA15_0=='C') ) {s = 8;}

                        else if ( (LA15_0=='P') ) {s = 9;}

                        else if ( (LA15_0=='[') ) {s = 10;}

                        else if ( (LA15_0==']') ) {s = 11;}

                        else if ( (LA15_0=='S') ) {s = 12;}

                        else if ( (LA15_0=='M') ) {s = 13;}

                        else if ( (LA15_0=='I') ) {s = 14;}

                        else if ( (LA15_0=='O') ) {s = 15;}

                        else if ( (LA15_0=='B') ) {s = 16;}

                        else if ( (LA15_0=='V') ) {s = 17;}

                        else if ( (LA15_0=='-') ) {s = 18;}

                        else if ( (LA15_0=='{') ) {s = 19;}

                        else if ( (LA15_0=='}') ) {s = 20;}

                        else if ( (LA15_0=='|') ) {s = 21;}

                        else if ( (LA15_0==',') ) {s = 22;}

                        else if ( (LA15_0=='H') ) {s = 23;}

                        else if ( (LA15_0=='D') ) {s = 24;}

                        else if ( (LA15_0=='<') ) {s = 25;}

                        else if ( (LA15_0=='#') ) {s = 26;}

                        else if ( (LA15_0=='>') ) {s = 27;}

                        else if ( (LA15_0=='A') ) {s = 28;}

                        else if ( (LA15_0=='?') ) {s = 29;}

                        else if ( (LA15_0=='!') ) {s = 30;}

                        else if ( (LA15_0=='N') ) {s = 31;}

                        else if ( (LA15_0=='L') ) {s = 32;}

                        else if ( (LA15_0=='=') ) {s = 33;}

                        else if ( (LA15_0=='R') ) {s = 34;}

                        else if ( (LA15_0=='^') ) {s = 35;}

                        else if ( (LA15_0=='G'||(LA15_0>='J' && LA15_0<='K')||LA15_0=='Q'||LA15_0=='U'||(LA15_0>='W' && LA15_0<='Z')) ) {s = 36;}

                        else if ( ((LA15_0>='a' && LA15_0<='z')) ) {s = 37;}

                        else if ( ((LA15_0>='%' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||LA15_0=='/'||LA15_0=='@'||LA15_0=='\\') ) {s = 38;}

                        else if ( (LA15_0=='_') ) {s = 39;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 40;}

                        else if ( (LA15_0=='\"') ) {s = 41;}

                        else if ( (LA15_0=='\'') ) {s = 42;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 43;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='$'||LA15_0=='.'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_83 = input.LA(1);

                        s = -1;
                        if ( ((LA15_83>='%' && LA15_83<='&')||(LA15_83>='*' && LA15_83<='+')||LA15_83=='-'||LA15_83=='/'||(LA15_83>='<' && LA15_83<='>')||LA15_83=='@'||LA15_83=='\\'||LA15_83=='^'||LA15_83=='|') ) {s = 146;}

                        else if ( ((LA15_83>='\u0000' && LA15_83<='$')||(LA15_83>='\'' && LA15_83<=')')||LA15_83==','||LA15_83=='.'||(LA15_83>='0' && LA15_83<=';')||LA15_83=='?'||(LA15_83>='A' && LA15_83<='[')||LA15_83==']'||(LA15_83>='_' && LA15_83<='{')||(LA15_83>='}' && LA15_83<='\uFFFF')) ) {s = 147;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_41 = input.LA(1);

                        s = -1;
                        if ( ((LA15_41>='\u0000' && LA15_41<='\uFFFF')) ) {s = 112;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}