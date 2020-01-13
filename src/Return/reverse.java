package Return;

public class reverse {
    public static String Reverseword(String str1) {
        String rev = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            rev = "" + rev+ str1.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(Reverseword("JurabekTahaAhmedzdfgsgarga"));
    }
}
