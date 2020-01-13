package NewLoopsDoWhileWhile;
import java.util.Scanner;
public class ValidNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        String number = input.nextLine();
        String num = number.charAt(4) + "";
        boolean valid =( number.length()==10 || (number.length()==12 && (number.startsWith("(") && num.equals(")"))));

        if (valid) {
            System.out.println("valid number");
        } else {
            System.out.println("Invalid number");

        }
    }
}
