package ArraysSelfPractise;

import java.util.Arrays;

public class indexFinding {
    public static void main(String[] args) {
        int [] numbers = {45,23,6,-3,66};
        Arrays.sort(numbers);
        System.out.println("index of -3 is: " + Arrays.binarySearch(numbers,23));

    }
}
