package October13;
import java.util.Scanner;
public class Practise1Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the time: ");
        int hoursEntered = input.nextInt();
        if ( hoursEntered >= 8 && hoursEntered<=23 ){
            System.out.println(" open ");
        } else {
            System.out.println( " invalid time: ");
        }

    }
}
