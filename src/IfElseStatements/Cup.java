package IfElseStatements;
import java.util.Scanner;
public class Cup {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter your code:");
        int myCode = input.nextInt();
        int passCode = 3241;
        // write a program that asks to enter 4 digit integer via scanner
        // compare the passcode
        // if valid passocde print "welcome to iPhone"
        //if invalid print "try again!"
        //check for special cases;
        // 1. check for nagative number. if entered passcode is negative print " no Negative number"
        //2. passcode must be only 4 digits. if more than 4 digits "you musted  more digits"
        // if less than 4 digits then print " you entered more digits"

        if (myCode==passCode) {
            System.out.println("Welcome to iPhone");
        }
        else if (myCode<0) {
            System.out.println("no negative number");
        }
        else if (myCode>9999) {
            System.out.println("you entered more digits");
        }

        else if ( myCode<999) {
            System.out.println("you entered less digits");
        }
        else {
            System.out.println("Try again please!");
        }



    }
}
