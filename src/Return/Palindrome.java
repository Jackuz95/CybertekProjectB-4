package Return;

public class Palindrome {
    public static String palindrome(String str1){
        String rev = "";
        str1 = str1.trim().toLowerCase();
        for(int i = str1.length()-1; i>=0; i--){
            rev = "" + rev+str1.charAt(i);
        }
        if(rev.equals(str1)){
            return "palindrome";
        }
        return " not palindrome";
    }

    public static void main(String[] args) {

        System.out.println(palindrome("    Civic"));
    }
}
