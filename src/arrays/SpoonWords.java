package arrays;

import java.util.Arrays;

public class SpoonWords {
    public static void main(String[] args) {
        String [] words = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "dish washer"};
        //String  newWords = "";
        for(int i = 0; i<words.length; i++) {
            if(words[i].contains(" ")) {
              // newWords = newWords + words[i];
                System.out.println(words[i]);
            }
        }

    }
}
