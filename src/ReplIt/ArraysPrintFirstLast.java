package ReplIt;
import java.util.*;
public class ArraysPrintFirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for(int i=0; i < words.length; i++){
            words[i] = words[i].substring(0);
        }
        System.out.println(Arrays.toString(words));



    }

}
