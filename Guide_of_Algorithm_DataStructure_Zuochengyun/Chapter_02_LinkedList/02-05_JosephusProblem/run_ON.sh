#!/bin/ksh
gmake

file=`ls *ON.java`
exe=${file%.*}

#echo $exe
java $exe
