package SwitchStatemants;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
               switch (num)  {
                   case 1:
                       System.out.println( "Sunday");
                       break;
                   case 2:
                       System.out.println("monday");
                       break;
                   case 3:
                       System.out.println("tuesday");
                       break;
                   case 4:
                       System.out.println("wednesday");
                       break;
                   case 5:
                       System.out.println("thursday");
                       break;
                   case 6:
                       System.out.println("friday");
                       break;
                   case 7:
                       System.out.println("Saturday");
                       break;
                   default:
                       System.out.println("invalid number");
               }
    }
}
