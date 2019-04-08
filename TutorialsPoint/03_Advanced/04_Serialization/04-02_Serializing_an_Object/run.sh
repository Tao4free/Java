#!/bin/ksh
gmake

file=`ls S*.java`
exe=${file%.*}

#echo $exe
java $exe
