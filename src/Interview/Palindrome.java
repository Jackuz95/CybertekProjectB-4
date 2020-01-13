package Interview;

public class Palindrome {
    public static void main(String[] args) {
numberIsPalindrome(5445);
    }

    public static void numberIsPalindrome(int number){ //5445
        int reverse = 0;
        int number2 = number;
        while (number2>0){
            int digit = number2%10;
            reverse = digit + reverse*10;
            number2 = number2/10;
        }
        if(number ==reverse){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
