package GurhanAbi;

public class reverse {
    public static void main(String[] args) {
        String str = "We went to picnic today";
        String reverse = "";
        //String [] haha  =str.split("");
        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i)+"";
           // reverse += haha[i] + "";
        }
        System.out.println(str);
        System.out.println("reversed version id: " + reverse);
    }
}
