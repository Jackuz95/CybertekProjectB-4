package Loops;

public class UniqueChar {
    public static void main(String[] args) {
        String str = "javaandjava";
        String newWord = "";
        for(int i=0; i<str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    newWord += str.charAt(j);

                }
            }
        } System.out.println(newWord);
    }
}
