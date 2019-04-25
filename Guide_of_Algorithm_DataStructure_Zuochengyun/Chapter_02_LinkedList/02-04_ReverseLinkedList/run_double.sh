#!/bin/ksh
gmake

file=`ls *double.java`
exe=${file%.*}

#echo $exe
java $exe
