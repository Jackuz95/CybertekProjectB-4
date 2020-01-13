package Interview;

public class ArmstrongNumber {
    public static void main(String[] args) {
        armstrong(8208);
    }
    public static void armstrong(int number){
        String num = number +"";
        int sum =0;
        int power = num.length();
        for(int i = 0; i<power; i++){
            int eachNumber = Integer.parseInt(num.charAt(i)+ "");
            sum +=Math.pow(eachNumber, power);
        }
        if(sum ==number){
            System.out.println(" Armstrong Number");
        }else{
            System.out.println("Not Armstrong number");
        }

    }
}
