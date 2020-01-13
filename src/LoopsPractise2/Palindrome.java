package LoopsPractise2;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word:");
        String word_user = input.nextLine();
        String reverse = "";
        int a = word_user.length()-1;
        char letter = word_user.charAt(0);

        for(int i = 0; i<word_user.length(); i++) {
            letter = word_user.charAt(a);
            reverse = reverse + "" + letter;
            a--;
        }

            if(word_user.equals(reverse)) {
                System.out.println("palindrome");
            }else {
                System.out.println(" not palindrome");
            }
        }
    }

