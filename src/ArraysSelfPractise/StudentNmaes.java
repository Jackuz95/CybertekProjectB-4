package ArraysSelfPractise;

import java.util.Arrays;

public class StudentNmaes {
    public static void main(String[] args) {
        String [] names = {"James", "Taha", "Elizes", "Ahmsed","Benzema"};
        for(int i=0; i<names.length; i++) {
            String readyNames = names[i];

            System.out.println(readyNames.charAt(0));
        }
        System.out.println("-----------------------");
//           // String lastLetter = names[i].substring(names[i].length()-1);
            for(int i= 0; i<names.length; i++){
            String NameWithS = "";
            if(names[i].endsWith("s")){
                NameWithS = ""+ names[i];
                System.out.println(NameWithS);
            }
        }
        System.out.println("----------------------");
            for(int i= 0; i<names.length; i++){
                if(names[i].contains("s")) {
                    System.out.println(names[i]);
                }
            }

    }
}
