# Lox-Compiler
a compiler/interpreter for the lox programming language, written by me
The original language was designed Robert Nystrom via his text book <a href="https://craftinginterpreters.com/">Crafting Interprters.</a>
This file contains an interpreter of the Lox language impleneted with java. To run a Lox file go to com/craftinginterpreter/lox and run the following commands.

```
javac *.java
java Lox <filename>
```
You may have to alter the java classpath to run the file. A sample makefile is included with the preset commands. Alternatively, you could omit the filename and run ``` java Lox ```
on its own. This enables users to type Lox commands directly to the command line.

#Syntax
Lox is a dynamically typed language using a Java like syntax. It supports classes, inheritance, while/for loops, if/else statements (although not else-if statements) and functions. The var and fun keywords declare variables and functions respectively. All expressions must end with a semicolon. There is one built in library function, the print function, which doesn't use parentheses and is equivalent to System.out.println() in java. A more detaield overview of the syntax can be found in <a href="https://craftinginterpreters.com/the-lox-language.html">Nystrom's textbook.</a> Below is a sample program
```
class Doughnut {
  cook() {
    print "Fry until golden brown.";
  }
}

class BostonCream < Doughnut {}

var method = BostonCream().cook;
var counter = 0;
for(var i = 0; i < 3; i = i + 1){
        method();
        counter = counter+1;
}
print "The value of counter is: ";
print counter;
```
The output is :
```
Fry until golden brown.
Fry until golden brown.
Fry until golden brown.
The value of counter is: 
3
```
<h1>Happy Coding!</h1>
