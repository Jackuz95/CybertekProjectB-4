package Loops;
import java.util.Scanner;
public class WhileTAsk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1500;
        int count = 0;
        int amount = 0;
        System.out.println("Please enter your transction:");
        int money_used = input.nextInt();
        while(balance-money_used<=balance) {
            count++;


            System.out.println("enter next transaction:");
            amount =input.nextInt();
            balance=balance-money_used;
        }
        System.out.println("you are broke");
    }
}
