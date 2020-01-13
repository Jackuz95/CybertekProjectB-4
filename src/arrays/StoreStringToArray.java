package arrays;
import java.util.*;
public class StoreStringToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.println("How many times you want to enter:");
        int num = input.nextInt();
        input.nextLine();
        String [] names_user = new String [num];
        for(int i =0; i<num ; i++) {
            System.out.println("Enter name " + (i+1)+" " );
            names_user[i] =input.nextLine();


        }System.out.println(Arrays.toString(names_user));
    }
}
