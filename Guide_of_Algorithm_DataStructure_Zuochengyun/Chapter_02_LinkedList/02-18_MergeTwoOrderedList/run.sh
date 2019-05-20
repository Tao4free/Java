#!/bin/ksh
gmake

file=`ls Merge*.java`
exe=${file%.*}

#echo $exe
java $exe
