package ReplIt;
import java.util.Scanner;
public class Party {
    //    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//        Ask for the first guest name.
//        Then ask does user want to enter one more guest.
//        If yes - take input from.
//        If not - finish the program and print list of the guests.
////        Example of the program:
////        Please enter guest name:
//        Nick
//        Do you want to enter new guest name:
//        yes
//        Please enter guest name:
//        Linda
//        Do you want to enter new guest name:
//        no
////        Guest's list: Nick, Linda
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the first guest:");
        String nameFirst = input.nextLine();
        String GuestList = "" +nameFirst;
        for(; ;) {
            System.out.println("Do you want to enter new guest name:");
            String answer1 = input.nextLine().toLowerCase();
            if(answer1.equals("yes")) {
                System.out.println("Enter guest name:");
                String nameCon = input.nextLine();
                GuestList = GuestList + " " + nameCon;
            } else {
                System.out.println("Guest's list: " +GuestList);
                break;
            }
        }

    }
}