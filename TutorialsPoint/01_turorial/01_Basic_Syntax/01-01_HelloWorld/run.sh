#!/bin/bash
make

file=`ls *.java`
exe=${file%.*}

#echo $exe
java $exe
