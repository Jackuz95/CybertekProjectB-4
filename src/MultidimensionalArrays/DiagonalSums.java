package MultidimensionalArrays;

import java.util.Arrays;

public class DiagonalSums {
    public static void main(String[] args) {
        int [][] nums = RandomArrays.createRandom2DArray(4,4);
        System.out.println(Arrays.deepToString(nums));
        printArray(nums);
        System.out.println(differenceSums(nums));
    }

    public static void printArray(int [][] a){
        for(int [] arr: a) {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int differenceSums (int [][] arr) {
        //int [][] arr = new int [num1][num2];
        int sum1 =0;
        int sum2 = 0;

        for(int i=0, j=arr.length-1;  i<arr.length;  i++, j--) {
            sum1 += arr[i][i];
            sum2 += arr[j][i];
            }return Math.abs(sum1-sum2);
        }

    }



