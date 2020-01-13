package Classes;

public class TestingCar {
    public static void main(String[] args) {
        Car car1 = new Car();
            car1.make = "Lexus";
            car1.year = 2020;
            car1.sportEdition = true;
            car1.mileage = 4000;
        System.out.println(car1.mileage);
        car1.drive("Downtown");
        System.out.println(car1.mileage);
        car1.drive(213);
        System.out.println(car1.mileage);
    }
}
