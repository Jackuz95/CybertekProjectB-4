package Loops;
import java.util.Scanner;
public class HiHelloBye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i>-1 ; i++) {
            String word = input.nextLine();
            if (word.equals("hi")) {
                System.out.println("hello");

            } else {
                System.out.println("bye");
                break;
            }
        }

    }
}
