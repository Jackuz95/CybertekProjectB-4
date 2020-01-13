package Interview;

public class Fibonacchi {
    public static void main(String[] args) {
        fibonacci(2,3,10);
    }
    public static void fibonacci(int firstNumber, int secondNumber, int range){
        int total =0;
            if(range<=0){
                System.out.println("Invalid number");
            }
            if(range==1){
                System.out.println(firstNumber);
            }
        System.out.print(firstNumber + " "+ secondNumber + " ");
            for(int i=2; i<range; i++){
                total = firstNumber +secondNumber;
                firstNumber = secondNumber;
                secondNumber = total;
                System.out.print(total + " ");
        }
    }


}
