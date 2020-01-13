package NewLoopsDoWhileWhile;
import java.util.Scanner;
public class TaskMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number:");
        int number = input.nextInt();
        for (int i = 1; i<=2; i++)  {
            while (i==2) {
                System.out.println("enter number");
                input.nextInt();
            }
            for(int j = 1; j<=10; j++) {
                System.out.println(" " + j*number);
            }
            System.out.println();
        }
    }
}
