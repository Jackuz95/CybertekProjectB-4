package ArraysSelfPractise;

public class WindyCityChicago {
    public static void main(String[] args) {
        String[] cities = {"New York",  "Madison", "Miami", "Washington"};
        int count = 0;
        boolean check =false;
        for (String city : cities) {
            if (city.equalsIgnoreCase("Chicago")) {
                check = true;
                count++;

            }
        }
            if(check==true) {
                System.out.println("Windy city is found " + count+ " times" );
            } else {
                System.out.println("Windy city is not found");
            }
    }
}
