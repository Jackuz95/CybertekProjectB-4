package CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class OddNumberRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want:");
        int num = input.nextInt();
        input.nextLine();
        Set<Integer> numbers = new HashSet<>();
        Iterator<Integer> inNum = numbers.iterator();
        for(int i =0; i<num; i++){
            System.out.println("Enter number" + (i+1));
            while (inNum.hasNext()){
                int nums = inNum.next();
                if(nums%2==0){
                    inNum.remove();

                }
                System.out.println(numbers);
            }
        }
    }
}
