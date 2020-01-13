package SelfPracties;

public class ForSezim {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,3};
        System.out.println(findNum(arr, 3));
    }

    public static boolean findNum(int[] arr, int num) {
        if (arr.length <= 1) {
            return true;
        } else {
            for (int i = num; i < arr.length; i += num-1) {
                if (arr[i] == num) {
                    return true;
                } else {

                }
            }
            return false;
        }

    }
}
