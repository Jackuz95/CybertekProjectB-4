package CodingBat;

public class String3gHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxgggxyzg"));
    }
    public static String gHappy(String str){
        str = str.replace("gg", "4");
        return str;
    }
}
