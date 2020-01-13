package Return;

public class multipleReturns {

    public static int chaeckNumber (int num) {
        if(num<0) {
            return 0;
        } else {
            return num;
        }

    }

    public static void main(String[] args) {
        System.out.println(chaeckNumber(-4));
    }
}
