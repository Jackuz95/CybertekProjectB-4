package OlgaTasks;
import java.util.Scanner;
public class UpperAndLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine();
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
    }
}
