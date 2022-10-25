public class StringExamples {
   /*
      Objects contain both state (data) and behavior (methods).
      
         
      In Java, we declare some variable and assign it to an object. 
      
      For example, we can create the following String object:
      
      String s1 = "hello";
      
      The data of String objects are its characters. 
      The methods of String objects are methods such as length, charAt, substring, and toUpperCase. 
      
      The general syntax of calling methods on objects is the following:
      
      <variable name>.<method name>(<expression>, <expression>, ..., <expression)
       
       For example, to get the length of a string, we do the following:
       
       String s1 = "hello";
       int s1Size = s1.length();
       System.out.println("The length of s1 is: " + s1Size);
   */
   
   public static void main(String[] args) {
      String s1 = "hello";
      String s2 = "how are you?";
      
      // length method
      int s1Size = s1.length();
      System.out.println("The size of s1 is: " + s1Size);
      System.out.println("The size of s2 is: " + s2.length());
      
      // Strings are sequences of the characters
      // Think of the characters of a string being placed in slots 
      
      /* 
      Slots
      0 1 2 3 4
      h e l l o
      */
      
      // charAt method
      // The slots are called indexes and we use indexes to get the character of a string. 
      char x = s1.charAt(0);
      System.out.println("The characters at index 0 of s1 is: " + x);
      System.out.println("The characters at index 11 of s2 is: " + s2.charAt(11)); 
      
      // We can use for loops to print out each letter of a string
      for (int i = 0; i < s1.length(); i++) {
         System.out.println(i + ": " + s1.charAt(i));
      }
      
      // substring method
      String substring = s1.substring(0,3);
      System.out.println("Substring of s1 from index 0 up to but not including index 3: " + substring);
      System.out.println("Substring of s2 from index 3 up to but not including index 7: " + s2.substring(3,7));
      
      // this method call will throw a StringIndexOutOfBoundsException because the index 77 does not exist for s2
      // System.out.println("Substring of s2 from index 3 up to but not including index 7: " + s2.substring(3,77));
      
      // Strings are immutable; we cannot change strings
      // If we want to change a string, we simply create new ones
      s1 = s1.toUpperCase();
      System.out.println("s1 has been changed to: " + s1); 
      System.out.println("s2 has been changed to: " + s2.toUpperCase()); 
   }
}