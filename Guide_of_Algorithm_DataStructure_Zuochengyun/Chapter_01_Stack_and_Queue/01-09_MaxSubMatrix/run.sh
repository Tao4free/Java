#!/bin/ksh
gmake

file=`ls *.java`
exe=${file%.*}

#echo $exe
java $exe
