public class ScratchPad {
   public static void main(String[] args) {
      // Math object method examples 
      int result = Math.abs(-42);
      System.out.println(result);
      
      // String object method examples
      String s1 = "Good Morning APCS";
      int foo = 42;
      
      System.out.println(s1);
      System.out.println("The length of s1 is: " + s1.length());
      System.out.println(s1.toUpperCase());
      System.out.println(s1.toLowerCase());
      
      System.out.print("Changing ping to....");
      System.out.println("ping".replace("i", "o")); 
      
      // You can also chain methods
      String s3 = "seaprep panther".substring(0,3).toUpperCase();
      System.out.println(s3); 
          
   }
}