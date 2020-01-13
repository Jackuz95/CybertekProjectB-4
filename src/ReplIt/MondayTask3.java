package ReplIt;

public class MondayTask3 {
    public static void main(String[] args) {
        int [] arr = {1,4,8,4,64,150};
        System.out.println(secondLargestNum(arr));
    }


    public static int secondLargestNum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }


        } return max;
    }
}
