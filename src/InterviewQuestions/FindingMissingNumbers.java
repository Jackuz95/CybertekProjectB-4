package InterviewQuestions;

import java.util.Arrays;

public class FindingMissingNumbers {
    public static void main(String[] args) {
        findNum(1,5,6,9,10,3,25,20,15);
    }
    public static void findNum(int ... arr){
        Arrays.sort(arr);
        int k=arr[0];

        for(int i=0; i<arr.length; i++, k++){
            while (arr[i] != k){
                System.out.println(k);
                k++;
            }
        }
    }
}
