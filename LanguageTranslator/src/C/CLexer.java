// Generated from C.g4 by ANTLR 4.7.2
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
		Star=17, Div=18, Mol=19, Assign=20, LeftParen=21, RightParen=22, LeftBrace=23, 
		RightBrace=24, Semi=25, Comma=26, Double_quo=27, Dot=28, EXCLA=29, QUES=30, 
		BACKSLASH=31, Identifier=32, DigitSequence=33, CharValue=34, CharArray=35, 
		Punc=36, Oprator=37, Whitespace=38, Newline=39, BlockComment=40, LineComment=41;
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
			"Div", "Mol", "Assign", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"Semi", "Comma", "Double_quo", "Dot", "EXCLA", "QUES", "BACKSLASH", "Identifier", 
			"DigitSequence", "CharValue", "CharArray", "Punc", "Oprator", "Nondigit", 
			"Digit", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'_Bool'", "'char'", "'else'", "'if'", "'int'", "'return'", 
			"'while'", "'void'", "'=='", "'!='", "'<'", "'>'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "'('", "')'", "'{'", "'}'", "';'", "','", "'\"'", 
			"'.'", "'!'", "'?'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Bool", "Char", "Else", "If", "Int", "Return", "While", 
			"Void", "Equal", "NotEqual", "Less", "Greater", "Plus", "Minus", "Star", 
			"Div", "Mol", "Assign", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"Semi", "Comma", "Double_quo", "Dot", "EXCLA", "QUES", "BACKSLASH", "Identifier", 
			"DigitSequence", "CharValue", "CharArray", "Punc", "Oprator", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\7!\u00b6"+
		"\n!\f!\16!\u00b9\13!\3\"\6\"\u00bc\n\"\r\"\16\"\u00bd\3#\3#\3#\5#\u00c3"+
		"\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\7$\u00ce\n$\f$\16$\u00d1\13$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00df\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00ea"+
		"\n&\3\'\3\'\3(\3(\3)\6)\u00f1\n)\r)\16)\u00f2\3)\3)\3*\3*\5*\u00f9\n*"+
		"\3*\5*\u00fc\n*\3*\3*\3+\3+\3+\3+\7+\u0104\n+\f+\16+\u0107\13+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\7,\u0112\n,\f,\16,\u0115\13,\3,\3,\3\u0105\2-\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M\2O\2Q(S)U*W+\3\2\6\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\tc\3\2\2\2\13h\3"+
		"\2\2\2\rm\3\2\2\2\17p\3\2\2\2\21t\3\2\2\2\23{\3\2\2\2\25\u0081\3\2\2\2"+
		"\27\u0086\3\2\2\2\31\u0089\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37"+
		"\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3"+
		"\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61"+
		"\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00a8\3\2\2\29\u00aa"+
		"\3\2\2\2;\u00ac\3\2\2\2=\u00ae\3\2\2\2?\u00b0\3\2\2\2A\u00b2\3\2\2\2C"+
		"\u00bb\3\2\2\2E\u00bf\3\2\2\2G\u00c6\3\2\2\2I\u00de\3\2\2\2K\u00e9\3\2"+
		"\2\2M\u00eb\3\2\2\2O\u00ed\3\2\2\2Q\u00f0\3\2\2\2S\u00fb\3\2\2\2U\u00ff"+
		"\3\2\2\2W\u010d\3\2\2\2YZ\7]\2\2Z\4\3\2\2\2[\\\7_\2\2\\\6\3\2\2\2]^\7"+
		"a\2\2^_\7D\2\2_`\7q\2\2`a\7q\2\2ab\7n\2\2b\b\3\2\2\2cd\7e\2\2de\7j\2\2"+
		"ef\7c\2\2fg\7t\2\2g\n\3\2\2\2hi\7g\2\2ij\7n\2\2jk\7u\2\2kl\7g\2\2l\f\3"+
		"\2\2\2mn\7k\2\2no\7h\2\2o\16\3\2\2\2pq\7k\2\2qr\7p\2\2rs\7v\2\2s\20\3"+
		"\2\2\2tu\7t\2\2uv\7g\2\2vw\7v\2\2wx\7w\2\2xy\7t\2\2yz\7p\2\2z\22\3\2\2"+
		"\2{|\7y\2\2|}\7j\2\2}~\7k\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\24\3"+
		"\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7q\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7f\2\2\u0085\26\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088\7?\2\2\u0088"+
		"\30\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\7?\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008d\7>\2\2\u008d\34\3\2\2\2\u008e\u008f\7@\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7-\2\2\u0091 \3\2\2\2\u0092\u0093\7/\2\2\u0093\"\3\2\2\2\u0094"+
		"\u0095\7,\2\2\u0095$\3\2\2\2\u0096\u0097\7\61\2\2\u0097&\3\2\2\2\u0098"+
		"\u0099\7\'\2\2\u0099(\3\2\2\2\u009a\u009b\7?\2\2\u009b*\3\2\2\2\u009c"+
		"\u009d\7*\2\2\u009d,\3\2\2\2\u009e\u009f\7+\2\2\u009f.\3\2\2\2\u00a0\u00a1"+
		"\7}\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3\62\3\2\2\2\u00a4"+
		"\u00a5\7=\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7.\2\2\u00a7\66\3\2\2\2\u00a8"+
		"\u00a9\7$\2\2\u00a98\3\2\2\2\u00aa\u00ab\7\60\2\2\u00ab:\3\2\2\2\u00ac"+
		"\u00ad\7#\2\2\u00ad<\3\2\2\2\u00ae\u00af\7A\2\2\u00af>\3\2\2\2\u00b0\u00b1"+
		"\7^\2\2\u00b1@\3\2\2\2\u00b2\u00b7\5M\'\2\u00b3\u00b6\5M\'\2\u00b4\u00b6"+
		"\5O(\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8B\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00bc\5O(\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00beD\3\2\2\2\u00bf\u00c2\7)\2\2\u00c0\u00c3"+
		"\5M\'\2\u00c1\u00c3\5O(\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\7)\2\2\u00c5F\3\2\2\2\u00c6\u00cf\5\67\34\2"+
		"\u00c7\u00ce\5M\'\2\u00c8\u00ce\5O(\2\u00c9\u00ce\5I%\2\u00ca\u00ce\5"+
		"K&\2\u00cb\u00ce\5Q)\2\u00cc\u00ce\5S*\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8"+
		"\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5\67\34\2\u00d3"+
		"H\3\2\2\2\u00d4\u00df\5\65\33\2\u00d5\u00df\59\35\2\u00d6\u00df\5\63\32"+
		"\2\u00d7\u00df\5+\26\2\u00d8\u00df\5-\27\2\u00d9\u00df\5/\30\2\u00da\u00df"+
		"\5\61\31\2\u00db\u00df\5;\36\2\u00dc\u00df\5=\37\2\u00dd\u00df\5? \2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d7\3\2"+
		"\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00dfJ\3\2\2\2"+
		"\u00e0\u00ea\5)\25\2\u00e1\u00ea\5\27\f\2\u00e2\u00ea\5\31\r\2\u00e3\u00ea"+
		"\5\33\16\2\u00e4\u00ea\5\35\17\2\u00e5\u00ea\5\37\20\2\u00e6\u00ea\5!"+
		"\21\2\u00e7\u00ea\5#\22\2\u00e8\u00ea\5%\23\2\u00e9\u00e0\3\2\2\2\u00e9"+
		"\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2"+
		"\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00eaL\3\2\2\2\u00eb\u00ec\t\2\2\2\u00ecN\3\2\2\2\u00ed"+
		"\u00ee\t\3\2\2\u00eeP\3\2\2\2\u00ef\u00f1\t\4\2\2\u00f0\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\b)\2\2\u00f5R\3\2\2\2\u00f6\u00f8\7\17\2\2\u00f7"+
		"\u00f9\7\f\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00fc\7\f\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\b*\2\2\u00feT\3\2\2\2\u00ff\u0100\7\61\2\2"+
		"\u0100\u0101\7,\2\2\u0101\u0105\3\2\2\2\u0102\u0104\13\2\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7,\2\2\u0109\u010a\7\61"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b+\2\2\u010cV\3\2\2\2\u010d\u010e"+
		"\7\61\2\2\u010e\u010f\7\61\2\2\u010f\u0113\3\2\2\2\u0110\u0112\n\5\2\2"+
		"\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\b,\2\2\u0117"+
		"X\3\2\2\2\20\2\u00b5\u00b7\u00bd\u00c2\u00cd\u00cf\u00de\u00e9\u00f2\u00f8"+
		"\u00fb\u0105\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}