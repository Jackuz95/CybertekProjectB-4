package Loops;

public class UniqueSelf {
    public static void main(String[] args) {
        String word =  "java is fun so and dump as well";
        String str = "";
      //  int count =0;
        for(int i=0; i<word.length(); i++){

            if(!str.contains("" +word.charAt(i))){
                str += ""+word.charAt(i);
                //count++;
            }
          //  System.out.println(count);
        }
        System.out.println(str);

    }
}
