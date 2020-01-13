package LoopsPractise2;

public class oneToTwenty {
    public static void main(String[] args) {
        for(int i= 1; i<20; i++) {
            while(i%2!=1) {
                i++;

            }System.out.print(i*i + " ");
        }
    }
}
