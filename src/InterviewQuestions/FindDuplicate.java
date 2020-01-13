package InterviewQuestions;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,4};
        System.out.println(getArray(arr));
    }
    public static boolean getArray(int[] num) {
        for(int i=0;i<num.length;i++) {
            for(int j=i+1;j<num.length;j++) {
                if(num[i]==num[j]) {
                    return true;
                }
            }
        }
        return false;
    }


}
