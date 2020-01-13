package SelfPracties;
import java.util.Scanner;
public class BillsRepIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numberOfCall;
        double bill = 0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();
        bill = 200.0;
        if (numberOfCall<100) {
            System.out.println("Your bill is $" + bill);
        } if (numberOfCall>100 && numberOfCall<150) {
            System.out.println(bill + ((numberOfCall-100)*0.6));
        } if (numberOfCall>=150 && numberOfCall<200) {
            System.out.println(bill + (50*0.6) + ((numberOfCall-150)*0.5));
        } if (numberOfCall>=200)  {
            System.out.println("Your bill is $" + (bill + (50*0.6) + (50*0.5) + (numberOfCall-200)*0.4));
        }
    }
}