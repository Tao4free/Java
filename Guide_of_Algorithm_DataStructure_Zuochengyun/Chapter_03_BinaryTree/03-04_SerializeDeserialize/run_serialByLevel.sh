#!/bin/ksh
gmake

file=`ls *ByLevel.java`
exe=${file%.*}

#echo $exe
java $exe
