package exceptions;

public class City {
    public static void main(String[] args) {
        Driver d = new Driver();

        try {
            d.setName("James bond");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(d.getName());
    }
}
