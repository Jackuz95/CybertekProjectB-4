package ArraysSelfPractise;

import java.util.Arrays;

public class readAndStore {
    public static void main(String[] args) {
        int [] nums = new int[4];
        nums[0] = 5;
        nums [1] = 7;
        nums [2] = 10;
        nums[3] = nums[0] + nums[2];
        System.out.println(Arrays.toString(nums));
    }
}
