package Classes.Practise;

public class FlagCheck {
    public static void main(String[] args) {
        FlagAgain flag1 = new FlagAgain();
          flag1.color= "red";
          flag1.country = "Usa";
          flag1.size = 5;
          flag1.material = "paper";

       // System.out.println(flag1.country);
        //flag1.flap();
        //flag1.info();
        FlagAgain flag2 = new FlagAgain();
        flag2.country = flag1.country;
        flag2.color = flag1.color;
        flag2.size = flag1.size;
        flag2.material = flag1.material;
        flag2.info();

        flag1.upgrade(0, "a","a","a");
        flag1.info();

        flag1.upgrade1(255, "gold");
        flag1.info();

    }
}
