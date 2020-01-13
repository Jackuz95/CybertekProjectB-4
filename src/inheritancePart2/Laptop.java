package inheritancePart2;

public class Laptop {

    String model;
    int memorySize;
    protected String color;
    public static int numsOfLaptops;

    public Laptop(String model){
        this.model =model;
    }
    public Laptop(){

    }
    public void turnOn(){

        System.out.println("Laptop is turning on");
    }
}
