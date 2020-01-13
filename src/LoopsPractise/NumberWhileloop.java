package LoopsPractise;
import java.util.Scanner;
public class NumberWhileloop {
    public static void main(String[] args) {
        int number ,count;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number: ");
        number= input.nextInt();
        count =1;
        while (count<=number) {
            System.out.print(count + ", ");
            count = count*3;
        }
        System.out.println("end");
    }
}
