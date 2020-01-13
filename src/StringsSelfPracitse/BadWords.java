package StringsSelfPracitse;
import java.util.Scanner;
public class BadWords {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("enter your message:");
              //  String message_by_user = input.nextLine().toLowerCase().trim();
        String message = input.nextLine();

        String checked = message;

        checked = checked.replace("idiot","smart");
        checked = checked.replace("dumb","smart");
        checked = checked.replace("stupid","smart");

        if(message.equalsIgnoreCase(checked)) {
            System.out.println("Your message was not changed");
            System.out.println(message);
        } else {
            System.out.println("Your bad words were removed");
            System.out.println(checked);
        }
        }
    }

