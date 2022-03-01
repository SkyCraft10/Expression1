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
		ASSIGN=9, NOTEQUAL=10, SEMI=11, POINT=12, FLOAT=13, INTEGER=14, VARIABLENAME=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OUTSTATEMENT", "INT", "PLUS", "MINUS", "DIV", "MULT", "MOD", "EQUALS", 
			"ASSIGN", "NOTEQUAL", "SEMI", "POINT", "FLOAT", "INTEGER", "VARIABLENAME", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'int'", "'+'", "'-'", "'/'", "'*'", "'%'", "'=='", 
			"'='", "'!='", "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OUTSTATEMENT", "INT", "PLUS", "MINUS", "DIV", "MULT", "MOD", "EQUALS", 
			"ASSIGN", "NOTEQUAL", "SEMI", "POINT", "FLOAT", "INTEGER", "VARIABLENAME", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16E\n\16\r"+
		"\16\16\16F\3\16\3\16\7\16K\n\16\f\16\16\16N\13\16\3\16\3\16\6\16R\n\16"+
		"\r\16\16\16S\5\16V\n\16\3\17\6\17Y\n\17\r\17\16\17Z\3\20\6\20^\n\20\r"+
		"\20\16\20_\3\21\6\21c\n\21\r\21\16\21d\3\21\3\21\2\2\22\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2"+
		"\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2n\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5)\3\2\2\2\7-\3\2\2\2\t"+
		"/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\23:\3"+
		"\2\2\2\25<\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33U\3\2\2\2\35X\3\2\2\2\37"+
		"]\3\2\2\2!b\3\2\2\2#$\7r\2\2$%\7t\2\2%&\7k\2\2&\'\7p\2\2\'(\7v\2\2(\4"+
		"\3\2\2\2)*\7k\2\2*+\7p\2\2+,\7v\2\2,\6\3\2\2\2-.\7-\2\2.\b\3\2\2\2/\60"+
		"\7/\2\2\60\n\3\2\2\2\61\62\7\61\2\2\62\f\3\2\2\2\63\64\7,\2\2\64\16\3"+
		"\2\2\2\65\66\7\'\2\2\66\20\3\2\2\2\678\7?\2\289\7?\2\29\22\3\2\2\2:;\7"+
		"?\2\2;\24\3\2\2\2<=\7#\2\2=>\7?\2\2>\26\3\2\2\2?@\7=\2\2@\30\3\2\2\2A"+
		"B\7\60\2\2B\32\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2GH\3\2\2\2HL\7\60\2\2IK\t\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MV\3\2\2\2NL\3\2\2\2OQ\7\60\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2TV\3\2\2\2UD\3\2\2\2UO\3\2\2\2V\34\3\2\2\2WY\t\2\2\2X"+
		"W\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\36\3\2\2\2\\^\t\3\2\2]\\\3\2"+
		"\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2` \3\2\2\2ac\t\4\2\2ba\3\2\2\2cd\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\21\2\2g\"\3\2\2\2\n\2FLSUZ_d\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}