#!/bin/ksh
gmake

file=`ls *_2.java`
exe=${file%.*}

#echo $exe
java $exe
