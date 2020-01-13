package OlgaTasks;

public class BUrger {
    public static void main(String[] args) {
        String str1 = "Burger with fries";
        String str2 = "Burger with mushed potato";
        if(str1.equals(str2)) {
            System.out.println("What!");
        }else  {
            System.out.println("Yes they are different");
        }
        if(str1.toLowerCase().contains("burger")) {
            System.out.println("You are eating too much!!!");
        } else {
            System.out.println("Good for you!");
        }
    }
}
