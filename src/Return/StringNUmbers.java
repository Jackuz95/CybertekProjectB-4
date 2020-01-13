package Return;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class StringNUmbers {
    public static void main(String[] args) {
        System.out.println(differenceFromString("45987"));
    }


    public static int differenceFromString(String number) {

        String [] arr = number.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return Integer.valueOf(arr[arr.length-1]) - Integer.valueOf(arr[0]);
    }
}


//    public static void addNumToString(String number, int add) {
//        // 9 8 4 3 2 6 3, 1
//        String [] nums = number.split("");
//
//        int [] intArray = new int[nums.length];
//
//        for(int i=0; i < nums.length; i++) {
//            intArray[i] = Integer.valueOf(nums[i]) + add;
//        }
//
//        System.out.println(Arrays.toString(intArray));
