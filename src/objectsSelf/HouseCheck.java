package objectsSelf;
import java.util.*;
public class HouseCheck {
    public static void main(String[] args) {
        HouseSelf myHouse = new HouseSelf();

        myHouse.numsOfRooms =5;
        myHouse.address = "Darxan city, Uzbekistan";
        myHouse.type = "Apartment";

        myHouse.info();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the new address:");
        myHouse.address =input.nextLine();
        System.out.println("enter the type of new apartment: ");
        myHouse.type = input.nextLine();
        System.out.println("Enter the number of rooms of new house: ");
        myHouse.numsOfRooms = input.nextInt();
        input.nextLine();
        myHouse.info();
    }
}
