package arrays;

public class JamesBond {
    public static void main(String[] args) {
        String [] words = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com"} ;
        for(int i =0; i<words.length; i++) {
            if(words[i].contains("@") && words[i].contains(".")) {
                int at  = words[i].indexOf("@");
                int dot = words[i].indexOf(".");
                if(at<dot) {
                    System.out.println( "Valid " + words[i]);
                } else {
                    System.out.println("invalid " + words[i]);
                }

            } else {
                System.out.println("invalid " + words[i]);
            }
        }
    }
}
