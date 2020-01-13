package ReplIt;

import java.util.Arrays;

public class MondayTask2 {
    public static void main(String[] args)
    {
        System.out.println(isAnagram("silent", "listena"));
    }

    public static boolean isAnagram(String word1, String word2) {
        boolean result = false;
        word1 = word1.toLowerCase().trim().replace(" ", "");
        word2 = word2.toLowerCase().trim().replace(" ", "");
        String[] arr1 = word1.split("");
        String[] arr2 = word2.split("");
        int count1 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length != arr2.length) {
            return result;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].equals(arr2[i])) {
                    count1++;
                }
            }
            if (count1 == arr1.length) {
                result = true;
            }
            return result;


        }

    }
}

