package objectsSelf;

public class CarcheckSelf {
    public static void main(String[] args) {
        CarSelf car = new CarSelf();
        car.mileage = 5000;
        car.make = "Tesla";
        car.sportEdition = true;
        car.year = 2020;

        System.out.println(car.mileage);
        car.drive();
        car.drive(45);
        System.out.println(car.mileage);
        car.drive("To Tashkent");
        System.out.println(car.mileage);
    }
}
