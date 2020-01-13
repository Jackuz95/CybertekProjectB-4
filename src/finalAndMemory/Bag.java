package finalAndMemory;

public class Bag {
   final String color;
    final static int totalBags;
    static  {
        totalBags =45;
    }
    public Bag(){
        this.color = "Red";
    }
    public Bag(String color){
        this.color = color;
    }

}
