package Methods;

public class MultipleTranser {
    public static void main(String[] args) {
        goTo("China", "New York");
makeEmail("james", "bond", 26);
    }
    public static void goTo (String origin, String newLocation){
        System.out.println("You start from " +origin);
        System.out.println("And you are going to " + newLocation);
    }
    public static void makeEmail (String name, String lastname, int age) {
        String email = name+lastname+age+"@cybertek.com";
        System.out.println(email);
    }
}
