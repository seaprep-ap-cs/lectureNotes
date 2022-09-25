# Lab 1 Recap

Going forward, I will start taking points off for incorrect or incomplete labs. Lab 1 was a practice lab.

**PROTIP:** Many of the common mistakes below could have easily been avoided had the student exercised **Attention To Detail** (ATD). Writing good and correct code requires many things to be right from mispelling a keyword to not enclosing a string or method, from missing a semicolon to not compiling your code before submitting it for homework. Build the habit of ATD as you write your program. Check and then double-check that your code actually works. Run any tests on your code. As John Wooden, the revered college basketball coach, said: "If you don't have time to do it right, when will you have time to do it over?" 


  
## Common Mistakes

### Submitting code that does not run even though it compiles

The code below compiles but does not run because the Java Virtual Machine (JVM) is expecting a main method with `String [] args`

```
public static void main(String args) {
  System.out.println("Hello World");
}
```

### Not formatting code for readability

Indentation and spacing matters. While the JVM does not need a specific format for your code to compile and run, your code is still read by humans. Before submitting your code, run it through a formatter such as [Best Java Viewer - Beautify - Minify - Formatter Online](https://codebeautify.org/javaviewer)

Or better yet, have the discipline to write your code in some conventional and accepted format. See BJP Chapter 1 on formatting Java code. 

### Blank lines in code do not correspond to lines of output

The code below produces ~~four~~ three (3) lines of output:

```
public class Tricky2 {
    public static void main(String[] args) {
        System.out.println("Testing, testing,");
        System.out.println("one two three.");

        System.out.println();
    }
}
```

### Copy and Paste with care

Some students copied and pasted parts of previous code to help write the code for another question. That is okay to do, but ensure that the class name gets changed to the correct name. 

If the example calls for a class called "MuchBetter" but your class is named "Tricky" because copied and pasted without changing the required parts, then your answer would be partially wrong. 

### Not checking your code using the JRE (i.e actually compiling and running your code on your machine)

Some questions on the lab are somewhat trivial and could be answered by simply writing the code by hand. However, attention to detail matters. Consider the last problem, Spikey. It requires an output with considerable spacing. 

```
  \/
 \\//
\\\///
///\\\
 //\\
  /\
```
If you don't check your code by running it on your machine, you might accidently write code with logic errors below:

```
public class Spikey {
   public static void main(String[] args) {  
      System.out.println("\\/");
      System.out.println("\\\\//");
      System.out.println("\\\\\\///");
      System.out.println("///\\\\\\");
      System.out.println("//\\\\");
      System.out.println("/\\");     
   }
}
```

Which produces this:

```
\/
\\//
\\\///
///\\\
//\\
/\
```





