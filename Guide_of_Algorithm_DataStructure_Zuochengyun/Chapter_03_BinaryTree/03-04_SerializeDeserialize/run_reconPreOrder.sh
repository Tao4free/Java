#!/bin/ksh
gmake

file=`ls ReconPreOrder.java`
exe=${file%.*}

#echo $exe
java $exe
