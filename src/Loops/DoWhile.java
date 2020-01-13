package Loops;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num  =1;
        do {
            System.out.println(num);
            num++;
        } while (num<10);
    }
}
