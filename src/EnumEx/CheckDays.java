package EnumEx;

public class CheckDays {
    public static void main(String[] args) {
        DaysEnum day = DaysEnum.Monday;
        switch (day){
            case Monday:
                System.out.println("mondays are bad!");
                break;
            case Friday:
                System.out.println("Fridays are great!");
                break;
            case Sunday:
                System.out.println("Weekends are the best!");
                break;
            case Saturday:
                System.out.println("Weekends are the best!");
                break;
            case Tuesday:
                System.out.println("Regular day");
                break;
            case Wednesday:
                System.out.println("Regualar day");
                break;
            case Thursday:
                System.out.println("Regular day");
                break;
        }
    }
}
