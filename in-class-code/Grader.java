public class Grader {
   public static void main(String[] args) {
      // pa1=10, pa2=16, pa3-8 = 20, section=20
      int homeworkTotal = 10 + 16 + 6 *20 + 20;
      int homeworkScore = 8 + 14 + 6 * 18 + 20;
      int extraCredit = 3;
      double homework = 100.0 * (homeworkScore + extraCredit / 3.0) / homeworkTotal;
      System.out.println("overall = " + homework);
   }
}