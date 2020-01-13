package OlgaTasks;
import java.util.Scanner;
public class FirstwordContainsSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two words: ");
        String word1 = input.nextLine().toLowerCase().trim();
        String word2 = input.nextLine().toLowerCase().trim();
        boolean valid =true;
        if(word1.contains(word2) || word2.contains(word1) ) {
            System.out.println("Wow");
        } else {
            System.out.println("Yey");
        }
        if(word1.equals("apple") || word1.equals("pineapple") || word1.equals("board") || word1.equals("keyboard")) {
            System.out.println(valid);
        } else if(word2.equals("apple") || word2.equals("pineapple") || word2.equals("board") || word2.equals("keyboard")) {
            System.out.println(valid);
        } else if(word1.equals("later") || word1.equals("letter") || word2.equals("later") || word2.equals("letter")) {
            System.out.println(!valid);
        }
    }
}
