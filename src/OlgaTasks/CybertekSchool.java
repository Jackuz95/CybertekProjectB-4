package OlgaTasks;

public class CybertekSchool {
    public static void main(String[] args) {
        String str = "Cybertek school";
        int space = str.indexOf(" ");
        System.out.println(space);
        System.out.println(str.substring(0,space));
        System.out.println(str.substring(space));
    }
}
