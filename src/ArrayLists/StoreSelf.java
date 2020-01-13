package ArrayLists;

import constructor.Item;

import java.util.ArrayList;

public class StoreSelf {
    String name;
    String address;
    ArrayList<Item> items = new ArrayList<>();
    int numOfItems;

    public StoreSelf(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void addItem(Item item){
        this.items.add(item);
        this.numOfItems++;
    }
    public void seeInventory(){
        for(Item item:  items){
            item.info();
        }
    }
}
