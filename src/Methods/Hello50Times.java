package Methods;

public class Hello50Times {
    public static void main(String[] args) {
        HelloSay();
        System.out.println();
        OddNUmber();
    }

    public static void HelloSay() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Hello " + i);
        }
    }

    public static void OddNUmber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd numbers: " + i);
            }
        }
    }


}

