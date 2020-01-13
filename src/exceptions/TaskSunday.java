package exceptions;
import java.util.*;
public class TaskSunday {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the number of index you want to change");
            int index = input.nextInt();
            System.out.println("Enter the number you want to change");
            int number = input.nextInt();

            arr[index] = number;

        }catch (InputMismatchException e){
            System.out.println("Invalid number entered");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Entered invalid index!");
        }finally {
            System.out.println(Arrays.toString(arr));
        }
    }
}