package October9;
import java.util.Scanner;
public class Teachersexp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " enter boolean");
        boolean word = input.nextBoolean();
        System.out.println( "your word is after: " + !word);
    }
}
