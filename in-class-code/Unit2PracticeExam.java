public class Unit2PracticeExam {
   public static void main(String[] args) {
      printSequence();
      printFibonacciWhileLoop();
      printSequenceV2();
   }
   
   public static void printSequenceV2() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 9; j >= 0; j--) {
            for (int k = 1; k <=5; k++) {
               System.out.print(j);
            }
         }
         System.out.println();
      }
   }
   
   public static void printSequence() {
      for (int i = 1; i <= 3; i++) {
         for (int j = 0; j <= 9; j++) {
            for (int k = 1; k <=3; k++) {
               System.out.print(j);
            }
         }
         System.out.println();
      }
   }
   
   public static void printFibonacciWhileLoop() {
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

}