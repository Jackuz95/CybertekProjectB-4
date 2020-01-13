package LoopsPractise;

public class ODDnumberLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            int number;
            if (i % 2 == 1) {
                System.out.println(i);
            } else {
                System.out.println("even number here");
            }
        }
    }
}