package ArraysSelfPractise;
import java.util.*;
public class loopPricechange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many elemants you want?");
        int num1 = input.nextInt();
        System.out.println("enter your prices:");
        double [] prices= new double[num1];
         for(int i=0; i<num1; i++) {
            prices [i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(prices));
         prices[prices.length-1] = 112.89;
        System.out.println(Arrays.toString(prices));
        prices[3] = 100;
        System.out.println(Arrays.toString(prices));
    }
}
