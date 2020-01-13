package MultidimensionalArrays;
import ArraysSelfPractise.RAndomRandomAgain;

import java.util.*;
public class RandomArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createRandom2DArray(4,5)));

    }
     public static int [][] createRandom2DArray (int num1, int num2) {
        int [][] arr  = new int [num1][num2];
         Random random = new Random();
         for(int i= 0; i<arr.length; i++) {
             for(int j=0; j<arr[i].length;j++){
                 arr[i][j] = random.nextInt(10);
             }
         }
         return arr;


     }

}
