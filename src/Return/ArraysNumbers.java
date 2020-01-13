package Return;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraysNumbers {
    public static void main(String[] args) {
        int [] nums = {4, 5, 2, 5, 4};
        //numbersArray5(1,2,5,1,5,1,2,5,4,5,3,12,15,18);
        numbersArray5(5,1,4,2,4,8);
    }

    public static void numbersArray5 (int ... nums) {
        int sum = 0;
        for(int i =0; i<nums.length; i++) {
            sum = sum + nums[i];
            if (nums[i] == 5 || nums[i] % 10 == 5) {
sum = sum-nums[i];

            }
        }System.out.println(sum);
    }
    public static void numbersArrays5 ( int [] nums,int num) {
        int sum1 = 0;
        for(int i =0; i<nums.length; i++) {
            sum1 = sum1+ nums[i];
            if(nums[i]==num || nums [i]%10 ==num){
                sum1 = sum1-nums[i]; }
        }
        System.out.println(sum1);
    }
}
