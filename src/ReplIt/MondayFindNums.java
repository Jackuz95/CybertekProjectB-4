package ReplIt;

import java.util.Arrays;

public class MondayFindNums {
    public static void main(String[] args) {
        int [] arr = {2,2,3,4,4,5,5};
        nonDub(arr);
    }


   public static void AddToArray( int [] arr, int n){
       int [] array = new int[arr.length+1];
       for(int i=0; i<arr.length; i++){
           array[i]= arr[i];
       }
       array[array.length-1] = n;
       System.out.println(Arrays.toString(array));
    }

    public static  void nonDub(int [] arr) {
        //String str = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j =0; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
