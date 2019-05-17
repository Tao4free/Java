#!/bin/ksh
gmake

file=`ls Sele*_self.java`
exe=${file%.*}

#echo $exe
java $exe
