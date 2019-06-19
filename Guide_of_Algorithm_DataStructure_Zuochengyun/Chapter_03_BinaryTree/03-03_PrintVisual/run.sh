#!/bin/ksh
gmake

file=`ls P*.java`
exe=${file%.*}

#echo $exe
java $exe
