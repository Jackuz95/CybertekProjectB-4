package MultidimensionalArrays;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        //int result = 1;
        int[][] arr = new int[10][10];
        int [][] arr2 = new int[10][10];
      //  System.out.println(arr.length);
        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr[i].length; j++) {

                arr2[i-1][j-1] = i*j;
            }

        }
        System.out.println(Arrays.deepToString(arr2));
    }
}
