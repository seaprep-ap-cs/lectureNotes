# Lab 7 - Parameters and Objects

## Methods that Return Values

1. Create a new Java class called ReturnMethods. 

1. Create a main method that has an empty body; the main method should not have any code or calls to methods yet. 

1. Implement the following methods. None of the methods you write should you have a print statement! The main method should take care of all the printing to the console. 
In other words, your main method should serve as a testing bed for your methods. The structure of the main method should look like the following:

>main method:

>Should call border 3 times with different input and print the output

>Should call fraction 3 times with different input and print the output

>Should call round 3 times with different input and print the output

### Method 1
`border`, which accepts two Strings: one representing a word and one representing a ‘border’ to go around the word. The method then returns the word surrounded on the left and right by the border String.
	
For example, `border(“APCS”, “**”)` would return `**APCS**`

### Method 2

`fraction`, which accepts two integers: one representing the numerator of a fraction and one representing the denominator. The method then returns the double approximation of the fraction.
	
For example, `fraction(4, 7)` would return approximately `0.571428`


### Method 3

`round2`, which accepts a double and returns an integer that represents the double that is truncated to two decimal places and then properly rounded up or down. We will assume positive values only. 

For example:
`round2(3.488834)` would return `3.49`
`round2(5.12345)` would return `5.12`
`round2(6.5)` would return `6.5`

Hints on `round`: Recall that in Java, we can truncate a `double` by casting it to an `int`. For example:

```java
(int) 35.14543
// 35

(int) 35.62333333
//35
```

But we don't want to truncate all the decimal numbers. We need to keep at least the first two decimals. What math trick can we use? First, we need to move the decimal point two places to the right. And How do we move a decimal two places to the right? Multiplication! And once we move the decimal to the right two times, we can then cast the result to an `int` to remove the decimal numbers we don't want. For example:

```java
35.14543 * 100.0
// 3514.543

(int) (35.14543 * 100.0)
// 3514

35.62333333 * 100.0
// 3562.333333

(int) (35.62333333 * 100.0)
// 3562
```

But wait, now the decimal is in the wrong place. For example,  we want 35.14543 to turn to 35.14 not 3514. How can we move a decimal to the left two times? Division! From the previous example:

```java
(int) (35.14543 * 100.0)
// 3514

(int) (35.14543 * 100.0) / 100.0
// 35.14

(int) (35.62333333 * 100.0)
// 3562

(int) (35.62333333 * 100.0) / 100.0
// 35.62
```

But wait again, we need to handle the case where the number is not only truncated but properly rounded up or down. For example, we want to truncate `35.14543` to `35.15` not `35.14` How can we do that? Recall that the Math class has a static method called `Math.round` Thus instead of casting a number to `int` to truncate, we can use `Math.round`, multiplication, and division to round a decimal to two decimal places? 

<br></br>
<br></br>
<br></br>
## String methods

1. Create a new Java class called StringMethods. 

1. Create a main method that has an empty body; the main method should not have any code or calls to methods yet. 

1. Implement the following methods. None of the methods you write should you have a print statement! The main method should take care of all the printing to the console. 
In other words, your main method should serve as a testing bed for your methods. 

1. Write a method called `removeFirst` that accepts a `String` and returns a `String` with the first character removed. For example, `removeFirst(“APCS”)` should return `PCS` . Assume that the `String` accepted has a length of at least one. Write some calls to this method in the main method and print the output to the console. 
 
1. Write a method called `removeLast` that accepts a `String` and returns a `String` with the last character removed. For example, `removeFirst(“APCS”)` should return `APC`. Assume that the `String` accepted has a length of at least one. Write some calls to this method in the main method and print the output to the console.  
 
 
1. Write a method called `onlyFirstLast` that accepts a String and returns a String that is only the first and last characters. For example, `onlyFirstLast(“APCS”)` should return `AS`. 
Write some calls to this method in the main method and print the output to the console. 
 
1. Write a method called `half` that accepts a `String` and returns only the first half of the `String` (for odd-length Strings, round down). For example, `half(“This is hard!”)` should return `This i`. Write some calls to this method in the main method and print the output to the console. 

1. Write a method called `isUpperCase` that accepts a `String` and returns a `boolean` whether all the letter characters are in uppercase. For example, `isUpperCase(“AP CS!”)` should return `true` since all letters are uppercase (spaces and other characters do not factor into the determination). Write some calls to this method in the main method and print the output to the console. 

<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br><br></br><br></br>
## Scanner Object practice

1. Create a new Java class called ScannerPractice. 

1. Create a main method.  In the main method, creates a Scanner object named `console`. 

1. Write a method called inputBirthday that accepts a Scanner for the
console as a parameter and prompts the user to enter a month, day, and
year of birth, then prints the birthdate in a suitable format. Here is an
example dialogue with the user:

```
On what day of the month were you born? 8
What is the name of the month in which you were born? May
During what year were you born? 1981
You were born on May 8, 1981. You're mighty old!
```
 
4. Write a method called nameGame that accepts a Scanner for the console as a parameter and prompts the user to input a first and last name. The method should then produce a song in the following format using their first, then last, name. Use additional static methods method to avoid redundancy (hint" remember the first programming assignment?).

```
What is your name? Fifty Cent

Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!
Cent, Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!
```
