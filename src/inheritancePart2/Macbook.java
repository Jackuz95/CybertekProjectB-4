package inheritancePart2;

public class Macbook extends Laptop{

    public Macbook(){
        super();
        System.out.println("macbook constructor");
    }
    public void appleID(){
        super.memorySize = 45;
    }

    public static void main(String[] args) {
        Macbook macbook = new Macbook();

    }


}
