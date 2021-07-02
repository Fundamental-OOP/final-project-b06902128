run:
	javac -cp . -sourcepath src -d out src/*.java
	java -Xmx4096m -cp out Main
