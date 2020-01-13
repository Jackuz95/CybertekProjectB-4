import java.util.Scanner;
import java.lang.Math;
public class Operators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        System.out.print("a= ");
        int a = input.nextInt();
        System.out.print("b= ");
        int b = input.nextInt();
        System.out.print("c= ");
        int c = input.nextInt();
        double D = (b*b) - (4*a*c);
        double x1 , x2;


   if (D==0) { x1 =  (-b)/(2*a);
       System.out.println("D=0 and answer 1 x=" + x1);
   } else if (D>0) { x1 =  (-b + Math.sqrt(D))/(2*a);
       x2 =  (-b - Math.sqrt(D))/(2*a);
        System.out.println("x1= " + x1);
        System.out.println("x2 = " + x2); }
   else { System.out.println("NO results" ); }




    }
}

