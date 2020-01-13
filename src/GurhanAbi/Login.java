package GurhanAbi;
import java.util.*;
public class Login {
    public static void main(String[] args) {
        login();
    }


    public static void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("You have clicked to login button!");
        System.out.println("Please enter account name:");
        String str1 = input.nextLine();
        System.out.println("Enter your password:");
        String str2 = input.nextLine();
        if(!str1.equalsIgnoreCase("johnjava") || !str2.equals("123456")){
            System.out.println("Either your password or your acciuntId is not correct");
        } else {
            System.out.println("Login successfully");
        }
    }

}
