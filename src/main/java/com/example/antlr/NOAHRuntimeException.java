package com.example.antlr;

class NOAHRuntimeException extends RuntimeException {
    public NOAHRuntimeException(String message) {
        super(message);
    }

    public NOAHRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}