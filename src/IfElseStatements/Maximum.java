package IfElseStatements;
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 integers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
       // we can use temporary int also
        // int max = 0;  reassigning;
        if (num1>num2 && num1>num3) {
            // max = num1
            System.out.println(" max number is: " + num1);
        }
        else if (num2>num1 && num2>num3) {
            // max=num2;
            System.out.println("max number is: " + num2);
        }
        else if (num3>num1 && num3>num2) {
            // max= num3
            System.out.println( "max number is: " + num3);
        }
        else if (num1==num2 && num1==num3){
            System.out.println("all numbers are equal ");
        }
    }
}