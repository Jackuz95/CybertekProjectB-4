package NewInterview;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) { // 1,2,2,5,6,5,7,3,8,3;   = 2,5,3
findDuplicate(1,2,2,5,6,7,3,8,3,4,7,4);
    }

    public static void findDuplicate(int... arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //int couunt =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i]==arr[j]){
                   System.out.println(arr[j]); break;
               }
            }
        }

    }
}
