<user-home>\.yawcam\extravars\README.txt


This folder exists to let you add own variables in the text overlay.
In this way you can let an external software or script produce a text file that will be parsed as an overlay variable in Yawcam.


Here follows an example of how it works:

A variable called {temperature} will read from the file {temperature}.txt
Say that you have an external script that writes the current temperature in the file {temperature}.txt, you can then display this temperature as an overlay in Yawcam by including the variable {temperature} in the text overlay.