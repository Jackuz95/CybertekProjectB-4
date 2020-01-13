package Methods;
import java.util.*;
public class tasksDayGiving {
    public static void main(String[] args) {
       // System.out.println(wordContcat("five" ,"monday"));
        System.out.println(wordContcat("five", "friday", 5));
    }


    public static String wordContcat (String day , String name) {
        //Scanner input  = new Scanner(System.in);

        return day+name+day;
    }
    public static String wordContcat (String day , String name, int num) {
        if(num<=0){
            return "";
        }

        String word = "";
        for (int i = 0; i < num; i++) {
            word += day;
            if(i==num-1) {
                break;

            }word += name;
        }
        return word;
        }
}
