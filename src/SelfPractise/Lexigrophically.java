package SelfPractise;
import java.util.Scanner;
public class Lexigrophically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String one = input.nextLine();
        System.out.println("Enter your second word:");
        String two = input.nextLine();
        // char final = one.compareTo(two);
        System.out.println(one.compareTo(two));
    }
}
