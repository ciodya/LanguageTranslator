// Generated from C.g4 by ANTLR 4.7.2
package C;
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
		Star=17, Div=18, Assign=19, LeftParen=20, RightParen=21, LeftBrace=22, 
		RightBrace=23, Semi=24, Identifier=25, DigitSequence=26, CharValue=27, 
		Whitespace=28, Newline=29, BlockComment=30, LineComment=31;
	public static final int
		RULE_externalDeclaration = 0, RULE_typeSpecifier = 1, RULE_funccall = 2, 
		RULE_initDeclaratorList = 3, RULE_functionDefinition = 4, RULE_parameterlist = 5, 
		RULE_parameter = 6, RULE_blockItemList = 7, RULE_expression = 8, RULE_arithExpression = 9, 
		RULE_castExpression = 10, RULE_statement = 11, RULE_actual = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"externalDeclaration", "typeSpecifier", "funccall", "initDeclaratorList", 
			"functionDefinition", "parameterlist", "parameter", "blockItemList", 
			"expression", "arithExpression", "castExpression", "statement", "actual"
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
		public List<TerminalNode> Semi() { return getTokens(CParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CParser.Semi, i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
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
					setState(26);
					functionDefinition();
					}
					break;
				case 2:
					{
					{
					setState(27);
					initDeclaratorList();
					setState(28);
					match(Semi);
					}
					}
					break;
				case 3:
					{
					{
					setState(30);
					funccall();
					setState(31);
					match(Semi);
					}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends TypeSpecifierContext {
		public TerminalNode Bool() { return getToken(CParser.Bool, 0); }
		public BoolContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends TypeSpecifierContext {
		public TerminalNode Char() { return getToken(CParser.Char, 0); }
		public CharContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends TypeSpecifierContext {
		public TerminalNode Int() { return getToken(CParser.Int, 0); }
		public IntContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
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
		public ActualContext actual() {
			return getRuleContext(ActualContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
				{
				setState(48);
				actual();
				}
			}

			setState(51);
			match(RightParen);
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
		public Var_delContext(InitDeclaratorListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitVar_del(this);
			else return visitor.visitChildren(this);
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
			setState(53);
			typeSpecifier();
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(54);
				((Var_delContext)_localctx).id1 = match(Identifier);
				}
				break;
			case 2:
				{
				{
				setState(55);
				((Var_delContext)_localctx).id2 = match(Identifier);
				setState(56);
				match(Assign);
				setState(57);
				((Var_delContext)_localctx).c1 = expression();
				}
				}
				break;
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(60);
				match(T__0);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(61);
					((Var_delContext)_localctx).id3 = match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(62);
					((Var_delContext)_localctx).id4 = match(Identifier);
					setState(63);
					match(Assign);
					setState(64);
					((Var_delContext)_localctx).c2 = expression();
					}
					}
					break;
				}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitVoid_func(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitNotvoid_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Void_funcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69);
				((Void_funcContext)_localctx).c1 = typeSpecifier();
				setState(70);
				((Void_funcContext)_localctx).id1 = match(Identifier);
				setState(71);
				match(LeftParen);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(72);
					parameterlist();
					}
				}

				setState(75);
				match(RightParen);
				setState(76);
				match(LeftBrace);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					{
					setState(77);
					blockItemList();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Notvoid_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(85);
				((Notvoid_funcContext)_localctx).c2 = typeSpecifier();
				setState(86);
				((Notvoid_funcContext)_localctx).id2 = match(Identifier);
				setState(87);
				match(LeftParen);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(88);
					parameterlist();
					}
				}

				setState(91);
				match(RightParen);
				setState(92);
				match(LeftBrace);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					{
					setState(93);
					blockItemList();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(Return);
				setState(100);
				expression();
				setState(101);
				match(Semi);
				setState(102);
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
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			parameter();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(107);
				match(T__0);
				setState(108);
				parameter();
				}
				}
				setState(113);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			typeSpecifier();
			setState(115);
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
		public List<TerminalNode> Semi() { return getTokens(CParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CParser.Semi, i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(121);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case If:
					case While:
					case LeftParen:
					case LeftBrace:
					case Semi:
					case Identifier:
					case DigitSequence:
						{
						setState(117);
						statement();
						}
						break;
					case Bool:
					case Char:
					case Int:
					case Void:
						{
						{
						setState(118);
						initDeclaratorList();
						setState(119);
						match(Semi);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public ArithExpressionContext e1;
		public Token op;
		public ArithExpressionContext e2;
		public List<ArithExpressionContext> arithExpression() {
			return getRuleContexts(ArithExpressionContext.class);
		}
		public ArithExpressionContext arithExpression(int i) {
			return getRuleContext(ArithExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(CParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(CParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(CParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CParser.Greater, i);
		}
		public List<TerminalNode> Equal() { return getTokens(CParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(CParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(CParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(CParser.NotEqual, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((ExpressionContext)_localctx).e1 = arithExpression();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Less) | (1L << Greater))) != 0)) {
				{
				{
				setState(126);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Less) | (1L << Greater))) != 0)) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				((ExpressionContext)_localctx).e2 = arithExpression();
				}
				}
				setState(132);
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

	public static class ArithExpressionContext extends ParserRuleContext {
		public CastExpressionContext e1;
		public Token op;
		public CastExpressionContext e2;
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(CParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(CParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(CParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(CParser.Minus, i);
		}
		public List<TerminalNode> Star() { return getTokens(CParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(CParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(CParser.Div, i);
		}
		public ArithExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitArithExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExpressionContext arithExpression() throws RecognitionException {
		ArithExpressionContext _localctx = new ArithExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((ArithExpressionContext)_localctx).e1 = castExpression();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0)) {
				{
				{
				setState(134);
				((ArithExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0)) ) {
					((ArithExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				((ArithExpressionContext)_localctx).e2 = castExpression();
				}
				}
				setState(140);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends CastExpressionContext {
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public NumContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends CastExpressionContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Char_valueContext extends CastExpressionContext {
		public Token e1;
		public TerminalNode CharValue() { return getToken(CParser.CharValue, 0); }
		public Char_valueContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitChar_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_castExpression);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(DigitSequence);
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(143);
				match(LeftParen);
				setState(144);
				expression();
				setState(145);
				match(RightParen);
				}
				}
				break;
			case 4:
				_localctx = new Func_callContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(147);
				match(Identifier);
				setState(148);
				match(LeftParen);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(149);
					actual();
					}
				}

				setState(152);
				match(RightParen);
				}
				}
				break;
			case 5:
				_localctx = new Char_valueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(153);
				match(T__1);
				setState(154);
				((Char_valueContext)_localctx).e1 = match(CharValue);
				setState(155);
				match(T__1);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_stmtContext extends StatementContext {
		public StatementContext c1;
		public StatementContext c2;
		public TerminalNode If() { return getToken(CParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CParser.Else, 0); }
		public If_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_stmtContext extends StatementContext {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public Func_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunc_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_stmtContext extends StatementContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assn_stmtContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public Assn_stmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new Compound_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(158);
				match(LeftBrace);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(159);
					blockItemList();
					}
				}

				setState(162);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(163);
					expression();
					}
				}

				setState(166);
				match(Semi);
				}
				}
				break;
			case 3:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(167);
				match(If);
				setState(168);
				match(LeftParen);
				setState(169);
				expression();
				setState(170);
				match(RightParen);
				setState(171);
				((If_stmtContext)_localctx).c1 = statement();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(172);
					match(Else);
					setState(173);
					((If_stmtContext)_localctx).c2 = statement();
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
				setState(176);
				match(While);
				setState(177);
				match(LeftParen);
				setState(178);
				expression();
				setState(179);
				match(RightParen);
				setState(180);
				statement();
				}
				}
				break;
			case 5:
				_localctx = new Func_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(182);
				funccall();
				setState(183);
				match(Semi);
				}
				}
				break;
			case 6:
				_localctx = new Assn_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(185);
				match(Identifier);
				setState(186);
				match(Assign);
				setState(187);
				expression();
				setState(188);
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
		public ActualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitActual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualContext actual() throws RecognitionException {
		ActualContext _localctx = new ActualContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(193);
				match(T__0);
				setState(194);
				expression();
				}
				}
				setState(199);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f\2"+
		"\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\5\4\64\n\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\5\5F"+
		"\n\5\3\6\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\6\t|\n\t\r\t\16\t}\3\n\3\n\3\n\7\n\u0083\n\n\f\n"+
		"\16\n\u0086\13\n\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\f\3\f\3\f\3\f\5\f"+
		"\u009f\n\f\3\r\3\r\5\r\u00a3\n\r\3\r\3\r\5\r\u00a7\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00b1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\16\3\16\3\16\7\16\u00c6\n\16\f\16\16"+
		"\16\u00c9\13\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\r"+
		"\20\3\2\21\24\2\u00df\2%\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\67\3\2\2\2"+
		"\nj\3\2\2\2\fl\3\2\2\2\16t\3\2\2\2\20{\3\2\2\2\22\177\3\2\2\2\24\u0087"+
		"\3\2\2\2\26\u009e\3\2\2\2\30\u00c0\3\2\2\2\32\u00c2\3\2\2\2\34$\5\n\6"+
		"\2\35\36\5\b\5\2\36\37\7\32\2\2\37$\3\2\2\2 !\5\6\4\2!\"\7\32\2\2\"$\3"+
		"\2\2\2#\34\3\2\2\2#\35\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)\3\3\2\2\2*/\7\f\2\2+/\7\6\2\2,/\7\t"+
		"\2\2-/\7\5\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61"+
		"\7\33\2\2\61\63\7\26\2\2\62\64\5\32\16\2\63\62\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\7\27\2\2\66\7\3\2\2\2\67<\5\4\3\28=\7\33\2\29:\7\33"+
		"\2\2:;\7\25\2\2;=\5\22\n\2<8\3\2\2\2<9\3\2\2\2=E\3\2\2\2>C\7\3\2\2?D\7"+
		"\33\2\2@A\7\33\2\2AB\7\25\2\2BD\5\22\n\2C?\3\2\2\2C@\3\2\2\2DF\3\2\2\2"+
		"E>\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GH\5\4\3\2HI\7\33\2\2IK\7\26\2\2JL\5\f"+
		"\7\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\27\2\2NR\7\30\2\2OQ\5\20\t\2PO"+
		"\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\31\2\2"+
		"Vk\3\2\2\2WX\5\4\3\2XY\7\33\2\2Y[\7\26\2\2Z\\\5\f\7\2[Z\3\2\2\2[\\\3\2"+
		"\2\2\\]\3\2\2\2]^\7\27\2\2^b\7\30\2\2_a\5\20\t\2`_\3\2\2\2ad\3\2\2\2b"+
		"`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\n\2\2fg\5\22\n\2gh\7\32\2"+
		"\2hi\7\31\2\2ik\3\2\2\2jG\3\2\2\2jW\3\2\2\2k\13\3\2\2\2lq\5\16\b\2mn\7"+
		"\3\2\2np\5\16\b\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\r\3\2\2\2s"+
		"q\3\2\2\2tu\5\4\3\2uv\7\33\2\2v\17\3\2\2\2w|\5\30\r\2xy\5\b\5\2yz\7\32"+
		"\2\2z|\3\2\2\2{w\3\2\2\2{x\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3"+
		"\2\2\2\177\u0084\5\24\13\2\u0080\u0081\t\2\2\2\u0081\u0083\5\24\13\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\23\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008c\5\26\f\2\u0088\u0089"+
		"\t\3\2\2\u0089\u008b\5\26\f\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u009f\7\34\2\2\u0090\u009f\7\33\2\2\u0091\u0092\7\26\2"+
		"\2\u0092\u0093\5\22\n\2\u0093\u0094\7\27\2\2\u0094\u009f\3\2\2\2\u0095"+
		"\u0096\7\33\2\2\u0096\u0098\7\26\2\2\u0097\u0099\5\32\16\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009f\7\27\2\2"+
		"\u009b\u009c\7\4\2\2\u009c\u009d\7\35\2\2\u009d\u009f\7\4\2\2\u009e\u008f"+
		"\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0095\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a2\7\30\2\2\u00a1\u00a3\5\20"+
		"\t\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00c1\7\31\2\2\u00a5\u00a7\5\22\n\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00c1\7\32\2\2\u00a9\u00aa\7\b\2\2\u00aa"+
		"\u00ab\7\26\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\7\27\2\2\u00ad\u00b0"+
		"\5\30\r\2\u00ae\u00af\7\7\2\2\u00af\u00b1\5\30\r\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00c1\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4"+
		"\7\26\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5\30\r"+
		"\2\u00b7\u00c1\3\2\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7\32\2\2\u00ba"+
		"\u00c1\3\2\2\2\u00bb\u00bc\7\33\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\5"+
		"\22\n\2\u00be\u00bf\7\32\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00a0\3\2\2\2\u00c0"+
		"\u00a6\3\2\2\2\u00c0\u00a9\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0\u00b8\3\2"+
		"\2\2\u00c0\u00bb\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c7\5\22\n\2\u00c3\u00c4"+
		"\7\3\2\2\u00c4\u00c6\5\22\n\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\32#%.\63<CEKR[bjq{}\u0084\u008c\u0098\u009e\u00a2\u00a6\u00b0"+
		"\u00c0\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}