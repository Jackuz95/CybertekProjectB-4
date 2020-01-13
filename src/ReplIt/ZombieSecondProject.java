package ReplIt;
import java.util.*;
public class ZombieSecondProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int sum = 0;
        int count = 0;


        System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));
        do {
            sum = 0;
            for (int i = 0; i < inhabitants.length; i++) {


                if (inhabitants[i] == 0) {
                    inhabitants[i] = inhabitants[i] / 2;
                    continue;
                }
                if (inhabitants[inhabitants.length-1] == 0) {
                    inhabitants[6] = inhabitants[6] / 2;
                   // continue;
                }
                if (i < (inhabitants.length - 1) && i >0) {
                    inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    inhabitants[i - 1] = inhabitants[i - 1] / 2;
continue;
                }
                if(inhabitants[i] !=0) {
                    inhabitants[i+1]= 0;
                    inhabitants[i-1] =0;
                    continue;
                }

                sum += inhabitants[i];

                System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));
            }
        }
        while (sum != 0) ;

        System.out.println("---- EXTINCT ----");

    }
}