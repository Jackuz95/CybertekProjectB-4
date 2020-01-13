package Methods;
import java.util.*;
public class NUmberOfWords {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter your sentence");
//        String coming_BY_user = input.nextLine();
numbersOfSen("The world is full of happiness!");
    }
    public static void numbersOfSen(String sentence) {
        String [] arr = sentence.trim().split(" ");
                    System.out.println("number of words: " + arr.length);
//        String [] arr1 = .trim().split(" ");
//        System.out.println("number of words: " + arr.length);

    }
}
