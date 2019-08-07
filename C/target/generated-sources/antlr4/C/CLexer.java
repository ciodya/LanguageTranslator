// Generated from C.g4 by ANTLR 4.7.2
package C;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Bool=3, Char=4, Else=5, If=6, Int=7, Return=8, While=9, 
		Void=10, Equal=11, NotEqual=12, Less=13, Greater=14, Plus=15, Minus=16, 
		Star=17, Div=18, Assign=19, LeftParen=20, RightParen=21, LeftBrace=22, 
		RightBrace=23, Semi=24, Identifier=25, DigitSequence=26, CharValue=27, 
		Whitespace=28, Newline=29, BlockComment=30, LineComment=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Bool", "Char", "Else", "If", "Int", "Return", "While", 
			"Void", "Equal", "NotEqual", "Less", "Greater", "Plus", "Minus", "Star", 
			"Div", "Assign", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"Semi", "Identifier", "DigitSequence", "CharValue", "Nondigit", "Digit", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'''", "'_Bool'", "'char'", "'else'", "'if'", "'int'", "'return'", 
			"'while'", "'void'", "'=='", "'!='", "'<'", "'>'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Bool", "Char", "Else", "If", "Int", "Return", "While", 
			"Void", "Equal", "NotEqual", "Less", "Greater", "Plus", "Minus", "Star", 
			"Div", "Assign", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"Semi", "Identifier", "DigitSequence", "CharValue", "Whitespace", "Newline", 
			"BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\32\7\32\u0094\n\32\f\32\16\32\u0097\13\32\3\33\6\33\u009a\n\33\r"+
		"\33\16\33\u009b\3\34\3\34\5\34\u00a0\n\34\3\35\3\35\3\36\3\36\3\37\6\37"+
		"\u00a7\n\37\r\37\16\37\u00a8\3\37\3\37\3 \3 \5 \u00af\n \3 \5 \u00b2\n"+
		" \3 \3 \3!\3!\3!\3!\7!\u00ba\n!\f!\16!\u00bd\13!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\7\"\u00c8\n\"\f\"\16\"\u00cb\13\"\3\"\3\"\3\u00bb\2#\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\36?\37"+
		"A C!\3\2\6\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\2\u00d4\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tO\3\2\2\2\13"+
		"T\3\2\2\2\rY\3\2\2\2\17\\\3\2\2\2\21`\3\2\2\2\23g\3\2\2\2\25m\3\2\2\2"+
		"\27r\3\2\2\2\31u\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2"+
		"#\u0080\3\2\2\2%\u0082\3\2\2\2\'\u0084\3\2\2\2)\u0086\3\2\2\2+\u0088\3"+
		"\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u008e\3\2\2\2\63\u0090\3\2\2\2"+
		"\65\u0099\3\2\2\2\67\u009f\3\2\2\29\u00a1\3\2\2\2;\u00a3\3\2\2\2=\u00a6"+
		"\3\2\2\2?\u00b1\3\2\2\2A\u00b5\3\2\2\2C\u00c3\3\2\2\2EF\7.\2\2F\4\3\2"+
		"\2\2GH\7)\2\2H\6\3\2\2\2IJ\7a\2\2JK\7D\2\2KL\7q\2\2LM\7q\2\2MN\7n\2\2"+
		"N\b\3\2\2\2OP\7e\2\2PQ\7j\2\2QR\7c\2\2RS\7t\2\2S\n\3\2\2\2TU\7g\2\2UV"+
		"\7n\2\2VW\7u\2\2WX\7g\2\2X\f\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\16\3\2\2\2\\]"+
		"\7k\2\2]^\7p\2\2^_\7v\2\2_\20\3\2\2\2`a\7t\2\2ab\7g\2\2bc\7v\2\2cd\7w"+
		"\2\2de\7t\2\2ef\7p\2\2f\22\3\2\2\2gh\7y\2\2hi\7j\2\2ij\7k\2\2jk\7n\2\2"+
		"kl\7g\2\2l\24\3\2\2\2mn\7x\2\2no\7q\2\2op\7k\2\2pq\7f\2\2q\26\3\2\2\2"+
		"rs\7?\2\2st\7?\2\2t\30\3\2\2\2uv\7#\2\2vw\7?\2\2w\32\3\2\2\2xy\7>\2\2"+
		"y\34\3\2\2\2z{\7@\2\2{\36\3\2\2\2|}\7-\2\2} \3\2\2\2~\177\7/\2\2\177\""+
		"\3\2\2\2\u0080\u0081\7,\2\2\u0081$\3\2\2\2\u0082\u0083\7\61\2\2\u0083"+
		"&\3\2\2\2\u0084\u0085\7?\2\2\u0085(\3\2\2\2\u0086\u0087\7*\2\2\u0087*"+
		"\3\2\2\2\u0088\u0089\7+\2\2\u0089,\3\2\2\2\u008a\u008b\7}\2\2\u008b.\3"+
		"\2\2\2\u008c\u008d\7\177\2\2\u008d\60\3\2\2\2\u008e\u008f\7=\2\2\u008f"+
		"\62\3\2\2\2\u0090\u0095\59\35\2\u0091\u0094\59\35\2\u0092\u0094\5;\36"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\64\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009a\5;\36\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\66\3\2\2\2\u009d\u00a0\59\35\2\u009e\u00a0"+
		"\5;\36\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a08\3\2\2\2\u00a1"+
		"\u00a2\t\2\2\2\u00a2:\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4<\3\2\2\2\u00a5"+
		"\u00a7\t\4\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\37\2\2\u00ab"+
		">\3\2\2\2\u00ac\u00ae\7\17\2\2\u00ad\u00af\7\f\2\2\u00ae\u00ad\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\7\f\2\2\u00b1\u00ac"+
		"\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b \2\2\u00b4"+
		"@\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\7,\2\2\u00b7\u00bb\3\2\2\2"+
		"\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7,\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b!"+
		"\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c9"+
		"\3\2\2\2\u00c6\u00c8\n\5\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\b\"\2\2\u00cdD\3\2\2\2\f\2\u0093\u0095\u009b\u009f\u00a8"+
		"\u00ae\u00b1\u00bb\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}