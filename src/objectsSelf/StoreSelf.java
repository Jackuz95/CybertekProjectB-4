package objectsSelf;
import java.util.*;
public class StoreSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many items do you have: ");
        int numsOfItems = input.nextInt();
        input.nextLine();
        ItemSelf [] items = new ItemSelf[numsOfItems];
        for(int i=0; i<numsOfItems; i++){
            System.out.println("Enter the name of " + (i+1) + " item");
            String name = input.nextLine();
            System.out.println("Enter the price of " + name + " " +(i+1) + " item");
            double price = input.nextDouble();
            input.nextLine();

            items[i] = new ItemSelf(name,price);
           //items[i].info();
        }
         for(ItemSelf eachItem: items){
             eachItem.info();
//             System.out.println("Name: " + eachItem.name);
//             System.out.println("price: " + eachItem.price);
         }


    }
}
