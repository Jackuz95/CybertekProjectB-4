package Strings;
import java.util.Scanner;
public class CapName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your name:");
        String name = input.nextLine();

        String firstLetter = name.substring(0,1);

    }
}
