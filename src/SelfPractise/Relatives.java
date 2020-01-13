package SelfPractise;
import java.util.Scanner;
public class Relatives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your full name for first person:");
        String firstName1 = input.nextLine();
        String firstLast1 = input.nextLine();

        System.out.println(" Enter your full name for second person:");
        String secondName = input.nextLine();
        String secondLast2 = input.nextLine();

        if (firstLast1.equals(secondLast2)) {
            System.out.println("Are you guys relatives! WOW!");
        } else {
            System.out.println("NO Similarity");
        }
    }
}
