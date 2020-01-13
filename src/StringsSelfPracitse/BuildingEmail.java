package StringsSelfPracitse;
import java.util.Scanner;
public class BuildingEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Given_word = "@cybertek.com";
        System.out.println(" enter your first word");
        String word1 = input.nextLine().trim().toLowerCase();
        System.out.println("enter your second word:");
        String word2 = input.nextLine().trim().toLowerCase();
  String first_word_4letter = word1.substring(0,4);
  String second_word_3end_letter = word2.substring(word2.length()-3);
        if (word1.length()>=6 && word2.length()>=6) {
            System.out.println(first_word_4letter + second_word_3end_letter+Given_word);
        } else {
            System.out.println("invalid data");
        }
    }
}
