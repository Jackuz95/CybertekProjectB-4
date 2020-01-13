package ArraysSelfPractise;

import java.util.Arrays;

public class NegativeSwitch0 {
    public static void main(String[] args) {
        int [] numbers = {4,-2,5,-3,-20,30,-8,-7,0};
        //int [] numbersWithoutNegative = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<0){
                numbers[i]=0;

            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
