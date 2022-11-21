
# Exam 1 Recap

* Identifiers in Java are names given to parts of a Java program
  * For example, the name of a class can be `HelloWorld`; the name of a method can be `_getx`
* The rules for a *legal* identifier are the following:
  * Identifiers can consist of the set of letters from the Roman alphabet AND two characters: `_` and `$`
  * Identifiers must start with a letter
  * After starting with a letter, identifiers can consist of any number of letters or digits or the two characters `_` and `$`
  * Identifiers are case sensitive. Therefore, `FOOBAR`, `foobar`, and `Foobar` are all considered different
  * There are reserved keywords that cannot be used as an identifier. For example, `for`, `void`, `static`.
* See BJP 1.2, section Identifiers and Keywords for reference 
* Do [PracticeIt Problem 1.6](https://practiceit.cs.washington.edu/problem/view/bjp3/chapter1/s6-legalIdentifiers)  
* Syntax/compilier errors are not the same as Runtime errors. Runtime errors occur when the program is run; this implies that the program does not have any
  syntax or compilier errors because the program has to succesfully compile before it can be run. 
  * Examples of Runtime errors: dividing by zero `1/0`, infinite loops

## Bonus Question 1

* The key takeaway is that we can use the technique of decomposition (i.e. breaking a problem down into smaller problems) to solve this question
within the constraints of having to use static methods and `System.out.println()` once. 

* For a solution that expresses how to solve the problem by solving smaller problems, see [ShiningPart2 code](https://github.com/seaprep-ap-cs/lectureNotes/blob/main/exam-notes/exam-1/ShiningPart2.java) 

## Bonus Question 2

* From PracticeIt problem 1.9:

> Many students fail this problem by not understanding how the \t character works, causing them to have the wrong number of spaces. A tab inserts multiple spaces until the total number of characters on the current line so far is a multiple of 8.

* Do [PracticeIt Problem 1.9](https://practiceit.cs.washington.edu/problem/view/bjp3/chapter1/s9-Archie)

## Bonus Question 3

* Take the time to understand what the question is asking you to do
* See [my solution](https://github.com/seaprep-ap-cs/lectureNotes/blob/main/exam-notes/exam-1/Meta.java)
