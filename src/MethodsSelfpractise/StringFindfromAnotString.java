package MethodsSelfpractise;
import java.util.*;
public class StringFindfromAnotString {
    public static void main(String[] args) {
SearchString("jurabek is good man", "bad");
    }

    public static void SearchString(String str1, String str2) {
        Scanner input = new Scanner(System.in);
       // for (int i = 0; i < str1.length(); i++) {
            if (str1.contains(str2)) {
                str1 = str1.replace(str2, "");
                System.out.println(str1);
            } else {
                System.out.println("not found");
                System.out.println("enter another word");
                String nextTry = input.nextLine();
                if(str1.contains(nextTry)) {
                    str1 = str1.replace(nextTry,"");
                    System.out.println(str1);
                } else {
                    System.out.println("bo'ldida endi!");
             }

        }
        //System.out.println(str1);
    }
}
