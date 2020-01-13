package Return;

public class returnType {
    public static int getThree() {
        return 3;
    }
    public static String getDate(){
        String date ="11/03/2019";
        return date;
    }

    public static void main(String[] args) {
        int a = getThree()+7;
        String date = getDate();
        System.out.println(a);
        System.out.println(date);
    }
}
