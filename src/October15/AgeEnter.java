package October15;
import java.util.Scanner;
public class AgeEnter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter your age: ");
        int age = input.nextInt();
        if (age == 30) {
            System.out.println(" You can enter");
        }
           if (age<=0 ||age >100) {
               System.out.print(" invalid age entered ");
                }
           if (age>0 && age<30) {
               System.out.println(" your age is not enough! ");
           }
           if (age >30 && age <100) {
                   System.out.println( " welcome to building!");
               }

    }
}
