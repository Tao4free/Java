#!/bin/ksh
gmake

file=`ls *singlePart.java`
exe=${file%.*}

#echo $exe
java $exe
