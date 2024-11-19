# SER502-NOAH-Team15

Description :-

NOAH(Notation for Optimized Algorithmic Handling) is a new programming language designed and implemented as part of the SER502 course project. The focus will be on making a robust, statically typed language that inherits most of the strengths of compiled languages while still keeping the flexibility afforded by modern programming paradigms.

System Support :-

 -> Windows 10 and above
 -> macOS 10.15 (Catalina) and above
 -> Linux (Ubuntu 20.04 LTS and above)

Development Tools :-

 -> ANTLR is used for generating the lexer and parser for NOAH. ANTLR allows the establishment of the grammar of the language and creates an Abstract Syntax Tree for further processing of       the code.

 -> LLVM is used on the backend part of the NOAH compiler to create optimized intermediate code. This will make sure that during runtime, everything will be really efficient.

 -> CMake is used for maintaining the build process in various platforms. It ensures fluent interaction between frontend parts (parser) and backend parts (LLVM).

 -> Flex and Bison: These will be alternate tools for the lexer and parser development in case one wants to go with a custom approach rather than using ANTLR for some features in the            language.

 -> GDB/Valgrind: It will be used for debugging the runtime environment and memory management so that the NOAH programs execute efficiently.

 -> GitHub: version control, manages contributions, and provides automated builds via GitHub Actions.

	Windows 10 and above
	macOS 10.15 (Catalina) and above
	Linux (Ubuntu 20.04 LTS and above)


Run Instructions: -

After building the project, you can run the NOAH parser to analyze `.noah` files:

1. Run the Parser:
   - Navigate to the root directory of your project.
   - Use the following command to run the parser with a sample file (replace `sample.noah` with the actual file path):
     ```bash
     java -cp target/classes com.example.antlr.NOAHParserMain src/data/sample.noah
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

Example Usage: -
To parse a file called `variables.noah`, run:
```bash
java -cp target/classes com.example.antlr.NOAHParserMain src/data/variables.noah
