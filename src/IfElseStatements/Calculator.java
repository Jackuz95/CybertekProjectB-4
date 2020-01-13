package IfElseStatements;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        //String cal = -, + , * , / ;
        input.nextLine();
        System.out.println("Please choose operator below: + , -, *, / ");
        String choose = input.nextLine();
        if (choose.equals("-")) {
            System.out.println("Result of 2 numbers " + (num1 - num2));
        } else if (choose.equals("+")) {
            System.out.println(" Result of 2 numbers = " + (num1 + num2));
        } else if (choose.equals("*")){
            System.out.println(" Result of 2 numbers = " + (num1 * num2));
        }
        else if (choose.equals( "/")){
            System.out.println(" Result of 2 numbers = " + (num1 / num2));
        }
    }
}
