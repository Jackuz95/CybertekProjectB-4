package MethodsSelfpractise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class IntPlusInt {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        plusNUm(arr,2);
    }
    public static void plusNUm (int [] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
