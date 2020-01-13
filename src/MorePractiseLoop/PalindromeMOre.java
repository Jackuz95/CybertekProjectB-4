package MorePractiseLoop;
import java.util.Scanner;
public class PalindromeMOre {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your word:");
        String word = input.nextLine().toLowerCase().trim();
        String rev = "";
        for(int i =word.length()-1; i>=0; i--){
            rev = rev+word.charAt(i) + "";

        }System.out.println(rev);
        if (rev.equals(word)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
