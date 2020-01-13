package ReplIt;

public class IsSorted {
    public static void main(String[] args) {
        int [] arr = {1,0,4,3,5};
        boolean check  = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]) {

            }
            else {
                System.out.println(!check);
            }
        }System.out.println(check);

    }
}
