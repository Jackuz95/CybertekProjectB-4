package arrays;

import java.util.Arrays;

public class colers {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "green"};
        for (int i = 0; i < colors.length; i++) {
            String colour = colors[i];
            if (colour.length() >= 4) {
                System.out.println(colour);
            }

        }
    }

    }


