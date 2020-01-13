package Methods;

public class AmAndPm {
    public static void main(String[] args) {
 PmAm(12,50,true);
    }

    public static void PmAm(int hours, int minutes, boolean valid) {


        if (hours >= 1 && hours <= 12 ) {
            if (minutes >= 1 && minutes <= 59) {
                if(valid) {
                    System.out.println(hours + ": "+ minutes +" AM");
                }else {
                    System.out.println(hours+ ": " + minutes+ " PM");
                }

            } else {
                System.out.println("invalid time info");
            }

        } else {
            System.out.println("Invalid time info");
        }

    }
}
