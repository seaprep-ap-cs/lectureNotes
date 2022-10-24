import java.lang.Math;

public class MathClassExample {
   /*
      Flow of Information
      1) Parameters in methods
      2) Overloading methods (i.e. methods with the same name but different number of parameters and/or types of parameters
      3) Methods can also return values
      
      Example of method header:
      
      // this method returns a double which is the power of 'base' raised to the 'exponent' 
      
      public static double power(double base, double exponent) {} 
      
      
      Two Types of Data:
      1. primitives
         -int
         -double
         -float
         -char
         -boolean
      
      2. objects 
         -String
         -Math
         -Scanner
         -<Custom types>
         
         
      An object is a programming entity that contains state (data) and behavior (methods).
      
      A class is a category or type of object. 
      A class is like a blueprint of what an object looks like. 
            
      
      To use the methods of other classes, we call it in the following way:
            
      <class name>.<element>
      
      Example: 
      
      Math.pow(5,2)
      
   */
  
  
  public static void main(String[] args){
   	int x = Math.abs(-2);
      int y = (int) Math.sqrt(9.0);
   	int z = (int) Math.sqrt(16);		//why need an int cast?
   // 	
//       System.out.println(x + y);
//    	System.out.println(Math.pow(5, 2));
   	
      x = Math.min(y, z);
   	// System.out.println(x);
//    	System.out.println(y);
//    	System.out.println(Math.sqrt(Math.max(25, y + z)));
//       
//       System.out.println(Math.E);
//       System.out.println(Math.PI);      
      
      double randX = Math.random();
      System.out.println(randX);
      
      int randomInteger = getRandomInt(10);
      System.out.println(randomInteger);
      
      int result = getRandomInt(200, 400);
      System.out.println(result); 
   }
   
   public static int getRandomInt(int max) {
      // generates a number between 0 and max
      int randomNumber = (int) (Math.random() * max);
      return randomNumber;
   }
   
   public static int getRandomInt(int min, int max) {
      int range = max - min + 1;
      return (int) (Math.random() * range) + min;
   }
}