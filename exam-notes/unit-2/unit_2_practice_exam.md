# APCS Practice Exam: Unit 2

#### Name: 
#### Date: 

## Multiple Choice Questions 

1. Which of the following are legal `int` literals? (circle all that apply)

* a) `22`
* b) `1.5`
* c) `-1`
* d) `2.3`
* e) `10.0`
* f) `5.`
* g) `-6875309`
* h) `'7'`

2. Trace the evaluation of the following expression and give its resulting value:


```java
4.0 / 2 * 9 / 2
```

* a) 9
* b) 0
* c) 36.0
* d) 9.0
* e) 36

3. Which of the following choices is the correct syntax for declaring a real number variable named `grade` and initializing its value to `4.0`?

* a) `int grade : 4.0;`
* b) `grade = double * 4.0;`
* c) `double grade = 4.0;`
* d) `grade = 4;`
* e) `4.0 = grade;`

4. What are the values of `first` and `second` at the end of the following code?

```java
int first = 8;
int second = 19;
first = first + second;
second = first - second;
first = first - second;
```

* a) first = 8, second = 19
* b) first = 19, second = 8
* c) first = 19, second = 8.0
* d) first = 19.0, second = 8
* e) first = 8.0, second = 19.0

5. Assume that you have a variable called `count` that will take on values `1, 2, 3, 4,` and so on. Formulate an expression in terms of `count` that will yield a sequence. For example, to get the sequence `2, 4, 6, 8, 10, ....`, you would use the expression `(2 * count)`. For this question, formulate the expression in terms of `count` that will yield the sequence `4, 19, 34, 49, 64, 79...`

```java 
// put your expression here



// hint: use the table technique

count       output  
1           4
2           19
3           34
4           49
5           64
6           79
```

6. What is the output of the following loop?

```java
int total = 25;
for (int number = 1; number <= (total / 2); number++) {
    total = total - number;
    System.out.println(total + " " + number);
}
```

* a) 
```
24 1
22 2
19 3
15 4
10 5
```

* b) 
```
24 5
22 4
19 3
15 2
10 1
```

* c) 
```
11 1
3 2
-2 3
3 4
-4 5
```

* d) 
```
24 1
22 2
19 3
16 4
10 5
```

* e) None of the above


7. Suppose you have an `int` variable called `number`. What Java expression produces the last digit of the number (i.e. the 'ones' place) as type `int` ? 


* a) `number / 10`
* b) `number / 10.0`
* c) `number % 10.0`
* d) `(int) number % 10.0`
* e) `number % 10`

8. Consider the following code segment: 

```java
double x = 5 * 4 / 2 - 5 / 2 * 4;
System.out.println(x);
```

What is printed when the code is executed?

* a) 0
* b) 1
* c) 0.0
* d) 1.0
* e) 2.0

9. Assume that the variable `int n` must be any non-negative integer (e.g. 42, 0, 5688). Consider the following code segment:

```java
while (n >= 2) {
    n = n / 2 - 1;
}  
System.out.println(n)
```
Which of the following represents the list of all possible outputs?

* a) 0
* b) -1, 0
* c) 0, 1
* d) -1, 1 
* e) -1, 0, 1

10. Suppose that you are trying to write a program that produces the following output:

```
1 3 5 7 9 11 13 15 17 19 21
1 3 5 7 9 11
```

The following program is an attempt at a solution, but it contains one or more errors. What are the errors?

```java
public class BadNews {
    public static final int MAX_ODD = 21;

    public static void writeOdds() {
        for (int count = 1 ; count <= (MAX_ODD -2); count++) {
            System.out.print(count + " ");
            count = count + 2;
        }

        System.out.print(count + 2);
    }

    public static void main(String[] args) {
        writeOdds();

        MAX_ODD = 11;
        writeOdds();
    }
}
```

* a) The class constant `MAX_ODD` is reassigned a new value even though it is marked as `final` 
* b) The test in the `for` loop will end the loop too early, resulting in not printing the last odd number of each line
* c) The variable `count` is being updated twice in both `count++` and `count = count + 2`, resulting in even numbers being printed
* d) The variable `count` in the method `writeOdds` is being accessed out of scope 
* e) All of the above


## Free Response Questions

1. This question focuses on the use of `for` and `while` loops. 

(a) Write a method named `printSequence` that uses nested `for` loops to produce the following output:

```java
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
```

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
(b) Recall the Fibonacci sequence: `1 1 2 3 5 8 13 21 34 55 89 144`. Also, recall the `for` loop implementation of the Fibonacci sequence that prints the first 12 numbers of the Fibonacci sequence. 

```java
int firstNum = 0;
int secondNum = 1;
int sum = firstNum + secondNum;

for (int i = 1; i <= 12; i++) {
    System.out.print(sum + " ");
    sum = firstNum + secondNum;
    firstNum = secondNum;
    secondNum = sum;
}
```

Rewrite the implementation of the Fibonnaci sequence using a `while` loop instead of a `for` loop. Your solution should produce the exact same output as the `for` loop example.  
