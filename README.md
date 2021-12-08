# CMPUT416-Project

## Team members
* Diana Le (dble)
* King Fu (xinjian)

## Descriptin of Project
We wanted to analyze ImageJ using Soot analysis to identify the location of the bugs as well as learn how the ImageJ is able to run on multiple platforms.
This github repository contains the ImageJ Open-Source code and Soot jar file, which can be found inside the soot folder that enable to run soot analysis.

For manual testing, two files large.jpeg and dog.jpg are examples of what we importated into the imageJ software.

Inside the folder soot, toString.txt is the result of the edges of running soot.java file.

To regenerate the result, you can clone this github repository
git clone https://github.com/kingfxj/CMPUT416-Project.git

Go to soot folder, and run command java -cp sootclasses-trunk-jar-with-dependencies.jar soot.java -cp ../ -pp -process-dir ../imagej1/ij.jar -allow-phantom-refs -w ij.ImageJ > toString.txt

## Resources:
* https://imagej.net/develop/source
* https://stackoverflow.com/questions/54526373/not-sure-how-to-use-system-nanotime-for-my-program
