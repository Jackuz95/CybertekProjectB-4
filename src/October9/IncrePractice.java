package October9;
import java.util.Scanner;
public class IncrePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " first number:");
        int firstNumber = input.nextInt();
        System.out.println( "second number: ");
        int secondNumber = input.nextInt();
        //int secondNumber;
        // = firstNumber++ *3;
        System.out.println(secondNumber);
        System.out.println(" incremented: ");
        int incremented = 3*(secondNumber*firstNumber++);
        System.out.println(incremented);
        //System.out.println();

    }
}
