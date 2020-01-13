package StringsSelfPracitse;
import java.util.Scanner;
public class AccountNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number please: ");
        String Account_number_by_user = input.nextLine();
       String first_letter = Account_number_by_user.substring(0,1);
        if(first_letter.equals("2") && Account_number_by_user.length()==7)  {
            System.out.println("Welcome!");
        } else if (first_letter.equals("5") && Account_number_by_user.length()==10) {
            System.out.println("Welcome!");
        }else {
            System.out.println("invalid enter!");
        }
    }
}
