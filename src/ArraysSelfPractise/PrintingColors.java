package ArraysSelfPractise;

public class PrintingColors {
    public static void main(String[] args) {
        String [] colors = {"red", "yellow", "blue", "white"};
        for(int i=0; i<colors.length; i++) {
            if (colors[i].length() >= 4) {
                System.out.println(colors[i]);
            }
        }


     }
}
