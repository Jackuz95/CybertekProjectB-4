package Classes.Practise;

public class CarCheck {
    public static void main(String[] args) {
    CarCar car = new CarCar();
    car.mileage = 2000;
    car.make = "nissan";
    car.sportEdition = true;
    car.year = 2018;
        System.out.println(car.mileage);
    car.drive("Downtown");
        System.out.println(car.mileage);
     car.drive(250);
        System.out.println(car.mileage);

    }

}
