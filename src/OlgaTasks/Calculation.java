package OlgaTasks;
import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two number:");
        int num1 =input.nextInt();
        int num2 = input.nextInt();
        int sum = num1+num2;
        int subs = num1-num2;
        int division = num1/num2;
        int multiple = num1*num2;
        System.out.println("sum of numbers: " + sum + " substriction of numbers: " + subs
        + " division ov numbers: " + division + " multiple of numbers: " +multiple);
    }
}
