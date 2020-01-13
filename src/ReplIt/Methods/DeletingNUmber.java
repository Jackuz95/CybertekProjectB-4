package ReplIt.Methods;

import java.util.Arrays;

public class DeletingNUmber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(deleteR(arr,2)));
    }
    public static int[] deleteR(int[] arr,int element) {
        int [] arrNew = new int [arr.length];
     for(int i=0; i<arr.length; i++) {
         arrNew[i] =arr[i];
         if(arrNew[i]==element){
             continue;

         }
     }
     return arrNew;
    }
}
