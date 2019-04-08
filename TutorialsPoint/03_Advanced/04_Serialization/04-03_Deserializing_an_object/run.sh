#!/bin/ksh
gmake

file=`ls D*.java`
exe=${file%.*}

#echo $exe
java $exe
