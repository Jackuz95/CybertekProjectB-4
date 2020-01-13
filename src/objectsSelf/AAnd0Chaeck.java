package objectsSelf;

public class AAnd0Chaeck {
    public static void main(String[] args) {
        FlagSelf f1 = new FlagSelf();
        FlagSelf f2 = new FlagSelf();
        f1.material = "paper";
        f1.color = "yellow";
        f1.country = "Iran";
        f1.size = 10;
        f1.info();
        f2.country = f1.country;
        f2.color = f1.color;
        f2.size = f1.size;
        f2.material = f1.material;
        f1.material = "a";
        f1.color= "a";
        f1.country ="a";
        f1.size = 0;

f1.upGrade(255,"gold");

        f2.info();
        f1.info();
    }
}
