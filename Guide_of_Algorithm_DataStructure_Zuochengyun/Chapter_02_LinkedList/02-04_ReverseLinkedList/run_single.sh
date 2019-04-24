#!/bin/ksh
gmake

file=`ls *single.java`
exe=${file%.*}

#echo $exe
java $exe
