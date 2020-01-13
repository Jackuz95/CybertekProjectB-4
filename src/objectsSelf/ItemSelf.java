package objectsSelf;

public class ItemSelf {
        String name;
        double price;

        public ItemSelf(String name, double price){
            this.name = name;
            this.price =price;
        }
        public void info(){

            System.out.println("Name of Item is: " + name);
            System.out.println("Price of Item : "+ price);
            System.out.println();
        }

}
