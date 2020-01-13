package ArraysSelfPractise;

public class Biggesstnumberrs {
    public static void main(String[] args) {
        int [] numbers = {2,400, 5, 12,25,45,1,9,100,200,45, 78};
        // loop through each elements;
        // create an integer to save our bigger number;
        // create if condation to find bigger numbers;
        int max = numbers[0];
        for(int i= 0; i<numbers.length; i++ ) {
            if(numbers[i] >max) {
                max = numbers[i];
            }

        }System.out.println(max);

    }
}
