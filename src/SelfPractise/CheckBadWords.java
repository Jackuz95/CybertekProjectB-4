package SelfPractise;
import java.util.Scanner;
public class CheckBadWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message here:");
        String message = input.nextLine();
        String badWords = "idiot\" , \"bad\" , \"dumb\"";
        String goodWords = "smart";
        //if (message.contains(badWords)) {
            //System.out.println(message.replace(goodWords));
        System.out.println();

    }
}
