package ArraysSelfPractise;

import java.util.Arrays;

public class BIggestnum {
    public static void main(String[] args) {
        int [] numbers = { 31,20, 25, 30 ,3, 48, 26, 12 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int smal = numbers[0];
        int big = numbers[numbers.length-1];
        System.out.println("small: " + smal + " big " +big);
    }
}
