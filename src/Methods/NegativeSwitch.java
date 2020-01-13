package Methods;

import java.util.Arrays;

public class NegativeSwitch {
    public static void main(String[] args) {
        int[] arr2 = {-1, 3, 25,-8, 12, -4, -2, 5};
        SwitchNegative(arr2, 5);
    }
     public static void SwitchNegative(int [] arr, int change) {
        for(int i =0; i<arr.length; i++) {
            if(arr[i]<0) {
                arr[i]= change;


            }
        }
         System.out.println(Arrays.toString(arr)) ;
     }
}
