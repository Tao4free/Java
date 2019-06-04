#!/bin/ksh
gmake

file=`ls *_1.java`
exe=${file%.*}

#echo $exe
java $exe
