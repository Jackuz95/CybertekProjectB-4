package CodingBat;

public class String3equalisNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
    public static  boolean equalIsNot(String str) {
        str = str.replace(" ", "").trim();
        boolean valid =true;
        str = str.replace("is", "$");
        str = str.replace("not", "#");
        System.out.println(str);
        int count1 =0;
        int count2 =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='#'){
                count1++;
            }
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='$'){
                count2++;
            }
        }


        if(count1 ==count2){
            valid =true;
        }else{
            valid = false;
        }
        return valid;
    }
}
