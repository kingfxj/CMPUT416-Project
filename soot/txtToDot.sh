OUT=toString.dot
echo "graph test {" > $OUT
sed -E 's/[a-z]+\.//g; s/[0-9]+\/;/; s/ / -- /; s/[\$|\:]/_/g'  toString.txt >> $OUT
echo "}" >> $OUT
dot -Tpng toString.dot -o toString.png
