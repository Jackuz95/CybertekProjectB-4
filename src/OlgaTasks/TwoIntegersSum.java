package OlgaTasks;
import java.util.Scanner;
public class TwoIntegersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1+num2;
        if(sum>50) {
            System.out.println("Your sum is more than 50, it is " + sum);
        } else
            System.out.println("your sum is less than 50, it is " + sum);
    }
}
