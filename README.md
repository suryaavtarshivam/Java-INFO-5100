Readme for Assignment 1
In this first assignment, we will be extending the Hello World class so we can customize the greeting.  Please modify the code below so a person can create any kind of greeting.

HINT - Look at the parameters in the Riddle in Java, Java, Java and that will help you create the constructors what to pass when constructing the greeting.

The Hello World code is below and you just need to modify the code properly.

We will discuss this in the lab portion this week.

To turn in - Please upload your Java source code to the assignment area.

Code:

public class HelloWorld {
    private String greeting = "Hello, World!";
    public void greet()
    
    {
    System.out.println(greeting); 
    }
    
    public static void main (String args[])
    {
    HelloWorld helloworld;
    helloworld = new HelloWorld ();
    helloworld.greet () ;
    } 
}

Readme for Assignment 2
Purpose

 

This assignment will teach the following skills:

 

Take in user input

Write Expressions

Output results to the user in standard out

Have the main in a separate file from the classes

 

This assignment will provide the following knowledge:

 

How Java treats expressions

The different key symbols for math expressions

Have knowledge of how to use other classes and libraries

Be able to further use IDEs

 

Task

 

Write a class that will properly weight grades. The class should have four attributes as follows:

 

Point Total

Earned Points

Assignment Percentage

Total Weighted Grade

 

The point total, earned points, and assignment percentage will be taked in from the user. The total weighted grade will be calculated. The idea is to take an assignment and then transform the raw score to the number of percentage points earned in the class as a total for the class.

 

For example, if a 200 point assignment accounts for 35% of the class grade, and the student earned 175 points, then the different attributes would be as follows:

 

Point Total = 200

Earned Points = 175

Assignment % = 35%

Total Weighted grade = 175 / 200 * .35 *100 = 30.625 for the weighted grade.

 

In this case the student earned 87.5% of the 35% of the class. That total is 30.625 and there will be other parts of the class that add up to 100 possible points.

 

Criteria for success

 

Students will be graded on the following:

 

Style of coding. COMMENTS are expected in this assignment

How the class is setup and proper method(s) developed

Private attributes created and then public methods

The main file needs to be separated from the class

Accuracy of numbers (The Double data type should be used for precision)



Readme for Assignment 3




This assignment will teach the following skills:

 

If – Then Statements in Java

Addiing attributes and methods to classes

Reference Variables vs Primitive Variables

 

This assignment will provide the following knowledge:

 

Loigic expressions in java

Assignment vs Logic expressions

The use of “this” in reference variables

 

Task

 

Extend the weighted grades class to include a method that generates the final grade. Students will need to add attributes to store the grades earned in the class. Additional attributes will be to support the percentage that the assignments / exams are for the class. Then the final piece is to put it all together. Once it is all put together, then the program will output a letter grade based on the total in the class. A is 90 – 100, B is 80 – 89.9999, C is 70 – < 80, D is 60 – < 70, then F is anything < 60. The program should accept 8 different grades with varying percentages of the total. Please see below for an example:

 

A user inputs total point total of assignments of 20, 30, 40, 50, 60, 100, 200, 300

 

A user inputs percentages as 10, 10, 10, 10, 10, 10, 15, 25

 

Then the TOTAL weighted grade will be calculated

 

Then when the total is figured out, through an If-Then statement, figure out the letter grade

 

 

Criteria for success

 

Students will be graded on the following:

 

Style of coding. COMMENTS are expected in this assignment

Modularity and making sure there are different methods for different tasks

Proper If-Then-Else

Proper use of less than and/or greater than in Java

Readme for Docker Assignment

Purpose

 

Understand development in Docker

 

This assignment will provide the following knowledge:

 

Docker Navigation

 

Task

 

Please follow the directions in the introduction to Docker. The link is as follows:

https://docs.docker.com/get-started/introduction/develop-with-containers/Links to an external site.

Please provide screen prints of the results of the updates to the code. The code language is different but this assignment is just to get used to Docker.

Criteria for success

 

Students will be graded on the following:

 

All of the steps being followed


Readme for FUN with GUI
Purpose

 

This assignment will teach the following skills:

 

Create a GUI Class

Connect Text Boxes and labels to attributes and variables

Output results in the GUI

 

This assignment will provide the following knowledge:

 

Building a Swing GUI

Some GUI building blocks in Swing

 

Task

 

Use assignment two as a model and create a GUI for assignment two.

 

There should be three attributes that get populated from input boxes:

 

Total points of the assignment possible

Earned points on the assignment

Percentage of the total grade for the assignment

 

There should be one output box:

 

Total points score for that specific weighted assignments

 

There should be one button to tun the calculation of the weighted grade.

 

Readme for Data files with GUI

Purpose

 

This assignment will teach the following skills:

 

Create more complete GUI

Read from flat files

Write to flat files

 

This assignment will provide the following knowledge:

 

Building a GUI

Reading from a file

Writing to a file

 

Task

 

Take the attached file and read it into memory when a user clicks a button. When it is read into memory, it should display the first five lines in a text box.

 

Once the file is read, then parse the first three fields and load those into a different file (Of the users choosing).

 

Display the first five lines of the file in a different text box

 

Make sure all files are in the same directory as your java code. DO NOT move them anywhere else.

 

There should be the following widgets in your GUI:

 

A text box that can be edited but defaults to the file name you are reading from

A button to read from the file

A text box to load the five lines of the file read

A button to write to the file

A text box for the user to input the new file name

A text box to show the first five lines that is written to the file so the user knows what data will be in the file

 



 
