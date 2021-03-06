// Generated from parseInput.g4 by ANTLR 4.5.1

    package AntlrParser;
    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parseInputLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NOT_TERMINAL_ID=7, TERMINAL_ID=8, 
		REGEXP_EXPRESSION=9, STRING=10, CODE=11, DECLARE_INNER_VARIABLE=12, PACAGE_NAME=13, 
		WHITE_SPACE=14, SAVE=15, SCIP=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NOT_TERMINAL_ID", "TERMINAL_ID", 
		"REGEXP_EXPRESSION", "STRING", "CODE", "DECLARE_INNER_VARIABLE", "PACAGE_NAME", 
		"WHITE_SPACE", "SAVE", "SCIP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "';'", "'package'", "'!'", "':'", "'|'", null, null, 
		null, null, null, null, null, null, "'='", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NOT_TERMINAL_ID", "TERMINAL_ID", 
		"REGEXP_EXPRESSION", "STRING", "CODE", "DECLARE_INNER_VARIABLE", "PACAGE_NAME", 
		"WHITE_SPACE", "SAVE", "SCIP"
	};
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


	public parseInputLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "parseInput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\t\3\t\7\tC\n\t\f\t\16\t"+
		"F\13\t\3\n\3\n\3\n\3\n\7\nL\n\n\f\n\16\nO\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\7\13W\n\13\f\13\16\13Z\13\13\3\13\3\13\3\f\3\f\6\f`\n\f\r\f\16\f"+
		"a\7\fd\n\f\f\f\16\fg\13\f\3\f\3\f\3\r\3\r\6\rm\n\r\r\r\16\rn\7\rq\n\r"+
		"\f\r\16\rt\13\r\3\r\3\r\3\16\6\16y\n\16\r\16\16\16z\3\17\6\17~\n\17\r"+
		"\17\16\17\177\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2"+
		"\f\3\2c|\4\2\62;c|\3\2C\\\4\2\62;C\\\5\2\f\f\17\17))\3\2$$\4\2}}\177\177"+
		"\4\2>>@@\5\2\60\60\62;c|\5\2\13\f\17\17\"\"\u0093\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5)\3\2\2\2\7+\3\2"+
		"\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21@\3\2\2\2\23"+
		"G\3\2\2\2\25R\3\2\2\2\27]\3\2\2\2\31j\3\2\2\2\33x\3\2\2\2\35}\3\2\2\2"+
		"\37\u0083\3\2\2\2!\u0085\3\2\2\2#$\7u\2\2$%\7v\2\2%&\7c\2\2&\'\7t\2\2"+
		"\'(\7v\2\2(\4\3\2\2\2)*\7=\2\2*\6\3\2\2\2+,\7r\2\2,-\7c\2\2-.\7e\2\2."+
		"/\7m\2\2/\60\7c\2\2\60\61\7i\2\2\61\62\7g\2\2\62\b\3\2\2\2\63\64\7#\2"+
		"\2\64\n\3\2\2\2\65\66\7<\2\2\66\f\3\2\2\2\678\7~\2\28\16\3\2\2\29=\t\2"+
		"\2\2:<\t\3\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\20\3\2\2\2?=\3"+
		"\2\2\2@D\t\4\2\2AC\t\5\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\22"+
		"\3\2\2\2FD\3\2\2\2GM\7)\2\2HL\n\6\2\2IJ\7^\2\2JL\7)\2\2KH\3\2\2\2KI\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7)\2\2Q\24"+
		"\3\2\2\2RX\7$\2\2SW\n\7\2\2TU\7^\2\2UW\7$\2\2VS\3\2\2\2VT\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7$\2\2\\\26\3\2\2\2"+
		"]e\7}\2\2^`\n\b\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\177\2"+
		"\2i\30\3\2\2\2jr\7>\2\2km\n\t\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2oq\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2"+
		"\2\2uv\7@\2\2v\32\3\2\2\2wy\t\n\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\34\3\2\2\2|~\t\13\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\17\2\2\u0082\36\3\2\2"+
		"\2\u0083\u0084\7?\2\2\u0084 \3\2\2\2\u0085\u0086\7?\2\2\u0086\u0087\7"+
		"@\2\2\u0087\"\3\2\2\2\20\2=DKMVXaenrxz\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}