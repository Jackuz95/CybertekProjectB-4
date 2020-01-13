package ArrayLists;
import constructor.Item;
public class Mall {
    public static void main(String[] args) {
        Store zara = new Store("Zara","312 main st");
        Item item1 = new Item("Socks", 15);
        Item item2 = new Item("Coat",85);
        Item item3 = new Item("T-shirt", 23);

        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);
        System.out.println(zara.totalSales);
        zara.seeInventory();

//        zara.addItem();
//        zara.seeInventory();
//        zara.sellItem("coat");
//        zara.seeInventory();
//
        zara.returnItem("table");
        zara.seeInventory();
        System.out.println(zara.totalSales);
    }
}
