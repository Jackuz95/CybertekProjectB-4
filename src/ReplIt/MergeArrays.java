package ReplIt;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int number = 4;
        int [] newArr = new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = number;

        System.out.println(Arrays.toString(newArr));
    }
}
