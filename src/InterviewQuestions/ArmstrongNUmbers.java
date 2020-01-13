package InterviewQuestions;

public class ArmstrongNUmbers {
    public static void main(String[] args) {
        System.out.println(Armstrong(152));
    }
   public static boolean Armstrong(int number) {
       String haha = "" + number;
       int power = haha.length();
       int total = 0;
    //  String [] arr = haha.split("");
       for (int i = 0; i < haha.length(); i++) {

          int digit = Integer.valueOf(haha.charAt(i)+"");

           total += Math.pow(digit,power);
       }
       if(total==number){
           return true;
       }
       return false;
   }

}
