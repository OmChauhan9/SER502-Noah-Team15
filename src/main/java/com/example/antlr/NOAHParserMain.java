package com.example.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class NOAHParserMain {
    public static void main(String[] args) throws Exception {
        // Sample input for testing
        String input = "x = 3 + 5;";

        // Create an input stream from the string
        CharStream charStream = CharStreams.fromString(input);
        NOAHLexer lexer = new NOAHLexer(charStream); // Create lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); // Create token stream
        NOAHParser parser = new NOAHParser(tokens); // Create parser

        // Parse the input and get the parse tree
        ParseTree tree = parser.start(); // Assuming 'start' is the entry rule

        // Print the parse tree
        System.out.println(tree.toStringTree(parser)); // Display the parse tree
    }
}