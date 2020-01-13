package SwitchStatemants;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        switch(word) {
            case "a":
                System.out.println("word is vowel");
                 break;
            case "e":
                System.out.println("word is vowel");
break;
            case"i":
                System.out.println("word is vowel");

            case "u":
                System.out.println("word is vowel");

            case"o":
                System.out.println("word is vowel");

            default:
                System.out.println("NO vowels");

        }
    }
}
