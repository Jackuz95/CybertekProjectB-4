package ReplIt;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int num = 1;
        for(int i=1; i<=number; i++) {
            num =num*i;

        }
        System.out.println(num);
    }
}
