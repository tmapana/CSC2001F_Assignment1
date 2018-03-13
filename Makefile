# DamArrayApp program makefile
# Tlotliso Mapana
# 04 March 2018

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class

SRCDIR = src
BINDIR = bin

$(BINDIR)/%.class: $(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

CLASSES = Dam.class\
	 DamArray.class\
	 DamArrayApp.class\
	 BinaryTreeNode.class\
	 BinaryTree.class\
	 BinarySearchTree.class\
	 DamBSTApp.class
	  
CLASS_FILES = $(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class

runA:
	java -cp bin DamArrayApp
	
runB:
	java -cp bin DamBSTApp