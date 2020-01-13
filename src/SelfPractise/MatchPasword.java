package SelfPractise;
import java.util.Scanner;
public class MatchPasword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = "test";
        String test123 = "test123";
        System.out.print("Enter your username please: ");
        String username = input.nextLine();


        if (username.equals(test)) {
            System.out.print("Enter your password: ");

            String password = input.nextLine();
            if (password.equals(test123)) {
                System.out.println("welcome");
            } else {
                System.out.println("invalid pasword");
            }
            } else{
                System.out.println("invalid username");
            }
        }
    }
