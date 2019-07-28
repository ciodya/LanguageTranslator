// Generated from python.g4 by ANTLR 4.4
package python;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, DEF=5, RETURN=6, IF=7, ELIF=8, ELSE=9, 
		WHILE=10, NOT=11, TRUE=12, FALSE=13, CLASS=14, ADD=15, MINUS=16, STAR=17, 
		DIV=18, LESS_THAN=19, GREATER_THAN=20, EQUALS=21, NOT_EQ_2=22, ASSIGN=23, 
		COMMA=24, COLON=25, DOT=26, SEMI_COLON=27, OPEN_PAREN=28, CLOSE_PAREN=29, 
		OPEN_BRACK=30, CLOSE_BRACK=31, OPEN_BRACE=32, CLOSE_BRACE=33, SKIP_=34, 
		NAME=35, NUMBER=36, NEWLINE=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "DEF", "RETURN", "IF", "ELIF", "ELSE", 
		"WHILE", "NOT", "TRUE", "FALSE", "CLASS", "ADD", "MINUS", "STAR", "DIV", 
		"LESS_THAN", "GREATER_THAN", "EQUALS", "NOT_EQ_2", "ASSIGN", "COMMA", 
		"COLON", "DOT", "SEMI_COLON", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", 
		"CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "NAME", "NUMBER", 
		"SPACES", "COMMENT", "LINE_JOINING", "ID_START", "ID_CONTINUE", "NON_ZERO_DIGIT", 
		"DIGIT", "NEWLINE"
	};


	  
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  private int opened = 0;
	  private Token lastToken = null;
	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      // Remove any trailing EOF tokens from our buffer.
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }

	      // First emit an extra line break that serves as the end of the statement.
	      this.emit(commonToken(pythonParser.NEWLINE, "\n"));

	      // Now emit as much DEDENT tokens as needed.
	      while (!indents.isEmpty()) {
	        this.emit(createDedent());
	        indents.pop();
	      }

	      // Put the EOF back on the token stream.
	      this.emit(commonToken(pythonParser.EOF, "<EOF>"));
	    }

	    Token next = super.nextToken();

	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      // Keep track of the last token on the default channel.
	      this.lastToken = next;
	    }

	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private Token createDedent() {
	    CommonToken dedent = commonToken(pythonParser.DEDENT, "");
	    dedent.setLine(this.lastToken.getLine());
	    return dedent;
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          // A normal space char.
	          count++;
	      }
	    }

	    return count;
	  }

	  boolean atStartOfInput() {
	    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	  }


	public pythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "python.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27: OPEN_PAREN_action((RuleContext)_localctx, actionIndex); break;
		case 28: CLOSE_PAREN_action((RuleContext)_localctx, actionIndex); break;
		case 29: OPEN_BRACK_action((RuleContext)_localctx, actionIndex); break;
		case 30: CLOSE_BRACK_action((RuleContext)_localctx, actionIndex); break;
		case 31: OPEN_BRACE_action((RuleContext)_localctx, actionIndex); break;
		case 32: CLOSE_BRACE_action((RuleContext)_localctx, actionIndex); break;
		case 43: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: opened++; break;
		}
	}
	private void OPEN_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: opened++; break;
		}
	}
	private void CLOSE_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: opened--; break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: 
		     String newLine = getText().replaceAll("[^\r\n\f]+", "");
		     String spaces = getText().replaceAll("[\r\n\f]+", "");
		     int next = _input.LA(1);
		     if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == '#') {
		       // If we're inside a list or on a blank line, ignore all indents, 
		       // dedents and line breaks.
		       skip();
		     }
		     else {
		       emit(commonToken(NEWLINE, newLine));
		       int indent = getIndentationCount(spaces);
		       int previous = indents.isEmpty() ? 0 : indents.peek();
		       if (indent == previous) {
		         // skip indents of the same size as the present indent-size
		         skip();
		       }
		       else if (indent > previous) {
		         indents.push(indent);
		         emit(commonToken(pythonParser.INDENT, spaces));
		       }
		       else {
		         // Possibly emit more than 1 DEDENT token.
		         while(!indents.isEmpty() && indents.peek() > indent) {
		           this.emit(createDedent());
		           indents.pop();
		         }
		       }
		     }
		    break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: opened--; break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: opened--; break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: opened++; break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43: return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\5#\u00ca\n#\3#\3#\3$\3$\7$\u00d0\n$\f$\16$\u00d3\13$\3%\3%\7%"+
		"\u00d7\n%\f%\16%\u00da\13%\3%\6%\u00dd\n%\r%\16%\u00de\5%\u00e1\n%\3&"+
		"\6&\u00e4\n&\r&\16&\u00e5\3\'\3\'\7\'\u00ea\n\'\f\'\16\'\u00ed\13\'\3"+
		"(\3(\5(\u00f1\n(\3(\5(\u00f4\n(\3(\3(\5(\u00f8\n(\3)\5)\u00fb\n)\3*\3"+
		"*\5*\u00ff\n*\3+\3+\3,\3,\3-\3-\3-\5-\u0108\n-\3-\3-\5-\u010c\n-\3-\5"+
		"-\u010f\n-\5-\u0111\n-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\2S\2U\2W\2Y"+
		"\'\3\2\7\4\2\13\13\"\"\4\2\f\f\16\17\5\2C\\aac|\3\2\62;\3\2\63;\u011c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5^\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13"+
		"e\3\2\2\2\ri\3\2\2\2\17p\3\2\2\2\21s\3\2\2\2\23x\3\2\2\2\25}\3\2\2\2\27"+
		"\u0083\3\2\2\2\31\u0087\3\2\2\2\33\u008c\3\2\2\2\35\u0092\3\2\2\2\37\u0098"+
		"\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a0\3\2\2\2"+
		")\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3\2\2\2/\u00aa\3\2\2\2\61\u00ac"+
		"\3\2\2\2\63\u00ae\3\2\2\2\65\u00b0\3\2\2\2\67\u00b2\3\2\2\29\u00b4\3\2"+
		"\2\2;\u00b7\3\2\2\2=\u00ba\3\2\2\2?\u00bd\3\2\2\2A\u00c0\3\2\2\2C\u00c3"+
		"\3\2\2\2E\u00c9\3\2\2\2G\u00cd\3\2\2\2I\u00e0\3\2\2\2K\u00e3\3\2\2\2M"+
		"\u00e7\3\2\2\2O\u00ee\3\2\2\2Q\u00fa\3\2\2\2S\u00fe\3\2\2\2U\u0100\3\2"+
		"\2\2W\u0102\3\2\2\2Y\u0110\3\2\2\2[\\\7@\2\2\\]\7?\2\2]\4\3\2\2\2^_\7"+
		">\2\2_`\7?\2\2`\6\3\2\2\2ab\7$\2\2b\b\3\2\2\2cd\7\'\2\2d\n\3\2\2\2ef\7"+
		"f\2\2fg\7g\2\2gh\7h\2\2h\f\3\2\2\2ij\7t\2\2jk\7g\2\2kl\7v\2\2lm\7w\2\2"+
		"mn\7t\2\2no\7p\2\2o\16\3\2\2\2pq\7k\2\2qr\7h\2\2r\20\3\2\2\2st\7g\2\2"+
		"tu\7n\2\2uv\7k\2\2vw\7h\2\2w\22\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7"+
		"g\2\2|\24\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080\u0081\7"+
		"n\2\2\u0081\u0082\7g\2\2\u0082\26\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7v\2\2\u0086\30\3\2\2\2\u0087\u0088\7V\2\2\u0088\u0089"+
		"\7t\2\2\u0089\u008a\7w\2\2\u008a\u008b\7g\2\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\7H\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2\u0090"+
		"\u0091\7g\2\2\u0091\34\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7n\2\2\u0094"+
		"\u0095\7c\2\2\u0095\u0096\7u\2\2\u0096\u0097\7u\2\2\u0097\36\3\2\2\2\u0098"+
		"\u0099\7-\2\2\u0099 \3\2\2\2\u009a\u009b\7/\2\2\u009b\"\3\2\2\2\u009c"+
		"\u009d\7,\2\2\u009d$\3\2\2\2\u009e\u009f\7\61\2\2\u009f&\3\2\2\2\u00a0"+
		"\u00a1\7>\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3*\3\2\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5\u00a6\7?\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00a9"+
		"\7?\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\60\3\2\2\2\u00ac\u00ad"+
		"\7.\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7<\2\2\u00af\64\3\2\2\2\u00b0\u00b1"+
		"\7\60\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7=\2\2\u00b38\3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b5\u00b6\b\35\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\u00b9"+
		"\b\36\3\2\u00b9<\3\2\2\2\u00ba\u00bb\7]\2\2\u00bb\u00bc\b\37\4\2\u00bc"+
		">\3\2\2\2\u00bd\u00be\7_\2\2\u00be\u00bf\b \5\2\u00bf@\3\2\2\2\u00c0\u00c1"+
		"\7}\2\2\u00c1\u00c2\b!\6\2\u00c2B\3\2\2\2\u00c3\u00c4\7\177\2\2\u00c4"+
		"\u00c5\b\"\7\2\u00c5D\3\2\2\2\u00c6\u00ca\5K&\2\u00c7\u00ca\5M\'\2\u00c8"+
		"\u00ca\5O(\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b#\b\2\u00ccF\3\2\2\2\u00cd\u00d1\5"+
		"Q)\2\u00ce\u00d0\5S*\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2H\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d8\5U+\2\u00d5\u00d7\5W,\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e1\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dd\7\62\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d4"+
		"\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1J\3\2\2\2\u00e2\u00e4\t\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6L\3\2\2\2\u00e7\u00eb\7%\2\2\u00e8\u00ea\n\3\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"N\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\7^\2\2\u00ef\u00f1\5K&\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f4\7\17"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f8\7\f\2\2\u00f6\u00f8\4\16\17\2\u00f7\u00f3\3\2\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f8P\3\2\2\2\u00f9\u00fb\t\4\2\2\u00fa\u00f9\3\2\2\2\u00fbR\3"+
		"\2\2\2\u00fc\u00ff\5Q)\2\u00fd\u00ff\t\5\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ffT\3\2\2\2\u0100\u0101\t\6\2\2\u0101V\3\2\2\2\u0102"+
		"\u0103\t\5\2\2\u0103X\3\2\2\2\u0104\u0105\6-\2\2\u0105\u0111\5K&\2\u0106"+
		"\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u010c\7\f\2\2\u010a\u010c\4\16\17\2\u010b\u0107\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5K&\2\u010e\u010d\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u0104\3\2\2\2\u0110\u010b"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b-\t\2\u0113Z\3\2\2\2\23\2\u00c9"+
		"\u00d1\u00d8\u00de\u00e0\u00e5\u00eb\u00f0\u00f3\u00f7\u00fa\u00fe\u0107"+
		"\u010b\u010e\u0110\n\3\35\2\3\36\3\3\37\4\3 \5\3!\6\3\"\7\b\2\2\3-\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}