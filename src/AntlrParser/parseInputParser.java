// Generated from parseInput.g4 by ANTLR 4.5.1

    package AntlrParser;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parseInputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NOT_TERMINAL_ID=7, TERMINAL_ID=8, 
		REGEXP_EXPRESSION=9, STRING=10, CODE=11, DECLARE_INNER_VARIABLE=12, PACAGE_NAME=13, 
		WHITE_SPACE=14, SAVE=15, SCIP=16;
	public static final int
		RULE_combine_all = 0, RULE_begin = 1, RULE_pack = 2, RULE_non_terminal_all_rules = 3, 
		RULE_non_terminal = 4, RULE_block_of_non_teerminal_rule = 5, RULE_sub_block_of_non_teerminal_rule = 6, 
		RULE_terminal_all_rules = 7, RULE_terminal_rule = 8, RULE_terminal_value = 9;
	public static final String[] ruleNames = {
		"combine_all", "begin", "pack", "non_terminal_all_rules", "non_terminal", 
		"block_of_non_teerminal_rule", "sub_block_of_non_teerminal_rule", "terminal_all_rules", 
		"terminal_rule", "terminal_value"
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

	@Override
	public String getGrammarFileName() { return "parseInput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    Map<String, String> terminals = new HashMap<>();
	    Set<String> passed = new HashSet<>();

	    public class Node {
	        public String name;
	        public String defineInnerVariables;
	        public String initCode;
	        public List<List<Map.Entry<String, String>>> states;
	        public Node() {
	            name = "";
	            defineInnerVariables = "";
	            initCode = "";
	            states = new ArrayList<>();
	        }
	    }
	    Map<String, Node> notTerminals = new HashMap<>();

	public parseInputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Combine_allContext extends ParserRuleContext {
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public Non_terminal_all_rulesContext non_terminal_all_rules() {
			return getRuleContext(Non_terminal_all_rulesContext.class,0);
		}
		public Terminal_all_rulesContext terminal_all_rules() {
			return getRuleContext(Terminal_all_rulesContext.class,0);
		}
		public Combine_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combine_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterCombine_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitCombine_all(this);
		}
	}

	public final Combine_allContext combine_all() throws RecognitionException {
		Combine_allContext _localctx = new Combine_allContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_combine_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			begin();
			setState(21);
			non_terminal_all_rules();
			setState(22);
			terminal_all_rules();
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

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode NOT_TERMINAL_ID() { return getToken(parseInputParser.NOT_TERMINAL_ID, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(SAVE);
			setState(26);
			match(NOT_TERMINAL_ID);
			setState(27);
			match(T__1);
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

	public static class PackContext extends ParserRuleContext {
		public TerminalNode PACAGE_NAME() { return getToken(parseInputParser.PACAGE_NAME, 0); }
		public PackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterPack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitPack(this);
		}
	}

	public final PackContext pack() throws RecognitionException {
		PackContext _localctx = new PackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__2);
			setState(30);
			match(PACAGE_NAME);
			setState(31);
			match(T__1);
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

	public static class Non_terminal_all_rulesContext extends ParserRuleContext {
		public Non_terminalContext a;
		public List<Non_terminalContext> non_terminal() {
			return getRuleContexts(Non_terminalContext.class);
		}
		public Non_terminalContext non_terminal(int i) {
			return getRuleContext(Non_terminalContext.class,i);
		}
		public Non_terminal_all_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_terminal_all_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterNon_terminal_all_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitNon_terminal_all_rules(this);
		}
	}

	public final Non_terminal_all_rulesContext non_terminal_all_rules() throws RecognitionException {
		Non_terminal_all_rulesContext _localctx = new Non_terminal_all_rulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_non_terminal_all_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				((Non_terminal_all_rulesContext)_localctx).a = non_terminal();
				//notTerminals.put($a.node.name, $a.node);
				                        
				setState(35);
				match(T__1);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOT_TERMINAL_ID );
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

	public static class Non_terminalContext extends ParserRuleContext {
		public Node node;
		public Token NOT_TERMINAL_ID;
		public Token DECLARE_INNER_VARIABLE;
		public Token CODE;
		public Block_of_non_teerminal_ruleContext block_of_non_teerminal_rule;
		public Block_of_non_teerminal_ruleContext s;
		public TerminalNode NOT_TERMINAL_ID() { return getToken(parseInputParser.NOT_TERMINAL_ID, 0); }
		public TerminalNode DECLARE_INNER_VARIABLE() { return getToken(parseInputParser.DECLARE_INNER_VARIABLE, 0); }
		public TerminalNode CODE() { return getToken(parseInputParser.CODE, 0); }
		public List<Block_of_non_teerminal_ruleContext> block_of_non_teerminal_rule() {
			return getRuleContexts(Block_of_non_teerminal_ruleContext.class);
		}
		public Block_of_non_teerminal_ruleContext block_of_non_teerminal_rule(int i) {
			return getRuleContext(Block_of_non_teerminal_ruleContext.class,i);
		}
		public Non_terminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterNon_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitNon_terminal(this);
		}
	}

	public final Non_terminalContext non_terminal() throws RecognitionException {
		Non_terminalContext _localctx = new Non_terminalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_non_terminal);

		        ((Non_terminalContext)_localctx).node =  new Node();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((Non_terminalContext)_localctx).NOT_TERMINAL_ID = match(NOT_TERMINAL_ID);
			setState(42);
			((Non_terminalContext)_localctx).DECLARE_INNER_VARIABLE = match(DECLARE_INNER_VARIABLE);
			setState(43);
			match(T__3);
			setState(44);
			((Non_terminalContext)_localctx).CODE = match(CODE);
			setState(45);
			match(T__4);
			setState(46);
			((Non_terminalContext)_localctx).block_of_non_teerminal_rule = block_of_non_teerminal_rule();

			                            _localctx.node.name = (((Non_terminalContext)_localctx).NOT_TERMINAL_ID!=null?((Non_terminalContext)_localctx).NOT_TERMINAL_ID.getText():null);
			                            _localctx.node.defineInnerVariables = (((Non_terminalContext)_localctx).DECLARE_INNER_VARIABLE!=null?((Non_terminalContext)_localctx).DECLARE_INNER_VARIABLE.getText():null);
			                            _localctx.node.initCode = (((Non_terminalContext)_localctx).CODE!=null?((Non_terminalContext)_localctx).CODE.getText():null);
			                            _localctx.node.states.add(((Non_terminalContext)_localctx).block_of_non_teerminal_rule.seq);
			                 
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(48);
				match(T__5);
				setState(49);
				((Non_terminalContext)_localctx).s = ((Non_terminalContext)_localctx).block_of_non_teerminal_rule = block_of_non_teerminal_rule();

				                    _localctx.node.states.add(((Non_terminalContext)_localctx).s.seq);
				                 
				}
				}
				setState(56);
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

	public static class Block_of_non_teerminal_ruleContext extends ParserRuleContext {
		public List<Map.Entry<String, String>> seq;
		public Sub_block_of_non_teerminal_ruleContext sub_block_of_non_teerminal_rule;
		public Token CODE;
		public List<Sub_block_of_non_teerminal_ruleContext> sub_block_of_non_teerminal_rule() {
			return getRuleContexts(Sub_block_of_non_teerminal_ruleContext.class);
		}
		public Sub_block_of_non_teerminal_ruleContext sub_block_of_non_teerminal_rule(int i) {
			return getRuleContext(Sub_block_of_non_teerminal_ruleContext.class,i);
		}
		public List<TerminalNode> CODE() { return getTokens(parseInputParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(parseInputParser.CODE, i);
		}
		public Block_of_non_teerminal_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_of_non_teerminal_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterBlock_of_non_teerminal_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitBlock_of_non_teerminal_rule(this);
		}
	}

	public final Block_of_non_teerminal_ruleContext block_of_non_teerminal_rule() throws RecognitionException {
		Block_of_non_teerminal_ruleContext _localctx = new Block_of_non_teerminal_ruleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block_of_non_teerminal_rule);

		        ((Block_of_non_teerminal_ruleContext)_localctx).seq =  new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				((Block_of_non_teerminal_ruleContext)_localctx).sub_block_of_non_teerminal_rule = sub_block_of_non_teerminal_rule();
				setState(59);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(58);
					((Block_of_non_teerminal_ruleContext)_localctx).CODE = match(CODE);
					}
				}


				                                _localctx.seq.add(new AbstractMap.SimpleEntry<>(((Block_of_non_teerminal_ruleContext)_localctx).sub_block_of_non_teerminal_rule.res, (((Block_of_non_teerminal_ruleContext)_localctx).CODE!=null?((Block_of_non_teerminal_ruleContext)_localctx).CODE.getText():null)));
				                                             
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOT_TERMINAL_ID || _la==TERMINAL_ID );
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

	public static class Sub_block_of_non_teerminal_ruleContext extends ParserRuleContext {
		public String res;
		public Token TERMINAL_ID;
		public Token NOT_TERMINAL_ID;
		public TerminalNode TERMINAL_ID() { return getToken(parseInputParser.TERMINAL_ID, 0); }
		public TerminalNode NOT_TERMINAL_ID() { return getToken(parseInputParser.NOT_TERMINAL_ID, 0); }
		public Sub_block_of_non_teerminal_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_block_of_non_teerminal_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterSub_block_of_non_teerminal_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitSub_block_of_non_teerminal_rule(this);
		}
	}

	public final Sub_block_of_non_teerminal_ruleContext sub_block_of_non_teerminal_rule() throws RecognitionException {
		Sub_block_of_non_teerminal_ruleContext _localctx = new Sub_block_of_non_teerminal_ruleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub_block_of_non_teerminal_rule);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case TERMINAL_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((Sub_block_of_non_teerminal_ruleContext)_localctx).TERMINAL_ID = match(TERMINAL_ID);
				((Sub_block_of_non_teerminal_ruleContext)_localctx).res =  (((Sub_block_of_non_teerminal_ruleContext)_localctx).TERMINAL_ID!=null?((Sub_block_of_non_teerminal_ruleContext)_localctx).TERMINAL_ID.getText():null);
				}
				break;
			case NOT_TERMINAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				((Sub_block_of_non_teerminal_ruleContext)_localctx).NOT_TERMINAL_ID = match(NOT_TERMINAL_ID);
				((Sub_block_of_non_teerminal_ruleContext)_localctx).res =  (((Sub_block_of_non_teerminal_ruleContext)_localctx).NOT_TERMINAL_ID!=null?((Sub_block_of_non_teerminal_ruleContext)_localctx).NOT_TERMINAL_ID.getText():null);
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

	public static class Terminal_all_rulesContext extends ParserRuleContext {
		public List<Terminal_ruleContext> terminal_rule() {
			return getRuleContexts(Terminal_ruleContext.class);
		}
		public Terminal_ruleContext terminal_rule(int i) {
			return getRuleContext(Terminal_ruleContext.class,i);
		}
		public Terminal_all_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_all_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterTerminal_all_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitTerminal_all_rules(this);
		}
	}

	public final Terminal_all_rulesContext terminal_all_rules() throws RecognitionException {
		Terminal_all_rulesContext _localctx = new Terminal_all_rulesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_terminal_all_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				terminal_rule();
				setState(74);
				match(T__1);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERMINAL_ID );
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

	public static class Terminal_ruleContext extends ParserRuleContext {
		public Token TERMINAL_ID;
		public Terminal_valueContext terminal_value;
		public TerminalNode TERMINAL_ID() { return getToken(parseInputParser.TERMINAL_ID, 0); }
		public TerminalNode SAVE() { return getToken(parseInputParser.SAVE, 0); }
		public Terminal_valueContext terminal_value() {
			return getRuleContext(Terminal_valueContext.class,0);
		}
		public TerminalNode SCIP() { return getToken(parseInputParser.SCIP, 0); }
		public Terminal_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterTerminal_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitTerminal_rule(this);
		}
	}

	public final Terminal_ruleContext terminal_rule() throws RecognitionException {
		Terminal_ruleContext _localctx = new Terminal_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminal_rule);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((Terminal_ruleContext)_localctx).TERMINAL_ID = match(TERMINAL_ID);
				setState(81);
				match(SAVE);
				setState(82);
				((Terminal_ruleContext)_localctx).terminal_value = terminal_value();
				terminals.put((((Terminal_ruleContext)_localctx).TERMINAL_ID!=null?((Terminal_ruleContext)_localctx).TERMINAL_ID.getText():null), ((Terminal_ruleContext)_localctx).terminal_value.res);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((Terminal_ruleContext)_localctx).TERMINAL_ID = match(TERMINAL_ID);
				setState(86);
				match(SCIP);
				setState(87);
				((Terminal_ruleContext)_localctx).terminal_value = terminal_value();
				terminals.put((((Terminal_ruleContext)_localctx).TERMINAL_ID!=null?((Terminal_ruleContext)_localctx).TERMINAL_ID.getText():null), ((Terminal_ruleContext)_localctx).terminal_value.res);
				                                            passed.add((((Terminal_ruleContext)_localctx).TERMINAL_ID!=null?((Terminal_ruleContext)_localctx).TERMINAL_ID.getText():null));
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

	public static class Terminal_valueContext extends ParserRuleContext {
		public String res;
		public Token REGEXP_EXPRESSION;
		public Token STRING;
		public TerminalNode REGEXP_EXPRESSION() { return getToken(parseInputParser.REGEXP_EXPRESSION, 0); }
		public TerminalNode STRING() { return getToken(parseInputParser.STRING, 0); }
		public Terminal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).enterTerminal_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parseInputListener ) ((parseInputListener)listener).exitTerminal_value(this);
		}
	}

	public final Terminal_valueContext terminal_value() throws RecognitionException {
		Terminal_valueContext _localctx = new Terminal_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_terminal_value);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case REGEXP_EXPRESSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((Terminal_valueContext)_localctx).REGEXP_EXPRESSION = match(REGEXP_EXPRESSION);
				((Terminal_valueContext)_localctx).res =  (((Terminal_valueContext)_localctx).REGEXP_EXPRESSION!=null?((Terminal_valueContext)_localctx).REGEXP_EXPRESSION.getText():null);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((Terminal_valueContext)_localctx).STRING = match(STRING);
				((Terminal_valueContext)_localctx).res =  (((Terminal_valueContext)_localctx).STRING!=null?((Terminal_valueContext)_localctx).STRING.getText():null);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5"+
		"(\n\5\r\5\16\5)\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\67\n\6"+
		"\f\6\16\6:\13\6\3\7\3\7\5\7>\n\7\3\7\3\7\6\7B\n\7\r\7\16\7C\3\b\3\b\3"+
		"\b\3\b\5\bJ\n\b\3\t\3\t\3\t\6\tO\n\t\r\t\16\tP\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n]\n\n\3\13\3\13\3\13\3\13\5\13c\n\13\3\13\2\2\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\2b\2\26\3\2\2\2\4\32\3\2\2\2\6\37\3\2\2\2\b\'"+
		"\3\2\2\2\n+\3\2\2\2\fA\3\2\2\2\16I\3\2\2\2\20N\3\2\2\2\22\\\3\2\2\2\24"+
		"b\3\2\2\2\26\27\5\4\3\2\27\30\5\b\5\2\30\31\5\20\t\2\31\3\3\2\2\2\32\33"+
		"\7\3\2\2\33\34\7\21\2\2\34\35\7\t\2\2\35\36\7\4\2\2\36\5\3\2\2\2\37 \7"+
		"\5\2\2 !\7\17\2\2!\"\7\4\2\2\"\7\3\2\2\2#$\5\n\6\2$%\b\5\1\2%&\7\4\2\2"+
		"&(\3\2\2\2\'#\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2\2\2+,\7\t"+
		"\2\2,-\7\16\2\2-.\7\6\2\2./\7\r\2\2/\60\7\7\2\2\60\61\5\f\7\2\618\b\6"+
		"\1\2\62\63\7\b\2\2\63\64\5\f\7\2\64\65\b\6\1\2\65\67\3\2\2\2\66\62\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2:8\3\2\2\2;=\5\16\b"+
		"\2<>\7\r\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\7\1\2@B\3\2\2\2A;\3\2\2"+
		"\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EF\7\n\2\2FJ\b\b\1\2GH\7\t"+
		"\2\2HJ\b\b\1\2IE\3\2\2\2IG\3\2\2\2J\17\3\2\2\2KL\5\22\n\2LM\7\4\2\2MO"+
		"\3\2\2\2NK\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\21\3\2\2\2RS\7\n\2\2"+
		"ST\7\21\2\2TU\5\24\13\2UV\b\n\1\2V]\3\2\2\2WX\7\n\2\2XY\7\22\2\2YZ\5\24"+
		"\13\2Z[\b\n\1\2[]\3\2\2\2\\R\3\2\2\2\\W\3\2\2\2]\23\3\2\2\2^_\7\13\2\2"+
		"_c\b\13\1\2`a\7\f\2\2ac\b\13\1\2b^\3\2\2\2b`\3\2\2\2c\25\3\2\2\2\n)8="+
		"CIP\\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}