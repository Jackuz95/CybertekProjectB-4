package ArraysSelfPractise;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String [] words = new String [4];
        System.out.println(Arrays.toString(words));

        words [0] = "Jurabek";
        words [1] = "Ahmed";
        words [2] = "Taha";
        words [3] = "baxa";
        for(int i =0; i<words.length; i++)
        System.out.println(words[i].charAt(0));
        System.out.println(Arrays.toString(words));

    }
}
