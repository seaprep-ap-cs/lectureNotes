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
      
      // T-minus 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, blastoff!
      System.out.println();
      
      System.out.print("T-minus ");
      for (int i = 10; i >= 1; i--) {
         System.out.print(i + ", ");
         // do something
      }
      
      System.out.print("blastoff!");
      System.out.println();
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