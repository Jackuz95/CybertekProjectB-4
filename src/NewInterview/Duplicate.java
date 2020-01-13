package NewInterview;

public class Duplicate {
    public static void main(String[] args) {
        duplicate(1,2,3,3,4,5,4,6);
    }
    public static void duplicate(int ... arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]==arr[j]) && i !=j){
                    System.out.println(arr[j]);
                }
            }
        }
    }

}
