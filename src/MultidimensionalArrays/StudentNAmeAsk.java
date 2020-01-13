package MultidimensionalArrays;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class StudentNAmeAsk {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many groups you want:");
        int groupNumber = input.nextInt();
        System.out.println("How many people you want in each group:");
        int peoplenumber = input.nextInt();
        String [][] arr = new String [groupNumber][peoplenumber];
        //String [] [] namesReady = String[][]
        String [][] names = new String [0][0];
        for(int i = 0, j=0; i<groupNumber;  i++){
            System.out.println("enter name:");
            names[i][j] = input.nextLine();

                j++;
            }System.out.println(Arrays.deepToString(names));
        }
}


