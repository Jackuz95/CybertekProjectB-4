package Classes;

public class Car {
    String make;
    int year;
    boolean sportEdition;
    int mileage;

    public void drive() {
        System.out.println(year + " " + make + " is driving.");
        mileage += 10;
    }
    public void drive (String destination){
        System.out.println(this.year + " " + make + " is driving " + destination);
       this.mileage+= 10;
     }
     public void drive(int miles){
         System.out.println(this.year + " " +this.make + " is driving " + miles + "miles");
         this.mileage+= miles;
     }


}
