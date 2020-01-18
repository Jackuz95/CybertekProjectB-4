package CodingBat;

public class String3SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits("X1z9b2"));
    }
    public static int sumDigits(String str) {
        int sum =0;
        int sum2 =0;
        char [] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(Character.isDigit(arr[i])){
                sum += Integer.parseInt(arr[i]+"");
            }
        } return sum;
    }

}
