package SelfPractise;
import java.util.Scanner;
public class SwitchingWord {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String sentence = "Cybertek is located in Des Plaines";
    // if (sentence.contains(" ").  sentence)
        System.out.println("Enter your word:");
        String word = input.nextLine();
        //if ( word.contains(sentence))
        int find = sentence.indexOf(word);

        System.out.println(find);
    }
}
