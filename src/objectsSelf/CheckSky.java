package objectsSelf;

import constructor.Sky;

public class CheckSky {
    public static void main(String[] args) {
        SkySelf refSky = new SkySelf("yelllow");

        System.out.println(refSky.color);
        SkySelf refSky2 = new SkySelf("Blue", 5);
        refSky2.info();
    }
}