package StringsSelfPracitse;
import java.util.Scanner;
public class FindingOctober {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ready_month = "october" ;
     boolean month = true;

        System.out.println("Enter your month:");
        String month_by_user = input.nextLine().toLowerCase();
        if(month_by_user.equals(ready_month)) {

            System.out.println("Your good!");
        } else {
            System.out.println("invalid enter");
        }
    }
}
