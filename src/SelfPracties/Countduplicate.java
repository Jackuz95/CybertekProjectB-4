package SelfPracties;

public class Countduplicate {
    public static void main(String[] args) {
        int [] arr = {10,20,10,20,50,30,10,10,70,70};
        System.out.println(sockMerchant(9, arr));
    }
    static int sockMerchant(int n, int[] ar) {
        int count =0;
        for(int i=0; i<ar.length-1; i++){
            for(int j=i+1; j<ar.length; j++){
                if(ar[i]==ar[j] && ar[i]!=0){
                    count++;
                    ar[j]=0;
                    break;
                }
            }
        }

        return count;
    }


    }

