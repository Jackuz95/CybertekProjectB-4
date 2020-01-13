package arrays;

public class BiggestNUmberfind {
    public static void main(String[] args) {
        int[] numbers = {3, 600,30, 14, 6,1000, 50, 20,78,700,1200};
        int max = numbers[0];
        boolean check;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];


            }
        }
        System.out.println(max);
    }
}