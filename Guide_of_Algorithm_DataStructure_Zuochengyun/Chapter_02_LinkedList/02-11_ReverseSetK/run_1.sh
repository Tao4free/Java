#!/bin/ksh
gmake

file=`ls *1.java`
exe=${file%.*}

#echo $exe
java $exe
