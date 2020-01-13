package StringsSelfPracitse;
import java.util.Scanner;
public class CarBrands {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String Brands = " Toyota , Nissan , BMW , Maserati , Jaguar" ;
      //  for ( ; ;)  {
            System.out.println("enter your brand:");
            String entered_brand = input.nextLine();
            entered_brand = entered_brand.substring(0,1).toUpperCase() + entered_brand.substring(1) ;
            if ( Brands.contains(entered_brand)  && entered_brand.equals("Nissan") && entered_brand.equals("Toyota"))  {
                System.out.println("you have japanese brands.");
               // break;
             if ( Brands.contains(entered_brand) && entered_brand.equals("BMW")) {
                    System.out.println("you have a german car");// break;
                } else if (Brands.contains(entered_brand) && entered_brand.equals("Maserati")) {
                    System.out.println("you have a italian car");// break;
                } else if(Brands.contains(entered_brand) && entered_brand.equals("Jaguar")) {
                    System.out.println("you have a british car"); //break;
                }


                } else {
                System.out.println("No X cars"); //break;
            }
        }
    }

