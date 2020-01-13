package ArraysSelfPractise;

import java.util.Arrays;

public class FindBiggestWord {
    public static void main(String[] args) {
        String str = "Write a program that creates a group of given size thisisabigword";
        String [] Arr = str.trim().split(" ");
      //  System.out.println(Arrays.toString(Arr));
        String max = "";
        int biggestLength = 0;
        for(String bigWord: Arr) {
            if(bigWord.length()>biggestLength) {
                max = bigWord;
                biggestLength =bigWord.length();
            }

            }
        System.out.println("The biggest word is: " +max);

        }

    }

