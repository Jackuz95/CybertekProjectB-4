package Inheritance;

public class PetSmart {
    public static void main(String[] args) {
        Huskey huskey = new Huskey();
        huskey.name = "Rex";
        huskey.age =5;
        huskey.bark();
        System.out.println(huskey.name);
        System.out.println(huskey.age);

    }
}
