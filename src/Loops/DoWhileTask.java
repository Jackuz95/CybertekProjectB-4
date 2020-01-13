package Loops;
import java.util.Random;
import java.util.Scanner;
public class DoWhileTask {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter your number");
        int user_num = input.nextInt();
        int number_ran = random.nextInt(100);
        int count = 0;
        do {
            //System.out.println("enter your number");
            System.out.println("random number is: " + number_ran);
            //user_num = input.nextInt();

            if (user_num>number_ran) {
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }
            count++;
            break;
            //System.out.println("enter your number");
           // user_num = input.nextInt();
           //count++;
        } while (user_num != number_ran);
        System.out.println("number of attepmts: " + count);
    }
}
