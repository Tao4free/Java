#!/bin/ksh
gmake

file=`ls Cross*.java`
exe=${file%.*}

#echo $exe
java $exe
