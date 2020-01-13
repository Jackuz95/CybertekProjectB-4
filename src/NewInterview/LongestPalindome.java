package NewInterview;

public class LongestPalindome {
    public static void main(String[] args) {
        System.out.println(findPalindrome("civicasifuasfcivic"));

    }
    public static String findPalindrome(String str){ // ab(civic)hgfghjk(civic)khjf;
        String res = "";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i)+"";
        }
        if(str.length()!=reverse.length()){
            return "Not palindrome";
        }
        for(int i=0, j=0; i<str.length(); i++, j++){
            if(str.substring(0,i).equals(reverse.substring(0,j))){
                res = str.substring(0,i);
            }
        }
        return res;
    }
}
