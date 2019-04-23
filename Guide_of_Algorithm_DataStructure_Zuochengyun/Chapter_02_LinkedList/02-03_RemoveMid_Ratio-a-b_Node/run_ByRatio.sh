#!/bin/ksh
gmake

file=`ls *ByRatio*.java`
exe=${file%.*}

#echo $exe
java $exe
