package StringsSelfPracitse;
import java.util.Scanner;
public class AandZBeginsName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name_by_user = input.nextLine().toUpperCase();
        if(name_by_user.startsWith("A") || name_by_user.startsWith("Z")) {
            System.out.println("cool name");
        } else {
            System.out.println("haha look at the name!");
        }
    }
}
