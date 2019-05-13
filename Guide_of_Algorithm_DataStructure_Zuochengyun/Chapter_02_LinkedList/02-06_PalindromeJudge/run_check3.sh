#!/bin/ksh
gmake

file=`ls Check*3.java`
exe=${file%.*}

#echo $exe
java $exe
