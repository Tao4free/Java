#!/bin/ksh
gmake

file=`ls Insert*.java`
exe=${file%.*}

#echo $exe
java $exe
