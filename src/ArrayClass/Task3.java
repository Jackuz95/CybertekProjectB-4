package ArrayClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [] number = {45,23,6,-3,66};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(" index of -3 : " +Arrays.binarySearch(number,-3));
    }
}
