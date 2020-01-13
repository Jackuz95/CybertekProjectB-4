package MethodsSelfpractise;

public class returnDtae {

    public static String getData() {
        String date = "11/12/2019";
        return date;
    }

    public static void main(String[] args) {
String ReadyData = getData().replace("/", "@");
        System.out.println(ReadyData);
    }
}
