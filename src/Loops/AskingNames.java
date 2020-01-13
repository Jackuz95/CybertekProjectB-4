package Loops;
import java.util.Scanner;
public class AskingNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i=0; i<5; i+=1) {
            System.out.println("enter your name" + (i+1));
            String name = input.nextLine();
            System.out.println(name);

        }
    }
}
