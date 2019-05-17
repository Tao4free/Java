#!/bin/ksh
gmake

file=`ls Str*.java`
exe=${file%.*}

#echo $exe
java $exe
