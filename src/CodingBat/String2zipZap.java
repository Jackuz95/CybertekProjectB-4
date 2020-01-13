package CodingBat;
import java.util.*;
public class String2zipZap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.nextLine();  //  zzzopzop
        String [] arr = word.split("");
        String str = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase("z") && arr[i+2].equalsIgnoreCase("p")){
            arr[i+1].equals("");

               str += arr[i]+"";
            }
        }
        System.out.println(str);
    }
}
