package LoopsPractise;
import java.util.Scanner;
public class PaswordAsking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("enter your password:");
        String Given_password = "Secret478";
       // int attempt =3;
        for (int  i = 0; ; i++) {
            if(i == 3)  {
                System.out.println("your profile is locked, please call us to activate again!"); break;
            }

            System.out.println("enter your password:");
            String password = input.nextLine();
            if(password.equals(Given_password)) {
                System.out.println("welcome to the profile!"); break;
//            } else {
//                System.out.println(" Sorry card is blocked try after 5 hours");
            }
        }
    }
}
