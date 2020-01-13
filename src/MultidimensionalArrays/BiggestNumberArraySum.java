package MultidimensionalArrays;
//
public class BiggestNumberArraySum {
//    public static void main(String[] args) {
//
//    }
//
//    public static
//}
public static void main(String[] args){

         System.out.println(waterTax(151));
        }

public static double waterTax(double units)
        {
        double bill = 0.0;
        //double ready = 50;
       // double readyToPay = 50*0.6;


        //your code here
        if(units<=50) {
        bill = units*0.6;
        //return bill;
        } else if(units>50 && units<=100) {
        bill =  units*0.9;
        //return   bill;
        } else if(units>100 && units<=150) {
        bill = (units*0.9)+50;
        //return bill;
        } else  {
        bill = (units*0.9)+100;
        //return bill;







        //end your code here

        }
        return bill;
        }//end waterTax


        }