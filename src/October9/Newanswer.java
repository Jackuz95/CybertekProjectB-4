import java.util.Scanner;

public class Newanswer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int change ,quarter,dime, nickle,penny;


        System.out.println("put your change : ");
        change = input.nextInt();

        quarter = change /25 ;
        dime = (change - (quarter*25))/10;
        nickle =(change - ((quarter*25) +(dime*10)))/5;
        penny   = change -((quarter*25)+(dime*10)+(nickle*5));
        System.out.println("your change is " + quarter + " quarters and " + dime + " dimes and  " + nickle+ " nickles " + penny+ " penny"  );
    }
}