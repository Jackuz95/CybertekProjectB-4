package ArrayClass;

public class ReverseString {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String [] arr = str.trim().split(" ");
        String finalString = "";
        int num = arr.length-1;
        for(String word : arr) {
            String rev = "";
            for(int i=word.length()-1; i>=0; i--)  {
                rev+=word.charAt(i);
            }
            finalString+= rev+" ";
        }
        System.out.println(finalString);
    }
}
