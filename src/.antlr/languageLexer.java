// Generated from c:\dominik\u005Cuczelnia\programowanie_genetyczne\project\geneticprogrammingdk_mg\antlr\language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "IF", "ELSE", "WHILE", "CONT", "BRK", "OP_ASSIGN", "OP_ADD", "OP_SUBTRACT", 
			"OP_MULTIPLY", "OP_DIVIDE", "OP_MODE", "OP_EQUALS", "OP_NOTEQUALS", "OP_LESS", 
			"OP_LESSEQUAL", "OP_MORE", "OP_MOREEQUAL", "OP_OR", "OP_AND", "OP_NOT", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"OUT", "INPUT", "DOT", "ALPHANUMERIC", "LETTER", "NUMBER", "WS"
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


	public languageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\6\36\u009d"+
		"\n\36\r\36\16\36\u009e\3\37\3\37\3 \3 \3!\6!\u00a6\n!\r!\16!\u00a7\3!"+
		"\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"\3\2\6\5\2\62;C\\c|\4\2C\\c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2"+
		"\2\7H\3\2\2\2\tM\3\2\2\2\13S\3\2\2\2\r\\\3\2\2\2\17b\3\2\2\2\21d\3\2\2"+
		"\2\23f\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35q\3\2"+
		"\2\2\37t\3\2\2\2!v\3\2\2\2#y\3\2\2\2%{\3\2\2\2\'~\3\2\2\2)\u0081\3\2\2"+
		"\2+\u0084\3\2\2\2-\u0086\3\2\2\2/\u0088\3\2\2\2\61\u008a\3\2\2\2\63\u008c"+
		"\3\2\2\2\65\u008e\3\2\2\2\67\u0092\3\2\2\29\u0098\3\2\2\2;\u009a\3\2\2"+
		"\2=\u00a0\3\2\2\2?\u00a2\3\2\2\2A\u00a5\3\2\2\2CD\7=\2\2D\4\3\2\2\2EF"+
		"\7k\2\2FG\7h\2\2G\6\3\2\2\2HI\7g\2\2IJ\7n\2\2JK\7u\2\2KL\7g\2\2L\b\3\2"+
		"\2\2MN\7y\2\2NO\7j\2\2OP\7k\2\2PQ\7n\2\2QR\7g\2\2R\n\3\2\2\2ST\7e\2\2"+
		"TU\7q\2\2UV\7p\2\2VW\7v\2\2WX\7k\2\2XY\7p\2\2YZ\7w\2\2Z[\7g\2\2[\f\3\2"+
		"\2\2\\]\7d\2\2]^\7t\2\2^_\7g\2\2_`\7c\2\2`a\7m\2\2a\16\3\2\2\2bc\7?\2"+
		"\2c\20\3\2\2\2de\7-\2\2e\22\3\2\2\2fg\7/\2\2g\24\3\2\2\2hi\7,\2\2i\26"+
		"\3\2\2\2jk\7\61\2\2k\30\3\2\2\2lm\7\'\2\2m\32\3\2\2\2no\7?\2\2op\7?\2"+
		"\2p\34\3\2\2\2qr\7#\2\2rs\7?\2\2s\36\3\2\2\2tu\7>\2\2u \3\2\2\2vw\7>\2"+
		"\2wx\7?\2\2x\"\3\2\2\2yz\7@\2\2z$\3\2\2\2{|\7@\2\2|}\7?\2\2}&\3\2\2\2"+
		"~\177\7~\2\2\177\u0080\7~\2\2\u0080(\3\2\2\2\u0081\u0082\7(\2\2\u0082"+
		"\u0083\7(\2\2\u0083*\3\2\2\2\u0084\u0085\7#\2\2\u0085,\3\2\2\2\u0086\u0087"+
		"\7}\2\2\u0087.\3\2\2\2\u0088\u0089\7\177\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\7*\2\2\u008b\62\3\2\2\2\u008c\u008d\7+\2\2\u008d\64\3\2\2\2\u008e\u008f"+
		"\7q\2\2\u008f\u0090\7w\2\2\u0090\u0091\7v\2\2\u0091\66\3\2\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7r\2\2\u0095\u0096\7w\2\2\u0096"+
		"\u0097\7v\2\2\u00978\3\2\2\2\u0098\u0099\7\60\2\2\u0099:\3\2\2\2\u009a"+
		"\u009c\7x\2\2\u009b\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f<\3\2\2\2\u00a0\u00a1"+
		"\t\3\2\2\u00a1>\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3@\3\2\2\2\u00a4\u00a6"+
		"\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b!\2\2\u00aaB\3\2\2\2\5"+
		"\2\u009e\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}