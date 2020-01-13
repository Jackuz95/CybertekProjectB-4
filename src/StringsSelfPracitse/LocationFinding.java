package StringsSelfPracitse;
import java.util.Scanner;
public class LocationFinding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Given_sentence = "Cybertek is located in Des Plaines";
        System.out.println(" ready sentence is: " + Given_sentence);
        System.out.println("enter your word:");
        String From_User = input.nextLine().trim();
        //int location =
                if (Given_sentence.contains(From_User)) {
                    System.out.println( Given_sentence.indexOf(From_User));
                } else{
                    System.out.println("Invalid enter");
                }
    }
}
