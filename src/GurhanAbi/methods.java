package GurhanAbi;
import java.util.*;
public class methods {
    public static void main(String[] args) {

countWords();
    }

    public static void countWords(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();

       String [] arr = str.split(" ");
       for(int i=0; i<arr.length; i++){

           System.out.println("Number of words: " + arr.length); break;
       }
        }

    }


