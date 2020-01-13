package Loops;

public class SkippingNum {
    public static void main(String[] args) {
//        for ( int i = 0; i<=50 ; i++) {
//
//        if (i%10==3) {
//
//            System.out.println(i);
//        }
//        }
        for (int i = 0; i >= 50; i--) {
            String num = i + "";
            if (num.endsWith("3")) {
                System.out.println(i);
            }

        }
    }
}