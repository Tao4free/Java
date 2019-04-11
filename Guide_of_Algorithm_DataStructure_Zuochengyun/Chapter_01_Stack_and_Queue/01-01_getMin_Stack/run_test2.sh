#!/bin/ksh
gmake

file=`ls T*2.java`
exe=${file%.*}

#echo $exe
java $exe
