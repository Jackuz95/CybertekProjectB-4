package ReplIt;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;


public class MondayTask1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractNum("076jgfdd1@!#$1gg8k7tr$#@8")));
    }
    public static int[] extractNum(String str){
        String [] arr = str.split("");
        String temp = "";
        for(int i=0; i<arr.length; i++){
            char number = arr[i].charAt(0);
            if(number>=48 && number<=57 ){

                temp+= number+"";

            }
        }
        String [] temp2 = temp.split("");
        int [] result = new int[temp2.length];
        for(int j =0; j<temp2.length; j++){

            result[j] = Integer.valueOf(temp2[j]);
        }

return result;

    }
}
