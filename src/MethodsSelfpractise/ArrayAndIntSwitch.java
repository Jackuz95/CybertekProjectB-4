package MethodsSelfpractise;

import java.util.Arrays;

public class ArrayAndIntSwitch {
    public static void main(String[] args) {
//        int [] numbers = {1,-8,9,-7,5,3,-6};
//        SwitchNegative(numbers,5);
        int [] arr = {1,2,3,4};
        Element(arr);
    }
    public static void SwitchNegative (int [] numbers, int number) {
        for(int i =0; i<numbers.length; i++) {
            if(numbers[i]<0) {
                numbers[i] = number;

            }
        }System.out.println(Arrays.toString(numbers));

    }
    public static void Element ( int [] arr) {
        String build = "[" ;
        for(int num: arr) {
            build =   build + num +", "  ;

        }build = build.trim().substring(0,(build.length()-2))+ "]" ;
        System.out.println( build );
    }
}
