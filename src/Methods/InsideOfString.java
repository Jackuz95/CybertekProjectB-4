package Methods;
import java.util.Scanner;
public class InsideOfString {
    public static void main(String[] args) {

    }
public static void Strings ( String str1, String str2) {
        if(str1.contains(str2)) {
            str1.replace(str2, "");
            System.out.println(str1.trim());
        } else {
            System.out.println("Try again");
            Scanner input = new Scanner(System.in);
            String again = input.nextLine();
            if(str1.contains(again)) {

            }else {
                System.out.println("out of tries");
            }
        }


}




}
