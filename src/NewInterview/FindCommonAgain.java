package NewInterview;

public class FindCommonAgain {
    public static void main(String[] args) {
        System.out.println(findCommon("apple","java"));
    }
    public static String findCommon(String str1, String str2){   // apple ; java; // pplejv
        str1 = str1.trim().toLowerCase().replace(" ", "");
        str2 = str2.trim().toLowerCase().replace(" ", "");

        for(int i=0; i<str1.length(); i++){
            if(str1.contains(str2.charAt(i)+"") && str2.contains(str1.charAt(i)+"")){
                str1 = str1.replace(str2.charAt(i)+"","");
                str2 = str2.replace(str1.charAt(i)+"", "");
            }
        }
        return str1+str2;
    }
}
