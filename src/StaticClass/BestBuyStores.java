package StaticClass;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy storeOne = new BestBuy();
        BestBuy storeTwo = new BestBuy();
BestBuy.print();
        //storeOne.print();
       // System.out.println(storeOne.numOfComputers);
        storeOne.numOfComputers-=5;
       // System.out.println(storeTwo.numOfComputers);
        BestBuy.print();
    }
}
