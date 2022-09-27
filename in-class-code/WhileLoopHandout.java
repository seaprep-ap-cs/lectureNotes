public class WhileLoopHandout {
   public static void main(String[] args) {
      // while1();
      // System.out.println();
      // while2();
      // System.out.println();
      // while3();
      // System.out.println();
      // while4();
      // System.out.println();
      // while5();
      // System.out.println();
      // System.out.println();
      // q6();
      // System.out.println();
      q7();
      // System.out.println();
      q7v2();
      // System.out.println();
      q7v3();
   }

   public static void while1() {
      var i = 0;
      while (i < 3) {
         System.out.println("hi");
         i++;
      }
      System.out.println("bye");
   }

   public static void while2() {
      var i = 3;
      while (i < 6) {
         System.out.println(i);
         i += 1;
      }
   }

   public static void while3() {
      var i = 0;
      while (i < 3) {
         System.out.println(i);
         i++;
      }
   }

   public static void while4() {
      int current = 1;
      while (current <= 7) {
         System.out.println(current);
         current += 2;
      }

      System.out.println();

      for (int i = 1; i <= 7; i += 2) {
         System.out.println(i);
      }
   }

   public static void while5() {
      int num = 0;
      while (num < 5) {
         System.out.print("*");
         num++;
      }

      System.out.println();
      System.out.println();

      for (int i = 1; i <= 5; i++) {
         System.out.print("*");
      }
   }

   public static void q6() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 5; j++) {
            System.out.print((i * j) + " ");
         }
         System.out.println();
      }
   }

   public static void q7() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 5; j >= 6 - i; j--) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
   }

   public static void q7Almost() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 5; j >= i; j--) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
   }

   public static void q7v3() {
      for (int i = 5; i > 0; i--) {
         for (int j = 5; j >= i; j--) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
   }

   public static void q7v2() {
      int k = 5;
      for (int i = 1; i <= 5; i++) {
         for (int j = 5; j >= k; j--) {
            System.out.print(j);
         }
         System.out.println();
         k--;
      }
      System.out.println();
   }

   // The following methods will result in Runtime errors because they are
   // infinite loops Run at your own RISK You are warned.
   public static void q7InifiniteLoopv1() {
      for (int i = 5; i >= 1; i--) {
         for (int j = 5; j <= i; j--) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
   }

   public static void q7InfiniteLoopv2() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 5; j <= 5; j--) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
   }

   public static void q7InfiniteLoopv3() {
      for (int i = 5; i >= 1; i--) {
         for (int j = 5; j <= i; j--) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
   }
}