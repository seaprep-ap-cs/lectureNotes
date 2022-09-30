# Lab 5 - Mirror

## Overview

For this lab, our purpose is to practice using development strategies to write complex programs. We will use problem-solving techniques such as decomposition, "table technique", multipliers and constants (i.e. basic algebra), and class constants to write our program.   

## Problem 1

Create a program that produces the following output on the console:


```plaintext
#================#
|      <><>      |
|    <>....<>    |
|  <>........<>  |
|<>............<>|
|<>............<>|
|  <>........<>  |
|    <>....<>    |
|      <><>      |
#================#
```

1.1 Create a new Java file called `MirrorArt`

1.2 Decompose the required output into smaller problems. Recall Exam 1, problems 9-12, in which we had to implement the methods for the output:

```
  ______
 /......\
/........\
\......../
 \______/

\......../
 \______/
+--------+

  ______
 /......\
/........\
|  STOP  |
\......../
 \______/

  ______
 /......\
/........\
+--------+
```

And here's the source code to print out that output:

```java

public class Figure {
   public static void main(String[] args) {
      topHalf();
      bottomHalf();
      System.out.println();
      bottomHalf();
      someLine();
      System.out.println();
      topHalf();
      stop();
      bottomHalf();
      System.out.println();
      topHalf();
      someLine();    
   }
```

For `MirrorArt`, write a main method that decomposes the required output into smaller pieces that correspond to static methods. (hint: the required output suggests at least three static methods).

1.3 Create "stubs" for the static methods you used in 1.2. "Stubs" are simply static methods with no code in it. For example: 

```
public static void main(String[] args) {
    doSomething();
}

public static void doSomething() {
    // TODO: add code
}
```

Use this same pattern above and write your stubbed methods. Compile your program to ensure that it is sytacticially correct. If compilation fails, look at the error logs, fix the errors, and then recompile until compilation passes.


1.4 
* For the method that prints out `#================#`, write pseudocode (i.e. code written in plain English).

* Translate your pseudocode into Java code and put it in your corresponding method
* Compile your program to ensure that it is sytacticially correct. If compilation fails, look at the error logs, fix the errors, and then recompile until compilation passes.

1.5 
* For the method that prints out:
```
|      <><>      |
|    <>....<>    |
|  <>........<>  |
|<>............<>|
```

* Write pseudocode that will produce the output above
* Use the "table technique" to solve the problem by hand
* Translate your pseudocode into Java code  
* Compile your program to ensure that it is sytacticially correct. If compilation fails, look at the error logs, fix the errors, and then recompile until compilation passes.



## Problem 2

Modify your program above so that it can scale. For example, 

```
#============#
|    <><>    |
|  <>....<>  |
|<>........<>|
|<>........<>|
|  <>....<>  |
|    <><>    |
#============#
```