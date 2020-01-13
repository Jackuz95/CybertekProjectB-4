package ReplIt.Methods;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        System.out.println(mergeStrings("java", "selenium"));
    }
    public static String mergeStrings(String one, String two) {

        String [] oneone = one.split("");
        String [] twotwo = two.split("");
        String ready = "";
        int length1 = oneone.length;
        int length2 = twotwo.length;
        if(length1>length2){
            for(int i=0, j=0; i<twotwo.length; i++) {
                ready+= oneone[i] +twotwo[j] ;
                j++;
            }
            return ready+ one.substring(length1-(length1-length2));
        } else if(length2>length1) {
            for(int i =0, j=0; i<oneone.length; i++){
                ready+= oneone[i] + twotwo[j];
                j++;
            }
        }
        return ready + two.substring(length2-(length2-length1));
    }


    }


