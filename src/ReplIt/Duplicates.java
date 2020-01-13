package ReplIt;

public class Duplicates {


    public static void main(String[] args) {
        String [] r = { "dog", "cactus", "cactus", "coffee mug", "coffee mug", "coffee mug"};
        System.out.println(getDup(r));
}

    public static int getDup(String [] r){
int sm =0;
      //  String [] arr = new String[r.length];
        for(int i=0; i<r.length; i++){
            int count =0;
            for(int j=0; j<r.length; j++){
                if( r[i].equals(r[j]) ){
                    count ++;
                    sm =count;

                }
            }

        } return sm;
    }
}

