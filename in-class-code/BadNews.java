public class BadNews {
    public static int MAX_ODD = 21;

    public static void writeOdds() {
        for (int count = 1; count <= (MAX_ODD - 2); count+=2) {
            System.out.print(count + " ");
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        writeOdds();
        MAX_ODD = 11;
        writeOdds();
    }
    
    
}