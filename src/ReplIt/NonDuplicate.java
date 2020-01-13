package ReplIt;

public class NonDuplicate {
    public static void main(String[] args) {
        FindNon(1,2,3,4,5,5,4,3,1,6,1,3,7);
    }

    public static void FindNon(int... arr) {
        int temp  = 0;
        String result ="";
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            temp = arr[i];
            for(int j =0; j<arr.length; j++){
                if(temp==arr[j]){
                    count ++;
                }
            }

            if (count==1){
                result +=temp+" ";

            }
        }
        System.out.println(result);

    }
}