// Generated from c:\dominik\u005Cuczelnia\programowanie_genetyczne\project\geneticprogrammingdk_mg\antlr\language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, IF=2, ELSE=3, WHILE=4, CONT=5, BRK=6, OP_ASSIGN=7, OP_ADD=8, OP_SUBTRACT=9, 
		OP_MULTIPLY=10, OP_DIVIDE=11, OP_MODE=12, OP_EQUALS=13, OP_NOTEQUALS=14, 
		OP_LESS=15, OP_LESSEQUAL=16, OP_MORE=17, OP_MOREEQUAL=18, OP_OR=19, OP_AND=20, 
		OP_NOT=21, LEFT_BRACKET=22, RIGHT_BRACKET=23, LEFT_PARENTHESIS=24, RIGHT_PARENTHESIS=25, 
		OUT=26, INPUT=27, DOT=28, ALPHANUMERIC=29, LETTER=30, NUMBER=31, WS=32;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_openScope = 2, RULE_closeScope = 3, 
		RULE_scopeBlock = 4, RULE_instruction = 5, RULE_eol = 6, RULE_variableAssignment = 7, 
		RULE_variableName = 8, RULE_variableValue = 9, RULE_condition = 10, RULE_whileLoop = 11, 
		RULE_loopBody = 12, RULE_tcontinue = 13, RULE_tbreak = 14, RULE_input = 15, 
		RULE_out = 16, RULE_expression = 17, RULE_term = 18, RULE_factor = 19, 
		RULE_comparison = 20, RULE_comparisonOperator = 21, RULE_logicalOperator = 22, 
		RULE_literal = 23, RULE_intLiteral = 24, RULE_floatLiteral = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "openScope", "closeScope", "scopeBlock", "instruction", 
			"eol", "variableAssignment", "variableName", "variableValue", "condition", 
			"whileLoop", "loopBody", "tcontinue", "tbreak", "input", "out", "expression", 
			"term", "factor", "comparison", "comparisonOperator", "logicalOperator", 
			"literal", "intLiteral", "floatLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'else'", "'while'", "'continue'", "'break'", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'||'", "'&&'", "'!'", "'{'", "'}'", "'('", "')'", "'out'", "'input'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "IF", "ELSE", "WHILE", "CONT", "BRK", "OP_ASSIGN", "OP_ADD", 
			"OP_SUBTRACT", "OP_MULTIPLY", "OP_DIVIDE", "OP_MODE", "OP_EQUALS", "OP_NOTEQUALS", 
			"OP_LESS", "OP_LESSEQUAL", "OP_MORE", "OP_MOREEQUAL", "OP_OR", "OP_AND", 
			"OP_NOT", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"OUT", "INPUT", "DOT", "ALPHANUMERIC", "LETTER", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public languageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LEFT_BRACKET) | (1L << OUT) | (1L << ALPHANUMERIC))) != 0)) {
				{
				{
				setState(54);
				instruction();
				}
				}
				setState(59);
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

	public static class OpenScopeContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(languageParser.LEFT_BRACKET, 0); }
		public OpenScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openScope; }
	}

	public final OpenScopeContext openScope() throws RecognitionException {
		OpenScopeContext _localctx = new OpenScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_openScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(LEFT_BRACKET);
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

	public static class CloseScopeContext extends ParserRuleContext {
		public TerminalNode RIGHT_BRACKET() { return getToken(languageParser.RIGHT_BRACKET, 0); }
		public CloseScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeScope; }
	}

	public final CloseScopeContext closeScope() throws RecognitionException {
		CloseScopeContext _localctx = new CloseScopeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_closeScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(RIGHT_BRACKET);
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

	public static class ScopeBlockContext extends ParserRuleContext {
		public OpenScopeContext openScope() {
			return getRuleContext(OpenScopeContext.class,0);
		}
		public CloseScopeContext closeScope() {
			return getRuleContext(CloseScopeContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ScopeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeBlock; }
	}

	public final ScopeBlockContext scopeBlock() throws RecognitionException {
		ScopeBlockContext _localctx = new ScopeBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scopeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			openScope();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LEFT_BRACKET) | (1L << OUT) | (1L << ALPHANUMERIC))) != 0)) {
				{
				{
				setState(65);
				instruction();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			closeScope();
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

	public static class InstructionContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ScopeBlockContext scopeBlock() {
			return getRuleContext(ScopeBlockContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				variableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				scopeBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				input();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				out();
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

	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(languageParser.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(EOL);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(languageParser.OP_ASSIGN, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			variableName();
			setState(84);
			match(OP_ASSIGN);
			setState(85);
			variableValue();
			setState(86);
			eol();
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(languageParser.ALPHANUMERIC, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ALPHANUMERIC);
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

	public static class VariableValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableValue);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				comparison();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				literal();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(languageParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<ScopeBlockContext> scopeBlock() {
			return getRuleContexts(ScopeBlockContext.class);
		}
		public ScopeBlockContext scopeBlock(int i) {
			return getRuleContext(ScopeBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(languageParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IF);
			setState(96);
			comparison();
			setState(97);
			scopeBlock();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(98);
				match(ELSE);
				setState(99);
				scopeBlock();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(languageParser.WHILE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHILE);
			setState(103);
			comparison();
			setState(104);
			loopBody();
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

	public static class LoopBodyContext extends ParserRuleContext {
		public OpenScopeContext openScope() {
			return getRuleContext(OpenScopeContext.class,0);
		}
		public CloseScopeContext closeScope() {
			return getRuleContext(CloseScopeContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TcontinueContext> tcontinue() {
			return getRuleContexts(TcontinueContext.class);
		}
		public TcontinueContext tcontinue(int i) {
			return getRuleContext(TcontinueContext.class,i);
		}
		public List<TbreakContext> tbreak() {
			return getRuleContexts(TbreakContext.class);
		}
		public TbreakContext tbreak(int i) {
			return getRuleContext(TbreakContext.class,i);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			openScope();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << CONT) | (1L << BRK) | (1L << LEFT_BRACKET) | (1L << OUT) | (1L << ALPHANUMERIC))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case WHILE:
				case LEFT_BRACKET:
				case OUT:
				case ALPHANUMERIC:
					{
					setState(107);
					instruction();
					}
					break;
				case CONT:
					{
					setState(108);
					tcontinue();
					}
					break;
				case BRK:
					{
					setState(109);
					tbreak();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			closeScope();
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

	public static class TcontinueContext extends ParserRuleContext {
		public TerminalNode CONT() { return getToken(languageParser.CONT, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TcontinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcontinue; }
	}

	public final TcontinueContext tcontinue() throws RecognitionException {
		TcontinueContext _localctx = new TcontinueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tcontinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(CONT);
			setState(118);
			eol();
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

	public static class TbreakContext extends ParserRuleContext {
		public TerminalNode BRK() { return getToken(languageParser.BRK, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TbreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbreak; }
	}

	public final TbreakContext tbreak() throws RecognitionException {
		TbreakContext _localctx = new TbreakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tbreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(BRK);
			setState(121);
			eol();
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

	public static class InputContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(languageParser.OP_ASSIGN, 0); }
		public TerminalNode INPUT() { return getToken(languageParser.INPUT, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(languageParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(languageParser.RIGHT_PARENTHESIS, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			variableName();
			setState(124);
			match(OP_ASSIGN);
			setState(125);
			match(INPUT);
			setState(126);
			match(LEFT_PARENTHESIS);
			setState(127);
			match(RIGHT_PARENTHESIS);
			setState(128);
			eol();
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

	public static class OutContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(languageParser.OUT, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(languageParser.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(languageParser.RIGHT_PARENTHESIS, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(OUT);
			setState(131);
			match(LEFT_PARENTHESIS);
			setState(132);
			expression();
			setState(133);
			match(RIGHT_PARENTHESIS);
			setState(134);
			eol();
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OP_ADD() { return getTokens(languageParser.OP_ADD); }
		public TerminalNode OP_ADD(int i) {
			return getToken(languageParser.OP_ADD, i);
		}
		public List<TerminalNode> OP_SUBTRACT() { return getTokens(languageParser.OP_SUBTRACT); }
		public TerminalNode OP_SUBTRACT(int i) {
			return getToken(languageParser.OP_SUBTRACT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			term();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD || _la==OP_SUBTRACT) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_ADD:
					{
					setState(137);
					match(OP_ADD);
					setState(138);
					term();
					}
					break;
				case OP_SUBTRACT:
					{
					setState(139);
					match(OP_SUBTRACT);
					setState(140);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OP_MULTIPLY() { return getTokens(languageParser.OP_MULTIPLY); }
		public TerminalNode OP_MULTIPLY(int i) {
			return getToken(languageParser.OP_MULTIPLY, i);
		}
		public List<TerminalNode> OP_DIVIDE() { return getTokens(languageParser.OP_DIVIDE); }
		public TerminalNode OP_DIVIDE(int i) {
			return getToken(languageParser.OP_DIVIDE, i);
		}
		public List<TerminalNode> OP_MODE() { return getTokens(languageParser.OP_MODE); }
		public TerminalNode OP_MODE(int i) {
			return getToken(languageParser.OP_MODE, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			factor();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MULTIPLY) | (1L << OP_DIVIDE) | (1L << OP_MODE))) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_MULTIPLY:
					{
					setState(147);
					match(OP_MULTIPLY);
					setState(148);
					factor();
					}
					break;
				case OP_DIVIDE:
					{
					setState(149);
					match(OP_DIVIDE);
					setState(150);
					factor();
					}
					break;
				case OP_MODE:
					{
					setState(151);
					match(OP_MODE);
					setState(152);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class FactorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(languageParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode OP_SUBTRACT() { return getToken(languageParser.OP_SUBTRACT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(languageParser.RIGHT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(LEFT_PARENTHESIS);
				setState(161);
				match(OP_SUBTRACT);
				setState(162);
				factor();
				setState(163);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(LEFT_PARENTHESIS);
				setState(166);
				expression();
				setState(167);
				match(RIGHT_PARENTHESIS);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(languageParser.LEFT_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(languageParser.RIGHT_PARENTHESIS, 0); }
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public TerminalNode OP_NOT() { return getToken(languageParser.OP_NOT, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comparison);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(LEFT_PARENTHESIS);
				setState(172);
				expression();
				setState(173);
				comparisonOperator();
				setState(174);
				expression();
				setState(175);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(LEFT_PARENTHESIS);
				setState(178);
				comparison();
				setState(179);
				logicalOperator();
				setState(180);
				comparison();
				setState(181);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(LEFT_PARENTHESIS);
				setState(184);
				match(OP_NOT);
				setState(185);
				comparison();
				setState(186);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(LEFT_PARENTHESIS);
				setState(189);
				comparison();
				setState(190);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(LEFT_PARENTHESIS);
				setState(193);
				variableName();
				setState(194);
				match(RIGHT_PARENTHESIS);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode OP_EQUALS() { return getToken(languageParser.OP_EQUALS, 0); }
		public TerminalNode OP_NOTEQUALS() { return getToken(languageParser.OP_NOTEQUALS, 0); }
		public TerminalNode OP_LESS() { return getToken(languageParser.OP_LESS, 0); }
		public TerminalNode OP_LESSEQUAL() { return getToken(languageParser.OP_LESSEQUAL, 0); }
		public TerminalNode OP_MORE() { return getToken(languageParser.OP_MORE, 0); }
		public TerminalNode OP_MOREEQUAL() { return getToken(languageParser.OP_MOREEQUAL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQUALS) | (1L << OP_NOTEQUALS) | (1L << OP_LESS) | (1L << OP_LESSEQUAL) | (1L << OP_MORE) | (1L << OP_MOREEQUAL))) != 0)) ) {
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OP_OR() { return getToken(languageParser.OP_OR, 0); }
		public TerminalNode OP_AND() { return getToken(languageParser.OP_AND, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==OP_OR || _la==OP_AND) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				intLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				floatLiteral();
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

	public static class IntLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(languageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(languageParser.NUMBER, i);
		}
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				match(NUMBER);
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(languageParser.DOT, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(languageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(languageParser.NUMBER, i);
		}
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(NUMBER);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(216);
			match(DOT);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(NUMBER);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"R\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13`\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\fg\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16q"+
		"\n\16\f\16\16\16t\13\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\7\23\u0090\n\23\f\23\16\23\u0093\13\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u009c\n\24\f\24\16\24\u009f\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ac\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c7\n\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\5\31\u00cf\n\31\3\32\6\32\u00d2\n\32\r\32\16\32\u00d3"+
		"\3\33\6\33\u00d7\n\33\r\33\16\33\u00d8\3\33\3\33\6\33\u00dd\n\33\r\33"+
		"\16\33\u00de\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\2\4\3\2\17\24\3\2\25\26\2\u00e3\2\66\3\2\2\2\4;\3\2\2\2\6"+
		">\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22"+
		"Z\3\2\2\2\24_\3\2\2\2\26a\3\2\2\2\30h\3\2\2\2\32l\3\2\2\2\34w\3\2\2\2"+
		"\36z\3\2\2\2 }\3\2\2\2\"\u0084\3\2\2\2$\u008a\3\2\2\2&\u0094\3\2\2\2("+
		"\u00ab\3\2\2\2*\u00c6\3\2\2\2,\u00c8\3\2\2\2.\u00ca\3\2\2\2\60\u00ce\3"+
		"\2\2\2\62\u00d1\3\2\2\2\64\u00d6\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\28:"+
		"\5\f\7\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=;\3\2\2\2"+
		">?\7\30\2\2?\7\3\2\2\2@A\7\31\2\2A\t\3\2\2\2BF\5\6\4\2CE\5\f\7\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\b\5\2J\13\3"+
		"\2\2\2KR\5\20\t\2LR\5\26\f\2MR\5\30\r\2NR\5\n\6\2OR\5 \21\2PR\5\"\22\2"+
		"QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\r\3\2\2"+
		"\2ST\7\3\2\2T\17\3\2\2\2UV\5\22\n\2VW\7\t\2\2WX\5\24\13\2XY\5\16\b\2Y"+
		"\21\3\2\2\2Z[\7\37\2\2[\23\3\2\2\2\\`\5$\23\2]`\5*\26\2^`\5\60\31\2_\\"+
		"\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\25\3\2\2\2ab\7\4\2\2bc\5*\26\2cf\5\n\6\2"+
		"de\7\5\2\2eg\5\n\6\2fd\3\2\2\2fg\3\2\2\2g\27\3\2\2\2hi\7\6\2\2ij\5*\26"+
		"\2jk\5\32\16\2k\31\3\2\2\2lr\5\6\4\2mq\5\f\7\2nq\5\34\17\2oq\5\36\20\2"+
		"pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"tr\3\2\2\2uv\5\b\5\2v\33\3\2\2\2wx\7\7\2\2xy\5\16\b\2y\35\3\2\2\2z{\7"+
		"\b\2\2{|\5\16\b\2|\37\3\2\2\2}~\5\22\n\2~\177\7\t\2\2\177\u0080\7\35\2"+
		"\2\u0080\u0081\7\32\2\2\u0081\u0082\7\33\2\2\u0082\u0083\5\16\b\2\u0083"+
		"!\3\2\2\2\u0084\u0085\7\34\2\2\u0085\u0086\7\32\2\2\u0086\u0087\5$\23"+
		"\2\u0087\u0088\7\33\2\2\u0088\u0089\5\16\b\2\u0089#\3\2\2\2\u008a\u0091"+
		"\5&\24\2\u008b\u008c\7\n\2\2\u008c\u0090\5&\24\2\u008d\u008e\7\13\2\2"+
		"\u008e\u0090\5&\24\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092%\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u009d\5(\25\2\u0095\u0096\7\f\2\2\u0096\u009c\5("+
		"\25\2\u0097\u0098\7\r\2\2\u0098\u009c\5(\25\2\u0099\u009a\7\16\2\2\u009a"+
		"\u009c\5(\25\2\u009b\u0095\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\'\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00ac\5\60\31\2\u00a1\u00ac\5\22"+
		"\n\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\5(\25\2\u00a5"+
		"\u00a6\7\33\2\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\5"+
		"$\23\2\u00a9\u00aa\7\33\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab"+
		"\u00a1\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac)\3\2\2\2"+
		"\u00ad\u00ae\7\32\2\2\u00ae\u00af\5$\23\2\u00af\u00b0\5,\27\2\u00b0\u00b1"+
		"\5$\23\2\u00b1\u00b2\7\33\2\2\u00b2\u00c7\3\2\2\2\u00b3\u00b4\7\32\2\2"+
		"\u00b4\u00b5\5*\26\2\u00b5\u00b6\5.\30\2\u00b6\u00b7\5*\26\2\u00b7\u00b8"+
		"\7\33\2\2\u00b8\u00c7\3\2\2\2\u00b9\u00ba\7\32\2\2\u00ba\u00bb\7\27\2"+
		"\2\u00bb\u00bc\5*\26\2\u00bc\u00bd\7\33\2\2\u00bd\u00c7\3\2\2\2\u00be"+
		"\u00bf\7\32\2\2\u00bf\u00c0\5*\26\2\u00c0\u00c1\7\33\2\2\u00c1\u00c7\3"+
		"\2\2\2\u00c2\u00c3\7\32\2\2\u00c3\u00c4\5\22\n\2\u00c4\u00c5\7\33\2\2"+
		"\u00c5\u00c7\3\2\2\2\u00c6\u00ad\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00b9"+
		"\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7+\3\2\2\2\u00c8"+
		"\u00c9\t\2\2\2\u00c9-\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb/\3\2\2\2\u00cc"+
		"\u00cf\5\62\32\2\u00cd\u00cf\5\64\33\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\61\3\2\2\2\u00d0\u00d2\7!\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\63\3\2\2"+
		"\2\u00d5\u00d7\7!\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\36\2\2"+
		"\u00db\u00dd\7!\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\65\3\2\2\2\23;FQ_fpr\u008f\u0091\u009b"+
		"\u009d\u00ab\u00c6\u00ce\u00d3\u00d8\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}