package NewInterview;

public class AddTwoString {
    public static void main(String[] args) {
        System.out.println(addWord("jurabek","123"));
    }
    public static String addWord(String str1, String str2){
        str1 = str1.trim(); str2 = str2.trim();
        String ready ="";
        String res2 = "";
        String res ="";
        if(str1.length()==str2.length()){
            for(int i=0, k=0; i<str1.length(); i++,k++){
                ready += str1.charAt(i) + "" + str2.charAt(k)+ "";
            }
            return ready;
        }else {

            if(str1.length()>str2.length()){
                for(int i =0, z=0; i<str2.length(); i++,z++){
                   res +=str1.charAt(i) +"" + str2.charAt(z)+ "";
                }
                res = res +str1.substring(str2.length());
                return res;
            }else {

                for(int i =0, z=0; i<str1.length(); i++,z++){
                    res2 +=str1.charAt(i) +"" + str2.charAt(z)+ "";
                }
                res2 = res2 + str2.substring(str1.length());
            }
        }
       return res2;
    }
}
