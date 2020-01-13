package ForRecordings;

public class MutableVsImmutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jurabek");
        System.out.println(sb.reverse());
       System.out.println(sb.delete(1,3));
        String name = "Jurabek";
        name = "Jasurbek";
        System.out.println(name);
    }
}
