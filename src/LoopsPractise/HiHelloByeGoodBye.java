package LoopsPractise;
import java.util.Scanner;
public class HiHelloByeGoodBye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        for ( ; ;) {
            String word  = input.nextLine().toLowerCase().trim();
            if(word.equals("hi")) {
                System.out.println("Hello!");
            } else {
                System.out.println("Good bye"); break;
            }
        }
     }
}
