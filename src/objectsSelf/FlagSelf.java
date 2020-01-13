package objectsSelf;

public class FlagSelf {
    String country;
    String color;
    int size;
    String material;

    public void flap(){
        System.out.println("flag is flapping");
    }
    public void upGrade(int size, String material){
        this.size = size;
        this.material = material;
    }
    public void info(){
        System.out.println("\nCountry: " + country);
        System.out.println("Color: " + color);
        System.out.println("matetial: " + material);
        System.out.println("Size: " + size + "\n");
    }
}
