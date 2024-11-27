# SER502-NOAH-Team15

Description :-

NOAH(Notation for Optimized Algorithmic Handling) is a new programming language designed and implemented as part of the SER502 course project. The focus will be on making a robust, statically typed language that inherits most of the strengths of compiled languages while still keeping the flexibility afforded by modern programming paradigms.

System Support :-

 -> Windows 10 and above
 -> macOS 10.15 (Catalina) and above
 -> Linux (Ubuntu 20.04 LTS and above)

Development Tools :-

 -> ANTLR is used for generating the lexer and parser for NOAH. ANTLR allows the establishment of the grammar of the language and creates an Abstract Syntax Tree for further processing of       the code.

 -> GitHub: version control, manages contributions, and provides automated builds via GitHub Actions.

	Windows 10 and above
	macOS 10.15 (Catalina) and above
	Linux (Ubuntu 20.04 LTS and above)
    ANTLR (4.13.2 and above)


Run Instructions: -

After building the project, you can run the NOAH parser to analyze `.noah` files:

1. Run the Parser:
   - Navigate to the root directory of your project.
   - Use the following command to run the parser with a sample file (replace `sample.noah` with the actual file path):
     ```bash
     java -cp target/classes com.example.antlr.NOAHParserMain src/main/resources/data/sample.noah
     ```

   - This command will parse the input `.noah` file, generate the Abstract Syntax Tree (AST), and output it to the console or a file as defined in your code.

2. Sample Files:
   - Sample NOAH programs demonstrating language constructs are in the `src/data` directory. You can test the parser by running any of these sample files.

Sample Programs: -

- `variables.noah` - Demonstrates variable declaration and assignment.
- `operators.noah` - Tests arithmetic and relational operators.
- `booleans.noah` - Shows boolean values and logical operations.
- `control_flow.noah` - Uses conditional statements like if-else and ternary operator.
- `loops.noah` - Demonstrates looping constructs, including `for` and `while` loops. 
- `logical1.noah` - shows `if_else`, `nested if_else`.

Example Usage: -
To parse a file called `variables.noah`, run:
```bash
java -cp target/classes com.example.antlr.NOAHParserMain src/data/variables.noah
```

General Notes :

Sample programs location :- src/main/resources/data/[various sample programs]

NOAHParserMain(Parse tree generation) location :- src/main/java/com/example/antlr/NOAHParserMain.java

NOAHInterpreter(Runtime Environment) location :- src/main/java/com/example/antlr/NOAHInterpreter.java

-> Comment down logic to show parse tree in NOAHParserMain


