package MultidimensionalArrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] arr2 = new int[arr.length];
        for(int i = arr.length-1, j=0; i>=0; i--){
            arr2[j] = arr[i];
           j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
