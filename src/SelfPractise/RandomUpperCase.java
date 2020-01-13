package SelfPractise;
import java.util.Random;
public class RandomUpperCase {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(26);
        System.out.println("Random number is:" + number);
        number +=65;
        char letter = (char) (number);
        System.out.println("our letter is: " + letter);

    }
}
