package October13;
import java.util.Scanner;
public class TaskMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " Please enter your pounds: ");
        double mass = input.nextDouble();
        System.out.println( " Now please enter your height: ");
        double height = input.nextDouble();
        double BMI = mass/(height*height);
           if ( BMI < 18.5) {
               System.out.println(" underweight ");
           } else if(18.5<= BMI && BMI<25) {
               System.out.println(" normal weight ");
           } else if( BMI>=25 && BMI<30) {
               System.out.println(" Overweight ");
           } else if ( BMI>=30 || BMI==30) {
               System.out.println(" obese ");
           }

           }

    }

