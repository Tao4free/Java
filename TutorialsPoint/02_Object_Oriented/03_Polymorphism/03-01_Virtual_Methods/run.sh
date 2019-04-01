#!/bin/ksh
gmake

file=`ls V*.java`
exe=${file%.*}

#echo $exe
java $exe
