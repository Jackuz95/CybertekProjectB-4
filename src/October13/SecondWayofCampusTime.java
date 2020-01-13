package October13;
import java.util.Scanner;
public class SecondWayofCampusTime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the time: ");
        int hoursEntered = input.nextInt();
        if ( hoursEntered >= 8 && hoursEntered<=23 ){
            System.out.println(" open ");
        } else {
            if (hoursEntered < 0 || hoursEntered >= 24) {
                System.out.println("Invalid time");
            } else {
                System.out.println("Campus is closed");
            }
        }
    }
}
