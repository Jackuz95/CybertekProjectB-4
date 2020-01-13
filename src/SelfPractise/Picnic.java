package SelfPractise;
import java.util.Scanner;
public class Picnic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "We will have a picnic when the weather gets nicer";
        System.out.println(sentence);
        System.out.println(" What word or letter you wanna change");
        String word = input.nextLine();
        System.out.println("So, WHAT do want to change that to");
        String changingOne = input.nextLine();
         String newOne = sentence.replace(word,changingOne);
        System.out.println(newOne);
    }
}
