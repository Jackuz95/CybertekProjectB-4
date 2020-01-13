package ReplIt.Methods;

public class reversed {
    public static void main(String[] args) {
        String word = "I love java";
        word = word.trim().toLowerCase();
        String [] arr = word.split(" ");
        String reversed = "";
        for(int i= arr.length-1; i>=0; i--){
            reversed += arr[i] + " ";
        }
        System.out.println(reversed.trim());
    }
}
