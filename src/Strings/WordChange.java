package Strings;
import java.util.Scanner;
public class WordChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your  sentence:");
        String sentence = input.nextLine();
        int space = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, space);
        String remain = sentence.substring(space+1);
        System.out.println(remain + " " + firstWord);


    }
}
