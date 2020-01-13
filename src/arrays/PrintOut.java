package arrays;

import java.util.Arrays;

public class PrintOut {
    public static void main(String[] args) {
        String [] names = new String[3];
        names[2] = "Jurabek";
        names[0] = "Taha";
        names[1] = "Ahmed";
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }
}
