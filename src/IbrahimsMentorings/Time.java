package IbrahimsMentorings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
//LocalDate d = LocalDate.now();
//        System.out.println(d);
//        LocalTime t = LocalTime.now();
//        System.out.println(t);
//
//
//
 LocalDateTime dt =  LocalDateTime.now();
       // System.out.println(dt);
//
//        LocalDate d1 = LocalDate.of(1999,1,1);
//        System.out.println(d1);
//       d1 =  d1.plusYears(1);
//        System.out.println(d1);
//        LocalDate dt = LocalDate.now();
//        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
//        System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        System.out.println(dt.toString());
        Period p = Period.of(0,0,1);
        dt = dt.plus(p);
        DateTimeFormatter  f = DateTimeFormatter.ofPattern("E dd");
        System.out.println(dt.toString());

    }
}
