package InterviewQuestions;

public class FindMissingNum {
    public static void main(String[] args) {
        int [] nums = {0,1,2,4,6,7,8,10}; // find a missing number
        findNumber(nums);
    }

    public static void findNumber(int [] nums) {
        for(int i = 0; i<10; i++) {
            boolean inside = false;
            for(int j = 0; j<nums.length; j++) {
                if(nums[j] == i) {
                    inside = true;
                }
            }
            if(inside==false) {
                System.out.println(i+" ");
            }
        }
    }

}
