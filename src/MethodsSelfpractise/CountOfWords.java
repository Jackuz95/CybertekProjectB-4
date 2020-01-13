package MethodsSelfpractise;
import java.util.*;
public class CountOfWords {
    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
      CountOfWords(str);
    }
    public static void CountOfWords (String str) {
        int count =0;
        String [] arr = str.trim().split(" ");
//        for(int i=0; i<arr.length; i++) {
//            count++;
//        }
        System.out.println("number of words of your sentence is: " +  arr.length);
    }
}
