package stringBuilder;

public class sbMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Car");
        sb.reverse();
        sb.delete(0,2);
        sb.insert(0,"Hello");
        System.out.println(sb);
    }
}
