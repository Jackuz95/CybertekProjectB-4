package objectsSelf;

import constructor.Sky;

public class SkySelf {

    String color;
    int numOfStars;

    public SkySelf(String colorcode){
        this.color =colorcode;
    }
    public SkySelf(String colorcode, int NUmbersStars ){
        this.color= colorcode;
        this.numOfStars=NUmbersStars;
    }
    public void info(){
        System.out.println("\nColor " + color);
        System.out.println("Number os stars: " + numOfStars);
    }
}
