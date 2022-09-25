public class ForLoops {
   public static void main(String[] args) {
      // control structure: statement that controls other statements
      // for loop
      
      /*
         for (init; test; update) {
            body
         } 
      */
      
      for (int i = 1; i <= 4; i=i+2) {
        System.out.println(i + " squared = " + (i * i)); 
      } 
      
      //System.out.println("1 squared = 1");
      //System.out.println("2 squared = 4");
      //System.out.println("3 squared = 9");
      //System.out.println("4 squared = 16");
      
      System.out.println();
      
      System.out.print("T-minus ");
      for (int i = 10; i >= 1; i--) {
         System.out.print(i + ", ");
         // do something
      }
      System.out.print("blastoff!");
      System.out.println();
      System.out.println();
      
      // Task: Using "for loops", display fives lines where each line consists of 10 starts. 
      // For example:  
      
      /*
            **********
            **********
            **********
            **********
            **********
      */
      
      
      // nested loops
      for (int i = 1; i <= 5; i++) {
         System.out.println("**********");
         /*  
         for (int j = 1; j <= 10; j++) {
            System.out.print("*");
         }
         System.out.println();
         */
      }
      System.out.println();


      // variations of nested loops
      /*
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
      */
      

      // variations of nested loops
      /*
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(i);
         }
         System.out.println();
      }
      System.out.println();
      */

      // variations of nested loops
      /*
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
      */
      
      // while loops
      // indefinite loop
      // equivalent to 

      System.out.println("That's all she wrote.");
   }
   
   public static void forLoopVariations() {
      int n = 42;

      for (int i = 1; i <= n; i++) {
         // do something
      }
      
      for (int i = 0; i < n; i++) {
         // do something
      }

      for (int i = n; i >= 1; i--) {
         // do something
      }

   }
}