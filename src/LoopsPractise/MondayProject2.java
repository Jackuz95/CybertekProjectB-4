import java.util.*;

class MondayProject2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TASK 1
        System.out.println("Enter the number:");
        int x = input.nextInt();

        //your code here
        //----------------------------------------------------------
        int first = 0;
        int second = 1;
        int sumOfTwo = 0;


        for(int i=1; i<=x ; i++) {
            sumOfTwo = first + second;
            first = second;
            second = sumOfTwo;

        }
        System.out.println(" " + sumOfTwo );



        // //----------------------------------------------------------
        System.out.println();
        //TASK 2
        System.out.println("Enter word:");
        String str1=input.nextLine();
        boolean validWord= false;


        //your code here
        //----------------------------------------------------------


        if(str1.length()>3 && str1.length()<100) {
            validWord = true;
            if (validWord) {
                for (int i = 0; i < str1.length(); i++) {

                    char number = str1.charAt(i);
                    if (number >= 48 && number <= 57) {
                        System.out.print(number);
                    }


                }
            }
        }
        else{
            //validWord=false;

            System.out.println("Invalid enter");
        }


        //----------------------------------------------------------

        //TASK 3
        //----------------------------------------------------------
        int number;
        String answer ;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        //your code here
        //----------------------------------------------------------


        do{
            System.out.println("Enter the number:");
            number= input.nextInt();input.nextLine();

            if(number>0){
                positive++;
            }else if(number<0){
                negative++;
            }else{
                zero++;
            }

            System.out.println("Do you want to continue y/n?");
            answer=input.nextLine();input.nextLine();

        }while(answer.equals("y"));


        //----------------------------------------------------------
        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);




        //TASK 4
        //----------------------------------------------------------
        System.out.println("Enter the word:");
        String str2 = input.nextLine();
        //----------------------------------------------------------

        String reverse = "";
        char letter = str2.charAt(0);
        int a = str2.length() -1;

        for(int i = 0; i < str2.length(); i ++){
            letter = str2.charAt(a);
            reverse += "" + letter;
            a--;


        }
        if(str2.equals(reverse)){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not palindrome");
        }




        //----------------------------------------------------------


    }
}
