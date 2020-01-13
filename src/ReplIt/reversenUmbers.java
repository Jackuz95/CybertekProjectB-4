package ReplIt;
import java.util.*;
public class reversenUmbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int middleNum = nums.length/2;
        for(int i= 0; i<middleNum; i++) {
           // int temp = nums[i];
            nums[i] = nums[nums.length-i];
           // nums[nums.length-1-i]= temp;

        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}


