#!/bin/ksh
gmake

file=`ls *ByPre.java`
exe=${file%.*}

#echo $exe
java $exe
