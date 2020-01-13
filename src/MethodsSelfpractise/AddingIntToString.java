package MethodsSelfpractise;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class AddingIntToString {
    public static void main(String[] args) {
addingIntToString("9843263",2);
    }
    public static void addingIntToString (String numbers, int num ) {
        String [] arr = numbers.split("");
        int [] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
             arr2 [i]  = Integer.valueOf(arr[i]) + num;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
