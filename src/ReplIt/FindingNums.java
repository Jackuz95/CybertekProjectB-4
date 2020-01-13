package ReplIt;
import java.util.*;
public class FindingNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str1 = input.nextLine();

        //your code here
        //----------------------------------------------------------
        String word ="";
        if(str1.length()>=3 && str1.length()<=100){
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i)>=48 && str1.charAt(i)<=57){
                    word +=str1.charAt(i)+"";
                }
            }
            System.out.println(word);
        }else{
            System.out.println("Invalid enter");
        }
    }
}
