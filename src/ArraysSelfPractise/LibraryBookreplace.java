package ArraysSelfPractise;
import java.util.*;
public class LibraryBookreplace {
    public static void main(String[] args) {
        String [] books =  {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};
        Scanner input = new Scanner (System.in);
        System.out.println("enter the book name you want: ");
        String nameNew = input.nextLine();
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

           int index  = Arrays.binarySearch(books, nameNew);
       if(index>0) {
           System.out.println("Enter the name you want to change: ");
          String enterByUser = input.nextLine();
          books[index] = enterByUser;
           System.out.println(Arrays.toString(books));


       } else {
           System.out.println("Book that you entered not found!");
       }
        }

    }

