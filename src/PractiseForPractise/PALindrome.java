package PractiseForPractise;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class PALindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word:");
        String word = input.nextLine();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = "" + reverse + word.charAt(i);
        }
        if (reverse.equals(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
