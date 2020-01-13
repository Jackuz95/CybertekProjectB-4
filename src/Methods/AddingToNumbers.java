package Methods;

import java.util.Arrays;

public class AddingToNumbers {
    public static void main(String[] args) {
       int [] num1 ={10, 9, 5, 4, 3, 7, 4};
       Adding(num1,7);
    }
    public static void Adding(int [] number , int plus) {
          for(int i= 0; i<number.length; i++) {
              number[i] = number[i]+plus;
          }
        System.out.println(Arrays.toString(number)) ;
    }
}
