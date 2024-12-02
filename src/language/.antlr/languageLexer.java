// Generated from c:/dominik/uczelnia/sem9/Advanced_Python_Programming/Programs_Generation/src/language/language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000 \u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0004\u001c"+
		"\u009b\b\u001c\u000b\u001c\f\u001c\u009c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u00a4\b\u001f\u000b\u001f\f"+
		"\u001f\u00a5\u0001\u001f\u0001\u001f\u0000\u0000 \u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? \u0001\u0000\u0004\u0003\u000009AZaz\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00aa\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003C"+
		"\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007K\u0001\u0000"+
		"\u0000\u0000\tQ\u0001\u0000\u0000\u0000\u000bZ\u0001\u0000\u0000\u0000"+
		"\r`\u0001\u0000\u0000\u0000\u000fb\u0001\u0000\u0000\u0000\u0011d\u0001"+
		"\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015h\u0001\u0000\u0000"+
		"\u0000\u0017j\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001b"+
		"o\u0001\u0000\u0000\u0000\u001dr\u0001\u0000\u0000\u0000\u001ft\u0001"+
		"\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#y\u0001\u0000\u0000\u0000"+
		"%|\u0001\u0000\u0000\u0000\'\u007f\u0001\u0000\u0000\u0000)\u0082\u0001"+
		"\u0000\u0000\u0000+\u0084\u0001\u0000\u0000\u0000-\u0086\u0001\u0000\u0000"+
		"\u0000/\u0088\u0001\u0000\u0000\u00001\u008a\u0001\u0000\u0000\u00003"+
		"\u008c\u0001\u0000\u0000\u00005\u0090\u0001\u0000\u0000\u00007\u0096\u0001"+
		"\u0000\u0000\u00009\u0098\u0001\u0000\u0000\u0000;\u009e\u0001\u0000\u0000"+
		"\u0000=\u00a0\u0001\u0000\u0000\u0000?\u00a3\u0001\u0000\u0000\u0000A"+
		"B\u0005;\u0000\u0000B\u0002\u0001\u0000\u0000\u0000CD\u0005i\u0000\u0000"+
		"DE\u0005f\u0000\u0000E\u0004\u0001\u0000\u0000\u0000FG\u0005e\u0000\u0000"+
		"GH\u0005l\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005e\u0000\u0000J\u0006"+
		"\u0001\u0000\u0000\u0000KL\u0005w\u0000\u0000LM\u0005h\u0000\u0000MN\u0005"+
		"i\u0000\u0000NO\u0005l\u0000\u0000OP\u0005e\u0000\u0000P\b\u0001\u0000"+
		"\u0000\u0000QR\u0005c\u0000\u0000RS\u0005o\u0000\u0000ST\u0005n\u0000"+
		"\u0000TU\u0005t\u0000\u0000UV\u0005i\u0000\u0000VW\u0005n\u0000\u0000"+
		"WX\u0005u\u0000\u0000XY\u0005e\u0000\u0000Y\n\u0001\u0000\u0000\u0000"+
		"Z[\u0005b\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005"+
		"a\u0000\u0000^_\u0005k\u0000\u0000_\f\u0001\u0000\u0000\u0000`a\u0005"+
		"=\u0000\u0000a\u000e\u0001\u0000\u0000\u0000bc\u0005+\u0000\u0000c\u0010"+
		"\u0001\u0000\u0000\u0000de\u0005-\u0000\u0000e\u0012\u0001\u0000\u0000"+
		"\u0000fg\u0005*\u0000\u0000g\u0014\u0001\u0000\u0000\u0000hi\u0005/\u0000"+
		"\u0000i\u0016\u0001\u0000\u0000\u0000jk\u0005%\u0000\u0000k\u0018\u0001"+
		"\u0000\u0000\u0000lm\u0005=\u0000\u0000mn\u0005=\u0000\u0000n\u001a\u0001"+
		"\u0000\u0000\u0000op\u0005!\u0000\u0000pq\u0005=\u0000\u0000q\u001c\u0001"+
		"\u0000\u0000\u0000rs\u0005<\u0000\u0000s\u001e\u0001\u0000\u0000\u0000"+
		"tu\u0005<\u0000\u0000uv\u0005=\u0000\u0000v \u0001\u0000\u0000\u0000w"+
		"x\u0005>\u0000\u0000x\"\u0001\u0000\u0000\u0000yz\u0005>\u0000\u0000z"+
		"{\u0005=\u0000\u0000{$\u0001\u0000\u0000\u0000|}\u0005|\u0000\u0000}~"+
		"\u0005|\u0000\u0000~&\u0001\u0000\u0000\u0000\u007f\u0080\u0005&\u0000"+
		"\u0000\u0080\u0081\u0005&\u0000\u0000\u0081(\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005!\u0000\u0000\u0083*\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"{\u0000\u0000\u0085,\u0001\u0000\u0000\u0000\u0086\u0087\u0005}\u0000"+
		"\u0000\u0087.\u0001\u0000\u0000\u0000\u0088\u0089\u0005(\u0000\u0000\u0089"+
		"0\u0001\u0000\u0000\u0000\u008a\u008b\u0005)\u0000\u0000\u008b2\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005o\u0000\u0000\u008d\u008e\u0005u\u0000"+
		"\u0000\u008e\u008f\u0005t\u0000\u0000\u008f4\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005i\u0000\u0000\u0091\u0092\u0005n\u0000\u0000\u0092\u0093\u0005"+
		"p\u0000\u0000\u0093\u0094\u0005u\u0000\u0000\u0094\u0095\u0005t\u0000"+
		"\u0000\u00956\u0001\u0000\u0000\u0000\u0096\u0097\u0005.\u0000\u0000\u0097"+
		"8\u0001\u0000\u0000\u0000\u0098\u009a\u0005v\u0000\u0000\u0099\u009b\u0007"+
		"\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d:\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0001"+
		"\u0000\u0000\u009f<\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0002\u0000"+
		"\u0000\u00a1>\u0001\u0000\u0000\u0000\u00a2\u00a4\u0007\u0003\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006\u001f\u0000\u0000"+
		"\u00a8@\u0001\u0000\u0000\u0000\u0003\u0000\u009c\u00a5\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}