package October9;
import java.util.Scanner;
public class SeventhPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your number here: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println( "Adding= " + (num1+num2) + " Sabtraction = " + (num1-num2) + " multiple = " + (num1*num2) + " division = " + (num1/num2) + " remiender = " + (num1%num2));
    }
}
