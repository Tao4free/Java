#!/bin/ksh
gmake

file=`ls *3.java`
exe=${file%.*}

#echo $exe
java $exe
