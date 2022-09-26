public class ForLoops {
   public static void main(String[] args) {
      // control structure: statement that controls other statements
      // for loop
      
      /*
         for (init; test; update) {
            body
         } 
      */
      
      for (int i = 1; i <= 4; i++) {
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
      }
      System.out.print("blastoff!");
      System.out.println();
      System.out.println();
      
      // nested loops
      // Task: Using "for loops", display fives lines where each line consists of 10 starts. 
      // For example:  
      
      /*
            ********************
            ********************
            ********************
            ********************
            ********************
      */
      
     for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 10; j++) {
         System.out.print("*");
      }
      System.out.println();
     } 
     System.out.println();
  
      // while loops
      /* 
         while (<test>) {
            <do something>
         } 
         <do something>
      */
        
      
      /*
      The while loop below is equivalent (i.e. does the same thing) as the following for loop:
      
         for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
         }
         System.out.println();
        
     */    
      int k = 1;
      while (k <= 5) {
         System.out.println("hello");
         k++;
      }
      System.out.println();

      // variations of nested loops
      // What if j <= i ?
      /*
         *
         **
         ***
         ****
         *****
      */
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
      
      

      // variations of nested loops
      // What if j <= i AND we print out i ?
      /*
         1
         22
         333
         4444
         55555
      */
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(i);
         }
         System.out.println();
      }
      System.out.println();
      

      // variations of nested loops
      // What if j <= i AND we print out j ?
      /*
         1
         12
         123
         1234
         12345
      */
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
      

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