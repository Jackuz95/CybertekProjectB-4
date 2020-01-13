package CodingBat;

public class ArrayCommonend {
    public static void main(String[] args) {
        int [] a = {7,4,3,8,4};
        int [] b = {5,6,9,7,3};
        boolean valid = true;
        if((a.length>=1 && b.length>=1) && (a[0]==b[0] ||( a.length-1 ==b.length-1)))  {
            System.out.println( valid);
        } else {
            System.out.println( !valid);
        }
    }
}
