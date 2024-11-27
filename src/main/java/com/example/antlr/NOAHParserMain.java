package com.example.antlr;

import com.example.gen.NOAHLexer;
import com.example.gen.NOAHParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class NOAHParserMain {
    public static void main(String[] args) {
        try {
            // Initialize runtime
            NOAHRuntime runtime = new NOAHRuntime();

            // Create lexer and parser
            NOAHLexer lexer = new NOAHLexer(CharStreams.fromFileName(args[0]));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NOAHParser parser = new NOAHParser(tokens);

            // Parse and check for syntax errors
            ParseTree tree = parser.start();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Syntax errors found");
                System.exit(1);
            }

            // Create interpreter and execute
            NOAHInterpreter interpreter = new NOAHInterpreter(runtime);
            interpreter.visit(tree);

            // Check for runtime errors
            if (runtime.getErrorHandler().hasErrors()) {
                for (NOAHError error : runtime.getErrorHandler().getErrors()) {
                    System.err.println(error);
                }
                System.exit(1);
            }

//            // Print the parse tree
//            System.out.println(tree.toStringTree(parser));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}