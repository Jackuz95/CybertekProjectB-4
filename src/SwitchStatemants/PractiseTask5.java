package SwitchStatemants;
import java.util.Scanner;
public class PractiseTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your first number ");
        double num1 = input.nextDouble();
        System.out.println("enter your second number ");
        double num2 = input.nextDouble();
        System.out.println(" choose the operations: + - / * ");
        input.nextLine();
        String operator = input.nextLine();

        switch (operator) {
            case "+":
                System.out.println(" num1+num2=" + (num1+num2));
                break;
            case "-":
                System.out.println( " num1-num2=" + (num1-num2));
                break;
            case "*":
                System.out.println( " num1*num2=" + (num1*num2));
                break;
            case "/":
                System.out.println( " num1/num2=" + (num1/num2));
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
