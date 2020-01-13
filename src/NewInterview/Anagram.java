package NewInterview;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
isAnagram("listen","silent");
    }
    public static void isAnagram(String word1, String word2){
        if(word1.length()!=word2.length()){
            System.out.println("Not anagram");
        }else{
            char [] arr = word1.toCharArray();
            char [] arr2 = word2.toCharArray();
            char temp1 ;
            for(int i =0; i<arr.length; i++){
                for(int j=0; j<arr.length-1; j++){
                    if(arr[j]>arr[j+1]){ // b, a, c
                        temp1 = arr[j];
                         arr[j] = arr[j+1];
                        arr[j+1] = temp1;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            for(int i =0; i<arr2.length; i++){
                for(int j=0; j<arr2.length-1; j++){
                    if(arr2[j]>arr2[j+1]){ // b, a, c
                        temp1 = arr2[j];
                        arr2[j] = arr2[j+1];
                        arr2[j+1] = temp1;
                    }
                }
            }
            System.out.println(Arrays.toString(arr2));
            if(Arrays.equals(arr,arr2)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not anagram");
            }

        }
    }
}
