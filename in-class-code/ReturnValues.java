public class ReturnValues {
   public static void main(String[] args) {
      // information flow
      // 1) pass information through methods with parameters
      // 2) pass information through overloaded methods 
      // (methods with the same name but different number and type of parameters)
      // 3) methods return information to the caller. Example: int result = sum(2,2)      
      
      sum(3,2);
      
      int result = sumV2(5,6);
      System.out.println(result);
      
      int mySum = arithmeticSum(10);
      System.out.println(mySum);
      
      String sumMessage = displayArithmeticSum(100);
      System.out.println(sumMessage);
   }
   
      
   public static void sum(int x, int y) {
      System.out.println(x + y);
   }
   
   public static int sumV2(int x, int y) {
      int result = x + y;
      return result;
   }
   
   public static String displayName(String first, String last) {
      String finalName = first + " " + last;
      return finalName;
   }
    
   public static int arithmeticSum(int number) {
      // returns the sum of all integers from 1 to "number"
      // uses the arithemtic sum ala Gauss: n(n+1) / 2
      int result = number * (number + 1) / 2;
      return result; 
    } 
   
   public static String displayArithmeticSum(int number) {
      int sum = arithmeticSum(number);
      return "The arithmetic sum of " + number + " is " + sum;
   }
   
   /*
      Anatomy of a method
      
      public static <type> <name>(<type> <name>, <type> <name>, ....) {
         <statement>
         <statement>
         ......
         <statement>
      }
      
      return <expression>
      
      Calling methods on a class takes the form:
      
      <class name>.<element>
      
      For example, Math.sqrt(4)
      
      You can also get certain value. For example, Math.PI or Math.E 
      
   */
   
}