// Generated from net/davidesavazzi/mylanguage/Chat.g4 by ANTLR 4.7.1

package net.davidesavazzi.mylanguage;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SAYS=9, 
		SHOUTS=10, WORD=11, WHITESPACE=12, NEWLINE=13, TEXT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "A", "S", 
		"Y", "H", "O", "U", "T", "LOWERCASE", "UPPERCASE", "SAYS", "SHOUTS", "WORD", 
		"WHITESPACE", "NEWLINE", "TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'-'", "')'", "'('", "'['", "']'", "'/'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SAYS", "SHOUTS", 
		"WORD", "WHITESPACE", "NEWLINE", "TEXT"
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


	public ChatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\6\25c\n\25\r\25\16\25d\3\26\6\26h\n\26\r\26\16\26i\3\27\5\27m\n"+
		"\27\3\27\3\27\6\27q\n\27\r\27\16\27r\3\30\3\30\6\30w\n\30\r\30\16\30x"+
		"\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31"+
		"\2\33\2\35\2\37\2!\2#\2%\13\'\f)\r+\16-\17/\20\3\2\16\4\2CCcc\4\2UUuu"+
		"\4\2[[{{\4\2JJjj\4\2QQqq\4\2WWww\4\2VVvv\3\2c|\3\2C\\\4\2\13\13\"\"\4"+
		"\2**]]\4\2++__\2z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2"+
		"\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2"+
		"\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35K\3"+
		"\2\2\2\37M\3\2\2\2!O\3\2\2\2#Q\3\2\2\2%S\3\2\2\2\'X\3\2\2\2)b\3\2\2\2"+
		"+g\3\2\2\2-p\3\2\2\2/t\3\2\2\2\61\62\7<\2\2\62\4\3\2\2\2\63\64\7/\2\2"+
		"\64\6\3\2\2\2\65\66\7+\2\2\66\b\3\2\2\2\678\7*\2\28\n\3\2\2\29:\7]\2\2"+
		":\f\3\2\2\2;<\7_\2\2<\16\3\2\2\2=>\7\61\2\2>\20\3\2\2\2?@\7B\2\2@\22\3"+
		"\2\2\2AB\t\2\2\2B\24\3\2\2\2CD\t\3\2\2D\26\3\2\2\2EF\t\4\2\2F\30\3\2\2"+
		"\2GH\t\5\2\2H\32\3\2\2\2IJ\t\6\2\2J\34\3\2\2\2KL\t\7\2\2L\36\3\2\2\2M"+
		"N\t\b\2\2N \3\2\2\2OP\t\t\2\2P\"\3\2\2\2QR\t\n\2\2R$\3\2\2\2ST\5\25\13"+
		"\2TU\5\23\n\2UV\5\27\f\2VW\5\25\13\2W&\3\2\2\2XY\5\25\13\2YZ\5\31\r\2"+
		"Z[\5\33\16\2[\\\5\35\17\2\\]\5\37\20\2]^\5\25\13\2^(\3\2\2\2_c\5!\21\2"+
		"`c\5#\22\2ac\7a\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e*\3\2\2\2fh\t\13\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2j,\3\2\2\2km\7\17\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2nq\7\f\2\2oq\7\17"+
		"\2\2pl\3\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s.\3\2\2\2tv\t\f"+
		"\2\2uw\n\r\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\t\r"+
		"\2\2{\60\3\2\2\2\n\2bdilprx\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}