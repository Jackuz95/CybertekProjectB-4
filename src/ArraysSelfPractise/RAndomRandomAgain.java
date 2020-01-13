package ArraysSelfPractise;

import java.util.Arrays;
import java.util.Random;

public class RAndomRandomAgain {
    public static void main(String[] args) {
        Random input = new Random();
        int[] nums = new int[50];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(nums));
    }
}