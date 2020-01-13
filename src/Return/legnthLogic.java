package Return;

public class legnthLogic {
    public static void main(String[] args) {
        String word = "word";
        System.out.println(word);
        System.out.println(stringLength(word));
    }
    public static int stringLength(String str) {
        int count =0;
        for(int i = 0; i<str.length(); i++) {
            count ++;
        }
        return count;
    }

}
