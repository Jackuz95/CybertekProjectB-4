package SelfPractise;
import java.util.Scanner;
public class ValueOfOctober {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the month");
        String month_by_user = input.nextLine();
        String month = "october";

        if (month.equals(month_by_user)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
