#!/bin/ksh
gmake

file=`ls A*.java`
exe=${file%.*}

#echo $exe
java $exe
