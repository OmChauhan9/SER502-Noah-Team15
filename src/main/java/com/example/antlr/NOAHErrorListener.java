package com.example.antlr;

import org.antlr.v4.runtime.*;

public class NOAHErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        String error = String.format("Syntax error at line %d, column %d: %s",
                line, charPositionInLine, msg);
        System.err.println(error);
        throw new RuntimeException(error);
    }
}
