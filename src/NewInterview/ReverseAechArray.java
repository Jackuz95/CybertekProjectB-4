package NewInterview;

import java.util.Arrays;

public class ReverseAechArray {
    public static void main(String[] args) {
        reverseWord("jurabek","java", "ahmed");
    }
    public static void reverseWord(String ... arr){

        String [] arr2 = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            String eachWord = "";
            for(int j=arr[i].length()-1; j>=0; j--){
                eachWord +=arr[i].charAt(j) + "";
            }
            arr2[i] = eachWord;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
