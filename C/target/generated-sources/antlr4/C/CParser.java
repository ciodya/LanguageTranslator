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
		RightBrace=23, Semi=24, Comma=25, Double_quo=26, Dot=27, Identifier=28, 
		DigitSequence=29, CharValue=30, CharArray=31, Punc=32, Oprator=33, Whitespace=34, 
		Newline=35, BlockComment=36, LineComment=37;
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
			null, "'['", "']'", "'_Bool'", "'char'", "'else'", "'if'", "'int'", "'return'", 
			"'while'", "'void'", "'=='", "'!='", "'<'", "'>'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'('", "')'", "'{'", "'}'", "';'", "','", "'\"'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Bool", "Char", "Else", "If", "Int", "Return", "While", 
			"Void", "Equal", "NotEqual", "Less", "Greater", "Plus", "Minus", "Star", 
			"Div", "Assign", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"Semi", "Comma", "Double_quo", "Dot", "Identifier", "DigitSequence", 
			"CharValue", "CharArray", "Punc", "Oprator", "Whitespace", "Newline", 
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
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
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public List<TerminalNode> Assign() { return getTokens(CParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(CParser.Assign, i);
		}
		public List<TerminalNode> DigitSequence() { return getTokens(CParser.DigitSequence); }
		public TerminalNode DigitSequence(int i) {
			return getToken(CParser.DigitSequence, i);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(51);
				((Var_delContext)_localctx).id1 = match(Identifier);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(52);
					match(T__0);
					setState(53);
					match(DigitSequence);
					setState(54);
					match(T__1);
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(57);
				((Var_delContext)_localctx).id2 = match(Identifier);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(58);
					match(T__0);
					setState(59);
					match(DigitSequence);
					setState(60);
					match(T__1);
					}
				}

				setState(63);
				match(Assign);
				setState(64);
				((Var_delContext)_localctx).c1 = expression();
				}
				}
				break;
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(67);
				match(Comma);
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(68);
					((Var_delContext)_localctx).id3 = match(Identifier);
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(69);
						match(T__0);
						setState(70);
						match(DigitSequence);
						setState(71);
						match(T__1);
						}
					}

					}
					break;
				case 2:
					{
					{
					setState(74);
					((Var_delContext)_localctx).id4 = match(Identifier);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(75);
						match(T__0);
						setState(76);
						match(DigitSequence);
						setState(77);
						match(T__1);
						}
					}

					setState(80);
					match(Assign);
					setState(81);
					((Var_delContext)_localctx).c2 = expression();
					}
					}
					break;
				}
				}
			}

			setState(86);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Void_funcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(88);
				((Void_funcContext)_localctx).c1 = typeSpecifier();
				setState(89);
				((Void_funcContext)_localctx).id1 = match(Identifier);
				setState(90);
				match(LeftParen);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(91);
					parameterlist();
					}
				}

				setState(94);
				match(RightParen);
				setState(95);
				match(LeftBrace);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					{
					setState(96);
					blockItemList();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Notvoid_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(104);
				((Notvoid_funcContext)_localctx).c2 = typeSpecifier();
				setState(105);
				((Notvoid_funcContext)_localctx).id2 = match(Identifier);
				setState(106);
				match(LeftParen);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Int) | (1L << Void))) != 0)) {
					{
					setState(107);
					parameterlist();
					}
				}

				setState(110);
				match(RightParen);
				setState(111);
				match(LeftBrace);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					{
					setState(112);
					blockItemList();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(Return);
				setState(119);
				expression();
				setState(120);
				match(Semi);
				setState(121);
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
			setState(125);
			parameter();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(126);
				match(Comma);
				setState(127);
				parameter();
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
			setState(133);
			typeSpecifier();
			setState(134);
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
			setState(138); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(138);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case If:
					case While:
					case LeftParen:
					case LeftBrace:
					case Semi:
					case Identifier:
					case DigitSequence:
					case CharValue:
					case CharArray:
						{
						setState(136);
						statement();
						}
						break;
					case Bool:
					case Char:
					case Int:
					case Void:
						{
						{
						setState(137);
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
				setState(140); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(142);
			((ExpressionContext)_localctx).e1 = arithExpression();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Less) | (1L << Greater))) != 0)) {
				{
				{
				setState(143);
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
				setState(144);
				((ExpressionContext)_localctx).e2 = arithExpression();
				}
				}
				setState(149);
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
			setState(150);
			((ArithExpressionContext)_localctx).e1 = castExpression();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0)) {
				{
				{
				setState(151);
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
				setState(152);
				((ArithExpressionContext)_localctx).e2 = castExpression();
				}
				}
				setState(157);
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
	public static class Char_arrayContext extends CastExpressionContext {
		public TerminalNode CharArray() { return getToken(CParser.CharArray, 0); }
		public Char_arrayContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitChar_array(this);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(DigitSequence);
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(160);
				match(LeftParen);
				setState(161);
				expression();
				setState(162);
				match(RightParen);
				}
				}
				break;
			case 4:
				_localctx = new Func_callContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(164);
				match(Identifier);
				setState(165);
				match(LeftParen);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					setState(166);
					actual();
					}
				}

				setState(169);
				match(RightParen);
				}
				}
				break;
			case 5:
				_localctx = new Char_valueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(170);
				match(CharValue);
				}
				}
				break;
			case 6:
				_localctx = new Char_arrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(171);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Compound_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(174);
				match(LeftBrace);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << If) | (1L << Int) | (1L << While) | (1L << Void) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					setState(175);
					blockItemList();
					}
				}

				setState(178);
				match(RightBrace);
				}
				}
				break;
			case 2:
				_localctx = new Expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Identifier) | (1L << DigitSequence) | (1L << CharValue) | (1L << CharArray))) != 0)) {
					{
					setState(179);
					expression();
					}
				}

				setState(182);
				match(Semi);
				}
				}
				break;
			case 3:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(183);
				match(If);
				setState(184);
				match(LeftParen);
				setState(185);
				((If_stmtContext)_localctx).e1 = expression();
				setState(186);
				match(RightParen);
				setState(187);
				((If_stmtContext)_localctx).c1 = statement();
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(188);
					match(Else);
					setState(189);
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
				setState(192);
				match(While);
				setState(193);
				match(LeftParen);
				setState(194);
				expression();
				setState(195);
				match(RightParen);
				setState(196);
				statement();
				}
				}
				break;
			case 5:
				_localctx = new Func_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(198);
				funccall();
				setState(199);
				match(Semi);
				}
				}
				break;
			case 6:
				_localctx = new Assn_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(201);
				match(Identifier);
				setState(202);
				match(Assign);
				setState(203);
				expression();
				setState(204);
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
			setState(208);
			expression();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(209);
				match(Comma);
				setState(210);
				expression();
				}
				}
				setState(215);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\5\5D\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\5\5U\n\5\5"+
		"\5W\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\7\6d\n\6\f\6\16\6"+
		"g\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6\7\6t\n\6\f\6\16\6"+
		"w\13\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16\7"+
		"\u0086\13\7\3\b\3\b\3\b\3\t\3\t\6\t\u008d\n\t\r\t\16\t\u008e\3\n\3\n\3"+
		"\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\13\3\13\3\13\7\13\u009c\n\13\f"+
		"\13\16\13\u009f\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00aa\n"+
		"\f\3\f\3\f\3\f\5\f\u00af\n\f\3\r\3\r\5\r\u00b3\n\r\3\r\3\r\5\r\u00b7\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\16\7\16\u00d6"+
		"\n\16\f\16\16\16\u00d9\13\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\4\3\2\r\20\3\2\21\24\2\u00f4\2!\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b"+
		"\64\3\2\2\2\n}\3\2\2\2\f\177\3\2\2\2\16\u0087\3\2\2\2\20\u008c\3\2\2\2"+
		"\22\u0090\3\2\2\2\24\u0098\3\2\2\2\26\u00ae\3\2\2\2\30\u00d0\3\2\2\2\32"+
		"\u00d2\3\2\2\2\34 \5\n\6\2\35 \5\b\5\2\36 \5\6\4\2\37\34\3\2\2\2\37\35"+
		"\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3"+
		"\2\2\2$%\7\2\2\3%\3\3\2\2\2&+\7\f\2\2\'+\7\6\2\2(+\7\t\2\2)+\7\5\2\2*"+
		"&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7\36\2\2-/\7\26"+
		"\2\2.\60\5\32\16\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\27\2\2"+
		"\62\63\7\32\2\2\63\7\3\2\2\2\64C\5\4\3\2\659\7\36\2\2\66\67\7\3\2\2\67"+
		"8\7\37\2\28:\7\4\2\29\66\3\2\2\29:\3\2\2\2:D\3\2\2\2;?\7\36\2\2<=\7\3"+
		"\2\2=>\7\37\2\2>@\7\4\2\2?<\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\25\2\2BD\5"+
		"\22\n\2C\65\3\2\2\2C;\3\2\2\2DV\3\2\2\2ET\7\33\2\2FJ\7\36\2\2GH\7\3\2"+
		"\2HI\7\37\2\2IK\7\4\2\2JG\3\2\2\2JK\3\2\2\2KU\3\2\2\2LP\7\36\2\2MN\7\3"+
		"\2\2NO\7\37\2\2OQ\7\4\2\2PM\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\25\2\2SU\5"+
		"\22\n\2TF\3\2\2\2TL\3\2\2\2UW\3\2\2\2VE\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY"+
		"\7\32\2\2Y\t\3\2\2\2Z[\5\4\3\2[\\\7\36\2\2\\^\7\26\2\2]_\5\f\7\2^]\3\2"+
		"\2\2^_\3\2\2\2_`\3\2\2\2`a\7\27\2\2ae\7\30\2\2bd\5\20\t\2cb\3\2\2\2dg"+
		"\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\31\2\2i~\3\2\2\2"+
		"jk\5\4\3\2kl\7\36\2\2ln\7\26\2\2mo\5\f\7\2nm\3\2\2\2no\3\2\2\2op\3\2\2"+
		"\2pq\7\27\2\2qu\7\30\2\2rt\5\20\t\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\n\2\2yz\5\22\n\2z{\7\32\2\2{|\7\31\2\2"+
		"|~\3\2\2\2}Z\3\2\2\2}j\3\2\2\2~\13\3\2\2\2\177\u0084\5\16\b\2\u0080\u0081"+
		"\7\33\2\2\u0081\u0083\5\16\b\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0087\u0088\5\4\3\2\u0088\u0089\7\36\2\2\u0089\17\3\2\2\2\u008a"+
		"\u008d\5\30\r\2\u008b\u008d\5\b\5\2\u008c\u008a\3\2\2\2\u008c\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u0095\5\24\13\2\u0091\u0092\t\2\2\2\u0092\u0094\5\24"+
		"\13\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\23\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009d\5\26\f"+
		"\2\u0099\u009a\t\3\2\2\u009a\u009c\5\26\f\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\25\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00af\7\37\2\2\u00a1\u00af\7\36\2\2\u00a2"+
		"\u00a3\7\26\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\7\27\2\2\u00a5\u00af"+
		"\3\2\2\2\u00a6\u00a7\7\36\2\2\u00a7\u00a9\7\26\2\2\u00a8\u00aa\5\32\16"+
		"\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af"+
		"\7\27\2\2\u00ac\u00af\7 \2\2\u00ad\u00af\7!\2\2\u00ae\u00a0\3\2\2\2\u00ae"+
		"\u00a1\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b2\7\30\2\2\u00b1\u00b3"+
		"\5\20\t\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00d1\7\31\2\2\u00b5\u00b7\5\22\n\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00d1\7\32\2\2\u00b9\u00ba\7\b\2\2"+
		"\u00ba\u00bb\7\26\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\7\27\2\2\u00bd"+
		"\u00c0\5\30\r\2\u00be\u00bf\7\7\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00d1\3\2\2\2\u00c2\u00c3\7\13\2\2\u00c3"+
		"\u00c4\7\26\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7"+
		"\5\30\r\2\u00c7\u00d1\3\2\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\7\32\2\2"+
		"\u00ca\u00d1\3\2\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\7\25\2\2\u00cd\u00ce"+
		"\5\22\n\2\u00ce\u00cf\7\32\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00b0\3\2\2\2"+
		"\u00d0\u00b6\3\2\2\2\u00d0\u00b9\3\2\2\2\u00d0\u00c2\3\2\2\2\u00d0\u00c8"+
		"\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d7\5\22\n\2\u00d3"+
		"\u00d4\7\33\2\2\u00d4\u00d6\5\22\n\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\33\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\36\37!*/9?CJPTV^enu}\u0084\u008c\u008e\u0095\u009d\u00a9"+
		"\u00ae\u00b2\u00b6\u00c0\u00d0\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}