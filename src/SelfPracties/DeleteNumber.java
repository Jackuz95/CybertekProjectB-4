package SelfPracties;

import java.util.Arrays;

public class DeleteNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int n  = 5;
        int [] newArr = new int [arr.length-1];
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                continue;

            }
            newArr[i]= arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
