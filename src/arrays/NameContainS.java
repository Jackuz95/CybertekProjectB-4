package arrays;
import java.util.*;
public class NameContainS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your letter");
        String word = input.nextLine();
        String [] students = {"James", "Johns" , "Adam", "Elize", "Jamie", "Benzema"} ;
        for(int i=0; i<students.length; i++) {

             if(students[i].contains(word)) {
                System.out.println(students[i]);
            }
        }
    }
}
