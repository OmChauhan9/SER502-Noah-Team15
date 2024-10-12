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


