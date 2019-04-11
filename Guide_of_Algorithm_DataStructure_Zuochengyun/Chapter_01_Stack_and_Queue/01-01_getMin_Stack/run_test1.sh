#!/bin/ksh
gmake

file=`ls T*1.java`
exe=${file%.*}

#echo $exe
java $exe
