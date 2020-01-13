package CodingBat;
import java.util.Scanner;
public class PasswordChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "test";
        String password = "test123";
        System.out.println("Enter your username:");
        String username_by_user = input.nextLine();
        if (username.equals(username_by_user)) {
            System.out.println("enter your password");

            String pasword_by_user = input.nextLine();
            if (password.equals(pasword_by_user)) {
                System.out.println("welcome!");
            } else {
                System.out.println("invalid pasword");
            }
        } else {
            System.out.println("invalid username");
        }
    }
}