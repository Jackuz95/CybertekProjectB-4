package SwitchStatemants;
import java.util.Scanner;
public class TAskForSw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Please enter your grade:");
        char  grade = input.nextLine().charAt(0);
        switch (grade)  {
            case 'a' :
            case 'A':
                System.out.println( " excellent!");
                break;
            case 'b' :
            case 'B':
                System.out.println( " great!");
                break;
            case 'c':
            case 'C':
                System.out.println("okay");
                break;
            case 'd':
            case 'D':
                System.out.println("you can do better");
                break;
            case 'f':
            case 'F':
                System.out.println("Something needs to change");
                break;
            default:
                System.out.println( " Not a valid grade letter");
        }

    }
}
