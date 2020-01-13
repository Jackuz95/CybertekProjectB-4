package ReplIt;

public class Loopx3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=20; i++) {
            while(i%2==0) {

                sum =sum+i;
break;
            }
        }System.out.println(sum);

    }
}




// Write for and while loops so that they add up the even numbers between 1 and 20 and prints it