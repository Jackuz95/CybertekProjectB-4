package Classes.Practise;

public class FlagAgain {
    String color;
    String country;
    int size;
    String material;

    public void info(){
        System.out.println("\nCountry "+ country);
        System.out.println("Color " + color);
        System.out.println("Size " + size);
        System.out.println("Material " + material);
    }

     public void flap(){
         System.out.println("Flag is flapping");
     }
     public void upgrade (int size, String material, String color, String country){
        this.size=size;
         this.material=material;
           this.color = color;
           this.country = country;
     }
     public void upgrade1 (int size, String color){
        this.size = size;
        this.color = color;
     }
}
