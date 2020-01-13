package Classes;
import java.util.*;
public class TestingHouse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter your info:");
      House checkHouse = new House();
        System.out.println("ENTER type of house:");
        checkHouse.type = input.nextLine();
        System.out.println("Enter your adress");
        checkHouse.adress = input.nextLine();
        System.out.println("Enter the numbers of rooms");
        checkHouse.NumsOfRooms = input.nextInt();
        checkHouse.info();
    }
}
