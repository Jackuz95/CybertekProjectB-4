package OlgaTasks;

import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = input.nextLine();
        System.out.println("Enter your last name:");
        String lastName = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("your name is: " + name + " |your last name: " + lastName + " |your age is: " + age);
    }
}
