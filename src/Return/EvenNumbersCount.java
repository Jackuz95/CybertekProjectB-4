package Return;

public class EvenNumbersCount {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 25, 68, 87, 98, 14, 15};
        System.out.println(EvenNumbers(arr));
    }
    public static int EvenNumbers (int [] nums) {
        int count = 0;
        for (int num: nums) {
            if (num % 2 == 0) {
                count++;

            }


        } return count;
    }

    }
