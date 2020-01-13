package arrays;

public class NamesFinding {
    public static void main(String[] args) {
        String [] names = new String[4];
        names[0] = "jurabek";
        names[1] = "jasurbek";
        names[2] = "Ahmed";
        names[3] = "Taha";
        for(int i=0; i<names.length; i++) {
        System.out.println(names[i].charAt(0));

    }System.out.println("first is " + names[1]);
        System.out.println("second is " + names[2]);
}
    }