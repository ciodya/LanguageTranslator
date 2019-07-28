// Generated from python.g4 by ANTLR 4.4
package python;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pythonParser extends Parser {
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
		NAME=35, NUMBER=36, NEWLINE=37, INDENT=38, DEDENT=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'>='", "'<='", "'\"'", "'%'", "'def'", "'return'", "'if'", 
		"'elif'", "'else'", "'while'", "'not'", "'True'", "'False'", "'class'", 
		"'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'=='", "'!='", "'='", "','", 
		"':'", "'.'", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "SKIP_", 
		"NAME", "NUMBER", "NEWLINE", "INDENT", "DEDENT"
	};
	public static final int
		RULE_input = 0, RULE_return_stmt = 1, RULE_small_stmt = 2, RULE_testlist = 3, 
		RULE_test = 4, RULE_comparison = 5, RULE_expr = 6, RULE_atom = 7, RULE_compound_stmt = 8, 
		RULE_if_stmt = 9, RULE_suite = 10, RULE_while_stmt = 11, RULE_funcdef = 12, 
		RULE_parameterlist = 13, RULE_parameter = 14;
	public static final String[] ruleNames = {
		"input", "return_stmt", "small_stmt", "testlist", "test", "comparison", 
		"expr", "atom", "compound_stmt", "if_stmt", "suite", "while_stmt", "funcdef", 
		"parameterlist", "parameter"
	};

	@Override
	public String getGrammarFileName() { return "python.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode EOF() { return getToken(pythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << OPEN_PAREN) | (1L << NAME) | (1L << NUMBER) | (1L << NEWLINE))) != 0)) {
				{
				setState(33);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(30); match(NEWLINE);
					}
					break;
				case T__1:
				case NOT:
				case TRUE:
				case FALSE:
				case OPEN_PAREN:
				case NAME:
				case NUMBER:
					{
					setState(31); small_stmt();
					}
					break;
				case DEF:
				case IF:
				case WHILE:
					{
					setState(32); compound_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(pythonParser.RETURN, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(RETURN);
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(41); test();
				}
				break;
			}
			setState(45);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(44); match(SEMI_COLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Small_stmtContext extends ParserRuleContext {
		public TestlistContext e1;
		public TestlistContext e2;
		public TestlistContext testlist(int i) {
			return getRuleContext(TestlistContext.class,i);
		}
		public List<TestlistContext> testlist() {
			return getRuleContexts(TestlistContext.class);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_small_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); ((Small_stmtContext)_localctx).e1 = testlist();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(48); match(ASSIGN);
				setState(49); ((Small_stmtContext)_localctx).e2 = testlist();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(55); match(SEMI_COLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); test();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59); match(COMMA);
					setState(60); test();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(67);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(66); match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public ComparisonContext e1;
		public ComparisonContext e2;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_test);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(NOT);
				setState(70); ((TestContext)_localctx).e1 = comparison();
				}
				break;
			case T__1:
			case TRUE:
			case FALSE:
			case OPEN_PAREN:
			case NAME:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); ((TestContext)_localctx).e2 = comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); ((ComparisonContext)_localctx).e1 = expr();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__2) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << NOT_EQ_2))) != 0)) {
				{
				{
				setState(75);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__2) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << NOT_EQ_2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(76); ((ComparisonContext)_localctx).e2 = expr();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public AtomContext e1;
		public AtomContext e2;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); ((ExprContext)_localctx).e1 = atom();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << MINUS) | (1L << STAR) | (1L << DIV))) != 0)) {
				{
				{
				setState(83);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << MINUS) | (1L << STAR) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(84); ((ExprContext)_localctx).e2 = atom();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends AtomContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public ParensContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends AtomContext {
		public TerminalNode NAME(int i) {
			return getToken(pythonParser.NAME, i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(pythonParser.NUMBER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pythonParser.DOT); }
		public List<TerminalNode> NAME() { return getTokens(pythonParser.NAME); }
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public List<TerminalNode> NUMBER() { return getTokens(pythonParser.NUMBER); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(pythonParser.DOT, i);
		}
		public StringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunccallContext extends AtomContext {
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public FunccallContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(pythonParser.NUMBER, 0); }
		public NumContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends AtomContext {
		public TrueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends AtomContext {
		public FalseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends AtomContext {
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public IdContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		int _la;
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90); match(NAME);
				}
				break;
			case 2:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(NUMBER);
				}
				break;
			case 3:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(T__1);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << DOT) | (1L << NAME) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(93);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << DOT) | (1L << NAME) | (1L << NUMBER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99); match(T__1);
				}
				break;
			case 4:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100); match(TRUE);
				}
				break;
			case 5:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(101); match(FALSE);
				}
				break;
			case 6:
				_localctx = new FunccallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(102); match(NAME);
				setState(103); match(OPEN_PAREN);
				setState(105);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << OPEN_PAREN) | (1L << NAME) | (1L << NUMBER))) != 0)) {
					{
					setState(104); testlist();
					}
				}

				setState(107); match(CLOSE_PAREN);
				}
				break;
			case 7:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108); match(OPEN_PAREN);
				setState(109); test();
				setState(110); match(CLOSE_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_stmt);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); while_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); funcdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TestContext t1;
		public SuiteContext s1;
		public TestContext t2;
		public SuiteContext s2;
		public SuiteContext s3;
		public List<TerminalNode> ELIF() { return getTokens(pythonParser.ELIF); }
		public TerminalNode ELSE() { return getToken(pythonParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public TerminalNode ELIF(int i) {
			return getToken(pythonParser.ELIF, i);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(IF);
			setState(120); ((If_stmtContext)_localctx).t1 = test();
			setState(121); match(COLON);
			setState(122); ((If_stmtContext)_localctx).s1 = suite();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(123); match(ELIF);
				setState(124); ((If_stmtContext)_localctx).t2 = test();
				setState(125); match(COLON);
				setState(126); ((If_stmtContext)_localctx).s2 = suite();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133); match(ELSE);
				setState(134); match(COLON);
				setState(135); ((If_stmtContext)_localctx).s3 = suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuiteContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(pythonParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(pythonParser.INDENT, 0); }
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(NEWLINE);
			setState(139); match(INDENT);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(144);
				switch (_input.LA(1)) {
				case T__1:
				case NOT:
				case TRUE:
				case FALSE:
				case OPEN_PAREN:
				case NAME:
				case NUMBER:
					{
					setState(140); small_stmt();
					}
					break;
				case DEF:
				case IF:
				case WHILE:
					{
					setState(141); compound_stmt();
					}
					break;
				case NEWLINE:
					{
					setState(142); match(NEWLINE);
					}
					break;
				case RETURN:
					{
					setState(143); return_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << OPEN_PAREN) | (1L << NAME) | (1L << NUMBER) | (1L << NEWLINE))) != 0) );
			setState(148); match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public SuiteContext s1;
		public SuiteContext s2;
		public TerminalNode ELSE() { return getToken(pythonParser.ELSE, 0); }
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(pythonParser.WHILE, 0); }
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(WHILE);
			setState(151); test();
			setState(152); match(COLON);
			setState(153); ((While_stmtContext)_localctx).s1 = suite();
			setState(157);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(154); match(ELSE);
				setState(155); match(COLON);
				setState(156); ((While_stmtContext)_localctx).s2 = suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public TerminalNode DEF() { return getToken(pythonParser.DEF, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(DEF);
			setState(160); match(NAME);
			setState(161); parameterlist();
			setState(162); match(COLON);
			setState(163); suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterlistContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitParameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(OPEN_PAREN);
			setState(174);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(166); parameter();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(167); match(COMMA);
					setState(168); parameter();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(176); match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonVisitor ) return ((pythonVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(NAME);
			setState(181);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(179); match(COLON);
				setState(180); test();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\5\3-\n\3\3\3\5\3\60\n\3\3\4\3\4\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\4\5\4;\n\4\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13"+
		"\5\3\5\5\5F\n\5\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13"+
		"\7\3\b\3\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\t\3\t\3\t\3\t\7\ta\n\t\f\t\16"+
		"\td\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t"+
		"\3\n\3\n\3\n\5\nx\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0083\n\13\f\13\16\13\u0086\13\13\3\13\3\13\3\13\5\13\u008b\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\6\f\u0093\n\f\r\f\16\f\u0094\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u00ac\n\17\f\17\16\17\u00af\13\17\5\17\u00b1\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u00b8\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\5\4\2\3\4\25\30\4\2\6\6\21\24\5\2\32\32\34\34%&\u00ca"+
		"\2%\3\2\2\2\4*\3\2\2\2\6\61\3\2\2\2\b<\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16"+
		"T\3\2\2\2\20r\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2\26\u008c\3\2\2\2\30\u0098"+
		"\3\2\2\2\32\u00a1\3\2\2\2\34\u00a7\3\2\2\2\36\u00b4\3\2\2\2 $\7\'\2\2"+
		"!$\5\6\4\2\"$\5\22\n\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)\3\3\2\2\2*,\7\b\2\2+-\5"+
		"\n\6\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\7\35\2\2/.\3\2\2\2/\60\3\2\2"+
		"\2\60\5\3\2\2\2\61\66\5\b\5\2\62\63\7\31\2\2\63\65\5\b\5\2\64\62\3\2\2"+
		"\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29;\7"+
		"\35\2\2:9\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<A\5\n\6\2=>\7\32\2\2>@\5\n\6\2"+
		"?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2DF\7\32\2"+
		"\2ED\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GH\7\r\2\2HK\5\f\7\2IK\5\f\7\2JG\3\2"+
		"\2\2JI\3\2\2\2K\13\3\2\2\2LQ\5\16\b\2MN\t\2\2\2NP\5\16\b\2OM\3\2\2\2P"+
		"S\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3\2\2\2TY\5\20\t\2UV\t\3\2"+
		"\2VX\5\20\t\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\17\3\2\2\2[Y\3"+
		"\2\2\2\\s\7%\2\2]s\7&\2\2^b\7\5\2\2_a\t\4\2\2`_\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2es\7\5\2\2fs\7\16\2\2gs\7\17\2\2h"+
		"i\7%\2\2ik\7\36\2\2jl\5\b\5\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2ms\7\37\2\2"+
		"no\7\36\2\2op\5\n\6\2pq\7\37\2\2qs\3\2\2\2r\\\3\2\2\2r]\3\2\2\2r^\3\2"+
		"\2\2rf\3\2\2\2rg\3\2\2\2rh\3\2\2\2rn\3\2\2\2s\21\3\2\2\2tx\5\24\13\2u"+
		"x\5\30\r\2vx\5\32\16\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\23\3\2\2\2yz\7\t"+
		"\2\2z{\5\n\6\2{|\7\33\2\2|\u0084\5\26\f\2}~\7\n\2\2~\177\5\n\6\2\177\u0080"+
		"\7\33\2\2\u0080\u0081\5\26\f\2\u0081\u0083\3\2\2\2\u0082}\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008a\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7\33\2\2\u0089"+
		"\u008b\5\26\f\2\u008a\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2"+
		"\2\u008c\u008d\7\'\2\2\u008d\u0092\7(\2\2\u008e\u0093\5\6\4\2\u008f\u0093"+
		"\5\22\n\2\u0090\u0093\7\'\2\2\u0091\u0093\5\4\3\2\u0092\u008e\3\2\2\2"+
		"\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\7)\2\2\u0097\27\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a\5\n\6\2"+
		"\u009a\u009b\7\33\2\2\u009b\u009f\5\26\f\2\u009c\u009d\7\13\2\2\u009d"+
		"\u009e\7\33\2\2\u009e\u00a0\5\26\f\2\u009f\u009c\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\7%\2\2\u00a3\u00a4"+
		"\5\34\17\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\5\26\f\2\u00a6\33\3\2\2\2"+
		"\u00a7\u00b0\7\36\2\2\u00a8\u00ad\5\36\20\2\u00a9\u00aa\7\32\2\2\u00aa"+
		"\u00ac\5\36\20\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00a8\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\37"+
		"\2\2\u00b3\35\3\2\2\2\u00b4\u00b7\7%\2\2\u00b5\u00b6\7\33\2\2\u00b6\u00b8"+
		"\5\n\6\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\37\3\2\2\2\31#"+
		"%,/\66:AEJQYbkrw\u0084\u008a\u0092\u0094\u009f\u00ad\u00b0\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}