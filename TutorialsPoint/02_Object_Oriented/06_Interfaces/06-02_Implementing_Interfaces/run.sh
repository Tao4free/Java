#!/bin/ksh
gmake

file=`ls M*.java`
exe=${file%.*}

#echo $exe
java $exe
