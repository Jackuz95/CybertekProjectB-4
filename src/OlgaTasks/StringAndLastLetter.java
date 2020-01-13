package OlgaTasks;

public class StringAndLastLetter {
    public static void main(String[] args) {
        String word = "morning";
        String new_Word = word.charAt(word.length()-1) + word;
        System.out.println(new_Word);

    }
}
