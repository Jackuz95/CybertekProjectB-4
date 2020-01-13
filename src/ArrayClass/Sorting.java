package ArrayClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String [] arr = {"e" , "a", "z"};
        System.out.println(arr[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
}
