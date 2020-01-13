package constructor;
import java.util.*;
public class ItemCheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many items do you have? ");
        int numbersOfItems = input.nextInt();
        input.nextLine();
        Item [] myItems = new Item[numbersOfItems];

           for(int i=0; i<myItems.length; i++){
               System.out.println("Enter your item " + (i+1));
               String name = input.nextLine();
               System.out.println("Enter the price " + (i+1));
               double price = input.nextDouble();
               input.nextLine();
              myItems [i] = new Item(name, price);
           }

    }
}
