Team Exercise - Cumulative Algorithms

10 points

Name: ___________________

Partner Name: ___________________


# Cumulative Algorithms

BJP 4.2 defines a cumulative algorithm as "an operation in which an overall value is computed incrementally, often using a loop".

We have already used cumulative algorithms in this course. For example, recall how we
created a method to get a certain number of Fibonacci numbers? We had to iterate through a sequence of numbers and perform
certain mathematical operations on them in order to calculate and then display the Fibonacci numbers. 



## Cumuluative Sum

1. In plain English, describe the algorithm to calculate the sum of a collection of numbers:
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>


2. Implement your algorithm in Java. You do not need to create a method. Just translate your algorithm above in Java. 

```java
// write your algorithm here
// hint: a for-loop might help











```

<br></br>

3. Go to another team and have them review your algorithm. Have them give you feedback on the algorithm that you created in the previous step. After they have given you feedback, have that team sign their initials below:

Other Team's initials: ___

Other Team's initials: ___

<br></br>

4. Open up JGrasp. Copy the code below and run it in JGrasp. Run through a couple of interactive examples. 

```java
// Finds the sum of a sequence of numbers.

import java.util.*;

public class ExamineNumbers1 {

   public static void main(String[] args) {
      System.out.println("This program adds a sequence of");
      System.out.println("numbers.");
      System.out.println();

      Scanner console = new Scanner(System.in);

      System.out.print("How many numbers do you have? ");
      int totalNumber = console.nextInt();
      
      double sum = 0.0;
      for (int i = 1; i <= totalNumber; i++) {
         System.out.print(" #" + i + "? ");
         double next = console.nextDouble();
         sum += next;
      }
      System.out.println();

      System.out.println("sum = " + sum);

   }
}
```
 
This program also calculates the cumulative sum of a collection of numbers. 
Where would you replace this program's cumulative sum algorithm with yours? How, if at all, is your algorithm different from the original program's?


## Cumulative Sum with `if`

Building on the previous algorithm, let's create a variation of our cumulative sum algorithm. Instead of adding a 
collection of numbers, we will create another algorithm: Given a collection of numbers, calculate the sum of even and the sum of odd numbers. 

1. In plain English, describe the algorithm to calculate the sum of even numbers and the sum of odd numbers over a given set of numbers:
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>
   <br></br>


2. Implement your algorithm in Java. You do not need to create a method. Just translate your algorithm above in Java.

```java
// write your algorithm here
// hint: a for-loop might help
// hint: if-else might also help














```

<br></br>

3. Go to another team and have them review your algorithm. Have them give you feedback on the algorithm that you created in the previous step. After they have given you feedback, have that team sign their initials below:

Other Team's initials: ___

Other Team's initials: ___

<br></br>

4. Open up JGrasp. Copy the code below and run it in JGrasp. Run it. Notice anything odd about this program?

```java
// Finds the sum of a sequence of numbers.

import java.util.*;

public class ExamineNumbers2 {

   public static void main(String[] args) {
      System.out.println("This program adds a sequence of");
      System.out.println("numbers.");
      System.out.println();

      Scanner console = new Scanner(System.in);

      System.out.print("How many numbers do you have? ");
      int totalNumber = console.nextInt();
      
      double sumEven = 0.0;
      double sumOdd = 0.0;
      
      // insert your algorithm here
      // ensure that your prompt the user for a number: System.out.print(" #" + i + "? "); 
      // ensure that you get the number given from the user: double next = console.nextDouble(); 
      // hint: see the for-loop in the previous problem
      
      
      
      
      
      
      
      
      
      
      System.out.println();
      System.out.println("sum of even numbers = " + sumEven);
      System.out.println("sum of odd numbers = " + sumOdd);
   }
}
```

This program is missing one key piece of code: the algorithm to compute the sum of even and odd numbers. Place your
algorithm in the right place (see the comments), ensure that the algorithm uses the right variables, and then run your program to ensure that it works as expected. 

