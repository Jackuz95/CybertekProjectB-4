package MorePractiseLoop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int result = 1;
        for(int i=1 ; i<=10 ; i++) {
            for(int j=1 ; j<=10; j++){
                result= i*j;
                System.out.println(i + " x "+ j + " = " + result);
            }
            System.out.println("----------------");
        }
    }
}
