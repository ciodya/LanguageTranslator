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
		T__0=1, T__1=2, Bool=3, Char=4, Else=5, If=6, Elseif=7, Int=8, Return=9, 
		While=10, Void=11, Equal=12, NotEqual=13, Less=14, Greater=15, Plus=16, 
		Minus=17, Star=18, Div=19, Assign=20, LeftParen=21, RightParen=22, LeftBrace=23, 
		RightBrace=24, Semi=25, Identifier=26, DigitSequence=27, CharValue=28, 
		Whitespace=29, Newline=30, BlockComment=31, LineComment=32;
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
			null, "','", "'''", "'_Bool'", "'char'", "'else'", "'if'", "'else if'", 
			"'int'", "'return'", "'while'", "'void'", "'=='", "'!='", "'<'", "'>'", 
			"'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Bool", "Char", "Else", "If", "Elseif", "Int", "Return", 
			"While", "Void", "Equal", "NotEqual", "Less", "Greater", "Plus", "Minus", 
			"Star", "Div", "Assign", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(29);
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
					setState(27);
					initDeclaratorList();
					}
					break;
				case 3:
					{
					setState(28);
					funccall();
					}
					break;
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				_localctx = new VoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(Void);
				}
				break;
			case Char:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(Char);
				}
				break;
			case Int:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(Int);
				}
				break;
			case Bool:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
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
			setState(42);
			match(Identifier);
			setState(43);
			match(LeftParen);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
				{
				setState(44);
				actual();
				}
			}

			setState(47);
			match(RightParen);
			setState(48);
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
			setState(50);
			typeSpecifier();
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(51);
				((Var_delContext)_localctx).id1 = match(Identifier);
				}
				break;
			case 2:
				{
				{
				setState(52);
				((Var_delContext)_localctx).id2 = match(Identifier);
				setState(53);
				match(Assign);
				setState(54);
				((Var_delContext)_localctx).c1 = expression();
				}
				}
				break;
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(57);
				match(T__0);
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(58);
					((Var_delContext)_localctx).id3 = match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(59);
					((Var_delContext)_localctx).id4 = match(Identifier);
					setState(60);
					match(Assign);
					setState(61);
					((Var_delContext)_localctx).c2 = expression();
					}
					}
					break;
				}
				}
			}

			setState(66);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Void_funcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(68);
				((Void_funcContext)_localctx).c1 = typeSpecifier();
				setState(69);
				((Void_funcContext)_localctx).id1 = match(Identifier);
				setState(70);
				match(LeftParen);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(71);
					parameterlist();
					}
				}

				setState(74);
				match(RightParen);
				setState(75);
				match(LeftBrace);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					{
					setState(76);
					blockItemList();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Notvoid_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(84);
				((Notvoid_funcContext)_localctx).c2 = typeSpecifier();
				setState(85);
				((Notvoid_funcContext)_localctx).id2 = match(Identifier);
				setState(86);
				match(LeftParen);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(87);
					parameterlist();
					}
				}

				setState(90);
				match(RightParen);
				setState(91);
				match(LeftBrace);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					{
					setState(92);
					blockItemList();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(Return);
				setState(99);
				expression();
				setState(100);
				match(Semi);
				setState(101);
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
			setState(105);
			parameter();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(106);
				match(T__0);
				setState(107);
				parameter();
				}
				}
				setState(112);
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
			setState(113);
			typeSpecifier();
			setState(114);
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
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(118);
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
						setState(116);
						statement();
						}
						break;
					case Bool:
					case Char:
					case Int:
					case Void:
						{
						{
						setState(117);
						initDeclaratorList();
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
				setState(120); 
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
			setState(122);
			((ExpressionContext)_localctx).e1 = arithExpression();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Less) | (1L << Greater))) != 0)) {
				{
				{
				setState(123);
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
				setState(124);
				((ExpressionContext)_localctx).e2 = arithExpression();
				}
				}
				setState(129);
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
			setState(130);
			((ArithExpressionContext)_localctx).e1 = castExpression();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0)) {
				{
				{
				setState(131);
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
				setState(132);
				((ArithExpressionContext)_localctx).e2 = castExpression();
				}
				}
				setState(137);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(DigitSequence);
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(140);
				match(LeftParen);
				setState(141);
				expression();
				setState(142);
				match(RightParen);
				}
				}
				break;
			case 4:
				_localctx = new Func_callContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(144);
				match(Identifier);
				setState(145);
				match(LeftParen);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(146);
					actual();
					}
				}

				setState(149);
				match(RightParen);
				}
				}
				break;
			case 5:
				_localctx = new Char_valueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(150);
				match(T__1);
				setState(151);
				((Char_valueContext)_localctx).e1 = match(CharValue);
				setState(152);
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
		public ExpressionContext e1;
		public StatementContext c1;
		public ExpressionContext e2;
		public StatementContext c2;
		public StatementContext c3;
		public TerminalNode If() { return getToken(CParser.If, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Elseif() { return getToken(CParser.Elseif, 0); }
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Compound_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(155);
				match(LeftBrace);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(156);
					blockItemList();
					}
				}

				setState(159);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence))) != 0)) {
					{
					setState(160);
					expression();
					}
				}

				setState(163);
				match(Semi);
				}
				}
				break;
			case 3:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(164);
				match(If);
				setState(165);
				match(LeftParen);
				setState(166);
				((If_stmtContext)_localctx).e1 = expression();
				setState(167);
				match(RightParen);
				setState(168);
				((If_stmtContext)_localctx).c1 = statement();
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(169);
					match(Elseif);
					setState(170);
					match(LeftParen);
					setState(171);
					((If_stmtContext)_localctx).e2 = expression();
					setState(172);
					match(RightParen);
					setState(173);
					((If_stmtContext)_localctx).c2 = statement();
					}
					break;
				}
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(177);
					match(Else);
					setState(178);
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
				setState(181);
				match(While);
				setState(182);
				match(LeftParen);
				setState(183);
				expression();
				setState(184);
				match(RightParen);
				setState(185);
				statement();
				}
				}
				break;
			case 5:
				_localctx = new Func_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(187);
				funccall();
				setState(188);
				match(Semi);
				}
				}
				break;
			case 6:
				_localctx = new Assn_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(190);
				match(Identifier);
				setState(191);
				match(Assign);
				setState(192);
				expression();
				setState(193);
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
			setState(197);
			expression();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(198);
				match(T__0);
				setState(199);
				expression();
				}
				}
				setState(204);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\5\5C\n\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3\b\3\b\3\b"+
		"\3\t\3\t\6\ty\n\t\r\t\16\tz\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13"+
		"\n\3\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0096\n\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r"+
		"\3\r\5\r\u00a0\n\r\3\r\3\r\5\r\u00a4\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\r\3\r\5\r\u00b6\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\16"+
		"\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\4\3\2\16\21\3\2\22\25\2\u00e5\2!\3\2\2\2\4*\3\2\2\2"+
		"\6,\3\2\2\2\b\64\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16s\3\2\2\2\20x\3\2\2\2"+
		"\22|\3\2\2\2\24\u0084\3\2\2\2\26\u009b\3\2\2\2\30\u00c5\3\2\2\2\32\u00c7"+
		"\3\2\2\2\34 \5\n\6\2\35 \5\b\5\2\36 \5\6\4\2\37\34\3\2\2\2\37\35\3\2\2"+
		"\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2"+
		"$%\7\2\2\3%\3\3\2\2\2&+\7\r\2\2\'+\7\6\2\2(+\7\n\2\2)+\7\5\2\2*&\3\2\2"+
		"\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7\34\2\2-/\7\27\2\2.\60"+
		"\5\32\16\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\30\2\2\62\63\7"+
		"\33\2\2\63\7\3\2\2\2\649\5\4\3\2\65:\7\34\2\2\66\67\7\34\2\2\678\7\26"+
		"\2\28:\5\22\n\29\65\3\2\2\29\66\3\2\2\2:B\3\2\2\2;@\7\3\2\2<A\7\34\2\2"+
		"=>\7\34\2\2>?\7\26\2\2?A\5\22\n\2@<\3\2\2\2@=\3\2\2\2AC\3\2\2\2B;\3\2"+
		"\2\2BC\3\2\2\2CD\3\2\2\2DE\7\33\2\2E\t\3\2\2\2FG\5\4\3\2GH\7\34\2\2HJ"+
		"\7\27\2\2IK\5\f\7\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\30\2\2MQ\7\31\2"+
		"\2NP\5\20\t\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2"+
		"\2\2TU\7\32\2\2Uj\3\2\2\2VW\5\4\3\2WX\7\34\2\2XZ\7\27\2\2Y[\5\f\7\2ZY"+
		"\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\30\2\2]a\7\31\2\2^`\5\20\t\2_^\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\13\2\2ef\5"+
		"\22\n\2fg\7\33\2\2gh\7\32\2\2hj\3\2\2\2iF\3\2\2\2iV\3\2\2\2j\13\3\2\2"+
		"\2kp\5\16\b\2lm\7\3\2\2mo\5\16\b\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2"+
		"\2\2q\r\3\2\2\2rp\3\2\2\2st\5\4\3\2tu\7\34\2\2u\17\3\2\2\2vy\5\30\r\2"+
		"wy\5\b\5\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\21\3\2\2"+
		"\2|\u0081\5\24\13\2}~\t\2\2\2~\u0080\5\24\13\2\177}\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0089\5\26\f\2\u0085\u0086\t\3\2\2\u0086\u0088\5"+
		"\26\f\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u009c\7\35\2"+
		"\2\u008d\u009c\7\34\2\2\u008e\u008f\7\27\2\2\u008f\u0090\5\22\n\2\u0090"+
		"\u0091\7\30\2\2\u0091\u009c\3\2\2\2\u0092\u0093\7\34\2\2\u0093\u0095\7"+
		"\27\2\2\u0094\u0096\5\32\16\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u009c\7\30\2\2\u0098\u0099\7\4\2\2\u0099\u009a"+
		"\7\36\2\2\u009a\u009c\7\4\2\2\u009b\u008c\3\2\2\2\u009b\u008d\3\2\2\2"+
		"\u009b\u008e\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0098\3\2\2\2\u009c\27"+
		"\3\2\2\2\u009d\u009f\7\31\2\2\u009e\u00a0\5\20\t\2\u009f\u009e\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00c6\7\32\2\2\u00a2\u00a4"+
		"\5\22\n\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00c6\7\33\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9"+
		"\5\22\n\2\u00a9\u00aa\7\30\2\2\u00aa\u00b1\5\30\r\2\u00ab\u00ac\7\t\2"+
		"\2\u00ac\u00ad\7\27\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7\30\2\2\u00af"+
		"\u00b0\5\30\r\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\7\7\2\2\u00b4\u00b6\5\30\r\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c6\3\2\2\2\u00b7\u00b8\7\f"+
		"\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7\30\2\2\u00bb"+
		"\u00bc\5\30\r\2\u00bc\u00c6\3\2\2\2\u00bd\u00be\5\6\4\2\u00be\u00bf\7"+
		"\33\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\7\26\2\2"+
		"\u00c2\u00c3\5\22\n\2\u00c3\u00c4\7\33\2\2\u00c4\u00c6\3\2\2\2\u00c5\u009d"+
		"\3\2\2\2\u00c5\u00a3\3\2\2\2\u00c5\u00a6\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5"+
		"\u00bd\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00cc\5\22\n"+
		"\2\u00c8\u00c9\7\3\2\2\u00c9\u00cb\5\22\n\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\33\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\33\37!*/9@BJQZaipxz\u0081\u0089\u0095\u009b\u009f"+
		"\u00a3\u00b1\u00b5\u00c5\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}