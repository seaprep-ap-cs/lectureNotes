import java.util.Scanner;

public class ScannerPractice {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      nameGame(console);
   }
   
   public static void nameGame(Scanner input) {
      System.out.print("What is your name? " );
      String name = input.nextLine();
      
      // We assume the user will give us their first and last name separarted by exactly one space
      int firstSpace = name.indexOf(" ");
      String first = name.substring(0, firstSpace);
      String last = name.substring(firstSpace + 1);
      
      song(first);
      song(last); 
   }
   
   public static void song(String name) {
		String suffix = name.substring(1);
		System.out.println(name + ", " + name + ", bo-B" + suffix);
		System.out.println("Banana-fana fo-F" + suffix);
		System.out.println("Fee-fi-mo-M" + suffix);
		System.out.println(name.toUpperCase() + "!");
	}
}