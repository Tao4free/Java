#!/bin/ksh
gmake

file=`ls *.java`
exe=${file%.*}

#echo $exe
java $exe this is a command line 200 -100
