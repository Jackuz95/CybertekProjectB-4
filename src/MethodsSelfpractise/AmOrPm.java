package MethodsSelfpractise;

public class AmOrPm {
    public static void main(String[] args) {
AmOrPm(4,45,true);
    }
    public static void AmOrPm (int hours, int minutes, boolean valid){
        //valid=true;
        if((hours>=1 && hours<=12) && (minutes>=1 && minutes<=59)){
           if(valid==true) {
                 System.out.println(hours + ": " + minutes + " AM");

        } else {
               System.out.println(hours + ": " + minutes + " PM");
           }
        } else {
            System.out.println("Invalid information");
}
}
}