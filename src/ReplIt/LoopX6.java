package ReplIt;

public class LoopX6 {
    public static void main(String[] args) {
        for(int i= 1; i<=20; i++) {
            while (i%3 ==0) {
                System.out.print(i + " "); break;
            }
        }
    }
}
