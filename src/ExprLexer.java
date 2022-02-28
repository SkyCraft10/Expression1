// Generated from D:/University Of Essex/CE305-6-Languages and Compilers/Expression1/src\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OUTSTATEMENT=1, INT=2, PLUS=3, MINUS=4, DIV=5, MULT=6, MOD=7, EQUALS=8, 
		ASSIGN=9, NOTEQUAL=10, SEMI=11, FLOAT=12, INTEGERS=13, VARIABLENAME=14, 
		WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OUTSTATEMENT", "INT", "PLUS", "MINUS", "DIV", "MULT", "MOD", "EQUALS", 
			"ASSIGN", "NOTEQUAL", "SEMI", "FLOAT", "INTEGERS", "VARIABLENAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'int'", "'+'", "'-'", "'/'", "'*'", "'%'", "'=='", 
			"'='", "'!='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OUTSTATEMENT", "INT", "PLUS", "MINUS", "DIV", "MULT", "MOD", "EQUALS", 
			"ASSIGN", "NOTEQUAL", "SEMI", "FLOAT", "INTEGERS", "VARIABLENAME", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\6\rA\n\r\r\r\16\rB\3\r\3\r\6\rG"+
		"\n\r\r\r\16\rH\5\rK\n\r\3\16\6\16N\n\16\r\16\16\16O\3\17\5\17S\n\17\3"+
		"\20\6\20V\n\20\r\20\16\20W\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4\5\2C\\aac|\5\2\13"+
		"\f\17\17\"\"\2_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3"+
		"\2\2\2\5\'\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63"+
		"\3\2\2\2\21\65\3\2\2\2\238\3\2\2\2\25:\3\2\2\2\27=\3\2\2\2\31@\3\2\2\2"+
		"\33M\3\2\2\2\35R\3\2\2\2\37U\3\2\2\2!\"\7r\2\2\"#\7t\2\2#$\7k\2\2$%\7"+
		"p\2\2%&\7v\2\2&\4\3\2\2\2\'(\7k\2\2()\7p\2\2)*\7v\2\2*\6\3\2\2\2+,\7-"+
		"\2\2,\b\3\2\2\2-.\7/\2\2.\n\3\2\2\2/\60\7\61\2\2\60\f\3\2\2\2\61\62\7"+
		",\2\2\62\16\3\2\2\2\63\64\7\'\2\2\64\20\3\2\2\2\65\66\7?\2\2\66\67\7?"+
		"\2\2\67\22\3\2\2\289\7?\2\29\24\3\2\2\2:;\7#\2\2;<\7?\2\2<\26\3\2\2\2"+
		"=>\7=\2\2>\30\3\2\2\2?A\4\62;\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2CJ\3\2\2\2DF\7\60\2\2EG\4\62;\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2IK\3\2\2\2JD\3\2\2\2JK\3\2\2\2K\32\3\2\2\2LN\4\62;\2ML\3\2\2\2NO\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2P\34\3\2\2\2QS\t\2\2\2RQ\3\2\2\2S\36\3\2\2\2"+
		"TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\20\2"+
		"\2Z \3\2\2\2\t\2BHJORW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}