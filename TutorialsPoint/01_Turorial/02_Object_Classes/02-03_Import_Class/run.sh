#!/bin/ksh
gmake

file=`ls *Test.java`
exe=${file%.*}

#echo $exe
java $exe
