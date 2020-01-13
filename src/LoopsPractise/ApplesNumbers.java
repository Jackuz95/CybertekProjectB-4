package LoopsPractise;
import java.util.Scanner;
public class ApplesNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int apples = 1;
        System.out.println("enter numbers");
        int number = input.nextInt();
        do {
            System.out.println("Apples we are eating: " + number);
            number--;
//            if(apples==15) {
//                break;
//            }
        } while (apples <=number);
        System.out.println(apples + "ated");
        System.out.println("no more aplles");
    }
}