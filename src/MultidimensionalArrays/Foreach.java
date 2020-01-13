package MultidimensionalArrays;

public class Foreach {
    public static void main(String[] args) {
        int [][] numbers = { { 1,2,3,9}, {4,5}, {7,8,9}};
        for(int [] inner : numbers){

            for(int elemant: inner) {
                System.out.println(elemant);
            }
            System.out.println();
        }
    }
}
