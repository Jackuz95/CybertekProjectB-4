package ReplIt;
import java.util.*;
public class TeamActivity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //----------------------------------------------------------

        //TASK 1
        System.out.println("Enter word:");
        String str2 = input.nextLine();

        //your code here
        //----------------------------------------------------------
        String word = "";
        if (str2.length() >= 3 && str2.length() <= 100) {
            int mid = str2.length() / 2;
            str2 = str2.toLowerCase();
            if (str2.length() % 2 == 1) {

                word = str2.substring(0, mid) + str2.substring(mid + mid + 1).toUpperCase() + str2.substring(mid + 1);
                System.out.println(word);
            } else {
                word = str2.substring(0, mid - 1) + str2.substring(mid - 1, mid + 1).toUpperCase() + str2.substring(mid + 1);
                System.out.println(word);
            }


        } else {
            System.out.println("Invalid enter");
        }

    }
}
