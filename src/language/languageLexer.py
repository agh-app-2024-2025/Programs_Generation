# Generated from language.g4 by ANTLR 4.11.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,36,197,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,
        26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,
        32,2,33,7,33,2,34,7,34,2,35,7,35,1,0,1,0,1,1,1,1,1,2,1,2,1,2,1,3,
        1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,
        1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,8,1,8,1,9,1,9,1,10,
        1,10,1,11,1,11,1,12,1,12,1,13,1,13,1,13,1,14,1,14,1,14,1,15,1,15,
        1,16,1,16,1,16,1,17,1,17,1,18,1,18,1,18,1,19,1,19,1,19,1,20,1,20,
        1,20,1,21,1,21,1,22,1,22,1,23,1,23,1,24,1,24,1,25,1,25,1,26,1,26,
        1,27,1,27,1,27,1,27,1,28,1,28,1,28,1,28,1,28,1,28,1,29,1,29,1,30,
        1,30,4,30,167,8,30,11,30,12,30,168,1,31,1,31,1,32,1,32,1,33,4,33,
        176,8,33,11,33,12,33,177,1,33,1,33,1,34,1,34,1,34,5,34,185,8,34,
        10,34,12,34,188,9,34,1,34,1,34,1,35,1,35,1,35,1,35,3,35,196,8,35,
        0,0,36,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,
        25,13,27,14,29,15,31,16,33,17,35,18,37,19,39,20,41,21,43,22,45,23,
        47,24,49,25,51,26,53,27,55,28,57,29,59,30,61,31,63,32,65,33,67,34,
        69,35,71,36,1,0,5,3,0,48,57,65,90,97,122,2,0,65,90,97,122,1,0,48,
        57,3,0,9,10,13,13,32,32,1,0,34,34,201,0,1,1,0,0,0,0,3,1,0,0,0,0,
        5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,
        1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,
        1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,
        1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,
        1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,
        1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,
        1,0,0,0,0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,0,1,73,1,0,0,0,3,75,
        1,0,0,0,5,77,1,0,0,0,7,80,1,0,0,0,9,85,1,0,0,0,11,91,1,0,0,0,13,
        100,1,0,0,0,15,106,1,0,0,0,17,108,1,0,0,0,19,110,1,0,0,0,21,112,
        1,0,0,0,23,114,1,0,0,0,25,116,1,0,0,0,27,118,1,0,0,0,29,121,1,0,
        0,0,31,124,1,0,0,0,33,126,1,0,0,0,35,129,1,0,0,0,37,131,1,0,0,0,
        39,134,1,0,0,0,41,137,1,0,0,0,43,140,1,0,0,0,45,142,1,0,0,0,47,144,
        1,0,0,0,49,146,1,0,0,0,51,148,1,0,0,0,53,150,1,0,0,0,55,152,1,0,
        0,0,57,156,1,0,0,0,59,162,1,0,0,0,61,164,1,0,0,0,63,170,1,0,0,0,
        65,172,1,0,0,0,67,175,1,0,0,0,69,181,1,0,0,0,71,195,1,0,0,0,73,74,
        5,59,0,0,74,2,1,0,0,0,75,76,5,34,0,0,76,4,1,0,0,0,77,78,5,105,0,
        0,78,79,5,102,0,0,79,6,1,0,0,0,80,81,5,101,0,0,81,82,5,108,0,0,82,
        83,5,115,0,0,83,84,5,101,0,0,84,8,1,0,0,0,85,86,5,119,0,0,86,87,
        5,104,0,0,87,88,5,105,0,0,88,89,5,108,0,0,89,90,5,101,0,0,90,10,
        1,0,0,0,91,92,5,99,0,0,92,93,5,111,0,0,93,94,5,110,0,0,94,95,5,116,
        0,0,95,96,5,105,0,0,96,97,5,110,0,0,97,98,5,117,0,0,98,99,5,101,
        0,0,99,12,1,0,0,0,100,101,5,98,0,0,101,102,5,114,0,0,102,103,5,101,
        0,0,103,104,5,97,0,0,104,105,5,107,0,0,105,14,1,0,0,0,106,107,5,
        61,0,0,107,16,1,0,0,0,108,109,5,43,0,0,109,18,1,0,0,0,110,111,5,
        45,0,0,111,20,1,0,0,0,112,113,5,42,0,0,113,22,1,0,0,0,114,115,5,
        47,0,0,115,24,1,0,0,0,116,117,5,37,0,0,117,26,1,0,0,0,118,119,5,
        61,0,0,119,120,5,61,0,0,120,28,1,0,0,0,121,122,5,33,0,0,122,123,
        5,61,0,0,123,30,1,0,0,0,124,125,5,60,0,0,125,32,1,0,0,0,126,127,
        5,60,0,0,127,128,5,61,0,0,128,34,1,0,0,0,129,130,5,62,0,0,130,36,
        1,0,0,0,131,132,5,62,0,0,132,133,5,61,0,0,133,38,1,0,0,0,134,135,
        5,124,0,0,135,136,5,124,0,0,136,40,1,0,0,0,137,138,5,38,0,0,138,
        139,5,38,0,0,139,42,1,0,0,0,140,141,5,33,0,0,141,44,1,0,0,0,142,
        143,5,94,0,0,143,46,1,0,0,0,144,145,5,123,0,0,145,48,1,0,0,0,146,
        147,5,125,0,0,147,50,1,0,0,0,148,149,5,40,0,0,149,52,1,0,0,0,150,
        151,5,41,0,0,151,54,1,0,0,0,152,153,5,111,0,0,153,154,5,117,0,0,
        154,155,5,116,0,0,155,56,1,0,0,0,156,157,5,105,0,0,157,158,5,110,
        0,0,158,159,5,112,0,0,159,160,5,117,0,0,160,161,5,116,0,0,161,58,
        1,0,0,0,162,163,5,46,0,0,163,60,1,0,0,0,164,166,5,118,0,0,165,167,
        7,0,0,0,166,165,1,0,0,0,167,168,1,0,0,0,168,166,1,0,0,0,168,169,
        1,0,0,0,169,62,1,0,0,0,170,171,7,1,0,0,171,64,1,0,0,0,172,173,7,
        2,0,0,173,66,1,0,0,0,174,176,7,3,0,0,175,174,1,0,0,0,176,177,1,0,
        0,0,177,175,1,0,0,0,177,178,1,0,0,0,178,179,1,0,0,0,179,180,6,33,
        0,0,180,68,1,0,0,0,181,186,3,3,1,0,182,185,3,71,35,0,183,185,8,4,
        0,0,184,182,1,0,0,0,184,183,1,0,0,0,185,188,1,0,0,0,186,184,1,0,
        0,0,186,187,1,0,0,0,187,189,1,0,0,0,188,186,1,0,0,0,189,190,3,3,
        1,0,190,70,1,0,0,0,191,192,5,92,0,0,192,196,5,34,0,0,193,194,5,92,
        0,0,194,196,5,92,0,0,195,191,1,0,0,0,195,193,1,0,0,0,196,72,1,0,
        0,0,6,0,168,177,184,186,195,1,6,0,0
    ]

class languageLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    EOL = 1
    STR_QUOTE = 2
    IF = 3
    ELSE = 4
    WHILE = 5
    CONT = 6
    BRK = 7
    OP_ASSIGN = 8
    OP_ADD = 9
    OP_SUBTRACT = 10
    OP_MULTIPLY = 11
    OP_DIVIDE = 12
    OP_MODE = 13
    OP_EQUALS = 14
    OP_NOTEQUALS = 15
    OP_LESS = 16
    OP_LESSEQUAL = 17
    OP_MORE = 18
    OP_MOREEQUAL = 19
    OP_OR = 20
    OP_AND = 21
    OP_NOT = 22
    OP_XOR = 23
    LEFT_BRACKET = 24
    RIGHT_BRACKET = 25
    LEFT_PARENTHESIS = 26
    RIGHT_PARENTHESIS = 27
    OUT = 28
    INPUT = 29
    DOT = 30
    ALPHANUMERIC = 31
    LETTER = 32
    NUMBER = 33
    WS = 34
    STR_LITERAL = 35
    STR_ESCAPE = 36

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "';'", "'\"'", "'if'", "'else'", "'while'", "'continue'", "'break'", 
            "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", 
            "'<='", "'>'", "'>='", "'||'", "'&&'", "'!'", "'^'", "'{'", 
            "'}'", "'('", "')'", "'out'", "'input'", "'.'" ]

    symbolicNames = [ "<INVALID>",
            "EOL", "STR_QUOTE", "IF", "ELSE", "WHILE", "CONT", "BRK", "OP_ASSIGN", 
            "OP_ADD", "OP_SUBTRACT", "OP_MULTIPLY", "OP_DIVIDE", "OP_MODE", 
            "OP_EQUALS", "OP_NOTEQUALS", "OP_LESS", "OP_LESSEQUAL", "OP_MORE", 
            "OP_MOREEQUAL", "OP_OR", "OP_AND", "OP_NOT", "OP_XOR", "LEFT_BRACKET", 
            "RIGHT_BRACKET", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "OUT", 
            "INPUT", "DOT", "ALPHANUMERIC", "LETTER", "NUMBER", "WS", "STR_LITERAL", 
            "STR_ESCAPE" ]

    ruleNames = [ "EOL", "STR_QUOTE", "IF", "ELSE", "WHILE", "CONT", "BRK", 
                  "OP_ASSIGN", "OP_ADD", "OP_SUBTRACT", "OP_MULTIPLY", "OP_DIVIDE", 
                  "OP_MODE", "OP_EQUALS", "OP_NOTEQUALS", "OP_LESS", "OP_LESSEQUAL", 
                  "OP_MORE", "OP_MOREEQUAL", "OP_OR", "OP_AND", "OP_NOT", 
                  "OP_XOR", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESIS", 
                  "RIGHT_PARENTHESIS", "OUT", "INPUT", "DOT", "ALPHANUMERIC", 
                  "LETTER", "NUMBER", "WS", "STR_LITERAL", "STR_ESCAPE" ]

    grammarFileName = "language.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.11.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None

