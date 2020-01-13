package exceptions;
import java.util.*;
public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        do {
            try {
                System.out.println("Enter num 1");
                int n1 = input.nextInt();
                input.nextLine();
                System.out.println("enter num 2");
                int n2 = input.nextInt();
                input.nextLine();
                int res = n1 / n2;
                System.out.println(res);
                x=10;

            } catch (Exception e) {
                System.out.println("You cant do that!");
            }
        } while (x == 1);
    }
}
