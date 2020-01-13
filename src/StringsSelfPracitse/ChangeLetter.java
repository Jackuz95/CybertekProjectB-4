package StringsSelfPracitse;
import java.util.Scanner;
public class ChangeLetter {
    public static void main(String[] jurabek) {
        Scanner input = new Scanner(System.in);
        String Given_Sentence = "We will have a picnic when the weather gets nicer";
        System.out.println(Given_Sentence);
        System.out.println("What letter you want to change? ");
        String word1 = input.nextLine();
        System.out.println("What letter you want to change to?");
         String word2 = input.nextLine();
            System.out.println(Given_Sentence.replace(word1, word2));

    }
}
