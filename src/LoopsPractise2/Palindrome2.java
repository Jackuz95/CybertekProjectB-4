package LoopsPractise2;
import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word:");
        String word = input.nextLine();
        String back_word = "";
        for(int i = word.length()-1; i>=0; i--) {
            back_word = back_word+word.charAt(i);
        }
        System.out.println(word);
        System.out.println(back_word);
        if(word.equals(back_word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
