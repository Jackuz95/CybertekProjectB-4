package Loops;
import java.util.Scanner;
public class AtoZLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter here:");
        char letter_by_user = input.nextLine().toUpperCase().trim().charAt(0);
                 if ( letter_by_user>65 && letter_by_user<90) {
                     while (letter_by_user != 'Z'+1) {
                         System.out.println(letter_by_user++);
                     }
                 } else {
                     System.out.println("Invalid letter");


        }
    }
}
