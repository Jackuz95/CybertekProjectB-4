package CodingBat;
import java.util.*;
public class WarmUptwoCountxx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word_by_user = input.nextLine();
        int count = 0;
        for(int i=0; i<word_by_user.length()-1; i++) {
            if(word_by_user.substring(i,i+2).equalsIgnoreCase("xx")){
                count++;
            }
        }
        System.out.println(count);
    }
}
