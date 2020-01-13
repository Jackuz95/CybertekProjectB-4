package constructor.Practise;

public class SkySky {
    public SkySky(String colorCode){
        this.color= colorCode;

    }
    public SkySky(String color, int visibleStars){
this.color = color;
this.visibleStars = visibleStars;
    }
    String color;
    int visibleStars;

    public void info(){
        System.out.println("\nColor: " + color);
        System.out.println("NUmbers of Star: " + visibleStars);
    }

    public static void main(String[] args) {
        SkySky refSky1 = new SkySky("Yellow");
        refSky1 = new SkySky("red", 5);
        refSky1.info();
        SkySky refSky2 = new SkySky("Blue", 10);
        refSky2.info();


    }
}
