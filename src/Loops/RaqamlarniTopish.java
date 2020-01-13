package Loops;

import java.util.Arrays;

public class RaqamlarniTopish {
    public static void main(String[] args) {
        int[] nums = new int[10000];

        for (int i = 0; i < 10000; i++) {
            nums[i] = i+1000;
            if(i==9999){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}