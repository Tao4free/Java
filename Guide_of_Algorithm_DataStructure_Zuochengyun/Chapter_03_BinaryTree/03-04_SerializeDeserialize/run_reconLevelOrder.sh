#!/bin/ksh
gmake

file=`ls ReconLevelOrder.java`
exe=${file%.*}

#echo $exe
java $exe
