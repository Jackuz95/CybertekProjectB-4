package ArrayLists;

import constructor.Item;
import java.util.*;
import java.util.ArrayList;

public class Store {
    String name;
    String address;
    int numberOfItems;
    double totalSales;
    ArrayList<Item> items = new ArrayList();


    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.numberOfItems++;
    }

    public void addItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = input.nextInt();
        input.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter your Item name " + (i + 1));
            String name = input.nextLine();
            System.out.println("Enter the price: " + (i + 1));
            double price = input.nextDouble();
            input.nextLine();
            Item item = new Item(name, price);
            this.items.add(item);
            this.numberOfItems++;
        }
    }


    public void sellItem(String itemName) {
        this.name = itemName;
        for (int i = 0; i < items.size(); i++) {
           if(items.get(i).name.equals(itemName)){
               this.totalSales += items.get(i).price;
               items.remove(i);
               System.out.println("\nSuccessful transaction! Thank you for the money");
               this.numberOfItems--;
               return;
            }
         }
        System.out.println("Item is not in stock");
    }

    public void returnItem(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of item: ");
        double price = input.nextDouble();
        Item returnItem = new Item(name, price);
        items.add(returnItem);
        this.totalSales -= price;
        this.numberOfItems++;
        System.out.println("\nReturn process successful.");
    }

    public void seeInventory() {
        System.out.println("\nZara Chicago Store");
        System.out.println("Total sales: " + this.totalSales + " $");
        for (Item item : items) {
            item.info();
        }
    }
}
