package ReplIt;

public class SelfDoingMondayPro {
    public static void main(String[] args) {
        System.out.println(extractNum("akjsd6974660006asfajkf"));
    }

     public static int [] extractNum (String str){
         String [] arr = str.split("");
         String  result = "";
         for(int i=0; i<arr.length; i++){
             if(arr[i].charAt(i)>=48 && arr[i].charAt(i)<=57 ){
                 result+=  arr[i]+"";
             }
         }
         String [] arr2 = result.split("");
         int [] arr3 = new int [result.length()];

         for(int j=0; j<arr3.length; j++){
             arr3[j] = Integer.valueOf(arr2[j]);
         }
return arr3;


     }
    }
