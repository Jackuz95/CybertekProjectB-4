package ReplIt;

public class COverMe {
    public static void main(String[] args) {
        String main = "Certified Wooden Spoon";
        String cover = "o";
        if(main.contains(cover)){

            main = main.replace(cover,"[" + cover+ "]");
        }
        System.out.println(main);
    }
}
