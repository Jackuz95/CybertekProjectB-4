package October9;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("name: ");
        String name = input.nextLine();
        System.out.println( "gender: ");
        char gender = input.nextLine().charAt(0);
        System.out.println( " phone number: ");
        long phoneNumber = input.nextLong();
        System.out.println("gpa: ");
        double gpa = input.nextDouble();
    }

}
