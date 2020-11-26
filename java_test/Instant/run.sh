#!/bin/ksh
gmake

file=`ls T*.java`
exe=${file%.*}

#echo $exe
java $exe
