// Generated from /Users/michaelberk/Documents/CS Work/Wordy/Wordy/Wordy.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class WordyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, TYPE=27, NUM_TYPE=28, LET=29, BE=30, ADD=31, AND=32, 
		INPUT=33, PRINT=34, TO=35, DO=36, WITH=37, AS=38, STRING_TYPE=39, INT=40, 
		FLOAT=41, OUTPUT=42, ALWAYS=43, TRUE=44, FALSE=45, BOOL=46, THING=47, 
		IF=48, IS=49, THEN=50, NOT=51, OTHERWISE=52, LOOP=53, FOR=54, EACH=55, 
		IN=56, UNTIL=57, AN=58, START=59, END=60, IDENTIFIER=61, INTEGER=62, REAL=63, 
		NEWLINE=64, WS=65, QUOTE=66, CHARACTER=67, STRING=68;
	public static final int
		RULE_program = 0, RULE_comment = 1, RULE_varValue = 2, RULE_assignVar = 3, 
		RULE_assignVarConst = 4, RULE_assignStmt = 5, RULE_arrayQuery = 6, RULE_castNum = 7, 
		RULE_arrayTerm = 8, RULE_array = 9, RULE_stringTerm = 10, RULE_numTerm = 11, 
		RULE_sayStmt = 12, RULE_outputStmt = 13, RULE_defThing = 14, RULE_defParam = 15, 
		RULE_defFunc = 16, RULE_funcCall = 17, RULE_relOpExpr = 18, RULE_ifStmt = 19, 
		RULE_curlyStatementList = 20, RULE_loopEachStmt = 21, RULE_loopUntilStment = 22, 
		RULE_loopStmt = 23, RULE_statementList = 24, RULE_statement = 25, RULE_boolConst = 26, 
		RULE_bool = 27, RULE_characterConstant = 28, RULE_stringConstant = 29, 
		RULE_variable = 30, RULE_number = 31, RULE_unsignedNumber = 32, RULE_integerConstant = 33, 
		RULE_realConstant = 34, RULE_expression = 35, RULE_numExpression = 36, 
		RULE_factor = 37, RULE_concat = 38, RULE_sign = 39, RULE_eqlOp = 40, RULE_neqOp = 41, 
		RULE_ltOp = 42, RULE_gtOp = 43, RULE_leqOp = 44, RULE_geqOp = 45, RULE_relOp = 46, 
		RULE_addOp = 47, RULE_mulOp = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "comment", "varValue", "assignVar", "assignVarConst", "assignStmt", 
			"arrayQuery", "castNum", "arrayTerm", "array", "stringTerm", "numTerm", 
			"sayStmt", "outputStmt", "defThing", "defParam", "defFunc", "funcCall", 
			"relOpExpr", "ifStmt", "curlyStatementList", "loopEachStmt", "loopUntilStment", 
			"loopStmt", "statementList", "statement", "boolConst", "bool", "characterConstant", 
			"stringConstant", "variable", "number", "unsignedNumber", "integerConstant", 
			"realConstant", "expression", "numExpression", "factor", "concat", "sign", 
			"eqlOp", "neqOp", "ltOp", "gtOp", "leqOp", "geqOp", "relOp", "addOp", 
			"mulOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'*/'", "'//'", "'='", "'['", "']'", "','", "'{'", "'}'", 
			"'('", "')'", "'+'", "'-'", "'equals'", "'!='", "'not equals'", "'<'", 
			"'less than'", "'>'", "'greater than'", "'<='", "'less than or equal to'", 
			"'>='", "'greater than or equal to'", "'*'", "'/'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TYPE", "NUM_TYPE", "LET", "BE", "ADD", "AND", "INPUT", 
			"PRINT", "TO", "DO", "WITH", "AS", "STRING_TYPE", "INT", "FLOAT", "OUTPUT", 
			"ALWAYS", "TRUE", "FALSE", "BOOL", "THING", "IF", "IS", "THEN", "NOT", 
			"OTHERWISE", "LOOP", "FOR", "EACH", "IN", "UNTIL", "AN", "START", "END", 
			"IDENTIFIER", "INTEGER", "REAL", "NEWLINE", "WS", "QUOTE", "CHARACTER", 
			"STRING"
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
	public String getGrammarFileName() { return "Wordy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WordyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(WordyParser.START, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(WordyParser.END, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(START);
			setState(99);
			statementList();
			setState(100);
			match(END);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(WordyParser.NEWLINE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__0);
				setState(103);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__2);
				setState(106);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class VarValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringTermContext stringTerm() {
			return getRuleContext(StringTermContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayQueryContext arrayQuery() {
			return getRuleContext(ArrayQueryContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(WordyParser.INPUT, 0); }
		public VarValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarValueContext varValue() throws RecognitionException {
		VarValueContext _localctx = new VarValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varValue);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				stringTerm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				arrayQuery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(INPUT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignVarContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(WordyParser.LET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarValueContext varValue() {
			return getRuleContext(VarValueContext.class,0);
		}
		public TerminalNode BE() { return getToken(WordyParser.BE, 0); }
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LET);
			setState(118);
			variable();
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==BE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			varValue();
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
	public static class AssignVarConstContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(WordyParser.LET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(WordyParser.ALWAYS, 0); }
		public VarValueContext varValue() {
			return getRuleContext(VarValueContext.class,0);
		}
		public TerminalNode BE() { return getToken(WordyParser.BE, 0); }
		public AssignVarConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVarConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterAssignVarConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitAssignVarConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitAssignVarConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarConstContext assignVarConst() throws RecognitionException {
		AssignVarConstContext _localctx = new AssignVarConstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignVarConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LET);
			setState(123);
			variable();
			setState(124);
			match(ALWAYS);
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==BE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			varValue();
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
	public static class AssignStmtContext extends ParserRuleContext {
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public AssignVarConstContext assignVarConst() {
			return getRuleContext(AssignVarConstContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignStmt);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				assignVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				assignVarConst();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayQueryContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(WordyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WordyParser.IDENTIFIER, i);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ArrayQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterArrayQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitArrayQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitArrayQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayQueryContext arrayQuery() throws RecognitionException {
		ArrayQueryContext _localctx = new ArrayQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENTIFIER);
			setState(133);
			match(T__4);
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
				{
				setState(134);
				unsignedNumber();
				}
				break;
			case IDENTIFIER:
				{
				setState(135);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			match(T__5);
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
	public static class CastNumContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(WordyParser.AS, 0); }
		public TerminalNode NUM_TYPE() { return getToken(WordyParser.NUM_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public CastNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterCastNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitCastNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitCastNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastNumContext castNum() throws RecognitionException {
		CastNumContext _localctx = new CastNumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_castNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(140);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(141);
				factor();
				}
				break;
			}
			setState(144);
			match(AS);
			setState(145);
			match(NUM_TYPE);
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
	public static class ArrayTermContext extends ParserRuleContext {
		public StringTermContext stringTerm() {
			return getRuleContext(StringTermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public ArrayTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterArrayTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitArrayTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitArrayTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTermContext arrayTerm() throws RecognitionException {
		ArrayTermContext _localctx = new ArrayTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayTerm);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				stringTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public List<ArrayTermContext> arrayTerm() {
			return getRuleContexts(ArrayTermContext.class);
		}
		public ArrayTermContext arrayTerm(int i) {
			return getRuleContext(ArrayTermContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__4);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 448110963242041453L) != 0)) {
				{
				setState(154);
				arrayTerm();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(157);
				match(T__6);
				setState(158);
				arrayTerm();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__5);
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
	public static class StringTermContext extends ParserRuleContext {
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public StringTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterStringTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitStringTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitStringTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTermContext stringTerm() throws RecognitionException {
		StringTermContext _localctx = new StringTermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stringTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(166);
				concat();
				}
				break;
			case 2:
				{
				setState(167);
				stringConstant();
				}
				break;
			case 3:
				{
				setState(168);
				match(IDENTIFIER);
				}
				break;
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
	public static class NumTermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public NumTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterNumTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitNumTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitNumTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumTermContext numTerm() throws RecognitionException {
		NumTermContext _localctx = new NumTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			factor();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				{
				setState(172);
				mulOp();
				setState(173);
				factor();
				}
				}
				setState(179);
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
	public static class SayStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(WordyParser.PRINT, 0); }
		public StringTermContext stringTerm() {
			return getRuleContext(StringTermContext.class,0);
		}
		public SayStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sayStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterSayStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitSayStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitSayStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SayStmtContext sayStmt() throws RecognitionException {
		SayStmtContext _localctx = new SayStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sayStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(PRINT);
			setState(181);
			stringTerm();
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
	public static class OutputStmtContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(WordyParser.OUTPUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterOutputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitOutputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitOutputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStmtContext outputStmt() throws RecognitionException {
		OutputStmtContext _localctx = new OutputStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_outputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(OUTPUT);
			setState(184);
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
	public static class DefThingContext extends ParserRuleContext {
		public TerminalNode THING() { return getToken(WordyParser.THING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public List<AssignStmtContext> assignStmt() {
			return getRuleContexts(AssignStmtContext.class);
		}
		public AssignStmtContext assignStmt(int i) {
			return getRuleContext(AssignStmtContext.class,i);
		}
		public DefThingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defThing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterDefThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitDefThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitDefThing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefThingContext defThing() throws RecognitionException {
		DefThingContext _localctx = new DefThingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defThing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(THING);
			setState(187);
			match(IDENTIFIER);
			setState(188);
			match(T__7);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET) {
				{
				{
				setState(189);
				assignStmt();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__8);
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
	public static class DefParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(WordyParser.AS, 0); }
		public TerminalNode TYPE() { return getToken(WordyParser.TYPE, 0); }
		public DefParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterDefParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitDefParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitDefParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefParamContext defParam() throws RecognitionException {
		DefParamContext _localctx = new DefParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IDENTIFIER);
			setState(198);
			match(AS);
			setState(199);
			match(TYPE);
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
	public static class DefFuncContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(WordyParser.TO, 0); }
		public TerminalNode DO() { return getToken(WordyParser.DO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public OutputStmtContext outputStmt() {
			return getRuleContext(OutputStmtContext.class,0);
		}
		public TerminalNode WITH() { return getToken(WordyParser.WITH, 0); }
		public List<DefParamContext> defParam() {
			return getRuleContexts(DefParamContext.class);
		}
		public DefParamContext defParam(int i) {
			return getRuleContext(DefParamContext.class,i);
		}
		public TerminalNode OUTPUT() { return getToken(WordyParser.OUTPUT, 0); }
		public TerminalNode AN() { return getToken(WordyParser.AN, 0); }
		public TerminalNode TYPE() { return getToken(WordyParser.TYPE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterDefFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitDefFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitDefFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFuncContext defFunc() throws RecognitionException {
		DefFuncContext _localctx = new DefFuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(TO);
			setState(202);
			match(DO);
			setState(203);
			match(IDENTIFIER);
			setState(204);
			match(T__9);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(205);
				match(WITH);
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(208);
				defParam();
				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(211);
				match(T__6);
				setState(212);
				defParam();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(T__10);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(219);
				match(OUTPUT);
				setState(220);
				match(AN);
				setState(221);
				match(TYPE);
				}
			}

			setState(224);
			match(T__7);
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(225);
				statementList();
				}
				break;
			}
			setState(228);
			outputStmt();
			setState(229);
			match(T__8);
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
	public static class FuncCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(WordyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WordyParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IDENTIFIER);
			setState(232);
			match(T__9);
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(233);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(234);
				expression();
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 3584887293636248425L) != 0)) {
				{
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(237);
					match(T__6);
					setState(238);
					match(IDENTIFIER);
					}
					break;
				case T__9:
				case T__11:
				case T__12:
				case T__14:
				case T__15:
				case ADD:
				case IS:
				case NOT:
				case IDENTIFIER:
				case INTEGER:
				case REAL:
				case CHARACTER:
				case STRING:
					{
					setState(239);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__10);
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
	public static class RelOpExprContext extends ParserRuleContext {
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public List<StringTermContext> stringTerm() {
			return getRuleContexts(StringTermContext.class);
		}
		public StringTermContext stringTerm(int i) {
			return getRuleContext(StringTermContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public RelOpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOpExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterRelOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitRelOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitRelOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpExprContext relOpExpr() throws RecognitionException {
		RelOpExprContext _localctx = new RelOpExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relOpExpr);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				numExpression();
				setState(248);
				relOp();
				setState(249);
				numExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				stringTerm();
				setState(252);
				relOp();
				setState(253);
				stringTerm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				bool();
				setState(256);
				relOp();
				setState(257);
				bool();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WordyParser.IF, 0); }
		public TerminalNode THEN() { return getToken(WordyParser.THEN, 0); }
		public List<CurlyStatementListContext> curlyStatementList() {
			return getRuleContexts(CurlyStatementListContext.class);
		}
		public CurlyStatementListContext curlyStatementList(int i) {
			return getRuleContext(CurlyStatementListContext.class,i);
		}
		public RelOpExprContext relOpExpr() {
			return getRuleContext(RelOpExprContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode OTHERWISE() { return getToken(WordyParser.OTHERWISE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IF);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(262);
				relOpExpr();
				}
				break;
			case 2:
				{
				setState(263);
				bool();
				}
				break;
			}
			setState(266);
			match(THEN);
			setState(267);
			curlyStatementList();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(268);
				match(OTHERWISE);
				setState(269);
				curlyStatementList();
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
	public static class CurlyStatementListContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CurlyStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curlyStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterCurlyStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitCurlyStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitCurlyStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurlyStatementListContext curlyStatementList() throws RecognitionException {
		CurlyStatementListContext _localctx = new CurlyStatementListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_curlyStatementList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__7);
			setState(273);
			statementList();
			setState(274);
			match(T__8);
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
	public static class LoopEachStmtContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(WordyParser.LOOP, 0); }
		public TerminalNode FOR() { return getToken(WordyParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(WordyParser.EACH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(WordyParser.IN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CurlyStatementListContext curlyStatementList() {
			return getRuleContext(CurlyStatementListContext.class,0);
		}
		public LoopEachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEachStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterLoopEachStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitLoopEachStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitLoopEachStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopEachStmtContext loopEachStmt() throws RecognitionException {
		LoopEachStmtContext _localctx = new LoopEachStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loopEachStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LOOP);
			setState(277);
			match(FOR);
			setState(278);
			match(EACH);
			setState(279);
			match(IDENTIFIER);
			setState(280);
			match(IN);
			setState(281);
			array();
			setState(282);
			curlyStatementList();
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
	public static class LoopUntilStmentContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(WordyParser.LOOP, 0); }
		public TerminalNode UNTIL() { return getToken(WordyParser.UNTIL, 0); }
		public CurlyStatementListContext curlyStatementList() {
			return getRuleContext(CurlyStatementListContext.class,0);
		}
		public RelOpExprContext relOpExpr() {
			return getRuleContext(RelOpExprContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public LoopUntilStmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopUntilStment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterLoopUntilStment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitLoopUntilStment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitLoopUntilStment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopUntilStmentContext loopUntilStment() throws RecognitionException {
		LoopUntilStmentContext _localctx = new LoopUntilStmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopUntilStment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LOOP);
			setState(285);
			match(UNTIL);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(286);
				relOpExpr();
				}
				break;
			case 2:
				{
				setState(287);
				bool();
				}
				break;
			}
			setState(290);
			curlyStatementList();
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
	public static class LoopStmtContext extends ParserRuleContext {
		public LoopEachStmtContext loopEachStmt() {
			return getRuleContext(LoopEachStmtContext.class,0);
		}
		public LoopUntilStmentContext loopUntilStment() {
			return getRuleContext(LoopUntilStmentContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loopStmt);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				loopEachStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				loopUntilStment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			statement();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					statement();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class StatementContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SayStmtContext sayStmt() {
			return getRuleContext(SayStmtContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public DefFuncContext defFunc() {
			return getRuleContext(DefFuncContext.class,0);
		}
		public DefThingContext defThing() {
			return getRuleContext(DefThingContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public OutputStmtContext outputStmt() {
			return getRuleContext(OutputStmtContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				assignStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				ifStmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				sayStmt();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				funcCall();
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				defFunc();
				}
				break;
			case THING:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				defThing();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				loopStmt();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 8);
				{
				setState(310);
				outputStmt();
				}
				break;
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 9);
				{
				setState(311);
				comment();
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
	public static class BoolConstContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(WordyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(WordyParser.FALSE, 0); }
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class BoolContext extends ParserRuleContext {
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				boolConst();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(IDENTIFIER);
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
	public static class CharacterConstantContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(WordyParser.CHARACTER, 0); }
		public CharacterConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterCharacterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitCharacterConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitCharacterConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterConstantContext characterConstant() throws RecognitionException {
		CharacterConstantContext _localctx = new CharacterConstantContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_characterConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(CHARACTER);
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
	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WordyParser.STRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(STRING);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WordyParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IDENTIFIER);
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
	public static class NumberContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(326);
				sign();
				}
			}

			setState(329);
			unsignedNumber();
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
	public static class UnsignedNumberContext extends ParserRuleContext {
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public RealConstantContext realConstant() {
			return getRuleContext(RealConstantContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unsignedNumber);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				integerConstant();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				realConstant();
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
	public static class IntegerConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(WordyParser.INTEGER, 0); }
		public IntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerConstantContext integerConstant() throws RecognitionException {
		IntegerConstantContext _localctx = new IntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_integerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(INTEGER);
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
	public static class RealConstantContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(WordyParser.REAL, 0); }
		public RealConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterRealConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitRealConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitRealConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealConstantContext realConstant() throws RecognitionException {
		RealConstantContext _localctx = new RealConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_realConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(REAL);
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
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public List<StringTermContext> stringTerm() {
			return getRuleContexts(StringTermContext.class);
		}
		public StringTermContext stringTerm(int i) {
			return getRuleContext(StringTermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				numExpression();
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(340);
					relOp();
					setState(341);
					numExpression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				stringTerm();
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(346);
					relOp();
					setState(347);
					stringTerm();
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumExpressionContext extends ParserRuleContext {
		public List<NumTermContext> numTerm() {
			return getRuleContexts(NumTermContext.class);
		}
		public NumTermContext numTerm(int i) {
			return getRuleContext(NumTermContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public CastNumContext castNum() {
			return getRuleContext(CastNumContext.class,0);
		}
		public TerminalNode ADD() { return getToken(WordyParser.ADD, 0); }
		public TerminalNode AND() { return getToken(WordyParser.AND, 0); }
		public NumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterNumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitNumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitNumExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExpressionContext numExpression() throws RecognitionException {
		NumExpressionContext _localctx = new NumExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_numExpression);
		int _la;
		try {
			int _alt;
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(353);
					sign();
					}
					break;
				}
				setState(356);
				numTerm();
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(357);
						addOp();
						setState(358);
						numTerm();
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				castNum();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(ADD);
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(367);
					numTerm();
					setState(368);
					match(T__6);
					}
					}
					setState(372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 448110911702433901L) != 0) );
				setState(374);
				match(AND);
				setState(375);
				numTerm();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberFactorContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterNumberFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitNumberFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitNumberFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringFactorContext extends FactorContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public StringFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterStringFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitStringFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitStringFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharacterFactorContext extends FactorContext {
		public CharacterConstantContext characterConstant() {
			return getRuleContext(CharacterConstantContext.class,0);
		}
		public CharacterFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterCharacterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitCharacterFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitCharacterFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableFactorContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterVariableFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitVariableFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitVariableFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotFactorContext extends FactorContext {
		public NeqOpContext neqOp() {
			return getRuleContext(NeqOpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NotFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterNotFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitNotFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitNotFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new VariableFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				variable();
				}
				break;
			case T__11:
			case T__12:
			case INTEGER:
			case REAL:
				_localctx = new NumberFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				number();
				}
				break;
			case CHARACTER:
				_localctx = new CharacterFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				characterConstant();
				}
				break;
			case STRING:
				_localctx = new StringFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				stringConstant();
				}
				break;
			case T__14:
			case T__15:
			case IS:
			case NOT:
				_localctx = new NotFactorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
				neqOp();
				setState(384);
				factor();
				}
				break;
			case T__9:
				_localctx = new ParenthesizedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				match(T__9);
				setState(387);
				expression();
				setState(388);
				match(T__10);
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
	public static class ConcatContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WordyParser.STRING, 0); }
		public TerminalNode AND() { return getToken(WordyParser.AND, 0); }
		public List<ConcatContext> concat() {
			return getRuleContexts(ConcatContext.class);
		}
		public ConcatContext concat(int i) {
			return getRuleContext(ConcatContext.class,i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(STRING);
			setState(393);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(395); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(394);
					concat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(397); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
	public static class EqlOpContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(WordyParser.IS, 0); }
		public EqlOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqlOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterEqlOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitEqlOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitEqlOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqlOpContext eqlOp() throws RecognitionException {
		EqlOpContext _localctx = new EqlOpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_eqlOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953437712L) != 0)) ) {
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
	public static class NeqOpContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(WordyParser.IS, 0); }
		public TerminalNode NOT() { return getToken(WordyParser.NOT, 0); }
		public NeqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterNeqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitNeqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitNeqOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeqOpContext neqOp() throws RecognitionException {
		NeqOpContext _localctx = new NeqOpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_neqOp);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(T__15);
				}
				break;
			case IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(IS);
				setState(406);
				match(NOT);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(NOT);
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
	public static class LtOpContext extends ParserRuleContext {
		public LtOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterLtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitLtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitLtOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtOpContext ltOp() throws RecognitionException {
		LtOpContext _localctx = new LtOpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ltOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
	public static class GtOpContext extends ParserRuleContext {
		public GtOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterGtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitGtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitGtOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtOpContext gtOp() throws RecognitionException {
		GtOpContext _localctx = new GtOpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_gtOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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
	public static class LeqOpContext extends ParserRuleContext {
		public LeqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterLeqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitLeqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitLeqOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeqOpContext leqOp() throws RecognitionException {
		LeqOpContext _localctx = new LeqOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_leqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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
	public static class GeqOpContext extends ParserRuleContext {
		public GeqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterGeqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitGeqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitGeqOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeqOpContext geqOp() throws RecognitionException {
		GeqOpContext _localctx = new GeqOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_geqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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
	public static class RelOpContext extends ParserRuleContext {
		public EqlOpContext eqlOp() {
			return getRuleContext(EqlOpContext.class,0);
		}
		public NeqOpContext neqOp() {
			return getRuleContext(NeqOpContext.class,0);
		}
		public LtOpContext ltOp() {
			return getRuleContext(LtOpContext.class,0);
		}
		public LeqOpContext leqOp() {
			return getRuleContext(LeqOpContext.class,0);
		}
		public GtOpContext gtOp() {
			return getRuleContext(GtOpContext.class,0);
		}
		public GeqOpContext geqOp() {
			return getRuleContext(GeqOpContext.class,0);
		}
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relOp);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				eqlOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				neqOp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				ltOp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				leqOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				gtOp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				geqOp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordyListener ) ((WordyListener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordyVisitor ) return ((WordyVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001D\u01af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001l\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002t\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0083\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0089\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u008f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0098\b\b\u0001\t\u0001\t\u0003\t\u009c"+
		"\b\t\u0001\t\u0001\t\u0005\t\u00a0\b\t\n\t\f\t\u00a3\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0003\n\u00aa\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00b0\b\u000b\n\u000b\f\u000b\u00b3\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00bf\b\u000e\n\u000e\f\u000e\u00c2"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00cf\b\u0010\u0001\u0010\u0003\u0010\u00d2\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00d6\b\u0010\n\u0010\f\u0010\u00d9\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00df\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00e3\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ec"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f1\b\u0011"+
		"\n\u0011\f\u0011\u00f4\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0104"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0109\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010f\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0121\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0127\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u012b\b\u0018\n\u0018\f\u0018\u012e"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0139\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u013f\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0003\u001f\u0148\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0003 \u014e\b \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u0158\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u015e\b#\u0003#\u0160"+
		"\b#\u0001$\u0003$\u0163\b$\u0001$\u0001$\u0001$\u0001$\u0005$\u0169\b"+
		"$\n$\f$\u016c\t$\u0001$\u0001$\u0001$\u0001$\u0001$\u0004$\u0173\b$\u000b"+
		"$\f$\u0174\u0001$\u0001$\u0001$\u0003$\u017a\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0187\b%\u0001"+
		"&\u0001&\u0001&\u0004&\u018c\b&\u000b&\f&\u018d\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0199\b)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u01a9\b.\u0001/\u0001/\u00010\u00010\u00010\u0000"+
		"\u00001\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\f\u0001\u0000"+
		"\u0002\u0002\u0001\u0000@@\u0002\u0000\u0004\u0004\u001e\u001e\u0001\u0000"+
		",-\u0002\u0000\f\f  \u0001\u0000\f\r\u0003\u0000\u0004\u0004\u000e\u000e"+
		"11\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001a\u01c0\u0000b\u0001\u0000"+
		"\u0000\u0000\u0002k\u0001\u0000\u0000\u0000\u0004s\u0001\u0000\u0000\u0000"+
		"\u0006u\u0001\u0000\u0000\u0000\bz\u0001\u0000\u0000\u0000\n\u0082\u0001"+
		"\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u008e\u0001\u0000"+
		"\u0000\u0000\u0010\u0097\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000"+
		"\u0000\u0000\u0014\u00a9\u0001\u0000\u0000\u0000\u0016\u00ab\u0001\u0000"+
		"\u0000\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00b7\u0001\u0000"+
		"\u0000\u0000\u001c\u00ba\u0001\u0000\u0000\u0000\u001e\u00c5\u0001\u0000"+
		"\u0000\u0000 \u00c9\u0001\u0000\u0000\u0000\"\u00e7\u0001\u0000\u0000"+
		"\u0000$\u0103\u0001\u0000\u0000\u0000&\u0105\u0001\u0000\u0000\u0000("+
		"\u0110\u0001\u0000\u0000\u0000*\u0114\u0001\u0000\u0000\u0000,\u011c\u0001"+
		"\u0000\u0000\u0000.\u0126\u0001\u0000\u0000\u00000\u0128\u0001\u0000\u0000"+
		"\u00002\u0138\u0001\u0000\u0000\u00004\u013a\u0001\u0000\u0000\u00006"+
		"\u013e\u0001\u0000\u0000\u00008\u0140\u0001\u0000\u0000\u0000:\u0142\u0001"+
		"\u0000\u0000\u0000<\u0144\u0001\u0000\u0000\u0000>\u0147\u0001\u0000\u0000"+
		"\u0000@\u014d\u0001\u0000\u0000\u0000B\u014f\u0001\u0000\u0000\u0000D"+
		"\u0151\u0001\u0000\u0000\u0000F\u015f\u0001\u0000\u0000\u0000H\u0179\u0001"+
		"\u0000\u0000\u0000J\u0186\u0001\u0000\u0000\u0000L\u0188\u0001\u0000\u0000"+
		"\u0000N\u018f\u0001\u0000\u0000\u0000P\u0191\u0001\u0000\u0000\u0000R"+
		"\u0198\u0001\u0000\u0000\u0000T\u019a\u0001\u0000\u0000\u0000V\u019c\u0001"+
		"\u0000\u0000\u0000X\u019e\u0001\u0000\u0000\u0000Z\u01a0\u0001\u0000\u0000"+
		"\u0000\\\u01a8\u0001\u0000\u0000\u0000^\u01aa\u0001\u0000\u0000\u0000"+
		"`\u01ac\u0001\u0000\u0000\u0000bc\u0005;\u0000\u0000cd\u00030\u0018\u0000"+
		"de\u0005<\u0000\u0000e\u0001\u0001\u0000\u0000\u0000fg\u0005\u0001\u0000"+
		"\u0000gh\b\u0000\u0000\u0000hl\u0005\u0002\u0000\u0000ij\u0005\u0003\u0000"+
		"\u0000jl\b\u0001\u0000\u0000kf\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000l\u0003\u0001\u0000\u0000\u0000mt\u0003F#\u0000nt\u0003\u0014\n"+
		"\u0000ot\u00036\u001b\u0000pt\u0003\u0012\t\u0000qt\u0003\f\u0006\u0000"+
		"rt\u0005!\u0000\u0000sm\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000\u0000"+
		"so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000t\u0005\u0001\u0000\u0000\u0000uv\u0005"+
		"\u001d\u0000\u0000vw\u0003<\u001e\u0000wx\u0007\u0002\u0000\u0000xy\u0003"+
		"\u0004\u0002\u0000y\u0007\u0001\u0000\u0000\u0000z{\u0005\u001d\u0000"+
		"\u0000{|\u0003<\u001e\u0000|}\u0005+\u0000\u0000}~\u0007\u0002\u0000\u0000"+
		"~\u007f\u0003\u0004\u0002\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0003\u0006\u0003\u0000\u0081\u0083\u0003\b\u0004\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u000b"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005=\u0000\u0000\u0085\u0088\u0005"+
		"\u0005\u0000\u0000\u0086\u0089\u0003@ \u0000\u0087\u0089\u0005=\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0006\u0000"+
		"\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008f\u0005=\u0000\u0000"+
		"\u008d\u008f\u0003J%\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005&\u0000\u0000\u0091\u0092\u0005\u001c\u0000\u0000\u0092\u000f\u0001"+
		"\u0000\u0000\u0000\u0093\u0098\u0003\u0014\n\u0000\u0094\u0098\u0003J"+
		"%\u0000\u0095\u0098\u00036\u001b\u0000\u0096\u0098\u0005=\u0000\u0000"+
		"\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0011\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u0005\u0000\u0000"+
		"\u009a\u009c\u0003\u0010\b\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u00a1\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\u0007\u0000\u0000\u009e\u00a0\u0003\u0010\b\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0006\u0000\u0000\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6\u00aa"+
		"\u0003L&\u0000\u00a7\u00aa\u0003:\u001d\u0000\u00a8\u00aa\u0005=\u0000"+
		"\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u0015\u0001\u0000\u0000"+
		"\u0000\u00ab\u00b1\u0003J%\u0000\u00ac\u00ad\u0003`0\u0000\u00ad\u00ae"+
		"\u0003J%\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0017\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\"\u0000"+
		"\u0000\u00b5\u00b6\u0003\u0014\n\u0000\u00b6\u0019\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005*\u0000\u0000\u00b8\u00b9\u0003F#\u0000\u00b9\u001b"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005/\u0000\u0000\u00bb\u00bc\u0005"+
		"=\u0000\u0000\u00bc\u00c0\u0005\b\u0000\u0000\u00bd\u00bf\u0003\n\u0005"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u001d\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005=\u0000\u0000\u00c6\u00c7\u0005&\u0000\u0000\u00c7\u00c8"+
		"\u0005\u001b\u0000\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005#\u0000\u0000\u00ca\u00cb\u0005$\u0000\u0000\u00cb\u00cc\u0005="+
		"\u0000\u0000\u00cc\u00ce\u0005\n\u0000\u0000\u00cd\u00cf\u0005%\u0000"+
		"\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u001e\u000f"+
		"\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d7\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0007\u0000"+
		"\u0000\u00d4\u00d6\u0003\u001e\u000f\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00de\u0005\u000b\u0000"+
		"\u0000\u00db\u00dc\u0005*\u0000\u0000\u00dc\u00dd\u0005:\u0000\u0000\u00dd"+
		"\u00df\u0005\u001b\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e2\u0005\b\u0000\u0000\u00e1\u00e3\u00030\u0018\u0000\u00e2\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u001a\r\u0000\u00e5\u00e6\u0005"+
		"\t\u0000\u0000\u00e6!\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005=\u0000"+
		"\u0000\u00e8\u00eb\u0005\n\u0000\u0000\u00e9\u00ec\u0005=\u0000\u0000"+
		"\u00ea\u00ec\u0003F#\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f2"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0007\u0000\u0000\u00ee\u00f1"+
		"\u0005=\u0000\u0000\u00ef\u00f1\u0003F#\u0000\u00f0\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000\u00f6#\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0003H$\u0000\u00f8\u00f9\u0003\\.\u0000\u00f9\u00fa"+
		"\u0003H$\u0000\u00fa\u0104\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003\u0014"+
		"\n\u0000\u00fc\u00fd\u0003\\.\u0000\u00fd\u00fe\u0003\u0014\n\u0000\u00fe"+
		"\u0104\u0001\u0000\u0000\u0000\u00ff\u0100\u00036\u001b\u0000\u0100\u0101"+
		"\u0003\\.\u0000\u0101\u0102\u00036\u001b\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u00f7\u0001\u0000\u0000\u0000\u0103\u00fb\u0001\u0000"+
		"\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0104%\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u00050\u0000\u0000\u0106\u0109\u0003$\u0012\u0000\u0107"+
		"\u0109\u00036\u001b\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u00052\u0000\u0000\u010b\u010e\u0003(\u0014\u0000\u010c\u010d\u00054"+
		"\u0000\u0000\u010d\u010f\u0003(\u0014\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\'\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005\b\u0000\u0000\u0111\u0112\u00030\u0018\u0000\u0112"+
		"\u0113\u0005\t\u0000\u0000\u0113)\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u00055\u0000\u0000\u0115\u0116\u00056\u0000\u0000\u0116\u0117\u00057"+
		"\u0000\u0000\u0117\u0118\u0005=\u0000\u0000\u0118\u0119\u00058\u0000\u0000"+
		"\u0119\u011a\u0003\u0012\t\u0000\u011a\u011b\u0003(\u0014\u0000\u011b"+
		"+\u0001\u0000\u0000\u0000\u011c\u011d\u00055\u0000\u0000\u011d\u0120\u0005"+
		"9\u0000\u0000\u011e\u0121\u0003$\u0012\u0000\u011f\u0121\u00036\u001b"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0003(\u0014\u0000"+
		"\u0123-\u0001\u0000\u0000\u0000\u0124\u0127\u0003*\u0015\u0000\u0125\u0127"+
		"\u0003,\u0016\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001"+
		"\u0000\u0000\u0000\u0127/\u0001\u0000\u0000\u0000\u0128\u012c\u00032\u0019"+
		"\u0000\u0129\u012b\u00032\u0019\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d1\u0001\u0000\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012f\u0139\u0003\n\u0005\u0000\u0130\u0139"+
		"\u0003&\u0013\u0000\u0131\u0139\u0003\u0018\f\u0000\u0132\u0139\u0003"+
		"\"\u0011\u0000\u0133\u0139\u0003 \u0010\u0000\u0134\u0139\u0003\u001c"+
		"\u000e\u0000\u0135\u0139\u0003.\u0017\u0000\u0136\u0139\u0003\u001a\r"+
		"\u0000\u0137\u0139\u0003\u0002\u0001\u0000\u0138\u012f\u0001\u0000\u0000"+
		"\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0138\u0131\u0001\u0000\u0000"+
		"\u0000\u0138\u0132\u0001\u0000\u0000\u0000\u0138\u0133\u0001\u0000\u0000"+
		"\u0000\u0138\u0134\u0001\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u01393\u0001\u0000\u0000\u0000\u013a\u013b\u0007\u0003\u0000\u0000"+
		"\u013b5\u0001\u0000\u0000\u0000\u013c\u013f\u00034\u001a\u0000\u013d\u013f"+
		"\u0005=\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013d\u0001"+
		"\u0000\u0000\u0000\u013f7\u0001\u0000\u0000\u0000\u0140\u0141\u0005C\u0000"+
		"\u0000\u01419\u0001\u0000\u0000\u0000\u0142\u0143\u0005D\u0000\u0000\u0143"+
		";\u0001\u0000\u0000\u0000\u0144\u0145\u0005=\u0000\u0000\u0145=\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0003N\'\u0000\u0147\u0146\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0003@ \u0000\u014a?\u0001\u0000\u0000\u0000"+
		"\u014b\u014e\u0003B!\u0000\u014c\u014e\u0003D\"\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014eA\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0005>\u0000\u0000\u0150C\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005?\u0000\u0000\u0152E\u0001\u0000\u0000\u0000\u0153\u0157"+
		"\u0003H$\u0000\u0154\u0155\u0003\\.\u0000\u0155\u0156\u0003H$\u0000\u0156"+
		"\u0158\u0001\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u0160\u0001\u0000\u0000\u0000\u0159"+
		"\u015d\u0003\u0014\n\u0000\u015a\u015b\u0003\\.\u0000\u015b\u015c\u0003"+
		"\u0014\n\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000"+
		"\u0000\u0000\u015f\u0153\u0001\u0000\u0000\u0000\u015f\u0159\u0001\u0000"+
		"\u0000\u0000\u0160G\u0001\u0000\u0000\u0000\u0161\u0163\u0003N\'\u0000"+
		"\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u016a\u0003\u0016\u000b\u0000"+
		"\u0165\u0166\u0003^/\u0000\u0166\u0167\u0003\u0016\u000b\u0000\u0167\u0169"+
		"\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0169\u016c"+
		"\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u017a\u0001\u0000\u0000\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016d\u017a\u0003\u000e\u0007\u0000\u016e\u0172"+
		"\u0005\u001f\u0000\u0000\u016f\u0170\u0003\u0016\u000b\u0000\u0170\u0171"+
		"\u0005\u0007\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u016f"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0005 \u0000\u0000\u0177\u0178\u0003"+
		"\u0016\u000b\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0162\u0001"+
		"\u0000\u0000\u0000\u0179\u016d\u0001\u0000\u0000\u0000\u0179\u016e\u0001"+
		"\u0000\u0000\u0000\u017aI\u0001\u0000\u0000\u0000\u017b\u0187\u0003<\u001e"+
		"\u0000\u017c\u0187\u0003>\u001f\u0000\u017d\u0187\u00038\u001c\u0000\u017e"+
		"\u0187\u0003:\u001d\u0000\u017f\u0180\u0003R)\u0000\u0180\u0181\u0003"+
		"J%\u0000\u0181\u0187\u0001\u0000\u0000\u0000\u0182\u0183\u0005\n\u0000"+
		"\u0000\u0183\u0184\u0003F#\u0000\u0184\u0185\u0005\u000b\u0000\u0000\u0185"+
		"\u0187\u0001\u0000\u0000\u0000\u0186\u017b\u0001\u0000\u0000\u0000\u0186"+
		"\u017c\u0001\u0000\u0000\u0000\u0186\u017d\u0001\u0000\u0000\u0000\u0186"+
		"\u017e\u0001\u0000\u0000\u0000\u0186\u017f\u0001\u0000\u0000\u0000\u0186"+
		"\u0182\u0001\u0000\u0000\u0000\u0187K\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0005D\u0000\u0000\u0189\u018b\u0007\u0004\u0000\u0000\u018a\u018c\u0003"+
		"L&\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018eM\u0001\u0000\u0000\u0000\u018f\u0190\u0007\u0005\u0000\u0000"+
		"\u0190O\u0001\u0000\u0000\u0000\u0191\u0192\u0007\u0006\u0000\u0000\u0192"+
		"Q\u0001\u0000\u0000\u0000\u0193\u0199\u0005\u000f\u0000\u0000\u0194\u0199"+
		"\u0005\u0010\u0000\u0000\u0195\u0196\u00051\u0000\u0000\u0196\u0199\u0005"+
		"3\u0000\u0000\u0197\u0199\u00053\u0000\u0000\u0198\u0193\u0001\u0000\u0000"+
		"\u0000\u0198\u0194\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199S\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0007\u0007\u0000\u0000\u019bU\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0007\b\u0000\u0000\u019dW\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0007\t\u0000\u0000\u019fY\u0001\u0000\u0000\u0000\u01a0\u01a1\u0007"+
		"\n\u0000\u0000\u01a1[\u0001\u0000\u0000\u0000\u01a2\u01a9\u0003P(\u0000"+
		"\u01a3\u01a9\u0003R)\u0000\u01a4\u01a9\u0003T*\u0000\u01a5\u01a9\u0003"+
		"X,\u0000\u01a6\u01a9\u0003V+\u0000\u01a7\u01a9\u0003Z-\u0000\u01a8\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9]\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0007\u0005\u0000\u0000\u01ab_\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0007\u000b\u0000\u0000\u01ada\u0001\u0000\u0000"+
		"\u0000(ks\u0082\u0088\u008e\u0097\u009b\u00a1\u00a9\u00b1\u00c0\u00ce"+
		"\u00d1\u00d7\u00de\u00e2\u00eb\u00f0\u00f2\u0103\u0108\u010e\u0120\u0126"+
		"\u012c\u0138\u013e\u0147\u014d\u0157\u015d\u015f\u0162\u016a\u0174\u0179"+
		"\u0186\u018d\u0198\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}