package Methods;

public class IntAndString {
    public static void main(String[] args) {
Ahmed("Ahmed is a bad guy", 5);
    }
    public static void Ahmed (String str, int number) {
        int strNUm = str.length();
        String arr [] = str.split(" ");

        if(arr.length==number) {
            System.out.println("equal and true");
        } else{
            System.out.println("not equal and honest");
        }
    }
}
