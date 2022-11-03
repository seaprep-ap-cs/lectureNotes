# APCS Exam: Unit 2

#### Name: 
#### Date: 

## Multiple Choice Questions 

1. Trace the evaluation of the following expression and give its resulting value:


```java
89 % (5 + 5) % 5
```

* a) 4
* b) throws Runtime error, cannot divide by zero
* c) 4.0
* d) 17
* e) 5

<br></br>
2. Trace the evaluation of the following expression and give its resulting value:


```java
2 + "(int) 2.0" + 2 * 2 + 2
```

* a) 2(int) 2.08
* b) 2(int) 2.042
* c) 2(int) 2.0222
* d) 2(int) 242
* e) 10

<br></br>
3. Given the declarations 

```java
int p = 5;
int q = 3;
```

which of the following expressions evaluate to 7.5?

I. `(double) p * (double) q / 2`

II. `(double) p * (double) (q / 2)`

III. `(double) (p * q / 2)`

* a) I only
* b) II only
* c) I and II only
* d) I, II, and III 
* e) None of them

<br></br>
4. Consider the following code segment.

```java
int num = 5;
while (num >= 0) {
    num -= 2;
}
System.out.print(num);
```

What is printed when the code segment is executed?

* a) -1
* b) -2
* c) 0
* d) 2
* e) 21

<br></br>
5. Assume that you have a variable called `count` that will take on values `1, 2, 3, 4,` and so on. Formulate an expression in terms of `count` that will yield a sequence. For example, to get the sequence `2, 4, 6, 8, 10, ....`, you would use the expression `(2 * count)`. For this question, formulate the expression in terms of `count` that will yield the sequence `30, 20, 10, 0, -10, -20,...`

```java 
// put your expression here



// hint: use the table technique

count       output  
1           30
2           20
3           10
4           0
5           -10
6           -20
```

<br></br>
6. Consider the following code segment.

```java
int n = 3;                  // Line 1
double x = 0.14             // Line 2
System.out.println(n + x)   // Line 3
```

* a) `3` is printed
* b) `3.14` is printed
* c) Syntax error on Line 1
* d) Syntax error on Line 2
* e) ArithmeticException on Line 3

<br></br>
7. Suppose you have an `int` variable called `number`. What Java expression produces the second-to-last digit of the number (i.e. the tens place). For example, given a number `123`, the expression should return `2`. 


* a) `number % 100`
* b) `number / 100`
* c) `number % 100 / 10`
* d) `(int) number % 100.0 / 10`
* e) `number % 1000 / 10`

<br></br>
8. Consider the following three code segments: 

```java
I. 

int i = 1;
while (i <= 10) {
    System.out.print(i);
    i += 2;
}

II. 

for (int i = 0; i < 5; i++) {
    System.out.print(2*i + 1);
}

III. 

for (int i = 0; i < 10; i++) {
    i++;
    System.out.print(i);
}
```

Which of the three segments produce the same output?

* a) I and II only
* b) II and III only
* c) I and III only
* d) All three outputs are different.
* e) All three outputs are the same.

<br></br>
9. What are the values of `a, b, c` after the following code statments?

```java
int a = 5;
int b = 10;
int c = b;
a = a + 1;
b = b - 1;
c = c + a;
```

* a) a = 6, b = 9, c = 15
* b) a = 6, b = 11, c = 16
* c) a = 5, b = 9, c = 16
* d) a = 6, b = 9, c = 16
* e) a = 6, b = 9, c = 14

<br></br>
10. Consider the following code segment.

```java
int i = 2;
for (int k = 0; k <= 12; k += i) {
    System.out.print(k + " ");
    i++;
}
```

What is printed when the statement is executed?
* a) `0 3 7`
* b) `0 3 7 12`
* c) `2 5 8 11`
* d) `0 3 6 9 12`
* e) `0 2 4 6 9 10`

<br></br>
11. What are the values of a and b after two iterations through the `for` loop?

```java
int a = 1, b = 2;
for (int k = 1; k <= 20; k++) {
    int oldA = a;
    a = b;
    b = (1 + b) / oldA;
}
```

* a) 2 and 2
* b) 2 and 3
* c) 3 and 2
* d) 3 and 3
* e) 3 and 6

<br></br>
12. Complete the following for loop to produce the following output:

```
-4
14
32
50
68
86
```

Write your solution here:
```java
for (int i = 1; i <= 6; i++) {
    // your code here



}
```


<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
## Free Response Questions

1. This question focuses on the use of `for` and `while` loops. 

(a) Write a method named `printSequenceV2` that uses nested `for` loops to produce the following output:

```java
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
```

*Hint: nested for loops can go three or more levels of nesting.*

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
<br></br>
<br></br>
<br></br>
<br></br>


(b) From https://letstalkscience.ca/educational-resources/backgrounders/gauss-summation:

>The Gauss Summation is named for Johann Karl Friedrich Gauss. He was a German mathematician. Gauss is one of history’s most influential mathematical thinkers. A legend suggests that Gauss came up with a new method of summing sequences at a very young age. The legend says that his math teacher asked the class to add the numbers 1 to 100. In other words, the teacher wanted them to add 1 + 2 + 3 + 4 + 5… all the way up to 100! 

> The teacher assumed that this would take the students a very long time. Think about how long it would take you to add up all the numbers from 1 to 100 one by one. However, Gauss answered 5050 almost immediately. 

> This story may not be entirely true. But, it reminds us that the youngest students are sometimes the ones to discover new mathematical patterns. Now, let’s think about the pattern that Gauss used to solve this problem quickly. 

> The trick that Gauss used to solve this problem is that it doesn’t matter what order we add the numbers. No matter what order we follow, we will get the same result. 

> For example:

> 2 + 3 has the same answer as 3 + 2.

> We can reorder the numbers from 1 to 100 in a clever way. This can help us add them more quickly. Here is a simple example which will show you how this grouping strategy works. 

> Say you wanted to add the numbers from 1 to 10.

> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = ?

> You could group the numbers in pairs. First, you could add the first number with the last number. Then, you could add the second number with the second to last number. You could continue to follow this pattern.

> Now, you might have noticed something strange. Each of these pairs adds up to 11. So, we can think about our problem like this

> (1 + 10) + (2 + 9) + (3 + 8) + (4 + 7) + (5 + 6) = ?

> (11) + (11) + (11) + (11) + (11) = ?

> Since we have 5 pairs, our answer is 

> 11 + 11 + 11 + 11 + 11 = 11 x 5 = 55


Write a class called `MathIsFun` that has a static method called `gaussianPairs`. This method should print all the pairs for any sequence of numbers starting at 1 and ending at any number. This method can and should use the `while` loop to print out all the pairs. Recall the example above for sequence 1, 2, 3,...,10. For a sequence that ends at 10, your method should print the following pairs:

```shell
1, 10
2, 9
3, 8
4, 7
5, 6
```

Your method should be easy to change so that it can handle any sequences from 1 to 5, 1 to 10, 1 to 100, or even 1 to 1000000. Note that for sequences that end on an odd number, we do not need to print the middle pair. For example, given a sequence from 1 to 5, your method should output the following pairs:

```shell
1, 5
2, 4
```

Note that we will not print the `3, 3` pair in this example. 

To help you get started, below is starter code for you to use to write your solution:

```java
public class MathIsFun {
    public static final int RIGHT = 10;

    public static void gaussianPairs() {
        // make a copy of the value of RIGHT
        int right = RIGHT;

        // add your code here















    }
}

```