package IbrahimsMentorings;

public class CountWords {
    public static void main(String[] args) {
        System.out.println(countWord("Java is fun"));
    }
    public static int countWord(String str)
    {
        return str.split(" ").length;
    }
}
