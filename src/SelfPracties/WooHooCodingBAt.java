package SelfPracties;
import java.util.Scanner;
public class WooHooCodingBAt {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        if (word.length()%2==0 && word.length()==6) {
            System.out.println(word.substring(0,3));
        } else {
            System.out.println("NOt enough");
        }
    }
}
