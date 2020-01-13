//package ReplIt;
///**
// * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved.
// * Any redistribution or reproduction of part or all of the contents in any form is
// * prohibited without the express consent of CyberTek.
// */
//
//
////import static org.junit.Assert.assertEquals;
//
//import java.util.Calendar;
//
//public class Date implements Comparable<Date>{
//
//    private static final int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    protected final int month;
//    protected final int day;
//    protected final int year;
//
//    /*
//     * Initialized a new date from the month, day and year.
//     * @param month the month (between 1 and 12)
//     * @param day the day (between 1 and 28-31, depending on the month)
//     * @param year the year
//
//     */
//
//
//    public Date(int month, int day, int year){
//        if(!isValid(month, day, year)){
//            System.out.println("Invalid Date");
//            throw new IllegalArgumentException();
//        }
//        // TO DO
//        this.month=month;
//        this.year=year;
//        this.day=day;
//    }
//
//    /*
//     * @return month of that month
//     */
//    public int getMonth(){
//        return this.month;
//    }
//
//    /*
//     * @return day of that day
//     */
//    public int getDay(){
//        return this.day;
//    }
//
//    /*
//     * @return year of that year
//     */
//    public int getYear(){
//        return this.year;
//    }
//
//    /**
//     * This method checks if a given date is a valid calendar date
//     *
//     * @param m  month
//     * @param d  day
//     * @param y  year. (A year is no less than 1900, and no greater than 2100)
//     * @return  true if the given date is a valid calendar date. false otherwise
//     */
//    public static boolean isValid(int m, int d, int y){
//        if(y>=1900&&y<=2100&&m>=1&&m<=12&&d>=1&&d<=31){
//            return true;
//        }
//        return false;
//    }
//
//
//    /**
//     * @param year
//     * @return true if the given year is a leap year. false otherwise.
//     */
//
//    public static boolean isLeapYear(int year){
//        if(year%4!=0){
//            return false;
//        }
//        return true;
//    }
//
//    /**
//     * Compare this date to that date.
//     * @return {a negative integer or zero or a positive integer}, depending on whether this date is {before, equal to, after} that date
//     */
//
//    public int compareTo(Date that) {
//        //TO DO
//        //this.year =year;
//
//        if(that.year==this.year){
//            if(that.month==this.year){
//                if(that.day>this.day){
//                    return -1;
//                }
//            }
//        }return 1;
//
//        // if(that.year>this.year){
//        //   return -1;
//        // } return 1;
//
//    }
//
//    /**
//     * Return a string representation of this date.
//     * @return the string representation in the format MM/DD/YYYY
//     */
//    public String toString(){
//        //TO DO
//        String newW = this.month + "/"+ this.day + "/" + this.year;
//        return newW;
//    }
//
//
//    /**
//     *
//     * @return the word representation of the date.
//     * Example: (new Date(12,1,2017)).dateToWords() returns "December One Two Thousand Seventeen"
//     */
//    // public String dateToWords() {
//    //     String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
//    //     String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
//    //     String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
//    //     String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
//    //     String[] yearWords = {"Hundred", "Thousand"};
//
//         // TO DO.
//         String result ="";
//         for(int i=1; i<monthWords.length; i++){
//           if(this.month ==indexOf(monthWords[i])){
//             result += monthWords[i]+"";
//           }
//           if(this.day<10){
//           for(int i=i; i<numbersLessThanTen.length; i++){
//             if(this.day==indexOf(numbersLessThanTen[i])
//           }
//         }
//
//         return "TODO";
//     }
//
//    public int age(){
//        Calendar cal = Calendar.getInstance();
//        int d = cal.get(Calendar.DAY_OF_MONTH);
//        int m = cal.get(Calendar.MONTH);        //starts from 0 to 11
//        int y = cal.get(Calendar.YEAR);
//
//        int age = 0;
//        // TO DO
//
//
//        return age;
//    }
//
//
//}