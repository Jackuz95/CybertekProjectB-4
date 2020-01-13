package ReplIt.Methods;

import java.util.Arrays;

public class MergeIntegers {
    public static void main(String[] args) {
     int [] arr = {1,2,3};
     int [] arr2 = {4,5,6};

     String [] newArr2 = new String [arr.length+arr2.length+3];
     for(int i=0, j=0; i<newArr2.length; i++){
         newArr2[i] = arr[i]+"" +arr2[j];
j++;
     }

        System.out.println(Arrays.toString(newArr2));
    }
}
