package LoopsPractise;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        long x = input.nextInt();

       long first = 0;
       long second = 1;
long third = 1;
      for(int i=0; i<=x ; i++) {
        long sumOfTwo = second + third;
        first = 0;
        second = 1;
        third = 1;
        second=third;
        third=sumOfTwo;
//          first = second;
//          second = sumOfTwo;
            System.out.print(" " + sumOfTwo );
        }
    }
}




