package MethodsSelfpractise;

public class ReturnPassword {
    public static void main(String[] args) {
//PasswordCheck("jama", "password");
        System.out.println(PasswordCheck("james123","password"));
    }
    public static boolean PasswordCheck (String str1, String str2) {
        String userName = "james123";
        String passsword = "password";
        if((userName.equalsIgnoreCase(str1)) && passsword.equalsIgnoreCase(str2)) {
            return true;
        } else {
            return false;
        }
    }
}
