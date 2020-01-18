package CodingBat;

import java.util.Arrays;

public class String2WordsEnd {
    public static void main(String[] args) {
WordsEnds("abcXY123XYijk", "XY");
    }
    public static void WordsEnds(String str, String word){
        String [] arr = str.split(word);
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            String res = "";
            for(int j=0; j<arr[i].length()-1; j++){
                res +=arr[i];
            }
        }
    }
}
