// Generated from net/davidesavazzi/mylanguage/Chat.g4 by ANTLR 4.7.1

package net.davidesavazzi.mylanguage;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChatParser}.
 */
public interface ChatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChatParser#chat}.
	 * @param ctx the parse tree
	 */
	void enterChat(ChatParser.ChatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#chat}.
	 * @param ctx the parse tree
	 */
	void exitChat(ChatParser.ChatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ChatParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ChatParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ChatParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ChatParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ChatParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ChatParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(ChatParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(ChatParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void enterEmoticon(ChatParser.EmoticonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void exitEmoticon(ChatParser.EmoticonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(ChatParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(ChatParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(ChatParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(ChatParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#mention}.
	 * @param ctx the parse tree
	 */
	void enterMention(ChatParser.MentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#mention}.
	 * @param ctx the parse tree
	 */
	void exitMention(ChatParser.MentionContext ctx);
}