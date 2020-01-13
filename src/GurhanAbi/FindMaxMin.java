package GurhanAbi;

import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        int [] grades = {15, 25, 33, 35, 34, 24, 78, 95, 98,1,500};
       //Arrays.sort(grades , 2,6);
//        System.out.println("Min grade: " + grades[0]);
//        System.out.println("Max grade: " + grades[grades.length-1]);
       // System.out.println(Arrays.toString(grades));
        int max = grades[0];
        int min = grades[0];
        for(int i=0; i<grades.length; i++){
            if(grades[i]<min){
                min = grades[i];
            }
        }
        System.out.println("Min grade: " + min);
        for(int i=0; i<grades.length; i++){
            if(grades[i]>max){
                max = grades[i];
            }
        }
        System.out.println("Max grade: " + max);

    }
}
