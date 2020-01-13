package InterviewQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertingDate {
    public static void main(String[] args) {

String str1 = new String();
str1 ="james";
        System.out.println(str1);
        String str = "December 2, 2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("MMMM d, yyyy"), Locale.ENGLISH);
        LocalDate date = LocalDate.parse(str, formatter);
        System.out.println(date);
    }
}
