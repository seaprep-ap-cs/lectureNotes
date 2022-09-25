public class Figure {
   public static void main(String[] args) {
      firstFigure();
      
      System.out.println();
      
      bottomHalf();
      someLine();
      
      System.out.println("");
      
      topHalf();
      stop();
      bottomHalf();
      
      System.out.println("");
      
      topHalf();
      someLine();    
   }
   
   public static void firstFigure() {
      topHalf();
      bottomHalf();
   }
   
   
   public static void topHalf() {
      System.out.println("  ______");
      System.out.println(" /......\\");
      System.out.println("/........\\");
   }
   
   public static void bottomHalf() {
      System.out.println("\\......../");
      System.out.println(" \\______/");
   }
   
   public static void someLine() {
      System.out.println("+--------+");   
   }
   
   public static void stop() {
      System.out.println("|  STOP  |");
   }
}