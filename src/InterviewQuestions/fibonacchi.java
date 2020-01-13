package InterviewQuestions;

import java.util.Arrays;

public class fibonacchi {
    public static void main(String[] args) {
        System.out.println(Fibonacci(10));

    }

    public static String Fibonacci(int range) {
        int[] arr = new int[range];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return Arrays.toString(arr).replace("[","").replace("]","").replace(",", "");


    }
}