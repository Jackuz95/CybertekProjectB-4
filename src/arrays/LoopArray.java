package arrays;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names));
        names[0] = "James";
        names [1] = "Tom";
        names[2] = "Taha";
        for(int i=0; i<names.length; i++) {
            System.out.println("names " + (i+1)+ " " + names[i].charAt(0));
        }
        //System.out.println();
    }
}
