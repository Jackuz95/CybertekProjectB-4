package StaticClass;

public class BestBuy {
    String location;
    static int numOfComputers ;
    static String day;

     static  {
         System.out.println("run first");
         numOfComputers =50;
         day = "monday";
     }

     static {
         System.out.println("run 2nd");
         if(day.equals("tuesday")){
             numOfComputers =60;
         } else {
             numOfComputers=20;
         }
     }


    public static void print (){
        System.out.println(numOfComputers);
    }

}
