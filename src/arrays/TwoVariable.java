package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TwoVariable {
    public static void main(String[] args) {
        int [] numbers1 =  { 3,2,6,43,7,20};
        int [] numbers2 =  {2,7,-10,10,-5,2,5};
          int [] sum  = new int [numbers1.length];
           for (int i = 0 ; i<numbers1.length ; i++) {
                sum[i] = numbers1[i] + numbers2[i];
           }
        System.out.println(Arrays.toString(sum));
    }
}
