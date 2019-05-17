#!/bin/ksh
gmake

file=`ls Insert*_book.java`
exe=${file%.*}

#echo $exe
java $exe
