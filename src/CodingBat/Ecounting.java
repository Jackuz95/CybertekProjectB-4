package CodingBat;

public class Ecounting {
    public static void main(String[] args) {
        System.out.println(Taha("JuraBeEkee"));
    }

    public static boolean Taha (String str) {
        int count =0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='e'){
                count++;
            }
        }
        if(count>=1&& count<=3){
            return true;
        }
        return false;
    }

}
