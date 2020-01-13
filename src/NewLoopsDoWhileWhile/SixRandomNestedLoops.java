package NewLoopsDoWhileWhile;

import java.util.Random;
import java.util.Scanner;
public class SixRandomNestedLoops {
    public static void main(String[] args) {
        Random random = new Random();
        //Scanner input = new Scanner(System.in);
        String number = random.nextInt(1000000) + "";
        System.out.println(number);
        for (int i = 0; number.length() < 6; i++) {
            if (number.equals(number.charAt(number.length()))) {
                System.out.println(number);
            }
        }
    }
}