package ReplIt;

import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3,4};
        int n = 5;
        int [] arr1 = new int[5];
        arr1[arr1.length-1] = n;
        for(int i=0; i<arr1.length; i++){
            arr1[i] = arr[i];
        }
       // arr1[arr1.length-1] = n;
        System.out.println(Arrays.toString(arr1));
    }
}
