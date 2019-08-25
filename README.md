# LanguageTranslator

University of Glasgow 
Msc Project

## Author
Yidi Cao

## Project Description

The aim of the project is to make a high-level language translator, with which users can specify the source language of the input program and get a semantically equivalent program in the target language. The languages that the translator support include Python and C. 

## Language and Technologies
The source codes are written in Java using Eclipse. JavaFX, CSS and Scene Builder were utilized for GUI design. 

## File Directory
Main packages are placed in "LanguageTranslator/src" directory, and their functions are as follows:
* Application: Driver of the application and GUI design
* C: Controller to translate C source programs to Python programs
* Python : Controller to translate Python  source programs to C programs
* tests: test files for both directions of translation

For quick function testing, there is a test.txt file containing a C source program and a Python source program, which include their respective main grammars.

For detailed tests, more test files written in Python or C can be found in "LanguageTranslator/tests" directory. 

## User Guide
To work with the application, Eclipse and JavaFX plug-in are recommended to be first installed on the machine.
Also, Application.jar file can be directly run with a double click.
The GUI is as follows:

![](/image/GUI.PNG)
 
Users can choose source lanuguages and target languages with the combo boxes, and they can also click the double arrow image to swap them. The text areas for input/output programs are both scrollable, and users can maximize the window to have a better view of the texts as well.


