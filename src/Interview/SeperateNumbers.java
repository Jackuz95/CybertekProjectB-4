package Interview;

import java.util.Arrays;

public class SeperateNumbers {
    public static void main(String[] args) {
       isNumber("sgf54sg49gas65dfgjfgyh45656");
    }
    public static void isNumber(String str){
        String result ="";
       // char [] arr = str.toCharArray();
      //  System.out.println(Arrays.toString(arr));
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                result +=str.charAt(i)+" ";
            }
        }
        System.out.println(result.trim());
    }
}
