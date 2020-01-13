package ReplIt;

public class CountWord {
    public static void main(String[] args) {
        String[] arr1 = {"java", "ahmed", "film", "yellow", "blue", "apple", "java", "java"};
        String word = "java";
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals(word)) {
                count++;
            } else {
                count2++;
            }

        }
//        if(count2)
        if (arr1.length - count2 == 0)
            System.out.println(0);
        else {
            System.out.println(count);
        }
    }
}
