package Methods;

public class StringStringTransfer {
    public static void main(String[] args) {
//        StringUse("Jurabek");
//        StringUse("Ahmed");
        makeEmail("Jurabek", "Sayfiev", 2);

        goTo("Uzbekistan", "USA");
    }
    public static void StringUse (String name ) {
        System.out.println( "Your name is " + name);

    }
    public static void goTo (String origin, String destination) {
        System.out.println("You start from " + origin);
        System.out.println("You will go to " + destination);
    }
    public static void makeEmail (String name, String lastName, int age ){
        String ready = name+ lastName+age+ "@cybertek.com";
        System.out.println(ready);
    }
}
