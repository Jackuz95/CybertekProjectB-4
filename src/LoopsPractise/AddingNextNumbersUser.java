package LoopsPractise;
import java.util.Scanner;
public class AddingNextNumbersUser {
    public static void main(String[] args) {
        int total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int nextnum = input.nextInt();
         total=0;
         while(nextnum>0) {
             System.out.println("enter next number:");
             total = total+nextnum;
             nextnum =input.nextInt();


         }
        System.out.println("unexpected enter");
        System.out.println("Entered all number:" + total);
    }
}
