// Generated from D:/SER_502/SER502-Noah-Team15-main/src/main/antlr/NOAH.g4 by ANTLR 4.13.2
package com.example.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NOAHParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, BOOLEAN=31, 
		IDENTIFIER=32, INTEGER=33, FLOAT=34, STRING=35, WS=36, COMMENT=37;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_type = 3, 
		RULE_assignment = 4, RULE_printStatement = 5, RULE_printExpression = 6, 
		RULE_expression = 7, RULE_ternaryExpression = 8, RULE_logicalExpression = 9, 
		RULE_comparisonExpression = 10, RULE_additiveExpression = 11, RULE_multiplicativeExpression = 12, 
		RULE_primaryExpression = 13, RULE_ifStatement = 14, RULE_forLoop = 15, 
		RULE_forInitStatement = 16, RULE_forUpdate = 17, RULE_whileLoop = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "variableDeclaration", "type", "assignment", "printStatement", 
			"printExpression", "expression", "ternaryExpression", "logicalExpression", 
			"comparisonExpression", "additiveExpression", "multiplicativeExpression", 
			"primaryExpression", "ifStatement", "forLoop", "forInitStatement", "forUpdate", 
			"whileLoop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'int'", "'float'", "'string'", "'boolean'", "'print'", 
			"'('", "')'", "'+'", "'?'", "':'", "'and'", "'or'", "'not'", "'>='", 
			"'<='", "'>'", "'<'", "'=='", "'!='", "'-'", "'*'", "'/'", "'if'", "'{'", 
			"'}'", "'else'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "BOOLEAN", "IDENTIFIER", "INTEGER", 
			"FLOAT", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "NOAH.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NOAHParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NOAHParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5939134712L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				variableDeclaration();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				printStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				assignment();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				ifStatement();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				forLoop();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				whileLoop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NOAHParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type();
			setState(55);
			match(IDENTIFIER);
			setState(56);
			match(T__0);
			setState(57);
			expression();
			setState(58);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NOAHParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENTIFIER);
			setState(63);
			match(T__0);
			setState(64);
			expression();
			setState(65);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__6);
			setState(68);
			match(T__7);
			setState(69);
			printExpression();
			setState(70);
			match(T__8);
			setState(71);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			expression();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(74);
				match(T__9);
				setState(75);
				expression();
				}
				}
				setState(80);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			ternaryExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ternaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			logicalExpression();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(84);
				match(T__10);
				setState(85);
				expression();
				setState(86);
				match(T__11);
				setState(87);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalExpression);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case BOOLEAN:
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				comparisonExpression();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12 || _la==T__13) {
					{
					{
					setState(92);
					_la = _input.LA(1);
					if ( !(_la==T__12 || _la==T__13) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(93);
					comparisonExpression();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__14);
				setState(100);
				comparisonExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			additiveExpression();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) {
				{
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				additiveExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			multiplicativeExpression();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__21) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(110);
					multiplicativeExpression();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			primaryExpression();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__23) {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				primaryExpression();
				}
				}
				setState(123);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NOAHParser.IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(NOAHParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(NOAHParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(NOAHParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(NOAHParser.STRING, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryExpression);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__7);
				setState(125);
				expression();
				setState(126);
				match(T__8);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__24);
			setState(136);
			match(T__7);
			setState(137);
			expression();
			setState(138);
			match(T__8);
			setState(139);
			match(T__25);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5939134712L) != 0)) {
				{
				{
				setState(140);
				statement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__26);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(147);
				match(T__27);
				setState(148);
				match(T__25);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5939134712L) != 0)) {
					{
					{
					setState(149);
					statement();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__28);
			setState(159);
			match(T__7);
			setState(160);
			forInitStatement();
			setState(161);
			expression();
			setState(162);
			match(T__1);
			setState(163);
			forUpdate();
			setState(164);
			match(T__8);
			setState(165);
			match(T__25);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5939134712L) != 0)) {
				{
				{
				setState(166);
				statement();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NOAHParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forInitStatement);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				type();
				setState(175);
				match(IDENTIFIER);
				setState(176);
				match(T__0);
				setState(177);
				expression();
				setState(178);
				match(T__1);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(IDENTIFIER);
				setState(181);
				match(T__0);
				setState(182);
				expression();
				setState(183);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NOAHParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IDENTIFIER);
			setState(188);
			match(T__0);
			setState(189);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NOAHListener ) ((NOAHListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NOAHVisitor) return ((NOAHVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__29);
			setState(192);
			match(T__7);
			setState(193);
			expression();
			setState(194);
			match(T__8);
			setState(195);
			match(T__25);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5939134712L) != 0)) {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__26);
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
		"\u0004\u0001%\u00cd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006M\b\u0006\n\u0006\f\u0006P\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bZ"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0005\t_\b\t\n\t\f\tb\t\t\u0001\t\u0001\t"+
		"\u0003\tf\b\t\u0001\n\u0001\n\u0001\n\u0003\nk\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\fx\b\f\n\f\f\f{\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0086\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u008e"+
		"\b\u000e\n\u000e\f\u000e\u0091\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0097\b\u000e\n\u000e\f\u000e\u009a\t\u000e\u0001"+
		"\u000e\u0003\u000e\u009d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00a8\b\u000f\n\u000f\f\u000f\u00ab\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00ba\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00c6\b\u0012\n\u0012\f\u0012\u00c9\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005\u0001\u0000\u0003"+
		"\u0006\u0001\u0000\r\u000e\u0001\u0000\u0010\u0015\u0002\u0000\n\n\u0016"+
		"\u0016\u0001\u0000\u0017\u0018\u00d1\u0000)\u0001\u0000\u0000\u0000\u0002"+
		"4\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006<\u0001"+
		"\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000"+
		"\fI\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010S\u0001"+
		"\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014g\u0001\u0000\u0000"+
		"\u0000\u0016l\u0001\u0000\u0000\u0000\u0018t\u0001\u0000\u0000\u0000\u001a"+
		"\u0085\u0001\u0000\u0000\u0000\u001c\u0087\u0001\u0000\u0000\u0000\u001e"+
		"\u009e\u0001\u0000\u0000\u0000 \u00b9\u0001\u0000\u0000\u0000\"\u00bb"+
		"\u0001\u0000\u0000\u0000$\u00bf\u0001\u0000\u0000\u0000&(\u0003\u0002"+
		"\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000"+
		"\u0000\u0000.5\u0003\u0004\u0002\u0000/5\u0003\n\u0005\u000005\u0003\b"+
		"\u0004\u000015\u0003\u001c\u000e\u000025\u0003\u001e\u000f\u000035\u0003"+
		"$\u0012\u00004.\u0001\u0000\u0000\u00004/\u0001\u0000\u0000\u000040\u0001"+
		"\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"43\u0001\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u000067\u0003\u0006"+
		"\u0003\u000078\u0005 \u0000\u000089\u0005\u0001\u0000\u00009:\u0003\u000e"+
		"\u0007\u0000:;\u0005\u0002\u0000\u0000;\u0005\u0001\u0000\u0000\u0000"+
		"<=\u0007\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005 \u0000"+
		"\u0000?@\u0005\u0001\u0000\u0000@A\u0003\u000e\u0007\u0000AB\u0005\u0002"+
		"\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000DE\u0005"+
		"\b\u0000\u0000EF\u0003\f\u0006\u0000FG\u0005\t\u0000\u0000GH\u0005\u0002"+
		"\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IN\u0003\u000e\u0007\u0000"+
		"JK\u0005\n\u0000\u0000KM\u0003\u000e\u0007\u0000LJ\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000O\r\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0003\u0010"+
		"\b\u0000R\u000f\u0001\u0000\u0000\u0000SY\u0003\u0012\t\u0000TU\u0005"+
		"\u000b\u0000\u0000UV\u0003\u000e\u0007\u0000VW\u0005\f\u0000\u0000WX\u0003"+
		"\u000e\u0007\u0000XZ\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\u0011\u0001\u0000\u0000\u0000[`\u0003\u0014"+
		"\n\u0000\\]\u0007\u0001\u0000\u0000]_\u0003\u0014\n\u0000^\\\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000af\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0005\u000f\u0000\u0000df\u0003\u0014\n\u0000e[\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000gj\u0003\u0016"+
		"\u000b\u0000hi\u0007\u0002\u0000\u0000ik\u0003\u0016\u000b\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0015\u0001\u0000\u0000"+
		"\u0000lq\u0003\u0018\f\u0000mn\u0007\u0003\u0000\u0000np\u0003\u0018\f"+
		"\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0017\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000ty\u0003\u001a\r\u0000uv\u0007\u0004\u0000\u0000"+
		"vx\u0003\u001a\r\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0019\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\b\u0000\u0000}~\u0003\u000e"+
		"\u0007\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0086\u0001\u0000\u0000"+
		"\u0000\u0080\u0086\u0005 \u0000\u0000\u0081\u0086\u0005\u001f\u0000\u0000"+
		"\u0082\u0086\u0005!\u0000\u0000\u0083\u0086\u0005\"\u0000\u0000\u0084"+
		"\u0086\u0005#\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085\u0080\u0001"+
		"\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u001b\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0019\u0000\u0000\u0088\u0089\u0005\b\u0000\u0000\u0089\u008a\u0003\u000e"+
		"\u0007\u0000\u008a\u008b\u0005\t\u0000\u0000\u008b\u008f\u0005\u001a\u0000"+
		"\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u009c\u0005\u001b\u0000"+
		"\u0000\u0093\u0094\u0005\u001c\u0000\u0000\u0094\u0098\u0005\u001a\u0000"+
		"\u0000\u0095\u0097\u0003\u0002\u0001\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u001b\u0000"+
		"\u0000\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001d\u0000"+
		"\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a1\u0003 \u0010\u0000"+
		"\u00a1\u00a2\u0003\u000e\u0007\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000"+
		"\u00a3\u00a4\u0003\"\u0011\u0000\u00a4\u00a5\u0005\t\u0000\u0000\u00a5"+
		"\u00a9\u0005\u001a\u0000\u0000\u00a6\u00a8\u0003\u0002\u0001\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005\u001b\u0000\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0003\u0006\u0003\u0000\u00af\u00b0\u0005 \u0000\u0000\u00b0\u00b1"+
		"\u0005\u0001\u0000\u0000\u00b1\u00b2\u0003\u000e\u0007\u0000\u00b2\u00b3"+
		"\u0005\u0002\u0000\u0000\u00b3\u00ba\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005 \u0000\u0000\u00b5\u00b6\u0005\u0001\u0000\u0000\u00b6\u00b7\u0003"+
		"\u000e\u0007\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ae\u0001\u0000\u0000\u0000\u00b9\u00b4\u0001"+
		"\u0000\u0000\u0000\u00ba!\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005 \u0000"+
		"\u0000\u00bc\u00bd\u0005\u0001\u0000\u0000\u00bd\u00be\u0003\u000e\u0007"+
		"\u0000\u00be#\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u001e\u0000\u0000"+
		"\u00c0\u00c1\u0005\b\u0000\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2"+
		"\u00c3\u0005\t\u0000\u0000\u00c3\u00c7\u0005\u001a\u0000\u0000\u00c4\u00c6"+
		"\u0003\u0002\u0001\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u001b\u0000\u0000\u00cb%\u0001"+
		"\u0000\u0000\u0000\u0010)4NY`ejqy\u0085\u008f\u0098\u009c\u00a9\u00b9"+
		"\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}