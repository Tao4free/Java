#!/bin/ksh
gmake

file=`ls TreeT*_Stack.java`
exe=${file%.*}

#echo $exe
java $exe
