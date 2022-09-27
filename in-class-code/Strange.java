

public class Strange {
 public static void first() {
 System.out.println("Inside first method");
 }

 public static void second() {
 System.out.println("Inside second method");
 first();
 }

 public static void third() {
 System.out.println("Inside third method");
 first();
 second();
 }

 public static void main(String[] args) {
    //System.out.println("// \ //// \\ ////// \\\");
    //System.out.println("/ \\ // \\\\ /// \\\\\\");
    System.out.println(1/0);
}
}