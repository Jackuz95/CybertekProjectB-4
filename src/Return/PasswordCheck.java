package Return;

public class PasswordCheck {
    public static boolean checkPasAndUser(String str1, String str2) {
        String ready1 = "james123";
        String ready2 = "password";

        boolean valid = true;
        if(str1.equals(ready1) && str2.equals(ready2)) {
            return valid;

        } else {
            return !valid;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPasAndUser("james12", "password"));
    }
}
