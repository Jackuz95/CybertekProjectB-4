package October9;
import java.util.Scanner;
public class EigthPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " Enter your number: ");
        int num = input.nextInt();
        int quarter= num/25;
        int rem1 = num%25;
        int dimens = rem1/10;
        int nickels= dimens%5;
        int penny = nickels;
        System.out.println( " quarters= " + quarter + " dimes= " + dimens+ " nuckels= " + nickels + " pennies= " + penny);
    }
}
