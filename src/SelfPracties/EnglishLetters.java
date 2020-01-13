package SelfPracties;
import java.util.Scanner;
public class EnglishLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = input.nextLine();
        System.out.println("Enter your second word: ");
        String word2 = input.nextLine();
        int sum = word1.length()+word2.length();
        String result = word1.substring(0,1).toUpperCase();
        String result2 = word2.substring(0,1).toUpperCase();
        System.out.println(sum);
        System.out.println(result + word1.substring(1) +  " " + result2 + word2.substring(1) );
    }
}
