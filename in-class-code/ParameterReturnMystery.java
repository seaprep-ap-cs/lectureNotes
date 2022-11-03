public class ParameterReturnMystery {
    public static void main(String[] args) {
        int num = 3;
        System.out.println("Num value before mystery call: " + num);
        num = mystery(num);
        System.out.println("Num value after mystery call: " + num);
    }

	public static int mystery(int x) {
        return x+1;
    }
}

