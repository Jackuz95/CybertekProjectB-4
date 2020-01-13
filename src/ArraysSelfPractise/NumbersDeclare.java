package ArraysSelfPractise;

import java.util.Arrays;

public class NumbersDeclare {
    public static void main(String[] args) {
        double [] numbers = {45.99,23.5,11.50,33.33,99.99};

        System.out.println(Arrays.toString(numbers));
        numbers[4] = 112.89;
        System.out.println(Arrays.toString(numbers));
    }
}
