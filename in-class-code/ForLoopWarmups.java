public class ForLoopWarmups {
   public static final int START = 20;
   public static final int TOTAL = 10;
   
   public static void main(String[] args) {
      getEvens();
      System.out.println();
      getEvensv2();
      System.out.println();
      getEvensv3();
      System.out.println();
   }
   
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