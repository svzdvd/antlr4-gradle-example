// Generated from net/davidesavazzi/mylanguage/Chat.g4 by ANTLR 4.7.1

package net.davidesavazzi.mylanguage;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SAYS=9, 
		SHOUTS=10, WORD=11, WHITESPACE=12, NEWLINE=13, TEXT=14;
	public static final int
		RULE_chat = 0, RULE_line = 1, RULE_name = 2, RULE_command = 3, RULE_message = 4, 
		RULE_emoticon = 5, RULE_link = 6, RULE_color = 7, RULE_mention = 8;
	public static final String[] ruleNames = {
		"chat", "line", "name", "command", "message", "emoticon", "link", "color", 
		"mention"
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

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChatContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ChatParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ChatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterChat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitChat(this);
		}
	}

	public final ChatContext chat() throws RecognitionException {
		ChatContext _localctx = new ChatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				line();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(23);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ChatParser.NEWLINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			name();
			setState(26);
			command();
			setState(27);
			message();
			setState(28);
			match(NEWLINE);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ChatParser.WORD, 0); }
		public TerminalNode WHITESPACE() { return getToken(ChatParser.WHITESPACE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(WORD);
			setState(31);
			match(WHITESPACE);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(ChatParser.WHITESPACE, 0); }
		public TerminalNode SAYS() { return getToken(ChatParser.SAYS, 0); }
		public TerminalNode SHOUTS() { return getToken(ChatParser.SHOUTS, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==SAYS || _la==SHOUTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(34);
			match(T__0);
			setState(35);
			match(WHITESPACE);
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

	public static class MessageContext extends ParserRuleContext {
		public List<EmoticonContext> emoticon() {
			return getRuleContexts(EmoticonContext.class);
		}
		public EmoticonContext emoticon(int i) {
			return getRuleContext(EmoticonContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<MentionContext> mention() {
			return getRuleContexts(MentionContext.class);
		}
		public MentionContext mention(int i) {
			return getRuleContext(MentionContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(ChatParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ChatParser.WORD, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ChatParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ChatParser.WHITESPACE, i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_message);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(37);
						emoticon();
						}
						break;
					case T__4:
						{
						setState(38);
						link();
						}
						break;
					case T__6:
						{
						setState(39);
						color();
						}
						break;
					case T__7:
						{
						setState(40);
						mention();
						}
						break;
					case WORD:
						{
						setState(41);
						match(WORD);
						}
						break;
					case WHITESPACE:
						{
						setState(42);
						match(WHITESPACE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class EmoticonContext extends ParserRuleContext {
		public EmoticonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emoticon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterEmoticon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitEmoticon(this);
		}
	}

	public final EmoticonContext emoticon() throws RecognitionException {
		EmoticonContext _localctx = new EmoticonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_emoticon);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__0);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(48);
					match(T__1);
					}
				}

				setState(51);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__0);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(53);
					match(T__1);
					}
				}

				setState(56);
				match(T__3);
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

	public static class LinkContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(ChatParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(ChatParser.TEXT, i);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__4);
			setState(60);
			match(TEXT);
			setState(61);
			match(T__5);
			setState(62);
			match(T__3);
			setState(63);
			match(TEXT);
			setState(64);
			match(T__2);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ChatParser.WORD, 0); }
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__6);
			setState(67);
			match(WORD);
			setState(68);
			match(T__6);
			setState(69);
			message();
			setState(70);
			match(T__6);
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

	public static class MentionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ChatParser.WORD, 0); }
		public MentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).enterMention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatListener ) ((ChatListener)listener).exitMention(this);
		}
	}

	public final MentionContext mention() throws RecognitionException {
		MentionContext _localctx = new MentionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(T__7);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(77);
			match(WORD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6.\n\6\r\6\16\6/\3\7\3\7\5\7\64\n\7\3\7\3"+
		"\7\3\7\5\79\n\7\3\7\5\7<\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\6\nL\n\n\r\n\16\nM\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\3\3\2\13\f\2S\2\25\3\2\2\2\4\33\3\2\2\2\6 \3\2\2\2\b#\3\2\2\2\n"+
		"-\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20D\3\2\2\2\22K\3\2\2\2\24\26\5\4\3\2"+
		"\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2"+
		"\31\32\7\2\2\3\32\3\3\2\2\2\33\34\5\6\4\2\34\35\5\b\5\2\35\36\5\n\6\2"+
		"\36\37\7\17\2\2\37\5\3\2\2\2 !\7\r\2\2!\"\7\16\2\2\"\7\3\2\2\2#$\t\2\2"+
		"\2$%\7\3\2\2%&\7\16\2\2&\t\3\2\2\2\'.\5\f\7\2(.\5\16\b\2).\5\20\t\2*."+
		"\5\22\n\2+.\7\r\2\2,.\7\16\2\2-\'\3\2\2\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2"+
		"\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61"+
		"\63\7\3\2\2\62\64\7\4\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65"+
		"<\7\5\2\2\668\7\3\2\2\679\7\4\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:<\7"+
		"\6\2\2;\61\3\2\2\2;\66\3\2\2\2<\r\3\2\2\2=>\7\7\2\2>?\7\20\2\2?@\7\b\2"+
		"\2@A\7\6\2\2AB\7\20\2\2BC\7\5\2\2C\17\3\2\2\2DE\7\t\2\2EF\7\r\2\2FG\7"+
		"\t\2\2GH\5\n\6\2HI\7\t\2\2I\21\3\2\2\2JL\7\n\2\2KJ\3\2\2\2LM\3\2\2\2M"+
		"K\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\r\2\2P\23\3\2\2\2\t\27-/\638;M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}