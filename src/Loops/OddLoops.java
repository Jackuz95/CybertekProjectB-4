package Loops;

public class OddLoops {
    public static void main(String[] args) {


        for (int i = 0; i <= 50; i ++) {
            if (i % 2 == 1) {
                System.out.println(i);
            } else {
                System.out.println("Even numbers here");
            }
            if (i==20) {
            break ;}
        }
    }
}