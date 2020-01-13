package SelfPracties;
import java.util.Scanner;
public class CodingBatStringExtraEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word:");
        String word = input.nextLine();
        //System.out.println(word.substring(word.length()-2 , word.length()+1));
        System.out.println(word.length()-2);
    }
}
