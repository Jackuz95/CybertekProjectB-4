package StringsSelfPracitse;
import java.util.Scanner;
public class Relatives {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter first fulname:");
        String firstFulname  = input.nextLine().trim();
        System.out.println("enter second Fulname");
        String secondFulname = input.nextLine().trim();
        int FirstLast = firstFulname.indexOf(" ");
        int SecondLast = secondFulname.indexOf(" ");
        if (firstFulname.substring(FirstLast).equals(secondFulname.substring(SecondLast))) {
            System.out.println(" Wow you are relatives");
        } else {
            System.out.println(" no similarity");
        }
    }
}
