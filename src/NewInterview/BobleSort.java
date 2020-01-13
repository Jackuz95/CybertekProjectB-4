package NewInterview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BobleSort {
    public static void main(String[] args) {
        sort(0,8,5,9,1,-5,4);
    }
    public static void sort(int ... arr){
        int temp = arr[0] ;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
