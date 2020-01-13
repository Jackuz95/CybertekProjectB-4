package ArraysSelfPractise;

import java.util.Arrays;

public class BinarySearchEx {
    public static void main(String[] args) {
        int [] nums = {2 ,5, 7, 14} ;

        System.out.println("Index of 2 is: " + Arrays.binarySearch(nums,2));
        System.out.println("Index of 14 is: " + Arrays.binarySearch(nums,14));
        System.out.println("Index of 9 is: " + Arrays.binarySearch(nums,9));
        System.out.println("Index of 16 is: " + Arrays.binarySearch(nums,16));
    }
}
