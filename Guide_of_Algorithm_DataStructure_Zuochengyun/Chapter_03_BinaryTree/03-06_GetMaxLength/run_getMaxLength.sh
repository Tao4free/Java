#!/bin/ksh
gmake

file=`ls GetMaxLength.java`
exe=${file%.*}

#echo $exe
java $exe
