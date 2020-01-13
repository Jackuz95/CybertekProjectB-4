package InterviewQuestions;
import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = scan.nextInt();
        System.out.println(isPrime(50));
    }
//        for (int i = 2; i < number; i++) {
//            if ((i % 2 == 1 && i % 3 != 0) && (i % 5 != 0 && i % 7 != 0)) {
//                System.out.println(i);

         public static ArrayList<Integer> isPrime(int num) {
             ArrayList<Integer> nums = new ArrayList<>();
             for (int i = 1; i <= num; i++) {
                 if(i<10 && i%2==1 && i%3!=0){
                     nums.add(i);
                 }else if(i>10 && i%2==1 && i%3!=0){
                         nums.add(i);
                     }

             }
             return nums;
            }
        }

