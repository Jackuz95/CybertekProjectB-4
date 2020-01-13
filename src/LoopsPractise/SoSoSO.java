package LoopsPractise;
import java.util.Scanner;
public class SoSoSO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine().trim().toUpperCase();
        for ( int i = 0 ; i<= 15;  i++)  {

            System.out.println("Welcome "  + name );
                    }
        for (int i = 0; i<name.length(); i++) {
            System.out.println(name.charAt(i) + " for index " + i);
        }
    }
}
