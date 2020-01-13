package utilities;
import java.util.ArrayList;
import java.util.*;
public class RandomStirngs {
    public static ArrayList<String> randomArrayList(int elements) {

        ArrayList <String> words = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i < elements; i++) {
            int size = random.nextInt(10) + 1;
            String temp = "";
            for(int j= 0; j < size; j++) {
                int characters = random.nextInt(23) + 65;
                temp += (char)characters;
            }

            words.add(temp.toLowerCase());

        }

        return words;

    }
}
