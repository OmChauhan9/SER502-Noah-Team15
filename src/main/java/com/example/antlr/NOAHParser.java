package com.example.antlr;

// Generated from /Users/omchauhan/Desktop/noah/src/main/java/NOAH.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue" })
public class NOAHParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
			T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
			BOOLEAN = 25, IDENTIFIER = 26, NUMERIC = 27, STRING = 28, WS = 29;
	public static final int RULE_start = 0, RULE_statement = 1, RULE_assignment = 2, RULE_ifStatement = 3,
			RULE_forLoop = 4, RULE_whileLoop = 5, RULE_printStatement = 6, RULE_expression = 7,
			RULE_booleanExpr = 8, RULE_relationalExpr = 9, RULE_arithmeticExpr = 10,
			RULE_term = 11, RULE_factor = 12, RULE_stringExpr = 13, RULE_identifier = 14,
			RULE_numericValue = 15;

	private static String[] makeRuleNames() {
		return new String[] {
				"start", "statement", "assignment", "ifStatement", "forLoop", "whileLoop",
				"printStatement", "expression", "booleanExpr", "relationalExpr", "arithmeticExpr",
				"term", "factor", "stringExpr", "identifier", "numericValue"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'='", "';'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'?'",
				"':'", "'for'", "'while'", "'print'", "'and'", "'or'", "'not'", "'<'",
				"'>'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, "BOOLEAN", "IDENTIFIER", "NUMERIC", "STRING", "WS"
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
	public String getGrammarFileName() {
		return "NOAH.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public NOAHParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() {
			return getToken(NOAHParser.EOF, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start;
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503396376L) != 0)) {
					{
						{
							setState(32);
							statement();
						}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class, 0);
		}

		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class, 0);
		}

		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class, 0);
		}

		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1); {
					setState(40);
					assignment();
				}
					break;
				case T__2:
				case T__3:
				case T__15:
				case BOOLEAN:
				case NUMERIC:
				case STRING:
					enterOuterAlt(_localctx, 2); {
					setState(41);
					ifStatement();
				}
					break;
				case T__10:
					enterOuterAlt(_localctx, 3); {
					setState(42);
					forLoop();
				}
					break;
				case T__11:
					enterOuterAlt(_localctx, 4); {
					setState(43);
					whileLoop();
				}
					break;
				case T__12:
					enterOuterAlt(_localctx, 5); {
					setState(44);
					printStatement();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() {
			return getToken(NOAHParser.IDENTIFIER, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(47);
				match(IDENTIFIER);
				setState(48);
				match(T__0);
				setState(49);
				expression();
				setState(50);
				match(T__1);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifStatement;
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__2:
					enterOuterAlt(_localctx, 1); {
					setState(52);
					match(T__2);
					setState(53);
					match(T__3);
					setState(54);
					expression();
					setState(55);
					match(T__4);
					setState(56);
					match(T__5);
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503396376L) != 0)) {
						{
							{
								setState(57);
								statement();
							}
						}
						setState(62);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(63);
					match(T__6);
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T__7) {
						{
							setState(64);
							match(T__7);
							setState(65);
							match(T__5);
							setState(69);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503396376L) != 0)) {
								{
									{
										setState(66);
										statement();
									}
								}
								setState(71);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(72);
							match(T__6);
						}
					}

				}
					break;
				case T__3:
				case T__15:
				case BOOLEAN:
				case NUMERIC:
				case STRING:
					enterOuterAlt(_localctx, 2); {
					setState(75);
					expression();
					setState(76);
					match(T__8);
					setState(77);
					expression();
					setState(78);
					match(T__9);
					setState(79);
					expression();
					setState(80);
					match(T__1);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}

		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class, i);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forLoop;
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(84);
				match(T__10);
				setState(85);
				match(T__3);
				setState(86);
				assignment();
				setState(87);
				expression();
				setState(88);
				match(T__1);
				setState(89);
				assignment();
				setState(90);
				match(T__4);
				setState(91);
				match(T__5);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503396376L) != 0)) {
					{
						{
							setState(92);
							statement();
						}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(T__6);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileLoop;
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				match(T__11);
				setState(101);
				match(T__3);
				setState(102);
				expression();
				setState(103);
				match(T__4);
				setState(104);
				match(T__5);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503396376L) != 0)) {
					{
						{
							setState(105);
							statement();
						}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__6);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printStatement;
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(113);
				match(T__12);
				setState(114);
				match(T__3);
				setState(115);
				expression();
				setState(116);
				match(T__4);
				setState(117);
				match(T__1);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class, 0);
		}

		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class, 0);
		}

		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class, 0);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1); {
					setState(119);
					booleanExpr(0);
				}
					break;
				case 2:
					enterOuterAlt(_localctx, 2); {
					setState(120);
					stringExpr();
				}
					break;
				case 3:
					enterOuterAlt(_localctx, 3); {
					setState(121);
					relationalExpr();
				}
					break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExprContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() {
			return getToken(NOAHParser.BOOLEAN, 0);
		}

		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}

		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class, i);
		}

		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_booleanExpr;
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_booleanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case BOOLEAN: {
						setState(125);
						match(BOOLEAN);
					}
						break;
					case T__15: {
						setState(126);
						match(T__15);
						setState(127);
						booleanExpr(2);
					}
						break;
					case T__3: {
						setState(128);
						match(T__3);
						setState(129);
						booleanExpr(0);
						setState(130);
						match(T__4);
					}
						break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(140);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
								case 1: {
									_localctx = new BooleanExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
									setState(134);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(135);
									match(T__13);
									setState(136);
									booleanExpr(5);
								}
									break;
								case 2: {
									_localctx = new BooleanExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
									setState(137);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(138);
									match(T__14);
									setState(139);
									booleanExpr(4);
								}
									break;
							}
						}
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ParserRuleContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}

		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class, i);
		}

		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relationalExpr;
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(145);
				arithmeticExpr();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) {
					{
						setState(146);
						_la = _input.LA(1);
						if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0))) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF)
								matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(147);
						arithmeticExpr();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}

		public TermContext term(int i) {
			return getRuleContext(TermContext.class, i);
		}

		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arithmeticExpr;
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithmeticExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(150);
				term();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__20 || _la == T__21) {
					{
						{
							setState(151);
							_la = _input.LA(1);
							if (!(_la == T__20 || _la == T__21)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF)
									matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(152);
							term();
						}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}

		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class, i);
		}

		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_term;
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(158);
				factor();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__22 || _la == T__23) {
					{
						{
							setState(159);
							_la = _input.LA(1);
							if (!(_la == T__22 || _la == T__23)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF)
									matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(160);
							factor();
						}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class, 0);
		}

		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class, 0);
		}

		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_factor;
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case NUMERIC:
					enterOuterAlt(_localctx, 1); {
					setState(166);
					numericValue();
				}
					break;
				case T__3:
					enterOuterAlt(_localctx, 2); {
					setState(167);
					match(T__3);
					setState(168);
					arithmeticExpr();
					setState(169);
					match(T__4);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ParserRuleContext {
		public TerminalNode STRING() {
			return getToken(NOAHParser.STRING, 0);
		}

		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stringExpr;
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(173);
				match(STRING);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() {
			return getToken(NOAHParser.IDENTIFIER, 0);
		}

		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_identifier;
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(175);
				match(IDENTIFIER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericValueContext extends ParserRuleContext {
		public TerminalNode NUMERIC() {
			return getToken(NOAHParser.NUMERIC, 0);
		}

		public NumericValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_numericValue;
		}
	}

	public final NumericValueContext numericValue() throws RecognitionException {
		NumericValueContext _localctx = new NumericValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numericValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(177);
				match(NUMERIC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 8:
				return booleanExpr_sempred((BooleanExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 4);
			case 1:
				return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN = "\u0004\u0001\u001d\u00b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"
			+
			"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
			"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
			"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b" +
			"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007" +
			"\u000f\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001" +
			"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
			"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
			"\u0003\u0001\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t\u0003\u0001" +
			"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003D\b\u0003\n\u0003" +
			"\f\u0003G\t\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001\u0003\u0001\u0003" +
			"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003" +
			"S\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004^\b\u0004" +
			"\n\u0004\f\u0004a\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005" +
			"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005k\b\u0005" +
			"\n\u0005\f\u0005n\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006" +
			"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007" +
			"\u0001\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
			"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0085\b\b\u0001\b\u0001\b\u0001\b\u0001" +
			"\b\u0001\b\u0001\b\u0005\b\u008d\b\b\n\b\f\b\u0090\t\b\u0001\t\u0001\t" +
			"\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u009a\b\n\n" +
			"\n\f\n\u009d\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a2" +
			"\b\u000b\n\u000b\f\u000b\u00a5\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f" +
			"\u0001\f\u0003\f\u00ac\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001" +
			"\u000f\u0001\u000f\u0001\u000f\u0000\u0001\u0010\u0010\u0000\u0002\u0004" +
			"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000" +
			"\u0003\u0001\u0000\u0011\u0014\u0001\u0000\u0015\u0016\u0001\u0000\u0017" +
			"\u0018\u00b8\u0000#\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000" +
			"\u0004/\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bT\u0001" +
			"\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000" +
			"\u000ez\u0001\u0000\u0000\u0000\u0010\u0084\u0001\u0000\u0000\u0000\u0012" +
			"\u0091\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016" +
			"\u009e\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a" +
			"\u00ad\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e" +
			"\u00b1\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000" +
			"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001" +
			"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000" +
			"&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000(.\u0003\u0004" +
			"\u0002\u0000).\u0003\u0006\u0003\u0000*.\u0003\b\u0004\u0000+.\u0003\n" +
			"\u0005\u0000,.\u0003\f\u0006\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000" +
			"\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001" +
			"\u0000\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u001a\u0000" +
			"\u000001\u0005\u0001\u0000\u000012\u0003\u000e\u0007\u000023\u0005\u0002" +
			"\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0003\u0000\u0000" +
			"56\u0005\u0004\u0000\u000067\u0003\u000e\u0007\u000078\u0005\u0005\u0000" +
			"\u00008<\u0005\u0006\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000" +
			"\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001" +
			"\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000" +
			"?I\u0005\u0007\u0000\u0000@A\u0005\b\u0000\u0000AE\u0005\u0006\u0000\u0000" +
			"BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000" +
			"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000" +
			"\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0005\u0007\u0000\u0000I@\u0001" +
			"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JS\u0001\u0000\u0000\u0000" +
			"KL\u0003\u000e\u0007\u0000LM\u0005\t\u0000\u0000MN\u0003\u000e\u0007\u0000" +
			"NO\u0005\n\u0000\u0000OP\u0003\u000e\u0007\u0000PQ\u0005\u0002\u0000\u0000" +
			"QS\u0001\u0000\u0000\u0000R4\u0001\u0000\u0000\u0000RK\u0001\u0000\u0000" +
			"\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0005\u000b\u0000\u0000UV\u0005" +
			"\u0004\u0000\u0000VW\u0003\u0004\u0002\u0000WX\u0003\u000e\u0007\u0000" +
			"XY\u0005\u0002\u0000\u0000YZ\u0003\u0004\u0002\u0000Z[\u0005\u0005\u0000" +
			"\u0000[_\u0005\u0006\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000" +
			"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001" +
			"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000" +
			"bc\u0005\u0007\u0000\u0000c\t\u0001\u0000\u0000\u0000de\u0005\f\u0000" +
			"\u0000ef\u0005\u0004\u0000\u0000fg\u0003\u000e\u0007\u0000gh\u0005\u0005" +
			"\u0000\u0000hl\u0005\u0006\u0000\u0000ik\u0003\u0002\u0001\u0000ji\u0001" +
			"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000" +
			"lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000" +
			"\u0000op\u0005\u0007\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0005" +
			"\r\u0000\u0000rs\u0005\u0004\u0000\u0000st\u0003\u000e\u0007\u0000tu\u0005" +
			"\u0005\u0000\u0000uv\u0005\u0002\u0000\u0000v\r\u0001\u0000\u0000\u0000" +
			"w{\u0003\u0010\b\u0000x{\u0003\u001a\r\u0000y{\u0003\u0012\t\u0000zw\u0001" +
			"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000" +
			"{\u000f\u0001\u0000\u0000\u0000|}\u0006\b\uffff\uffff\u0000}\u0085\u0005" +
			"\u0019\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0085\u0003\u0010" +
			"\b\u0002\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0082\u0003\u0010\b" +
			"\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0085\u0001\u0000\u0000" +
			"\u0000\u0084|\u0001\u0000\u0000\u0000\u0084~\u0001\u0000\u0000\u0000\u0084" +
			"\u0080\u0001\u0000\u0000\u0000\u0085\u008e\u0001\u0000\u0000\u0000\u0086" +
			"\u0087\n\u0004\u0000\u0000\u0087\u0088\u0005\u000e\u0000\u0000\u0088\u008d" +
			"\u0003\u0010\b\u0005\u0089\u008a\n\u0003\u0000\u0000\u008a\u008b\u0005" +
			"\u000f\u0000\u0000\u008b\u008d\u0003\u0010\b\u0004\u008c\u0086\u0001\u0000" +
			"\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000" +
			"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000" +
			"\u0000\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000" +
			"\u0000\u0000\u0091\u0094\u0003\u0014\n\u0000\u0092\u0093\u0007\u0000\u0000" +
			"\u0000\u0093\u0095\u0003\u0014\n\u0000\u0094\u0092\u0001\u0000\u0000\u0000" +
			"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0013\u0001\u0000\u0000\u0000" +
			"\u0096\u009b\u0003\u0016\u000b\u0000\u0097\u0098\u0007\u0001\u0000\u0000" +
			"\u0098\u009a\u0003\u0016\u000b\u0000\u0099\u0097\u0001\u0000\u0000\u0000" +
			"\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000" +
			"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0015\u0001\u0000\u0000\u0000" +
			"\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a3\u0003\u0018\f\u0000\u009f" +
			"\u00a0\u0007\u0002\u0000\u0000\u00a0\u00a2\u0003\u0018\f\u0000\u00a1\u009f" +
			"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1" +
			"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u0017" +
			"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00ac" +
			"\u0003\u001e\u000f\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9" +
			"\u0003\u0014\n\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ac\u0001" +
			"\u0000\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001" +
			"\u0000\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005" +
			"\u001c\u0000\u0000\u00ae\u001b\u0001\u0000\u0000\u0000\u00af\u00b0\u0005" +
			"\u001a\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005" +
			"\u001b\u0000\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u0010#-<EIR_lz" +
			"\u0084\u008c\u008e\u0094\u009b\u00a3\u00ab";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}