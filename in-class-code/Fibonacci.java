public class Fibonacci {
   public static int TOTAL_NUMBERS = 13;

   public static void main(String[] args) {
      printFibonacciV1();
   }
   
   public static void printFibonacciV1() {
      int firstNum = 0;
      int secondNum = 1;
      int sum = firstNum + secondNum;
      
      for (int i = 1; i <= TOTAL_NUMBERS; i++) {
         System.out.print(sum + " ");
         sum = firstNum + secondNum;
         firstNum = secondNum;
         secondNum = sum;
      }
   }
  
  public static void printFibonacciV2() {
      int firstNum = 0;
      int secondNum = 1;
      int sum = firstNum + secondNum;
      int count = 12;
      
      while (count >= 1) {
         System.out.print(sum + " ");
         sum = firstNum + secondNum;
         firstNum = secondNum;
         secondNum = sum;
         
         count--;
      }
   }
   
     public static int FIRST_NUM = 0;
   public static int SECOND_NUM = 1;
   public static int SUM = FIRST_NUM + SECOND_NUM;
   
   public static void printFibonacciV3() {      
      if (TOTAL_NUMBERS == 0) {
         System.out.print("");
      } else {
         System.out.print(SUM + " ");
         SUM = FIRST_NUM + SECOND_NUM;
         FIRST_NUM = SECOND_NUM;
         SECOND_NUM = SUM;
         TOTAL_NUMBERS--;
         printFibonacciV3();  
      }
   }

}