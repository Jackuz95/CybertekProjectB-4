package constructor;

public class Sky {

    public Sky(String colorCode){
    this.color= colorCode;

     }
     public Sky(String colorCode, int numsStars) {
        this.color = colorCode;
        this.visibleStars = numsStars;
     }

     String color;
    int visibleStars;

    public void info() {
        System.out.println("\nColor of Sky: " + color);
        System.out.println("Numbers of stars " + visibleStars);
    }

    public static void main(String[] args) {
        Sky refSky = new Sky("Blue");
        Sky newRef = new Sky("Red", 10);
//       System.out.println(refSky.color);
//        System.out.println(newRef.color);
//        System.out.println(newRef.visibleStars);
        newRef.info();
        refSky.info();
    }

}
