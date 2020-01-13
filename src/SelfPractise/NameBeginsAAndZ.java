package SelfPractise;
import java.util.Scanner;
public class NameBeginsAAndZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your name please:");
        String name = input.nextLine();
        if (name.startsWith("A") || name.startsWith("Z")) {
            System.out.println("your name is good");
                    } else {
            System.out.println("Sorry not a cool name");
        }
    }
}
