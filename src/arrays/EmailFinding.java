package arrays;

public class EmailFinding {
    public static void main(String[] args) {
        String[] emails = {"Jamesbond3@gmail.com", "notvalid@.com", "Ada.m5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com"};

        for (int i = 0; i < emails.length; i++) {
            if (emails[i].contains("@") && emails[i].contains(".")) {
                int sign = emails[i].indexOf('@');
                int dot = emails[i].indexOf(".");
                if (dot > sign) {

                    System.out.println(emails[i] + " Valid");
                } else {
                    System.out.println(emails[i] + " invalid emails");
                }
            } else {
                System.out.println(emails[i] + " Invalid emails");
            }
        }
    }
}
