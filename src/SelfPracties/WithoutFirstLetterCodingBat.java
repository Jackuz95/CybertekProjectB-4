package SelfPracties;
import java.util.Scanner;
public class WithoutFirstLetterCodingBat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first word:");
        String word1 = input.nextLine();
        System.out.println("Secong word:");
        String word2 = input.nextLine();
        String Fix1 = word1.substring(1);
        String Fix2 = word2.substring(1);
        System.out.println(Fix1+Fix2);
    }
}
