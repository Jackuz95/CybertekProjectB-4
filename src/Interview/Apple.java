package Interview;
import java.util.*;
public class Apple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word please");
        String word = input.nextLine();
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            if (!str.contains("" + word.charAt(i))) {
                str += word.charAt(i);
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }

                System.out.print("" + word.charAt(i) + ":" + count + " ");
            }
        }
    }
}
