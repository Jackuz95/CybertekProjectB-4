package Loops;
import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int start = 0;
        while (start<=num) {
            System.out.println(start++);
        }
    }
}
