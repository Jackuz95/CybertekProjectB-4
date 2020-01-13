package IfElseStatements;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your username: ");
        String username = "Jurabek";
        String pasword = "jurabek";
        String username1 = input.nextLine();
        if (username.equals(username1)) {
            System.out.println(" please enter password");
            String pasword1 = input.nextLine();
            if (pasword.equals(pasword1)) {
                System.out.println(" login successfully ");
            }

         else {
            System.out.println("invalid password");
        }
    } else {
            System.out.println(" try again username  ");

        }
    }
}
