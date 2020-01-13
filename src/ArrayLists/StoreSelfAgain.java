package ArrayLists;

import constructor.Item;

import java.util.ArrayList;

public class StoreSelfAgain {
    String name;
    String address;
    ArrayList<Item> items = new ArrayList<>();
    int numberOfItems;

    public StoreSelfAgain(String name, String address){
        this.address = address;
        this.name = name;
    }
    public void addItem(Item itemmm){
        this.items.add(itemmm);
        numberOfItems++;
    }
    public void seeInventory(){
           for(Item myItems: items){
               myItems.info();
           }
    }
    public void info(){
        System.out.println("Address: " + this.address);
        System.out.println("Name of Store: " + this.name);
    }
}
