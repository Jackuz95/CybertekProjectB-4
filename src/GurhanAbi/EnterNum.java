package GurhanAbi;
import java.util.*;
public class EnterNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = input.nextInt();
        input.nextLine();
        int [] arr = new int[num];
        int [] firstHalf = new int[num/2];
        int [] secondHalf = new int[num/2];
        for(int i = 1; i<num; i++){
            System.out.println(i);
            arr[i] = i;
        }
        System.out.println("The string value of your array is: " + Arrays.toString(arr));
        for(int i = 1 ; i<num/2; i++){
            firstHalf[i] = i;
        }
       System.out.println("The 1st value of your array is: " + Arrays.toString(firstHalf));
        for(int i = num/2 ; i<num; i++){
            secondHalf[i] = i;
        }
        System.out.println("The 1st value of your array is: " + Arrays.toString(secondHalf));
    }
}
