package Return;

public class Weekdays {       //////USe Switch case for this task!!!!
    public static boolean checkWeekdays(String str1) {
        str1= str1.toLowerCase();
        String days ="monday, tuesday, wednesday, thursday, friday, saturday, sunday";

        for (int i = 0; i < days.length() - 3; i++) {
            if (str1.contains(days)) {

            }return true;

        } return false;
    }

        public static void main (String[]args){
            System.out.println(checkWeekdays("sunday"));
        }
    }
