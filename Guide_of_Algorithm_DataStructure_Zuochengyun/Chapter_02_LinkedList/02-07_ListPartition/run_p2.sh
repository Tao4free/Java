#!/bin/ksh
gmake

file=`ls *2.java`
exe=${file%.*}

#echo $exe
java $exe
