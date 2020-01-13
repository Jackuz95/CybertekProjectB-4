package arrays;

import java.util.Arrays;

public class DoubleNumbers {
    public static void main(String[] args) {
        Double [] number = {45.99, 23.5, 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(number));
       number[number.length-1] = 112.89;
        System.out.println(Arrays.toString(number));

    }
}
