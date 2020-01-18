package CodingBat;

import java.util.Arrays;

public class PlusOutString2 {
    public static void main(String[] args) {
        plusOut("--++ab","++");
    }
    public static void plusOut(String str, String word){
        String [] arr = str.split(word);
        System.out.println(Arrays.toString(arr));

        String result2 ="";
        for(int i=0; i<arr.length; i++){
            String result ="";
            for(int j=0; j<arr[i].length(); j++){
                result +="+";
            }
            result2 +=result + word;
        }
        System.out.println(result2);
    }
}
