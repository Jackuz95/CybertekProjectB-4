package MethodsSelfpractise;

public class ArraysNegativeNumbers {
    public static void main(String[] args) {
       // int [] numbers = {1,5,-5,3,-7,9,0,-8};
    NegativeNum(1,-8,8,7,5,10);
    }
    public static void NegativeNum (int ... numbers) {
        for(int num: numbers) {
            if(num<0) {
                System.out.print(num);
            }
        }
    }
}
