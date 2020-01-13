package Loops;

public class NchiHad {
    public static void main(String[] args) {
        /*logic is like this here:
        if our number is any odd number, sum of each element of this number is even!!!(13 = 1+3(4); 15 = 1+5(6);
        if out number is any even number , sum of each elemant of this number is even also!! 20 = 2+0(2); 26 =2+6(8)
        and so on it is gonna continue:
        because of having limit 200000(not inclusive like( <=) just <) our loop(for) is gonna till this;
        and you can check any number(as a limit) to find final number by using program below: :)
         */

        int n = 0;
        for(int i=0; i<100; i++){
            if(i%2==1){
                n =i;
            } else
                n =i;
            }
        System.out.println(n);
        }
    }

