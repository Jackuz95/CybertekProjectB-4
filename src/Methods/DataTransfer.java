package Methods;

public class DataTransfer {
    public static void main(String[] args) {
    printName("james");
    printName("Adam");
    firstChar("Jurabek");
    }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void firstChar (String name) {
        System.out.println(name.charAt(0));
    }
}
