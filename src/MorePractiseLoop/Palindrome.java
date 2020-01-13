package MorePractiseLoop;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine().trim().toLowerCase();
        String back = "";
        for(int i =word.length()-1; i>=0; i--) {
            back = back + word.charAt(i);
        }
            if(word.equals(back)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome"); 
            }
        }
    }

