package Methods;
import java.util.*;
public class overloading {
    public static void main(String[] args) {
        jump();
        jump("Adidas");
        jump(6);
       String [] arr = {"d"};
        System.out.println(jump(arr));
        int [] arr1 = {15};
        System.out.println(jump(arr1));
    }

    public static void jump () {

        System.out.println("You dont get for");
    }
    public static void jump(String shoes) {
        System.out.println("The shoes made me for go further");
    }
    public static void jump(int distance) {
        System.out.println("You jumped " + distance);
    }
    public static String jump(String [] arr) {
        return "Jumped by array";
    }
    public static String jump( int [] arr1) {
        return "Jumped by Ahmed";
    }
}
