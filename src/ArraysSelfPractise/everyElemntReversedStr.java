package ArraysSelfPractise;

public class everyElemntReversedStr {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String[] Splitted = str.trim().split(" ");
        String finalString = "";

        for (String words : Splitted) {
            String rev = "";
            for (int i = words.length() - 1; i >= 0; i--) {
                rev = rev + words.charAt(i);
            } finalString = finalString+rev +" ";

        }System.out.println(finalString);
    }
}
