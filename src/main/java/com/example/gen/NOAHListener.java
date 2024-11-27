// Generated from D:/SER_502/SER502-Noah-Team15-main/src/main/antlr/NOAH.g4 by ANTLR 4.13.2
package com.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NOAHParser}.
 */
public interface NOAHListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NOAHParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(NOAHParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(NOAHParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NOAHParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NOAHParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(NOAHParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(NOAHParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NOAHParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NOAHParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(NOAHParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(NOAHParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(NOAHParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(NOAHParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(NOAHParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(NOAHParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NOAHParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NOAHParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(NOAHParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(NOAHParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(NOAHParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(NOAHParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(NOAHParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(NOAHParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(NOAHParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(NOAHParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(NOAHParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(NOAHParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(NOAHParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(NOAHParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(NOAHParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(NOAHParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(NOAHParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(NOAHParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(NOAHParser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(NOAHParser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(NOAHParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(NOAHParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NOAHParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(NOAHParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NOAHParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(NOAHParser.WhileLoopContext ctx);
}