#!/bin/ksh
gmake

file=`ls R*_double.java`
exe=${file%.*}

#echo $exe
java $exe
