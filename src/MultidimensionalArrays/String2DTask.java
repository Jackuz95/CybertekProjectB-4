package MultidimensionalArrays;

import java.util.Arrays;

public class String2DTask {
    public static void main(String[] args) {
        String [][] str = new String [3][];
        String [] name1 = {"James", "John", "Jasurbek", "Bexruz"};
        String [] name2 = {"Taha", "Ahmed"};
        String [] name3 = {"Mohammed", "Jurabek" , "Azamat"};
   str[0] = name1;
   str[1]= name2;
   str[2]= name3;
        System.out.println(Arrays.deepToString(str));
    }
}
