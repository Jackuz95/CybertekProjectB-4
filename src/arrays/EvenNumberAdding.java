package arrays;

import java.util.Arrays;

public class EvenNumberAdding {
    public static void main(String[] args) {
        int [] numbers = {1,2,-3,4,-34,55,78,9,33,10,12,14,15};
       int count = 0;
        for(int i=0; i<numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
              count++;
            }
        }
        int [] evens = new int [count];
        for(int i=0, j=0; i<numbers.length; i++) {
           if(numbers[i] %2==0) {
               evens [j] = numbers[i];
               j++;
           }
        }
        System.out.println(Arrays.toString(evens));

    }
}
