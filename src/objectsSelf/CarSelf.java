package objectsSelf;

import java.util.jar.JarOutputStream;

public class CarSelf {
    String make;
    int year;
    boolean sportEdition;
    double mileage;

public void drive(){
    System.out.println(this.year + " " + this.make + " is driving \n" );
    this.mileage +=  10;
}
 public void drive(String destination){
     System.out.println(this.year + " " + this.make + " is driving to " + destination );
     this.mileage += 10;
 }
 public void drive(int mile){
     System.out.println(this.year + " " + this.make + " is driving " + mile + " miles" );
     mileage += mile;
 }

}
