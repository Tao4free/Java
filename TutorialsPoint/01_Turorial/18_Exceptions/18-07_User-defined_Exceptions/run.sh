#!/bin/ksh
gmake

file=`ls B*.java`
exe=${file%.*}

#echo $exe
java $exe
