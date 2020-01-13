package finalAndMemory;

public class Blue {
   final String name = "Kevin";


    public static void main(String[] args) {
        final int k;
        System.out.println("Program");
        k=6;
        System.out.println(k);
        Blue b = new Blue();
        System.out.println(b.name);

    }
}
