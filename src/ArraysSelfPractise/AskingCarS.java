package ArraysSelfPractise;
import java.util.*;
public class AskingCarS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many cars you wanna?");
        int numsOfCars = input.nextInt();
        int [] carsNum = new int[numsOfCars];
        input.nextLine();
        String [] names = new String[numsOfCars];
        for (int i=0; i<carsNum.length; i++) {
            System.out.println("enter your car "+ (i+1));
             names[i] =  input.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}
