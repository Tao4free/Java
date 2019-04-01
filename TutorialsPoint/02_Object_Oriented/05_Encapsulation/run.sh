#!/bin/ksh
gmake

file=`ls R*.java`
exe=${file%.*}

#echo $exe
java $exe
