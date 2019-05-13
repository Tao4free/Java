#!/bin/ksh
gmake

file=`ls Check*1.java`
exe=${file%.*}

#echo $exe
java $exe
