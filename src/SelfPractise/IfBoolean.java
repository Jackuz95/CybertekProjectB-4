import java.util.*;

class IfBoolean {
    public static void main(String[] args) {

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        // Your code here
        //------------------------------------------------


        if (n.contains("a") && n.length() <5) {
            System.out.println("A Perfect");
        }
        if (n.contains("b") && n.length()<=10) {

            if (n.contains("a") && n.length()>=7)
                System.out.println("B perfect");
        }
        if (!(n.contains("a") && n.length()<=10)) {

            if (!(n.contains("a") && n.length()>=7))
                System.out.println("Perfect");
        }  if (n.contains("a")&& n.length()>10) {
            System.out.println("");
        } else {
            System.out.println("Sorry");
        }
    }
}