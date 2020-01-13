package ReplIt;

public class December12Project {
    public static void main(String[] args) {
        String in = "java is fun juRabek ahmed";

            in = in.trim();
            String newWord = "";
            String newWord1 ="";

            String [] arr = in.split(" ");
            for(int i=0; i<arr.length; i++){
                newWord1 = arr[i].substring(0,1).toUpperCase()+ arr[i].substring(1).toLowerCase();
                newWord += newWord1+" ";
            }

        System.out.println(newWord.trim());
        }
    }


