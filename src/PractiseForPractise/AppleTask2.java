package PractiseForPractise;

public class AppleTask2 {
    public static void main(String[] args) { // apple
        countLetter("java is funn");
    }

    public static void countLetter(String str) {
        str = str.trim().toLowerCase().replace(" ", "");
        char[] arr = str.toCharArray();
        int count = 0;
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            if (!temp.contains(arr[i] + "")) {
                temp += arr[i] + "";
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;// break;
                    }
                }
            }
            System.out.println(arr[i] + " " + count + " times");

        }
    }
}
