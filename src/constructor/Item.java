package constructor;

public class Item {
    public String name;
    public double price;
    int size;



    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Overload the constroctor that takes 3 parametrs to set all 3 instance variables

    public Item (String name, double price, int size){
        this.name = name;
        this.price = price;   // this(name,price);
        this.size= size;
    }
    // We can call constructor inside another constructor.
    // It is called constructor chaining.
    // We can do it using keyword "this" with parenthesis.



    public void info(){
        System.out.println("\nName " + name);
        System.out.println("price " + price);

    }


}