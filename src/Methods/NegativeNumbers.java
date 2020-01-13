package Methods;

public class NegativeNumbers {
    public static void main(String[] args) {
        int [] arr = { -1, 3, -4, -2,5};
negativeNumbers(arr);
    }
    public static void negativeNumbers (int ... arr) {
        for(int num: arr) {
            if(num<0){
                System.out.println("negative numbers: " +num);
            }
        }
    }
}
