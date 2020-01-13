package ReplIt;
import java.util.*;
public class PowerOfAnother {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num1 = input.nextInt();
        input.nextLine();
        int num2 = input.nextInt();
        input.nextLine();
        int result =1;
        for(int i=1; i<=num2; i++){
            result*=num1;
        }
        System.out.println(result);
    }
}
