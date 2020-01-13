package SelfPracties;
import java.util.Scanner;
public class CoinsRepLIT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your price:");
        int price  = input.nextInt();
        if (price>=25 && price<=100) {
            int change = 100-price;
            int numQuarters = change/25;
            int remainderOfQuar = change%25;
            int NumOfDimes = remainderOfQuar/10;
            int remainderOfDimes = remainderOfQuar%10;
            int numberOfNickel = remainderOfDimes/5;
            System.out.println( " your change has Number of Qaurters: " + numQuarters + " number of dimes: " +
                    NumOfDimes + " number of nickels: " + numberOfNickel);
        } else {
            System.out.println("invalid enter.");
        }
    }
}

