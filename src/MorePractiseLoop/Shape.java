package MorePractiseLoop;
import java.util.Scanner;
public class Shape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i= 0; i<number ; i++) {
            for(int j= 0; j<number; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
