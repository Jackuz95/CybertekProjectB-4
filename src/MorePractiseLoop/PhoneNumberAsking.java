package MorePractiseLoop;
import java.util.*;
public class PhoneNumberAsking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        String PhoNumber = input.nextLine();
        int number = PhoNumber.length();
        String firstChar = PhoNumber.substring(0) + "";
        String forthChar = PhoNumber.substring(5,6) +"";
        for(int i = 0; i<number; i++) {
            if((PhoNumber.charAt(i)>=48 &&PhoNumber.charAt(i)<=57) && PhoNumber.length()==10){
                System.out.println("valid"); break;
            } else if((PhoNumber.charAt(i)>=48 &&PhoNumber.charAt(i)<=57) && PhoNumber.length()==12 &&
            firstChar.equals("(") && forthChar.equals(")")) {
                System.out.println("valid number"); break;
//            if(PhoNumber.length()==10 && PhoNumber.contains("1")&&PhoNumber.contains("2")&&PhoNumber.contains("3")
//            &&PhoNumber.contains("4")&&PhoNumber.contains("5")&&PhoNumber.contains("6")&&PhoNumber.contains("7")
//            &&PhoNumber.contains("8")&&PhoNumber.contains("9") ) {
//                System.out.println("Valid number"); break;
//            } else if((PhoNumber.length()==12 && PhoNumber.contains("1")&&PhoNumber.contains("2")&&PhoNumber.contains("3")
//                    &&PhoNumber.contains("4")&&PhoNumber.contains("5")&&PhoNumber.contains("6")&&PhoNumber.contains("7")
//                    &&PhoNumber.contains("8")&&PhoNumber.contains("9"))  && PhoNumber.substring(0).equals("(") &&
//            PhoNumber.substring(5,6).equals(")")) {
//                System.out.println("valid number"); break;
            }
        }
        System.out.println("invalid number");
    }
}
