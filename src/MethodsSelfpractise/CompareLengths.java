package MethodsSelfpractise;

public class CompareLengths {
    public static void main(String[] args) {
CompareLength("Jurabek is good", 10);
    }
    public static void CompareLength (String str , int number) {
        if(str.length()==number) {
            System.out.println("equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
