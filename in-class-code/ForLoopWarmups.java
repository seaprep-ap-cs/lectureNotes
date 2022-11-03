public class ForLoopWarmups {
   public static void main(String[] args) {
      printName("Peter", 5);
   }
   
   public static void printName(String name, int count) {
      for (int q = 1; q <= count; q++) {
         System.out.print(name);
      }
   }
   
   public static void warmupForLoop() {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 1; j++) {
              System.out.println("Hello");
         }
	      System.out.println("Goodbye");
      }
   }
   
   public static final int START = 20;
   public static final int TOTAL = 10;
   
   public static void getEvens() {
      // start must be even
      for (int i = START; i >= 2; i=i-2) {
         System.out.println(i);
      }
   }
   
   public static void getEvensv2() {
      for (int i = TOTAL; i > 0; i--) {
         System.out.println(2 * i);
      }
   }

   public static void getEvensv3() {
      for (int i = TOTAL; i >= 1; i--) {
         System.out.println(2 * i);
      }
   }
   
    
}