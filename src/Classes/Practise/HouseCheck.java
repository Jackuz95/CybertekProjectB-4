package Classes.Practise;

import java.util.Scanner;

public class HouseCheck {
    public static void main(String[] args) {
        HousePrac house = new HousePrac();
        Scanner input = new Scanner(System.in);
         System.out.println("What kind of type ");
        house.type = input.nextLine();
        System.out.println("How many rooms");
        house.NumberOfrooms = input.nextInt();
        input.nextLine();
        System.out.println("what is address?");
        house.addres = input.nextLine();

         house.info();
    }
}
