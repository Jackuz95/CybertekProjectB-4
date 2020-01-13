package ArrayClass;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class LibararyBookFinding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your book name here please please: ");
        String name_user = input.nextLine().toLowerCase().trim();
        String [] books = {"history", "biology", "matematics", "economics", "sience"} ;
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
        Arrays.binarySearch(books,name_user);
        System.out.println(books);


        }
    }

