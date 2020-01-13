package MorePractiseLoop;
import java.util.Random;
public class RAndomSixNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        String number = "";
       for(int i =0; i<6; i++){
           int ranNum = random.nextInt(10);
           while(number.contains(ranNum+"")) {
               ranNum = random.nextInt(10);
               System.out.println(ranNum);
           }  number = number+ranNum;

       }
        System.out.println(number);

    }
}
