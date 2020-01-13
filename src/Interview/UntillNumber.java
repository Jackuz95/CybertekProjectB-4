package Interview;

public class UntillNumber {
    public static void main(String[] args) {
printNum3(35);
    }
    public static void printNum3(int num){
        for(int i=0; i<num; i++){
            if(i%10==3){
                System.out.print(i +  " ");
            }
        }
    }


}
