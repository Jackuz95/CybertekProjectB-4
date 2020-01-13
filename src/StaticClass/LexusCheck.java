package StaticClass;

public class LexusCheck {
    public static void main(String[] args) {
        Lexus carOne  = new Lexus("x", 2017);
       carOne.mileage = 5348;
       Lexus.evaluateCar(carOne);
    }
}
