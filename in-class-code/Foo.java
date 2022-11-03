import java.lang.Math;

public class MathClassExample {
  public static void main(String[] args){
	int x = Math.abs(-2);
	double y = Math.sqrt(9.0);
	int z = (int) Math.sqrt(16);		//why need an int cast?
	System.out.println(x + y);
	System.out.println(Math.pow(5, 2));
	x = Math.min(y, z);
	System.out.println(x);
	System.out.println(y);
	System.out.println(Math.sqrt(Math.max(25, y + z)));
   }
}