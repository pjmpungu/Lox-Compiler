JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: program

program: $(classes)

clean:
	rm -f *.class

run:
	java com.craftinginterpreters.lox.Lox test.txt 
classpath: 
	CLASSPATH=~/compilers/src/jlox
	export CLASSPATH
%.class: %.java
	$(JAVAC) *.java

jar: $(classes)
	jar cvf program.jar $(classes)

.PHONY: all program clean jar
