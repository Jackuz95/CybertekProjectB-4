package MorePractiseLoop;
import java.util.Scanner;
public class Sum5050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
       int num2 = input.nextInt();
        int sum = 0;
        double ave =num2;

        for(int i =num1; i<=num2; i++){
            sum = sum +i;
            ave = sum/num2-num1;
        }
        System.out.println(sum);
        System.out.println(ave);
    }
}
