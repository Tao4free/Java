#!/bin/ksh
gmake

file=`ls Sele*t.java`
exe=${file%.*}

#echo $exe
java $exe
