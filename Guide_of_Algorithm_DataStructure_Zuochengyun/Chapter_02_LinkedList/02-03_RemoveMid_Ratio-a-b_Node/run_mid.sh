#!/bin/ksh
gmake

file=`ls *Mid*.java`
exe=${file%.*}

#echo $exe
java $exe
