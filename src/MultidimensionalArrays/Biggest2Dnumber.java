package MultidimensionalArrays;

public class Biggest2Dnumber {
    public static void main(String[] args) {
       int [][] num = {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43, 1021000,23,23}};
        System.out.println(BiggestNum(num));
    }

    public static int  BiggestNum (int [][] num){
        int  max = num[0][0];
        for(int i= 0; i<num.length; i++){
                for(int j =0; j <num[i].length; j++){
                    if (num[i][j]>max){
                        max = num[i][j];
                    }
            }


        } return max;
    }
}
