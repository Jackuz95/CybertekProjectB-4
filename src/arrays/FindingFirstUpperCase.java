package arrays;

public class FindingFirstUpperCase {
    public static void main(String[] args) {
        String [] words = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        int count =0;
        for(String word: words) {
            if(word.charAt(0)>=65 && word.charAt(0)<=90) {
                count++;
                System.out.print(" " +word + " " +count);

            }
        }
    }
}
