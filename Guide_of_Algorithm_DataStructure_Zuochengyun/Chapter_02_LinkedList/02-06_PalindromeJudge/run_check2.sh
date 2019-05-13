#!/bin/ksh
gmake

file=`ls Check*2.java`
exe=${file%.*}

#echo $exe
java $exe
