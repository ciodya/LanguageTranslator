// Generated from C.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
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
	public static final int
		RULE_externalDeclaration = 0, RULE_typeSpecifier = 1, RULE_funccall = 2, 
		RULE_initDeclaratorList = 3, RULE_functionDefinition = 4, RULE_parameterlist = 5, 
		RULE_parameter = 6, RULE_blockItemList = 7, RULE_expression = 8, RULE_expression_suffix = 9, 
		RULE_arithExpression = 10, RULE_arithExpression_suffix = 11, RULE_castExpression = 12, 
		RULE_statement = 13, RULE_actual = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"externalDeclaration", "typeSpecifier", "funccall", "initDeclaratorList", 
			"functionDefinition", "parameterlist", "parameter", "blockItemList", 
			"expression", "expression_suffix", "arithExpression", "arithExpression_suffix", 
			"castExpression", "statement", "actual"
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

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<InitDeclaratorListContext> initDeclaratorList() {
			return getRuleContexts(InitDeclaratorListContext.class);
		}
		public InitDeclaratorListContext initDeclaratorList(int i) {
			return getRuleContext(InitDeclaratorListContext.class,i);
		}
		public List<FunccallContext> funccall() {
			return getRuleContexts(FunccallContext.class);
		}
		public FunccallContext funccall(int i) {
			return getRuleContext(FunccallContext.class,i);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_externalDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					functionDefinition();
					}
					break;
				case 2:
					{
					setState(31);
					initDeclaratorList();
					}
					break;
				case 3:
					{
					setState(32);
					funccall();
					}
					break;
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidContext extends TypeSpecifierContext {
		public TerminalNode Void() { return getToken(CParser.Void, 0); }
		public VoidContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVoid(this);
		}
	}
	public static class BoolContext extends TypeSpecifierContext {
		public TerminalNode Bool() { return getToken(CParser.Bool, 0); }
		public BoolContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBool(this);
		}
	}
	public static class CharContext extends TypeSpecifierContext {
		public TerminalNode Char() { return getToken(CParser.Char, 0); }
		public CharContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitChar(this);
		}
	}
	public static class IntContext extends TypeSpecifierContext {
		public TerminalNode Int() { return getToken(CParser.Int, 0); }
		public IntContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInt(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeSpecifier);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				_localctx = new VoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(Void);
				}
				break;
			case Char:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(Char);
				}
				break;
			case Int:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(Int);
				}
				break;
			case Bool:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(Bool);
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ActualContext actual() {
			return getRuleContext(ActualContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Identifier);
			setState(47);
			match(LeftParen);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << EXCLA) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
				{
				setState(48);
				actual();
				}
			}

			setState(51);
			match(RightParen);
			setState(52);
			match(Semi);
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	 
		public InitDeclaratorListContext() { }
		public void copyFrom(InitDeclaratorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Var_delContext extends InitDeclaratorListContext {
		public Token id1;
		public Token id2;
		public ExpressionContext c1;
		public Token id3;
		public Token id4;
		public ExpressionContext c2;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public List<TerminalNode> Identifier() { return getTokens(CParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CParser.Identifier, i);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public List<TerminalNode> Assign() { return getTokens(CParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(CParser.Assign, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DigitSequence() { return getTokens(CParser.DigitSequence); }
		public TerminalNode DigitSequence(int i) {
			return getToken(CParser.DigitSequence, i);
		}
		public Var_delContext(InitDeclaratorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVar_del(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVar_del(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initDeclaratorList);
		int _la;
		try {
			_localctx = new Var_delContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			typeSpecifier();
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(55);
				((Var_delContext)_localctx).id1 = match(Identifier);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(56);
					match(T__0);
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DigitSequence) {
						{
						setState(57);
						match(DigitSequence);
						}
					}

					setState(60);
					match(T__1);
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(63);
				((Var_delContext)_localctx).id2 = match(Identifier);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(64);
					match(T__0);
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DigitSequence) {
						{
						setState(65);
						match(DigitSequence);
						}
					}

					setState(68);
					match(T__1);
					}
				}

				setState(71);
				match(Assign);
				setState(72);
				((Var_delContext)_localctx).c1 = expression();
				}
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(75);
				match(Comma);
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(76);
					((Var_delContext)_localctx).id3 = match(Identifier);
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(77);
						match(T__0);
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DigitSequence) {
							{
							setState(78);
							match(DigitSequence);
							}
						}

						setState(81);
						match(T__1);
						}
					}

					}
					break;
				case 2:
					{
					{
					setState(84);
					((Var_delContext)_localctx).id4 = match(Identifier);
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(85);
						match(T__0);
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DigitSequence) {
							{
							setState(86);
							match(DigitSequence);
							}
						}

						setState(89);
						match(T__1);
						}
					}

					setState(92);
					match(Assign);
					setState(93);
					((Var_delContext)_localctx).c2 = expression();
					}
					}
					break;
				}
				}
			}

			setState(98);
			match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	 
		public FunctionDefinitionContext() { }
		public void copyFrom(FunctionDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Void_funcContext extends FunctionDefinitionContext {
		public TypeSpecifierContext c1;
		public Token id1;
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public List<BlockItemListContext> blockItemList() {
			return getRuleContexts(BlockItemListContext.class);
		}
		public BlockItemListContext blockItemList(int i) {
			return getRuleContext(BlockItemListContext.class,i);
		}
		public Void_funcContext(FunctionDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVoid_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVoid_func(this);
		}
	}
	public static class Notvoid_funcContext extends FunctionDefinitionContext {
		public TypeSpecifierContext c2;
		public Token id2;
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public TerminalNode Return() { return getToken(CParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public List<BlockItemListContext> blockItemList() {
			return getRuleContexts(BlockItemListContext.class);
		}
		public BlockItemListContext blockItemList(int i) {
			return getRuleContext(BlockItemListContext.class,i);
		}
		public Notvoid_funcContext(FunctionDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterNotvoid_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitNotvoid_func(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Void_funcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(100);
				((Void_funcContext)_localctx).c1 = typeSpecifier();
				setState(101);
				((Void_funcContext)_localctx).id1 = match(Identifier);
				setState(102);
				match(LeftParen);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(103);
					parameterlist();
					}
				}

				setState(106);
				match(RightParen);
				setState(107);
				match(LeftBrace);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << EXCLA) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					{
					setState(108);
					blockItemList();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Notvoid_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(116);
				((Notvoid_funcContext)_localctx).c2 = typeSpecifier();
				setState(117);
				((Notvoid_funcContext)_localctx).id2 = match(Identifier);
				setState(118);
				match(LeftParen);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(119);
					parameterlist();
					}
				}

				setState(122);
				match(RightParen);
				setState(123);
				match(LeftBrace);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << EXCLA) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					{
					setState(124);
					blockItemList();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(Return);
				setState(131);
				expression();
				setState(132);
				match(Semi);
				setState(133);
				match(RightBrace);
				}
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

	public static class ParameterlistContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameterlist(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			parameter();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(138);
				match(Comma);
				setState(139);
				parameter();
				}
				}
				setState(144);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			typeSpecifier();
			setState(146);
			match(Identifier);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<InitDeclaratorListContext> initDeclaratorList() {
			return getRuleContexts(InitDeclaratorListContext.class);
		}
		public InitDeclaratorListContext initDeclaratorList(int i) {
			return getRuleContext(InitDeclaratorListContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(148);
						statement();
						}
						break;
					case 2:
						{
						setState(149);
						initDeclaratorList();
						}
						break;
					case 3:
						{
						setState(150);
						functionDefinition();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token not;
		public ArithExpressionContext e1;
		public ArithExpressionContext arithExpression() {
			return getRuleContext(ArithExpressionContext.class,0);
		}
		public List<Expression_suffixContext> expression_suffix() {
			return getRuleContexts(Expression_suffixContext.class);
		}
		public Expression_suffixContext expression_suffix(int i) {
			return getRuleContext(Expression_suffixContext.class,i);
		}
		public TerminalNode EXCLA() { return getToken(CParser.EXCLA, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLA) {
				{
				setState(155);
				((ExpressionContext)_localctx).not = match(EXCLA);
				}
			}

			setState(158);
			((ExpressionContext)_localctx).e1 = arithExpression();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Less) | (1L << Greater))) != 0)) {
				{
				{
				setState(159);
				expression_suffix();
				}
				}
				setState(164);
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

	public static class Expression_suffixContext extends ParserRuleContext {
		public Token op;
		public ArithExpressionContext e2;
		public ArithExpressionContext arithExpression() {
			return getRuleContext(ArithExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CParser.Greater, 0); }
		public TerminalNode Equal() { return getToken(CParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CParser.NotEqual, 0); }
		public Expression_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression_suffix(this);
		}
	}

	public final Expression_suffixContext expression_suffix() throws RecognitionException {
		Expression_suffixContext _localctx = new Expression_suffixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((Expression_suffixContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Less) | (1L << Greater))) != 0)) ) {
				((Expression_suffixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(166);
			((Expression_suffixContext)_localctx).e2 = arithExpression();
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

	public static class ArithExpressionContext extends ParserRuleContext {
		public CastExpressionContext e1;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<ArithExpression_suffixContext> arithExpression_suffix() {
			return getRuleContexts(ArithExpression_suffixContext.class);
		}
		public ArithExpression_suffixContext arithExpression_suffix(int i) {
			return getRuleContext(ArithExpression_suffixContext.class,i);
		}
		public ArithExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArithExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArithExpression(this);
		}
	}

	public final ArithExpressionContext arithExpression() throws RecognitionException {
		ArithExpressionContext _localctx = new ArithExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((ArithExpressionContext)_localctx).e1 = castExpression();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mol))) != 0)) {
				{
				{
				setState(169);
				arithExpression_suffix();
				}
				}
				setState(174);
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

	public static class ArithExpression_suffixContext extends ParserRuleContext {
		public Token op;
		public CastExpressionContext e2;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Div() { return getToken(CParser.Div, 0); }
		public TerminalNode Mol() { return getToken(CParser.Mol, 0); }
		public ArithExpression_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpression_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArithExpression_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArithExpression_suffix(this);
		}
	}

	public final ArithExpression_suffixContext arithExpression_suffix() throws RecognitionException {
		ArithExpression_suffixContext _localctx = new ArithExpression_suffixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arithExpression_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((ArithExpression_suffixContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mol))) != 0)) ) {
				((ArithExpression_suffixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			((ArithExpression_suffixContext)_localctx).e2 = castExpression();
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

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends CastExpressionContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public ParensContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParens(this);
		}
	}
	public static class Char_arrayContext extends CastExpressionContext {
		public TerminalNode CharArray() { return getToken(CParser.CharArray, 0); }
		public Char_arrayContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterChar_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitChar_array(this);
		}
	}
	public static class NumContext extends CastExpressionContext {
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public NumContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitNum(this);
		}
	}
	public static class IdContext extends CastExpressionContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitId(this);
		}
	}
	public static class Func_callContext extends CastExpressionContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public ActualContext actual() {
			return getRuleContext(ActualContext.class,0);
		}
		public Func_callContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunc_call(this);
		}
	}
	public static class Char_valueContext extends CastExpressionContext {
		public TerminalNode CharValue() { return getToken(CParser.CharValue, 0); }
		public Char_valueContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterChar_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitChar_value(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_castExpression);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(DigitSequence);
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(180);
				match(LeftParen);
				setState(181);
				expression();
				setState(182);
				match(RightParen);
				}
				}
				break;
			case 4:
				_localctx = new Func_callContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(184);
				match(Identifier);
				setState(185);
				match(LeftParen);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << EXCLA) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					setState(186);
					actual();
					}
				}

				setState(189);
				match(RightParen);
				}
				}
				break;
			case 5:
				_localctx = new Char_valueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(190);
				match(CharValue);
				}
				}
				break;
			case 6:
				_localctx = new Char_arrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(191);
				match(CharArray);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Compound_stmtContext extends StatementContext {
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public Compound_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompound_stmt(this);
		}
	}
	public static class While_stmtContext extends StatementContext {
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitWhile_stmt(this);
		}
	}
	public static class If_stmtContext extends StatementContext {
		public ExpressionContext e1;
		public StatementContext c1;
		public StatementContext c3;
		public TerminalNode If() { return getToken(CParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CParser.Else, 0); }
		public If_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIf_stmt(this);
		}
	}
	public static class Func_stmtContext extends StatementContext {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public Func_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunc_stmt(this);
		}
	}
	public static class Expr_stmtContext extends StatementContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpr_stmt(this);
		}
	}
	public static class Assn_stmtContext extends StatementContext {
		public List<TerminalNode> Identifier() { return getTokens(CParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CParser.Identifier, i);
		}
		public List<TerminalNode> Assign() { return getTokens(CParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(CParser.Assign, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public Assn_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssn_stmt(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new Compound_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(194);
				match(LeftBrace);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << EXCLA) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					setState(195);
					blockItemList();
					}
				}

				setState(198);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << EXCLA) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					setState(199);
					expression();
					}
				}

				setState(202);
				match(Semi);
				}
				}
				break;
			case 3:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(203);
				match(If);
				setState(204);
				match(LeftParen);
				setState(205);
				((If_stmtContext)_localctx).e1 = expression();
				setState(206);
				match(RightParen);
				setState(207);
				((If_stmtContext)_localctx).c1 = statement();
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(208);
					match(Else);
					setState(209);
					((If_stmtContext)_localctx).c3 = statement();
					}
					break;
				}
				}
				}
				break;
			case 4:
				_localctx = new While_stmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(212);
				match(While);
				setState(213);
				match(LeftParen);
				setState(214);
				expression();
				setState(215);
				match(RightParen);
				setState(216);
				statement();
				}
				}
				break;
			case 5:
				_localctx = new Func_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(218);
				funccall();
				setState(219);
				match(Semi);
				}
				}
				break;
			case 6:
				_localctx = new Assn_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(221);
				match(Identifier);
				setState(222);
				match(Assign);
				setState(223);
				expression();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(224);
					match(Comma);
					setState(225);
					match(Identifier);
					setState(226);
					match(Assign);
					setState(227);
					expression();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				match(Semi);
				}
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

	public static class ActualContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ActualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterActual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitActual(this);
		}
	}

	public final ActualContext actual() throws RecognitionException {
		ActualContext _localctx = new ActualContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_actual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			expression();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(238);
				match(Comma);
				setState(239);
				expression();
				}
				}
				setState(244);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\5\5@\n\5\3\5\3\5\3\5\5\5E"+
		"\n\5\3\5\5\5H\n\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\5\5U\n"+
		"\5\3\5\3\5\3\5\5\5Z\n\5\3\5\5\5]\n\5\3\5\3\5\5\5a\n\5\5\5c\n\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6k\n\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\7\3\7\3\7\7\7\u008f\n\7\f\7\16"+
		"\7\u0092\13\7\3\b\3\b\3\b\3\t\3\t\3\t\6\t\u009a\n\t\r\t\16\t\u009b\3\n"+
		"\5\n\u009f\n\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\13\3\13\3\13"+
		"\3\f\3\f\7\f\u00ad\n\f\f\f\16\f\u00b0\13\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00be\n\16\3\16\3\16\3\16\5\16\u00c3"+
		"\n\16\3\17\3\17\5\17\u00c7\n\17\3\17\3\17\5\17\u00cb\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d5\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e7\n\17"+
		"\f\17\16\17\u00ea\13\17\3\17\3\17\5\17\u00ee\n\17\3\20\3\20\3\20\7\20"+
		"\u00f3\n\20\f\20\16\20\u00f6\13\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\4\3\2\r\20\3\2\21\25\2\u0116\2%\3\2\2\2\4.\3\2\2\2\6"+
		"\60\3\2\2\2\b8\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2\2\16\u0093\3\2\2"+
		"\2\20\u0099\3\2\2\2\22\u009e\3\2\2\2\24\u00a7\3\2\2\2\26\u00aa\3\2\2\2"+
		"\30\u00b1\3\2\2\2\32\u00c2\3\2\2\2\34\u00ed\3\2\2\2\36\u00ef\3\2\2\2 "+
		"$\5\n\6\2!$\5\b\5\2\"$\5\6\4\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)\3\3\2\2\2*/\7\f"+
		"\2\2+/\7\6\2\2,/\7\t\2\2-/\7\5\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2"+
		"\2\2/\5\3\2\2\2\60\61\7\"\2\2\61\63\7\27\2\2\62\64\5\36\20\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\30\2\2\66\67\7\33\2\2\67\7\3"+
		"\2\2\28K\5\4\3\29?\7\"\2\2:<\7\3\2\2;=\7#\2\2<;\3\2\2\2<=\3\2\2\2=>\3"+
		"\2\2\2>@\7\4\2\2?:\3\2\2\2?@\3\2\2\2@L\3\2\2\2AG\7\"\2\2BD\7\3\2\2CE\7"+
		"#\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FH\7\4\2\2GB\3\2\2\2GH\3\2\2\2HI\3"+
		"\2\2\2IJ\7\26\2\2JL\5\22\n\2K9\3\2\2\2KA\3\2\2\2Lb\3\2\2\2M`\7\34\2\2"+
		"NT\7\"\2\2OQ\7\3\2\2PR\7#\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\4\2\2"+
		"TO\3\2\2\2TU\3\2\2\2Ua\3\2\2\2V\\\7\"\2\2WY\7\3\2\2XZ\7#\2\2YX\3\2\2\2"+
		"YZ\3\2\2\2Z[\3\2\2\2[]\7\4\2\2\\W\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\26"+
		"\2\2_a\5\22\n\2`N\3\2\2\2`V\3\2\2\2ac\3\2\2\2bM\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2de\7\33\2\2e\t\3\2\2\2fg\5\4\3\2gh\7\"\2\2hj\7\27\2\2ik\5\f\7\2"+
		"ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\30\2\2mq\7\31\2\2np\5\20\t\2on\3\2"+
		"\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\32\2\2u\u008a"+
		"\3\2\2\2vw\5\4\3\2wx\7\"\2\2xz\7\27\2\2y{\5\f\7\2zy\3\2\2\2z{\3\2\2\2"+
		"{|\3\2\2\2|}\7\30\2\2}\u0081\7\31\2\2~\u0080\5\20\t\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0085\7\n\2\2\u0085\u0086\5\22\n\2\u0086"+
		"\u0087\7\33\2\2\u0087\u0088\7\32\2\2\u0088\u008a\3\2\2\2\u0089f\3\2\2"+
		"\2\u0089v\3\2\2\2\u008a\13\3\2\2\2\u008b\u0090\5\16\b\2\u008c\u008d\7"+
		"\34\2\2\u008d\u008f\5\16\b\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\r\3\2\2\2\u0092\u0090\3\2\2\2"+
		"\u0093\u0094\5\4\3\2\u0094\u0095\7\"\2\2\u0095\17\3\2\2\2\u0096\u009a"+
		"\5\34\17\2\u0097\u009a\5\b\5\2\u0098\u009a\5\n\6\2\u0099\u0096\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\21\3\2\2\2\u009d\u009f\7\37\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\5\26"+
		"\f\2\u00a1\u00a3\5\24\13\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00a8\t\2\2\2\u00a8\u00a9\5\26\f\2\u00a9\25\3\2\2\2\u00aa\u00ae"+
		"\5\32\16\2\u00ab\u00ad\5\30\r\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\5\32\16\2\u00b3\31\3\2\2\2\u00b4"+
		"\u00c3\7#\2\2\u00b5\u00c3\7\"\2\2\u00b6\u00b7\7\27\2\2\u00b7\u00b8\5\22"+
		"\n\2\u00b8\u00b9\7\30\2\2\u00b9\u00c3\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb"+
		"\u00bd\7\27\2\2\u00bc\u00be\5\36\20\2\u00bd\u00bc\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\7\30\2\2\u00c0\u00c3\7$\2\2\u00c1"+
		"\u00c3\7%\2\2\u00c2\u00b4\3\2\2\2\u00c2\u00b5\3\2\2\2\u00c2\u00b6\3\2"+
		"\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\33\3\2\2\2\u00c4\u00c6\7\31\2\2\u00c5\u00c7\5\20\t\2\u00c6\u00c5\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ee\7\32\2\2\u00c9"+
		"\u00cb\5\22\n\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00ee\7\33\2\2\u00cd\u00ce\7\b\2\2\u00ce\u00cf\7\27\2\2\u00cf"+
		"\u00d0\5\22\n\2\u00d0\u00d1\7\30\2\2\u00d1\u00d4\5\34\17\2\u00d2\u00d3"+
		"\7\7\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00ee\3\2\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00d9"+
		"\5\22\n\2\u00d9\u00da\7\30\2\2\u00da\u00db\5\34\17\2\u00db\u00ee\3\2\2"+
		"\2\u00dc\u00dd\5\6\4\2\u00dd\u00de\7\33\2\2\u00de\u00ee\3\2\2\2\u00df"+
		"\u00e0\7\"\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e8\5\22\n\2\u00e2\u00e3\7"+
		"\34\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00e7\5\22\n\2"+
		"\u00e6\u00e2\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\33\2\2"+
		"\u00ec\u00ee\3\2\2\2\u00ed\u00c4\3\2\2\2\u00ed\u00ca\3\2\2\2\u00ed\u00cd"+
		"\3\2\2\2\u00ed\u00d6\3\2\2\2\u00ed\u00dc\3\2\2\2\u00ed\u00df\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00f4\5\22\n\2\u00f0\u00f1\7\34\2\2\u00f1\u00f3\5\22"+
		"\n\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00f4\3\2\2\2$#%.\63<?DGKQTY\\`"+
		"bjqz\u0081\u0089\u0090\u0099\u009b\u009e\u00a4\u00ae\u00bd\u00c2\u00c6"+
		"\u00ca\u00d4\u00e8\u00ed\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}