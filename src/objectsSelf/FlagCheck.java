package objectsSelf;

public class FlagCheck {
    public static void main(String[] args) {
        FlagSelf f1 = new FlagSelf();
        f1.country = "Uzbekistan";
        f1.color = "Blue";
        f1.material = "Silk";
        f1.size = 5;
     FlagSelf f2 = new FlagSelf();

       // f1.flap();
        f2.upGrade(8,"paper");


        f1.info();
        f2.info();
    }
}
