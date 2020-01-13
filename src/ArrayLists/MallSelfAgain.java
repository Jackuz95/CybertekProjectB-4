package ArrayLists;

import constructor.Item;
import objectsSelf.ItemSelf;
import ArrayLists.StoreSelfAgain;
public class MallSelfAgain {
    public static void main(String[] args) {
        StoreSelfAgain myStore = new StoreSelfAgain("Jurabek","123 main st, chi ill");
        Item item1 = new Item("cup", 12.3);
        Item item2 = new Item("pen", 5.5);

        myStore.addItem(item1);
myStore.addItem(item2);
       myStore.info();
myStore.seeInventory();
    }
}
