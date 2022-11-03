public class Stars1 {
   public static void main(String[] args) {
      lineOf13();
      lineOf7();
      lineOf35();
      box10x5();
      box5x6();
      
      // information flow
      // i.e. How do we pass information to a method?
    
      // Methods behave the same as above but uses parameters and reduces redundancy (i.e. copied code)
      lines(13);
      lines(7);
      lines(35);
      drawBox(10, 5);
      drawBox(5, 6);
      
      // examples of overloading
      drawBox();
      drawBox(3);
   }
   
   public static void drawBox(int width) {
      // draw a box with a given width (e.g. 3) but fixed height of 6
      drawBox(width, 6);
   }
   
   public static void drawBox() {
      // draw default box of fixed width 3 and height 3
      drawBox(3, 3);
   }
   
   public static void drawBox(int width, int height) {
      // draw a box of stars given a width of 'width' and height of 'height'
      lines(width);
      
      for (int line = 1; line <= height - 2; line++) {
         System.out.print("*");
         for (int space = 1; space <= width - 2; space++) {
            System.out.print(" ");
         }
         System.out.println("*");
      }
      
      lines(width);
      System.out.println();
   }

   
   public static void lineOf13() {
      for (int i = 1; i <= 13; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   
   public static void lineOf7() {
      for (int i = 1; i <= 7; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   
   public static void lineOf35() {
      for (int i = 1; i <= 35; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   
    public static void box10x5() {
      for (int i = 1; i <= 10; i++) {
            System.out.print("*");
         }
         System.out.println();
      
      for (int line = 1; line <= 3; line++) {
         System.out.print("*");
         for (int space = 1; space <= 8; space++) {
            System.out.print(" ");
         }
         System.out.println("*");
      }
      
      for (int i = 1; i <= 10; i++) {
            System.out.print("*");
         }
      System.out.println();
   }

   public static void box5x6(){
      for (int i = 1; i <= 5; i++) {
         System.out.print("*");
      }
      System.out.println();
      
      for (int line = 1; line <= 4; line++) {
         System.out.print("*");
         for (int space = 1; space <= 3; space++) {
            System.out.print(" ");
         }
         System.out.println("*");
      }
      
      for (int i = 1; i <= 5; i++) {
         System.out.print("*");
      }
      System.out.println();
  }
   
   public static void lines(int count) {
      for (int i = 1; i <= count; i++) {
         System.out.print("*");
      }
      System.out.println();
   }  
}