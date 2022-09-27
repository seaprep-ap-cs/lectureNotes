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
