package ArrayClass;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int [] num = {2,5,7,14} ;
        System.out.println("Index of 2 is: " + Arrays.binarySearch(num,2));
        System.out.println("Index of 2 is: " + Arrays.binarySearch(num,14));
        System.out.println("Index of 2 is: " + Arrays.binarySearch(num,9));
    }
}
