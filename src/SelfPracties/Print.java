package SelfPracties;

import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        double result =0;
        double [][] n = new double[3][2];
        double [][] m = new double[3][2];
        n[0][1] =1.5;
        n[1][1]= 21.5;
        n[2][1]=100;

        m[0][1] =0.003;
        m[1][1]= 0.5;
        m[2][1]=0.87;
result = n[0][1] * m[0][1] + n[1][1]*m[1][1]+ n[2][1]*m[2][1];

        System.out.println(result);
    }
}
