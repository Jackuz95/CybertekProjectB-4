package Interview;

public class SecondMax {
    public static void main(String[] args) {
       // int [] arr = {1,2,3,4,5,5,5,5,5,5,6,6,6,6,6};
        System.out.println(secondMax(1,2,3,5,4,6,8));
    }

    public static int secondMax(int ... arr){
        int max = arr[0];
        int secondMax = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            if(arr[i]>secondMax && arr[i]<max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
