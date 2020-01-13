package ArraysSelfPractise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BiggestSmallest {
    public static void main(String[] args) {
        int [] arr = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(arr);
        System.out.println("Biggest number: " + arr[0] + " Smallest number: " + arr[arr.length-1]);
    }
}
