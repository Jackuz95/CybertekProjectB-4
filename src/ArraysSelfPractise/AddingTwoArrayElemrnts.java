package ArraysSelfPractise;

import java.util.Arrays;

public class AddingTwoArrayElemrnts {
    public static void main(String[] args) {


    int [] first = {3,2,6,43,7,20,5};
    int [] second = {2,7,-10,10,-5,2,5,7};
int [] sum = new int [first.length];
for(int i=0, j=0 , k=0; i<first.length; i++ ) {
    sum[k] =first[i]+ second[j];
    k++;
    j++;

}
        System.out.println(Arrays.toString(sum));
}
    }