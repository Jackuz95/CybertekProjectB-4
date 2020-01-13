package StringsSelfPracitse;
import java.util.Scanner;
public class LexigociacallyFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = input.nextLine().trim();
        System.out.println("enter your second word:");
        String word2 = input.nextLine().trim();
        //String compared = word1.compareTo(word2);
        System.out.println(word1.compareTo(word2));
    }
}
