public class ShiningPart2  {
    public static void main(String[] args) {
        print256();
    }

    public static void printOne() {
        System.out.println("All work and no play makes Jack a dull boy");
    }

    public static void printTwo() {
        printOne();
        printOne();
    }

    public static void printFour() {
        printTwo();
        printTwo();
    }

    public static void printEight() {
        printFour();
        printFour();
    }

    public static void print16() {
        printEight();
        printEight();
    }

    public static void print32() {
        print16();
        print16();
    }

    public static void print64() {
        print32();
        print32();
    }

    public static void print128() {
        print32();
        print32();
    }

    public static void print256() {
        print128();
        print128();
    }
}
