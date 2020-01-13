package LoopsPractise;
import java.util.Scanner;
public class Nameenter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=1; i<6 ; i++) {
            System.out.println("What is your name? " + i);
            String name = input.nextLine();
            System.out.println(name);
        }
    }
}
