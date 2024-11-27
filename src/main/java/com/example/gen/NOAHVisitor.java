// Generated from D:/SER_502/SER502-Noah-Team15-main/src/main/antlr/NOAH.g4 by ANTLR 4.13.2
package com.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NOAHParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NOAHVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NOAHParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(NOAHParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NOAHParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(NOAHParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(NOAHParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(NOAHParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(NOAHParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(NOAHParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NOAHParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(NOAHParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(NOAHParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(NOAHParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(NOAHParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(NOAHParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(NOAHParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(NOAHParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(NOAHParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(NOAHParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(NOAHParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NOAHParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(NOAHParser.WhileLoopContext ctx);
}