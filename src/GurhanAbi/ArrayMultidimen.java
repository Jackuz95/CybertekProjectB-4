package GurhanAbi;

public class ArrayMultidimen {
    public static void main(String[] args) {
        int [][]  numbers = {{44,62,12,51,33},
                             {33,66,54,12,25},
                             {65,78,56,42,22},
                             {14,12,15,16,14}};
        for(int i =0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
