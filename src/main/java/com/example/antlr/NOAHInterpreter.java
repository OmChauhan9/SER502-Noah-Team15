package com.example.antlr;

import com.example.gen.NOAHBaseVisitor;
import com.example.gen.NOAHParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class NOAHInterpreter extends NOAHBaseVisitor<NOAHRuntime.Value> {
    private final NOAHRuntime runtime;

    public NOAHInterpreter(NOAHRuntime runtime) {
        this.runtime = runtime;
    }

    @Override
    public NOAHRuntime.Value visitVariableDeclaration(NOAHParser.VariableDeclarationContext ctx) {
        try {
            String type = ctx.type().getText();
            String name = ctx.IDENTIFIER().getText();
            NOAHRuntime.Value value = visit(ctx.expression());
            NOAHRuntime.DataType declaredType = getDataType(type);

            // Type checking and conversion
            value = convertType(value, declaredType);
            runtime.defineVariable(name, value);

            return null;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitAssignment(NOAHParser.AssignmentContext ctx) {
        try {
            String name = ctx.IDENTIFIER().getText();
            NOAHRuntime.Value value = visit(ctx.expression());

            if (!runtime.variableExists(name)) {
                throw new NOAHRuntimeException("Variable not defined: " + name);
            }

            NOAHRuntime.Value currentValue = runtime.getVariable(name);
            value = convertType(value, currentValue.getType());
            runtime.setVariable(name, value);

            return null;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitPrintStatement(NOAHParser.PrintStatementContext ctx) {
        try {
            NOAHRuntime.Value value = visit(ctx.printExpression());
            System.out.println(value.getValue());
            return null;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitPrintExpression(NOAHParser.PrintExpressionContext ctx) {
        try {
            StringBuilder result = new StringBuilder();
            for (NOAHParser.ExpressionContext expr : ctx.expression()) {
                NOAHRuntime.Value value = visit(expr);
                result.append(value != null ? value.getValue().toString() : "null");
            }
            return new NOAHRuntime.Value(result.toString(), NOAHRuntime.DataType.STRING);
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitWhileLoop(NOAHParser.WhileLoopContext ctx) {
        try {
            // Enter a new scope for the while loop
            runtime.enterScope();

            while (true) {
                NOAHRuntime.Value condition = visit(ctx.expression());
                if (condition.getType() != NOAHRuntime.DataType.BOOLEAN) {
                    throw new NOAHRuntimeException("While condition must be boolean");
                }

                if (!(Boolean) condition.getValue()) {
                    break;
                }

                for (NOAHParser.StatementContext stmt : ctx.statement()) {
                    visit(stmt);
                }
            }

            // Exit the loop scope
            runtime.exitScope();
            return null;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitLogicalExpression(NOAHParser.LogicalExpressionContext ctx) {
        try {
            if (ctx.getChildCount() == 1) {
                return visit(ctx.comparisonExpression(0));
            }

            if (ctx.getChild(0).getText().equals("not")) {
                NOAHRuntime.Value value = visit(ctx.comparisonExpression(0));
                if (value.getType() != NOAHRuntime.DataType.BOOLEAN) {
                    throw new NOAHRuntimeException("Cannot apply 'not' to non-boolean value");
                }
                return new NOAHRuntime.Value(!(Boolean) value.getValue(), NOAHRuntime.DataType.BOOLEAN);
            }

            NOAHRuntime.Value left = visit(ctx.comparisonExpression(0));
            String operator = ctx.getChild(1).getText();
            NOAHRuntime.Value right = visit(ctx.comparisonExpression(1));

            if (left.getType() != NOAHRuntime.DataType.BOOLEAN || right.getType() != NOAHRuntime.DataType.BOOLEAN) {
                throw new NOAHRuntimeException("Logical operators require boolean operands");
            }

            boolean result = operator.equals("and") ?
                    (Boolean) left.getValue() && (Boolean) right.getValue() :
                    (Boolean) left.getValue() || (Boolean) right.getValue();

            return new NOAHRuntime.Value(result, NOAHRuntime.DataType.BOOLEAN);
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitComparisonExpression(NOAHParser.ComparisonExpressionContext ctx) {
        try {
            if (ctx.getChildCount() == 1) {
                return visit(ctx.additiveExpression(0));
            }

            NOAHRuntime.Value left = visit(ctx.additiveExpression(0));
            String operator = ctx.getChild(1).getText();
            NOAHRuntime.Value right = visit(ctx.additiveExpression(1));

            if (!(left.getValue() instanceof Number) || !(right.getValue() instanceof Number)) {
                throw new NOAHRuntimeException("Comparison operators require numeric operands");
            }

            double leftNum = ((Number) left.getValue()).doubleValue();
            double rightNum = ((Number) right.getValue()).doubleValue();
            boolean result;

            switch (operator) {
                case ">":
                    result = leftNum > rightNum;
                    break;
                case "<":
                    result = leftNum < rightNum;
                    break;
                case ">=":
                    result = leftNum >= rightNum;
                    break;
                case "<=":
                    result = leftNum <= rightNum;
                    break;
                case "==":
                    result = leftNum == rightNum;
                    break;
                case "!=":
                    result = leftNum != rightNum;
                    break;
                default:
                    throw new NOAHRuntimeException("Unknown comparison operator: " + operator);
            }

            return new NOAHRuntime.Value(result, NOAHRuntime.DataType.BOOLEAN);
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitAdditiveExpression(NOAHParser.AdditiveExpressionContext ctx) {
        try {
            NOAHRuntime.Value result = visit(ctx.multiplicativeExpression(0));

            for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
                String operator = ctx.getChild(2 * i - 1).getText();
                NOAHRuntime.Value right = visit(ctx.multiplicativeExpression(i));

                if (result.getValue() instanceof Number && right.getValue() instanceof Number) {
                    double leftNum = ((Number) result.getValue()).doubleValue();
                    double rightNum = ((Number) right.getValue()).doubleValue();
                    double value = operator.equals("+") ? leftNum + rightNum : leftNum - rightNum;
                    result = new NOAHRuntime.Value(value, NOAHRuntime.DataType.FLOAT);
                } else if (operator.equals("+") &&
                        (result.getType() == NOAHRuntime.DataType.STRING ||
                                right.getType() == NOAHRuntime.DataType.STRING)) {
                    String value = result.getValue().toString() + right.getValue().toString();
                    result = new NOAHRuntime.Value(value, NOAHRuntime.DataType.STRING);
                } else {
                    throw new NOAHRuntimeException("Invalid operands for " + operator);
                }
            }

            return result;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitMultiplicativeExpression(NOAHParser.MultiplicativeExpressionContext ctx) {
        try {
            NOAHRuntime.Value result = visit(ctx.primaryExpression(0));

            for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                String operator = ctx.getChild(2 * i - 1).getText();
                NOAHRuntime.Value right = visit(ctx.primaryExpression(i));

                if (!(result.getValue() instanceof Number) || !(right.getValue() instanceof Number)) {
                    throw new NOAHRuntimeException("Multiplicative operators require numeric operands");
                }

                double leftNum = ((Number) result.getValue()).doubleValue();
                double rightNum = ((Number) right.getValue()).doubleValue();

                if (operator.equals("/") && rightNum == 0) {
                    throw new NOAHRuntimeException("Division by zero");
                }

                double value = operator.equals("*") ? leftNum * rightNum : leftNum / rightNum;
                result = new NOAHRuntime.Value(value, NOAHRuntime.DataType.FLOAT);
            }

            return result;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitPrimaryExpression(NOAHParser.PrimaryExpressionContext ctx) {
        try {
            if (ctx.IDENTIFIER() != null) {
                String varName = ctx.IDENTIFIER().getText();
                if (!runtime.variableExists(varName)) {
                    // More detailed error message
                    String errorMsg = "Variable not defined: " + varName;
//                    System.err.println(errorMsg); // Add error logging
                    throw new NOAHRuntimeException(errorMsg);
                }
                return runtime.getVariable(varName);
            }
            if (ctx.INTEGER() != null) {
                int value = Integer.parseInt(ctx.INTEGER().getText());
                return new NOAHRuntime.Value(value, NOAHRuntime.DataType.INTEGER);
            }
            ///////
            if (ctx.FLOAT() != null) {
                double value = Double.parseDouble(ctx.FLOAT().getText());
                return new NOAHRuntime.Value(value, NOAHRuntime.DataType.FLOAT);
            }
            if (ctx.STRING() != null) {
                String str = ctx.STRING().getText();
                // Remove quotes
                String value = str.substring(1, str.length() - 1);
                return new NOAHRuntime.Value(value, NOAHRuntime.DataType.STRING);
            }
            if (ctx.BOOLEAN() != null) {
                boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
                return new NOAHRuntime.Value(value, NOAHRuntime.DataType.BOOLEAN);
            }
            if (ctx.expression() != null) {
                return visit(ctx.expression());
            }
            throw new NOAHRuntimeException("Invalid primary expression");
        } catch (Exception e) {
            // Log the full exception details
//            System.err.println("Error in visitPrimaryExpression: " + e);
//            e.printStackTrace();

            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }

    @Override
    public NOAHRuntime.Value visitForLoop(NOAHParser.ForLoopContext ctx) {
        try {
            // Enter a new scope for the entire for loop
            runtime.enterScope();

            // Execute initialization and define the loop variable in the runtime
            NOAHParser.ForInitStatementContext initCtx = ctx.forInitStatement();
            if (initCtx.type() != null) {
                // Variable declaration
                String type = initCtx.type().getText();
                String varName = initCtx.IDENTIFIER().getText();
                NOAHRuntime.Value value = visit(initCtx.expression());
                NOAHRuntime.DataType declaredType = getDataType(type);

                // Type checking and conversion
                value = convertType(value, declaredType);
                runtime.defineVariable(varName, value);
            } else {
                // Variable assignment
                String varName = initCtx.IDENTIFIER().getText();
                NOAHRuntime.Value value = visit(initCtx.expression());

                if (!runtime.variableExists(varName)) {
                    throw new NOAHRuntimeException("Variable not found: " + varName);
                }

                runtime.setVariable(varName, value);
            }

            // Loop execution
            while (true) {
                // Evaluate condition
                NOAHRuntime.Value condition = visit(ctx.expression());
                if (condition.getType() != NOAHRuntime.DataType.BOOLEAN) {
                    throw new NOAHRuntimeException("For loop condition must be boolean");
                }
                if (!(Boolean) condition.getValue()) {
                    break; // Exit loop if condition is false
                }

                // Enter a new scope for the loop body
                runtime.enterScope();

                // Execute the loop body
                for (NOAHParser.StatementContext stmt : ctx.statement()) {
                    visit(stmt);
                }

                // Exit the loop body scope
                runtime.exitScope();

                // Execute the update
                NOAHParser.ForUpdateContext updateCtx = ctx.forUpdate();
                String varName = updateCtx.IDENTIFIER().getText();
                NOAHRuntime.Value newValue = visit(updateCtx.expression());

                if (!runtime.variableExists(varName)) {
                    throw new NOAHRuntimeException("Variable not found: " + varName);
                }

                // Preserve original type of the loop variable
                NOAHRuntime.Value currentValue = runtime.getVariable(varName);
                newValue = convertType(newValue, currentValue.getType());
                runtime.setVariable(varName, newValue);
            }

            // Exit the loop scope
            runtime.exitScope();
            return null;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }


    private NOAHRuntime.DataType getDataType(String type) {
        switch (type) {
            case "int":
                return NOAHRuntime.DataType.INTEGER;
            case "float":
                return NOAHRuntime.DataType.FLOAT;
            case "string":
                return NOAHRuntime.DataType.STRING;
            case "boolean":
                return NOAHRuntime.DataType.BOOLEAN;
            default:
                throw new NOAHRuntimeException("Unknown type: " + type);
        }
    }

    private NOAHRuntime.Value convertType(NOAHRuntime.Value value, NOAHRuntime.DataType targetType) {
        if (value.getType() == targetType) {
            return value;
        }

        try {
            Object converted = value.getValue();
            Object result;

            switch (targetType) {
                case INTEGER:
                    // Explicitly enforce integer conversion
                    if (converted instanceof Double) {
                        result = ((Double) converted).intValue();
                    } else if (converted instanceof String) {
                        result = Integer.parseInt((String) converted);
                    } else {
                        result = ((Number) converted).intValue();
                    }
                    break;
                case FLOAT:
                    if (converted instanceof String) {
                        result = Double.parseDouble((String) converted);
                    } else {
                        result = ((Number) converted).doubleValue();
                    }
                    break;
                case STRING:
                    result = converted.toString();
                    break;
                case BOOLEAN:
                    if (converted instanceof String) {
                        result = Boolean.parseBoolean((String) converted);
                    } else {
                        result = Boolean.valueOf(converted.toString());
                    }
                    break;
                default:
                    throw new NOAHRuntimeException("Unsupported type conversion");
            }
            return new NOAHRuntime.Value(result, targetType);
        } catch (Exception e) {
            throw new NOAHRuntimeException("Cannot convert " + value.getType() + " to " + targetType);
        }
    }

    @Override
    public NOAHRuntime.Value visitIfStatement(NOAHParser.IfStatementContext ctx) {
        try {
            // Enter a new scope for the if-else block
            runtime.enterScope();

            // Evaluate the condition
            NOAHRuntime.Value condition = visit(ctx.expression());

            // Ensure the condition is a boolean
            if (condition.getType() != NOAHRuntime.DataType.BOOLEAN) {
                throw new NOAHRuntimeException("If condition must be a boolean");
            }

            // If condition is true, execute the if block statements
            if ((Boolean) condition.getValue()) {
                for (ParseTree stmt : ctx.statement()) {
                    if (ctx.statement().indexOf(stmt) == ctx.statement().size() - 1 && ctx.statement().size() > 1) {
                        // Skip the else block if exists
                        break;
                    }
                    visit((NOAHParser.StatementContext) stmt);
                }
            }
            // If condition is false and there's an else block, execute the else block
            else if (ctx.statement().size() > 1) {
                boolean skipElseBlock = false;
                for (ParseTree stmt : ctx.statement()) {
                    if (skipElseBlock) {
                        visit((NOAHParser.StatementContext) stmt);
                    }
                    skipElseBlock = true;
                }
            }

            // Exit the if-else scope
            runtime.exitScope();
            return null;
        } catch (Exception e) {
            runtime.getErrorHandler().reportError(new NOAHError(
                    e.getMessage(),
                    ErrorType.RUNTIME,
                    ctx
            ));
            throw new NOAHRuntimeException(e.getMessage());
        }
    }
}
