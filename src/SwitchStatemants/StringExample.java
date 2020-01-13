package SwitchStatemants;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine();
        switch (fruit) {
            case "oranges":
                System.out.println(" Oranges are sweet");
            case "banana":
            case "apple":
                System.out.println("my favorite ");
                break;
            default:
                System.out.println(" Not a fruit");
        }
    }
}
