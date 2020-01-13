package SelfPracties;
import java.util.Scanner;
public class WithoutEndCodingBat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = in.nextLine();


        int num = word.length()-1;
        System.out.println(word.substring(1,num));
    }
}
