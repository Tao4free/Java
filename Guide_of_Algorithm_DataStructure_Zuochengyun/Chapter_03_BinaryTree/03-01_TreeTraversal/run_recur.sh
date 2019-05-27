#!/bin/ksh
gmake

file=`ls TreeT*Recur*.java`
exe=${file%.*}

#echo $exe
java $exe
