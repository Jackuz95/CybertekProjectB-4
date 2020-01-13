package Loops;
import java.util.Scanner;
public class LoopsPasword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; ; i++) {
            if (i==3) {
                System.out.println("your profile is locked");
                break;
            }
            System.out.println("Enter your password:");
            String password = input.nextLine();
            if (password.equals("secret478")) {
                System.out.println("welcome to the profile!");
                break;

                }
                }
            }
        }

