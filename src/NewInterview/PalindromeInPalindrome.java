package NewInterview;

public class PalindromeInPalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("forgeeksskeegfor"));
    }
    public static String palindrome(String str){
        String word ="";
        for(int i =0; i<str.length(); i++){
            if((str.substring(i).equalsIgnoreCase(str.substring(str.length()-1-i)))){
                word = str.substring(i) +"";
            }
        }
        return word;
    }
}
