package arrays;
import java.util.*;
import java.util.Arrays;
public class Garage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of cars:");
        int number = input.nextInt();
        input.nextLine();
        String names ="";
        int count = 0;
        String [] cars = new String[number];
       for(int i = 0; i<cars.length; i++) {
           System.out.println("enter car" + (i+1));
           String cars_By_user = input.nextLine();
           cars[i] = cars_By_user;

           }System.out.println(Arrays.toString(cars));

       }

    }

