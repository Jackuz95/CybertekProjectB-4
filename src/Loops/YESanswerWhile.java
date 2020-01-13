package Loops;
import java.util.Scanner;
public class YESanswerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("would you like to add 1?");
        String word = input.nextLine();
        while (word.equals("y") || word.equals("yes")) {
            System.out.println("would you like to add 1?");
            count++;
            word = input.nextLine();
            if (word.equals("n") || word.equals("no")) {
                break;

            }

        }
        System.out.println("your number is: " + count);
    }
}