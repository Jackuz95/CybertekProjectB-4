package ArrayClass;

import java.util.Arrays;

public class BIggestAndSmallest {
    public static void main(String[] args) {
        int [] numbers = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(numbers);
        System.out.println("The smallest number is: " + numbers[0]);
        System.out.println("The biggest number is: " + numbers[7]);

    }
}
