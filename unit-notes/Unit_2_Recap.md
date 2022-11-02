## Development Strategy (aka How to Get Unstuck on Hard Problems)

Students sometimes get stuck on hard problems such as question 7 on the Loop handout. To get "unstuck", we need to have some problem-solving tools to approach tough problems. We have already talked about one technique, decomposition, in which we break a large, complex problem into smaller, easier-to-solve problems; we then can use the solutions to smaller problems to help solve the large, original problem. 

Another technique is to have a development strategy. One strategy I recommend is the following:

1. Clearly understand the problem. One way to check if you know what the problem is asking is to try to explain the problem to a five-year old (i.e. use simple words)
2. Visualize the problem. Sometimes, pictures are much more helpful in understanding the problem.  Techniques to use are the "table technique" and "pseudocode".
3. Solve the problem by hand. Use the visualizations you created in step 2 to help solve the problem by hand. Manually write out each solution until you can see a pattern. The patterns you see will help you write out the instructions that you will use to write the solution in code. 
4. Write the code. You should spend a majority of your time on steps 1-3. Your solution that you did by hand should drive the code. The code/programming language should NOT drive your solution. You will know that you skipped steps 1-3 when you feel like you are going in circles trying to make the code work. 


## Loops

* The "for loop" takes the following general form:

``` 
for (init; test; update)
    body
```

Where `init` declares some variable that will be used for testing, `test` will run some test on the initialized variable, `body` is a set of statements
that will be run, and `update` will update the initialized variable *AFTER* the `body` is updated. 

For example, the following will produce five lines of 10 stars:

```java
for (int i = 1; i <= 5; i++) {
  System.out.println("**********");
}
```

* Remember the mantra of the control flow of a "for loop": test, body, update (repeat until test no longer passes)

### Nested Loops

* Nested loops are much more common and harder to read and write than simple for loops, but not too hard once one gets a lot of practice. 
* In a nested for loop, the 'body' can itself be another for loop. 

For example, the following code will also product five lines of 10 stars, but this time using nested loops:

```java
for (int i = 1; i <= 5; i++) {
  for (int j = 1; j <= 10; j++) {
    System.out.print("*");
  }
  System.out.println();
}
```

* In the example above, note that the variable `i` has been declared and that it cannot be redeclared (i.e. reused) as the initialization variable
for the nested/inner for loop. The nested loop has to declare a new initialization variable, in this case `j`. 
* We can manipulate the test in the inner for loop by using the outer for loop's initialization variable to create certain, desired output. 

For example, the following will print:

1
12
123
1234
12345

```
for (int i = 1; i <= 5; i++) {
  for (int j = 1; j <= i; j++) {
    System.out.println(j);
  }
}
```

* Nested loops are prone to errors such as infinite loops (i.e. loops that never end). This can happen if the programmer accidently or carelessly 
changes the "test" or "update" parts of a for loop.

For example, the following loop will run forever because the "update" of the inner for loop never updates the correct variable being tested:

```
for (int i = 1; i <= 5; i++) {
  for (int j = 1; j <= 10; i++) {
    System.out.println("Please make it stop!!!!!!");
  }
}
```

## While loops

* While loops are another way to write for loops.
* Note the differences in the general form of the two loops:

```
// while loop form
init
while (test) 
  body
  update

// for loop form
for (init; test; update)
  body
```

An example of a while loop and for loop that are both equivalent and do the same thing is shown below:

```
// both loops will print five lines that show the current number being iterated through

int i = 1
while (i <= 5) {
  System.out.println("i is " + i);
  i++;
}

for (int i = 1; i <= 5; i ++) {
  System.out.println("i is " + i);
}

```
