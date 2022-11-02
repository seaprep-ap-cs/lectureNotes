import java.util.*;


public class Mortgage {
   public static void main(String[] args) {
      // Create an object named 'console' of type Scanner
      Scanner console = new Scanner(System.in);
      // common methods of the Scanner object
      // next() reads and returns the next token as a String
      // nextDouble() reads and returns a double value
      // nextInt() reads and returns an int value
      // nextLine() reads and returns the next line of input as a String
      
      System.out.println("This program computes monthly mortgage payments.");
      
      System.out.print("What is your name? ");
      String name = console.next();      
      
      System.out.print("loan amount\t\t\t: ");
      double loan = console.nextDouble();
      
      System.out.print("number of years\t: ");
      int years = console.nextInt();
      
      System.out.print("interest rate\t\t: ");
      double rate = console.nextDouble();
      
      // Calculate the monthly mortgage payment and show it on the console
      System.out.println();
      int n = 12 * years;
      double c = rate / 12.0 / 100.0;
      double payment = loan * c * Math.pow(1 + c, n) / (Math.pow(1 + c, n) - 1);
      System.out.println("payment\t\t\t = $" + (int) payment);
      System.out.println("Thank you, " + name + ". Have a nice day!");      
   }
}