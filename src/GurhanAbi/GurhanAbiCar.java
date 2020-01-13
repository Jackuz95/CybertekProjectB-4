package GurhanAbi;

public class GurhanAbiCar {
    public static void main(String[] args) {


        String[] carBrands = {"mercedes", "bmw", "toyota", "ferrari"};
        for (int i = 0; i < carBrands.length; i++) {
            if (carBrands[i].equalsIgnoreCase("mercedes")) {
                System.out.println(carBrands[i] + ": Luxury - Comfort");
            }
            else if (carBrands[i].equalsIgnoreCase("bmw")) {
                System.out.println(carBrands[i] + ": Luxury - Sport");
            }
            else if (carBrands[i].equalsIgnoreCase("toYota")) {
                System.out.println(carBrands[i] + ": Reliable- Cheap");
            }
            else if (carBrands[i].equalsIgnoreCase("Ferrari")) {
                System.out.println(carBrands[i] + ": Super car - Super expensive");
            }
        }
    }
}
