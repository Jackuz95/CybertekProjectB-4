package LoopsPractise;
import java.util.Scanner;
public class MondayProjectTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word:");
        String str2 = input.nextLine();
        if(str2.length()>=3 && str2.length()<=100) {
            for(int i=0; i< str2.length(); i++) {
            char number = str2.charAt(i);
                if(number>48 && number<57) {
                    System.out.print(number);
                }
            }




        } else {
            System.out.println("invalid number");
        }
    }
}
