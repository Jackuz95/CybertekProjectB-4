package MorePractiseLoop;
import java.util.Scanner;
public class EasyPalindromeFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine().toLowerCase().trim();
        int num = word.length();
        for (int num1 = word.length() - 1; num1 >= 0; num1--) {

            if (word.charAt(num1) == word.charAt(word.length() - 1-num1)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("not palindrome");

            }
                }
        //System.out.println("palindrome");

            }
        }


