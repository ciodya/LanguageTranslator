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
		T__0=1, T__1=2, T__2=3, Bool=4, Char=5, Else=6, If=7, Int=8, Return=9, 
		While=10, Void=11, Equal=12, Less=13, Greater=14, Plus=15, Minus=16, Star=17, 
		Div=18, Assign=19, LeftParen=20, RightParen=21, LeftBrace=22, RightBrace=23, 
		Semi=24, Identifier=25, DigitSequence=26, Whitespace=27, Newline=28, BlockComment=29, 
		LineComment=30;
	public static final int
		RULE_externalDeclaration = 0, RULE_typeSpecifier = 1, RULE_initDeclaratorList = 2, 
		RULE_functionDefinition = 3, RULE_parameterlist = 4, RULE_parameter = 5, 
		RULE_blockItemList = 6, RULE_expression = 7, RULE_arithExpression = 8, 
		RULE_castExpression = 9, RULE_statement = 10, RULE_actual = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"externalDeclaration", "typeSpecifier", "initDeclaratorList", "functionDefinition", 
			"parameterlist", "parameter", "blockItemList", "expression", "arithExpression", 
			"castExpression", "statement", "actual"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'!='", "'''", "'_Bool'", "'char'", "'else'", "'if'", "'int'", 
			"'return'", "'while'", "'void'", "'=='", "'<'", "'>'", "'+'", "'-'", 
			"'*'", "'/'", "'='", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Bool", "Char", "Else", "If", "Int", "Return", 
			"While", "Void", "Equal", "Less", "Greater", "Plus", "Minus", "Star", 
			"Div", "Assign", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"Semi", "Identifier", "DigitSequence", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(24);
					functionDefinition();
					}
					break;
				case 2:
					{
					setState(25);
					initDeclaratorList();
					setState(26);
					match(Semi);
					}
					break;
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				_localctx = new VoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(Void);
				}
				break;
			case Char:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(Char);
				}
				break;
			case Int:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(Int);
				}
				break;
			case Bool:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
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
		public List<TerminalNode> Assign() { return getTokens(CParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(CParser.Assign, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CParser.Identifier, i);
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
		enterRule(_localctx, 4, RULE_initDeclaratorList);
		int _la;
		try {
			_localctx = new Var_delContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			typeSpecifier();
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(42);
				((Var_delContext)_localctx).id1 = match(Identifier);
				}
				break;
			case 2:
				{
				setState(43);
				((Var_delContext)_localctx).id2 = match(Identifier);
				setState(44);
				match(Assign);
				setState(45);
				((Var_delContext)_localctx).c1 = expression(0);
				}
				break;
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(48);
				match(T__0);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(49);
					((Var_delContext)_localctx).id3 = match(Identifier);
					}
					break;
				case 2:
					{
					setState(50);
					((Var_delContext)_localctx).id4 = match(Identifier);
					setState(51);
					match(Assign);
					setState(52);
					((Var_delContext)_localctx).c2 = expression(0);
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
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Void_funcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((Void_funcContext)_localctx).c1 = typeSpecifier();
				setState(58);
				((Void_funcContext)_localctx).id1 = match(Identifier);
				setState(59);
				match(LeftParen);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(60);
					parameterlist();
					}
				}

				setState(63);
				match(RightParen);
				setState(64);
				match(LeftBrace);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					{
					setState(65);
					blockItemList(0);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new Notvoid_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((Notvoid_funcContext)_localctx).c2 = typeSpecifier();
				setState(74);
				((Notvoid_funcContext)_localctx).id2 = match(Identifier);
				setState(75);
				match(LeftParen);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(76);
					parameterlist();
					}
				}

				setState(79);
				match(RightParen);
				setState(80);
				match(LeftBrace);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					{
					setState(81);
					blockItemList(0);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(Return);
				setState(88);
				expression(0);
				setState(89);
				match(Semi);
				setState(90);
				match(RightBrace);
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
		enterRule(_localctx, 8, RULE_parameterlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			parameter();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(95);
				match(T__0);
				setState(96);
				parameter();
				}
				}
				setState(101);
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
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			typeSpecifier();
			setState(103);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
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
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case If:
			case While:
			case LeftParen:
			case LeftBrace:
			case Semi:
			case Identifier:
			case DigitSequence:
				{
				setState(106);
				statement();
				}
				break;
			case Bool:
			case Char:
			case Int:
			case Void:
				{
				{
				setState(107);
				initDeclaratorList();
				setState(108);
				match(Semi);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(112);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
					case If:
					case While:
					case LeftParen:
					case LeftBrace:
					case Semi:
					case Identifier:
					case DigitSequence:
						{
						setState(113);
						statement();
						}
						break;
					case Bool:
					case Char:
					case Int:
					case Void:
						{
						{
						setState(114);
						initDeclaratorList();
						setState(115);
						match(Semi);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ArithExpressionContext e3;
		public ArithExpressionContext e2;
		public ArithExpressionContext arithExpression() {
			return getRuleContext(ArithExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CParser.Greater, 0); }
		public TerminalNode Equal() { return getToken(CParser.Equal, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			((ExpressionContext)_localctx).e3 = arithExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(127);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(128);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Equal) | (1L << Less) | (1L << Greater))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(129);
					((ExpressionContext)_localctx).e2 = arithExpression(0);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithExpressionContext extends ParserRuleContext {
		public ArithExpressionContext e1;
		public CastExpressionContext e3;
		public CastExpressionContext e2;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ArithExpressionContext arithExpression() {
			return getRuleContext(ArithExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Div() { return getToken(CParser.Div, 0); }
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
		return arithExpression(0);
	}

	private ArithExpressionContext arithExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithExpressionContext _localctx = new ArithExpressionContext(_ctx, _parentState);
		ArithExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			((ArithExpressionContext)_localctx).e3 = castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithExpressionContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arithExpression);
					setState(138);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(139);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(140);
					((ArithExpressionContext)_localctx).e2 = castExpression();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public TerminalNode Whitespace() { return getToken(CParser.Whitespace, 0); }
		public Char_valueContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitChar_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_castExpression);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(DigitSequence);
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(LeftParen);
				setState(149);
				expression(0);
				setState(150);
				match(RightParen);
				}
				break;
			case 4:
				_localctx = new Func_callContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(Identifier);
				setState(153);
				match(LeftParen);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(154);
					actual();
					}
				}

				setState(157);
				match(RightParen);
				}
				break;
			case 5:
				_localctx = new Char_valueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(T__2);
				setState(159);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << DigitSequence) | (1L << Whitespace))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				match(T__2);
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
	public static class FunccallContext extends StatementContext {
		public Token id;
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ActualContext actual() {
			return getRuleContext(ActualContext.class,0);
		}
		public FunccallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunccall(this);
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
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Compound_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(LeftBrace);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(164);
					blockItemList(0);
					}
				}

				setState(167);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new Expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(168);
					expression(0);
					}
				}

				setState(171);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(If);
				setState(173);
				match(LeftParen);
				setState(174);
				expression(0);
				setState(175);
				match(RightParen);
				setState(176);
				((If_stmtContext)_localctx).c1 = statement();
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(177);
					match(Else);
					setState(178);
					((If_stmtContext)_localctx).c2 = statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new While_stmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(While);
				setState(182);
				match(LeftParen);
				setState(183);
				expression(0);
				setState(184);
				match(RightParen);
				setState(185);
				statement();
				}
				break;
			case 5:
				_localctx = new FunccallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				((FunccallContext)_localctx).id = match(Identifier);
				setState(188);
				match(LeftParen);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(189);
					actual();
					}
				}

				setState(192);
				match(RightParen);
				setState(193);
				match(Semi);
				}
				break;
			case 6:
				_localctx = new Assn_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(Identifier);
				setState(195);
				match(Assign);
				setState(196);
				expression(0);
				setState(197);
				match(Semi);
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
		enterRule(_localctx, 22, RULE_actual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			expression(0);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(202);
				match(T__0);
				setState(203);
				expression(0);
				}
				}
				setState(208);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 8:
			return arithExpression_sempred((ArithExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithExpression_sempred(ArithExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\48\n\4\5\4:\n\4\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\7\5E\n\5"+
		"\f\5\16\5H\13\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\7\5U\n\5"+
		"\f\5\16\5X\13\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\7\6d\n\6\f\6"+
		"\16\6g\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bx\n\b\7\bz\n\b\f\b\16\b}\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0085"+
		"\n\t\f\t\16\t\u0088\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16"+
		"\n\u0093\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u00a4\n\13\3\f\3\f\5\f\u00a8\n\f\3\f\3"+
		"\f\5\f\u00ac\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00ca\n\f\3\r\3\r\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\r\2\5\16"+
		"\20\22\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\4\2\4\4\16\20\3\2\21\24\3"+
		"\2\33\35\2\u00e9\2 \3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b^\3\2\2\2\n`\3\2\2"+
		"\2\fh\3\2\2\2\16k\3\2\2\2\20~\3\2\2\2\22\u0089\3\2\2\2\24\u00a3\3\2\2"+
		"\2\26\u00c9\3\2\2\2\30\u00cb\3\2\2\2\32\37\5\b\5\2\33\34\5\6\4\2\34\35"+
		"\7\32\2\2\35\37\3\2\2\2\36\32\3\2\2\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3"+
		"\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3$\3\3\2\2\2%*\7\r\2\2&"+
		"*\7\7\2\2\'*\7\n\2\2(*\7\6\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2"+
		"\2*\5\3\2\2\2+\60\5\4\3\2,\61\7\33\2\2-.\7\33\2\2./\7\25\2\2/\61\5\20"+
		"\t\2\60,\3\2\2\2\60-\3\2\2\2\619\3\2\2\2\62\67\7\3\2\2\638\7\33\2\2\64"+
		"\65\7\33\2\2\65\66\7\25\2\2\668\5\20\t\2\67\63\3\2\2\2\67\64\3\2\2\28"+
		":\3\2\2\29\62\3\2\2\29:\3\2\2\2:\7\3\2\2\2;<\5\4\3\2<=\7\33\2\2=?\7\26"+
		"\2\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\27\2\2BF\7\30\2\2CE\5"+
		"\16\b\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ"+
		"\7\31\2\2J_\3\2\2\2KL\5\4\3\2LM\7\33\2\2MO\7\26\2\2NP\5\n\6\2ON\3\2\2"+
		"\2OP\3\2\2\2PQ\3\2\2\2QR\7\27\2\2RV\7\30\2\2SU\5\16\b\2TS\3\2\2\2UX\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\13\2\2Z[\5\20\t\2["+
		"\\\7\32\2\2\\]\7\31\2\2]_\3\2\2\2^;\3\2\2\2^K\3\2\2\2_\t\3\2\2\2`e\5\f"+
		"\7\2ab\7\3\2\2bd\5\f\7\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3"+
		"\2\2\2ge\3\2\2\2hi\5\4\3\2ij\7\33\2\2j\r\3\2\2\2kp\b\b\1\2lq\5\26\f\2"+
		"mn\5\6\4\2no\7\32\2\2oq\3\2\2\2pl\3\2\2\2pm\3\2\2\2q{\3\2\2\2rw\f\3\2"+
		"\2sx\5\26\f\2tu\5\6\4\2uv\7\32\2\2vx\3\2\2\2ws\3\2\2\2wt\3\2\2\2xz\3\2"+
		"\2\2yr\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}{\3\2\2\2~\177"+
		"\b\t\1\2\177\u0080\5\22\n\2\u0080\u0086\3\2\2\2\u0081\u0082\f\3\2\2\u0082"+
		"\u0083\t\2\2\2\u0083\u0085\5\22\n\2\u0084\u0081\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\b\n\1\2\u008a\u008b\5\24\13\2\u008b\u0091\3"+
		"\2\2\2\u008c\u008d\f\3\2\2\u008d\u008e\t\3\2\2\u008e\u0090\5\24\13\2\u008f"+
		"\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\23\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u00a4\7\34\2\2\u0095\u00a4"+
		"\7\33\2\2\u0096\u0097\7\26\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7\27\2"+
		"\2\u0099\u00a4\3\2\2\2\u009a\u009b\7\33\2\2\u009b\u009d\7\26\2\2\u009c"+
		"\u009e\5\30\r\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a4\7\27\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\t\4\2\2\u00a2"+
		"\u00a4\7\5\2\2\u00a3\u0094\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3\u0096\3\2"+
		"\2\2\u00a3\u009a\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a7"+
		"\7\30\2\2\u00a6\u00a8\5\16\b\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00ca\7\31\2\2\u00aa\u00ac\5\20\t\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ca\7\32\2\2"+
		"\u00ae\u00af\7\t\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2"+
		"\7\27\2\2\u00b2\u00b5\5\26\f\2\u00b3\u00b4\7\b\2\2\u00b4\u00b6\5\26\f"+
		"\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ca\3\2\2\2\u00b7\u00b8"+
		"\7\f\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00bb\7\27\2"+
		"\2\u00bb\u00bc\5\26\f\2\u00bc\u00ca\3\2\2\2\u00bd\u00be\7\33\2\2\u00be"+
		"\u00c0\7\26\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00ca\7\32\2\2\u00c4"+
		"\u00c5\7\33\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8"+
		"\7\32\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00a5\3\2\2\2\u00c9\u00ab\3\2\2\2"+
		"\u00c9\u00ae\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c4"+
		"\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00d0\5\20\t\2\u00cc\u00cd\7\3\2\2\u00cd"+
		"\u00cf\5\20\t\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d0\3\2\2\2\33\36"+
		" )\60\679?FOV^epw{\u0086\u0091\u009d\u00a3\u00a7\u00ab\u00b5\u00c0\u00c9"+
		"\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}