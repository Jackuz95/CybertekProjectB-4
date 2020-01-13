package SelfPracties;
import java.util.Scanner;
public class Practise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str = input.nextLine();
        if (str.length()<2)  {
            System.out.println(str);
        } else if (str.length()>=2) {
            System.out.println(str.substring(0,2));
        }
    }
}
