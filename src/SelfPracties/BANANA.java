package SelfPracties;
import java.time.temporal.IsoFields;
import java.util.Scanner;
public class BANANA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str2 = input.nextLine();
        boolean length = str2.length() >= 3 && str2.length() < 100;
        boolean odd = str2.length() % 2 == 1;
        boolean even = str2.length()%2==0;
        if (length) {

            if (odd) {
                int middle = str2.length() / 2;

                //System.out.println( middle);
                String firstHalf = str2.substring(0, middle);
                String secondHalf = str2.substring(middle + 1);
                String midletters = str2.substring(middle, middle + 1).toUpperCase();
                System.out.println(firstHalf + midletters + secondHalf);

            } else if (even) {
                int middle = str2.length() / 2;
                int secondmiddle = middle + 1;
                String midletter = str2.substring(middle - 1, secondmiddle - 1).toUpperCase();
                String midletter2 = str2.substring(middle, secondmiddle).toUpperCase();

                String firsthalf = str2.substring(0, middle - 1);
                String secondhalf = str2.substring(middle + 1);
                System.out.println(firsthalf + midletter + midletter2 + secondhalf);
            }
        }
    }
}