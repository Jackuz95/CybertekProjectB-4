package InterviewQuestions;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000001));
    }

    public static boolean isPalindrome(long number){
String haha = ""+number;
String hahaha = "";
String [] arr = haha.split("");
for(int i= arr.length-1; i>=0; i--){
    hahaha += arr[i];
}
if(haha.equalsIgnoreCase(hahaha)){
    return true;
}return false;
    }
}
