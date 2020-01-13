package ArraysSelfPractise;

import java.util.Arrays;

public class NegativeSearch {
    public static void main(String[] args) {
        int [] num = {45,23,6,-3,2,66};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.binarySearch(num,-3));
    }
}
