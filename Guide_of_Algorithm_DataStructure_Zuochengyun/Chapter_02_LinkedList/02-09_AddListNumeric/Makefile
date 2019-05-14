#
# source: https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
SRC = $(wildcard *.java)

JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = $(SRC) 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	-rm *.class
