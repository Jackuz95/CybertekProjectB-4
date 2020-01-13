package ReplIt;
import java.util.Scanner;
public class PaswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = input.nextLine();
        boolean valid = password.length()>=65 && password.length()<=90;
        if(password.length()>=8) {
           if(valid){

            }else{
               System.out.println("password should contain minimum 1 lower letter");
           }

        } else {
            System.out.println("password should contain minimum 8 characters");
        }









    }
}
