package ReplIt;
import java.util.*;
public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;

        //your code here
        //----------------------------------------------------------
        int num = 0;
        String answer = "";

        do{
            System.out.println("Enter the number:");
            num = input.nextInt();
            input.nextLine();


            if(num<0){
                negative++;
            }else if(num==0){
                zero++;
            }else if(num>0){
                positive++;
            }
            System.out.println("Do you want to continue y/n?");
            answer = input.nextLine();
        }while(answer.equalsIgnoreCase("y"));





        //----------------------------------------------------------
        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);
    }
}
