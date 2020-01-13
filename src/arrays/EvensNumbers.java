package arrays;

import java.util.Arrays;

public class EvensNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 8, 3, 5, 6, 7,8};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int [count];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[j] = numbers[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evens));
    }
}
