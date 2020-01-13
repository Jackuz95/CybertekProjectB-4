package CodingBat;
import java.util. Scanner;
public class StringPractises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word_by_user = input.nextLine();
        int length1 = word_by_user.length();
        char first_from_user = word_by_user.charAt(length1-1);
        char second_from_user = word_by_user.charAt(length1-2);
        System.out.println(first_from_user + " " + first_from_user + " " + first_from_user+ " " + second_from_user +
                second_from_user + second_from_user);

    }
}
