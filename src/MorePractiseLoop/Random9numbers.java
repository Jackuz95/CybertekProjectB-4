package MorePractiseLoop;

import java.util.Random;

public class Random9numbers {
    public static void main(String[] args) {
        Random random = new Random();
        String number = "";
        for (int i = 0; i < 9; i++) {
            int RanNum = random.nextInt(10);
           // System.out.println(RanNum);
            while (number.contains(RanNum + "")) {
                RanNum = random.nextInt(10);
                //number=number+RanNum;
            }
            number = number + RanNum;
        }
        System.out.println(number);
    }
}
