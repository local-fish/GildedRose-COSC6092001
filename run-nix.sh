gradle -q pre > refactor-out.txt
diff refactor-out.txt expected-out.txt

gradle -q text > refactor-out-workingconjure.txt
