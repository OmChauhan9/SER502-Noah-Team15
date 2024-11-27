package com.example.antlr;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NOAHRuntime {
    private final Stack<Map<String, Value>> symbolTableStack = new Stack<>();
    private final NOAHErrorHandler errorHandler;

    public NOAHRuntime() {
        this.errorHandler = new NOAHErrorHandler();
        // Initialize with a global scope
        symbolTableStack.push(new HashMap<>());
    }

    // Enter a new scope
    public void enterScope() {
        symbolTableStack.push(new HashMap<>());
    }

    // Exit the current scope
    public void exitScope() {
        if (symbolTableStack.size() > 1) {
            symbolTableStack.pop();
        }
    }

    public void defineVariable(String name, Value value) {
        // Check only in the current (top) scope
        Map<String, Value> currentScope = symbolTableStack.peek();

        if (currentScope.containsKey(name)) {
            throw new NOAHRuntimeException("Variable already defined in current scope: " + name);
        }

        currentScope.put(name, value);
    }

    public void setVariable(String name, Value value) {
        // Search from top to bottom of the scope stack
        for (int i = symbolTableStack.size() - 1; i >= 0; i--) {
            Map<String, Value> scope = symbolTableStack.get(i);
            if (scope.containsKey(name)) {
                scope.put(name, value);
                return;
            }
        }

        // If not found in any scope, define in the current (top) scope
        symbolTableStack.peek().put(name, value);
    }

    public Value getVariable(String name) {
        // Search from top to bottom of the scope stack
        for (int i = symbolTableStack.size() - 1; i >= 0; i--) {
            Map<String, Value> scope = symbolTableStack.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }

        throw new NOAHRuntimeException("Variable not found: " + name);
    }

    public boolean variableExists(String name) {
        // Search from top to bottom of the scope stack
        for (Map<String, Value> scope : symbolTableStack) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public NOAHErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public static class Value {
        private final Object value;
        private final DataType type;

        public Value(Object value, DataType type) {
//            System.out.println("value: " + value + "type: " + type);
            this.value = value;
            this.type = type;
        }

        public Object getValue() {
//            System.out.println("value: " + value);
            return value;
        }

        public DataType getType() {
//            System.out.println("type: " + type);
            return type;
        }

        @Override
        public String toString() {
            return value != null ? value.toString() : "null";
        }
    }

    public enum DataType {
        INTEGER,
        FLOAT,
        STRING,
        BOOLEAN
    }
}