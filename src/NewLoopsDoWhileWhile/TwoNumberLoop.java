package NewLoopsDoWhileWhile;
import java.util.Scanner;
public class TwoNumberLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = input.nextInt();
        System.out.println("Enter your second number");
        int number2 = input.nextInt();
        int sum = 0;
        for(int i = number1 ; i<=number2 ; i++) {
            sum = sum+i;

        }System.out.println("sumofValue= " + number1 + " " + number2 + " " +sum );
    }
}
