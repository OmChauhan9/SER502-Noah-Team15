package com.example.antlr;

import org.antlr.v4.runtime.ParserRuleContext;

class NOAHError {
    private final String message;
    private final ErrorType type;
    private final ParserRuleContext context;

    public NOAHError(String message, ErrorType type, ParserRuleContext context) {
        this.message = message;
        this.type = type;
        this.context = context;
    }

    public String getMessage() {
        return message;
    }

    public ErrorType getType() {
        return type;
    }

    public ParserRuleContext getContext() {
        return context;
    }

    @Override
    public String toString() {
        int line = context.getStart().getLine();
        int column = context.getStart().getCharPositionInLine();
        return String.format("%s Error at line %d:%d - %s", type, line, column, message);
    }
}

enum ErrorType {
    RUNTIME,
    TYPE,
    SYNTAX,
    SEMANTIC
}
