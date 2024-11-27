package com.example.antlr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class NOAHErrorHandler {
    private final List<NOAHError> errors = new ArrayList<>();

    public void reportError(NOAHError error) {
        int line = error.getContext().getStart().getLine();
        int charPosition = error.getContext().getStart().getCharPositionInLine();
        String message = String.format("%s at line %d, column %d: %s",
                error.getType(), line, charPosition, error.getMessage());
        errors.add(new NOAHError(message, error.getType(), error.getContext()));
    }


    public List<NOAHError> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    public void clearErrors() {
        errors.clear();
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}