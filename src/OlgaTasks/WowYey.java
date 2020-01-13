package OlgaTasks;
import java.util.Scanner;
public class WowYey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine();
        int length = word.length();
        if(length>=5) {
            System.out.println("Wow");
        } else {
            System.out.println("Yey");
        }

    }
}
