package arrays;

public class CitiesFinding {
    public static void main(String[] args) {
        String[] cities = {"New York", "Madison", "Miami", "Washington", "Chicago", "Chicago"};
        for(String city: cities){
            if(city.equalsIgnoreCase("chicago")){
                System.out.println("Windy city found"); break;
            }else {
                System.out.println("not found"); break;
            }
        }


    }
}

