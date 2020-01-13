package accessModifiers;
import java.util.*;
public class Pasport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person person = new Person();
        person.setName("Zeynep");
        System.out.println(person.getName());
        System.out.println("Please enter age for " + person.getName());
        for(; ; ) {
            int age = input.nextInt();
            input.nextLine();
            if (age > 0) {
                person.setAge(age);
                break;
            } else {
                System.out.println("Enter again please!");
            }
        }
        System.out.println("Age of " + person.getName() + " is " + person.getAge());

        // Ask user to enter age for Zeynep untill user enters valid age
        // user scanner
    }
}
