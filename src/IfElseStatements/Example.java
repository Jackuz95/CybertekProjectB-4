package IfElseStatements;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " ENter the number");
        int number = input.nextInt();
        if (number % 2 == 0)  {
            System.out.println("even");
        }
        else {
            System.out.println( "odd");
        }
    }
}
