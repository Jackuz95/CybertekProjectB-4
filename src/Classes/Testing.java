package Classes;

public class Testing {
    public static void main(String[] args) {

        Flag f1 = new Flag();
        f1.country= "USA";
        f1.color= "Red/White";
        f1.size = 5;
        f1.material = "wood";
        Flag f2 = new Flag();

//        System.out.println(f1.country);
//         f1.flap();
        f1.upgrade(6,"paper");
       // f2.info();

    }
}
