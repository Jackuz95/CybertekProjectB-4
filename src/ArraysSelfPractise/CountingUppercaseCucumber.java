package ArraysSelfPractise;

public class CountingUppercaseCucumber {
    public static void main(String[] args) {
        String [] words = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};

        boolean check = true;
        int count = 0;
        for(String word: words) {

            char firstLetter = word.charAt(0);
            if(firstLetter>=65 && firstLetter<=90) {
                check  =true;
                count++;
            }

        } if(check) {
            System.out.println("We have " + count + " words starts with Uppercase");
        } else {
            System.out.println("We dont any words with Uppercase");
        }
    }
}
