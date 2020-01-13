package Classes.Practise;

public class CarCar {
    String make;
    int year;
    boolean sportEdition;
    int mileage;

    public void info(){
        //System.out.println(year + " "+ make + " is driving" +  mileage+10);
    }

    public void drive(){
        System.out.println(this.year + " "+ this.make + " is driving");
    mileage+=10;
    }
    public void drive(String destination){
        System.out.println(this.year + " "+ this.make + " is driving" +  " to " +" " +destination );
        mileage +=10;
    }
    public void drive (int miles){
        System.out.println(year + " "+ make + " is driving " +  miles+ " miles ");
                mileage +=miles;
    }


}


