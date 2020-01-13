package Methods;

public class datatypePromotion {
    public static void main(String[] args) {
        int a = 45;
        calc(a);
    }
    public static void calc(byte i){
        System.out.println("using int");
    }

    public static void calc (long d) {
        System.out.println("using double");
    }

    public static void calc (float f) {
        System.out.println("using float");
    }
}
