package com.example.antlr;

import com.example.gen.NOAHLexer;
import com.example.gen.NOAHParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NOAHInterpreterTest {
    private NOAHInterpreter interpreter;
    private NOAHRuntime runtime;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        // Reset the output stream
        outputStream.reset();
        runtime = new NOAHRuntime();
        interpreter = new NOAHInterpreter(runtime);
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testVariableDeclaration() {
        String input = "int x = 5;";
        ParseTree tree = parse(input);
        interpreter.visit(tree);

        NOAHRuntime.Value value = runtime.getVariable("x");
        assertEquals(5, value.getValue());
        assertEquals(NOAHRuntime.DataType.INTEGER, value.getType());
    }

    @Test
    void testForLoop() {
        String input = """
            for (int i = 0; i < 3; i = i + 1) {
                print(i);
            }
            """;
        ParseTree tree = parse(input);
        interpreter.visit(tree);
        assertEquals("0\n1\n2\n", outputStream.toString());
    }

    @Test
    void testWhileLoop() {
        String input = """
            int count = 0;
            while (count < 3) {
                print(count);
                count = count + 1;
            }
            """;
        ParseTree tree = parse(input);
        interpreter.visit(tree);
        String temp = outputStream.toString();
        assertEquals("0\n1\n2\n", temp);
    }

    @Test
    void testDivisionByZero() {
        String input = "int x = 5 / 0;";
        ParseTree tree = parse(input);

        Exception exception = assertThrows(NOAHRuntimeException.class, () -> {
            interpreter.visit(tree);
        });

        assertTrue(exception.getMessage().contains("Division by zero"));
    }

    @Test
    void testUndefinedVariable() {
        String input = "print(unknownVar);";
        ParseTree tree = parse(input);

        Exception exception = assertThrows(NOAHRuntimeException.class, () -> {
            interpreter.visit(tree);
        });
//        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("not defined"));
    }

    private ParseTree parse(String input) {
        NOAHLexer lexer = new NOAHLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NOAHParser parser = new NOAHParser(tokens);
        return parser.start();
    }
}