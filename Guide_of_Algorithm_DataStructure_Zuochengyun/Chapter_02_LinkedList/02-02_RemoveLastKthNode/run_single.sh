#!/bin/ksh
gmake

file=`ls R*_single.java`
exe=${file%.*}

#echo $exe
java $exe
