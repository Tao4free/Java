#!/bin/ksh
gmake

file=`ls Re*.java`
exe=${file%.*}

#echo $exe
java $exe
