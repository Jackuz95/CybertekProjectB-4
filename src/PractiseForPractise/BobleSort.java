package PractiseForPractise;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BobleSort {
    public static void main(String[] args) { // 1,5,6,8,0,9,3; // 0,1,3,5,6,8,9;
        System.out.println(Arrays.toString(sortBob(1,5,0,9,4,8,2,-2)));
    }
    public static int [] sortBob(int ... arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
               // int temp = arr[j];
                if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
        return arr;
      }


}
