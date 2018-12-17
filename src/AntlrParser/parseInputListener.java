// Generated from parseInput.g4 by ANTLR 4.5.1

    package AntlrParser;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parseInputParser}.
 */
public interface parseInputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parseInputParser#combine_all}.
	 * @param ctx the parse tree
	 */
	void enterCombine_all(parseInputParser.Combine_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#combine_all}.
	 * @param ctx the parse tree
	 */
	void exitCombine_all(parseInputParser.Combine_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(parseInputParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(parseInputParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#pack}.
	 * @param ctx the parse tree
	 */
	void enterPack(parseInputParser.PackContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#pack}.
	 * @param ctx the parse tree
	 */
	void exitPack(parseInputParser.PackContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#non_terminal_all_rules}.
	 * @param ctx the parse tree
	 */
	void enterNon_terminal_all_rules(parseInputParser.Non_terminal_all_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#non_terminal_all_rules}.
	 * @param ctx the parse tree
	 */
	void exitNon_terminal_all_rules(parseInputParser.Non_terminal_all_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#non_terminal}.
	 * @param ctx the parse tree
	 */
	void enterNon_terminal(parseInputParser.Non_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#non_terminal}.
	 * @param ctx the parse tree
	 */
	void exitNon_terminal(parseInputParser.Non_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#block_of_non_teerminal_rule}.
	 * @param ctx the parse tree
	 */
	void enterBlock_of_non_teerminal_rule(parseInputParser.Block_of_non_teerminal_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#block_of_non_teerminal_rule}.
	 * @param ctx the parse tree
	 */
	void exitBlock_of_non_teerminal_rule(parseInputParser.Block_of_non_teerminal_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#sub_block_of_non_teerminal_rule}.
	 * @param ctx the parse tree
	 */
	void enterSub_block_of_non_teerminal_rule(parseInputParser.Sub_block_of_non_teerminal_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#sub_block_of_non_teerminal_rule}.
	 * @param ctx the parse tree
	 */
	void exitSub_block_of_non_teerminal_rule(parseInputParser.Sub_block_of_non_teerminal_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#terminal_all_rules}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_all_rules(parseInputParser.Terminal_all_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#terminal_all_rules}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_all_rules(parseInputParser.Terminal_all_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#terminal_rule}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_rule(parseInputParser.Terminal_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#terminal_rule}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_rule(parseInputParser.Terminal_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link parseInputParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_value(parseInputParser.Terminal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link parseInputParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_value(parseInputParser.Terminal_valueContext ctx);
}