package GurhanAbi;
import java.util.Arrays;
public class GurhanAbiSort {
    public static void main(String[] args) {
        String [] shows = {"Game of Thrones", "Friends", "Prison Break", "Doctor Who", "Greys Anatomy"};
        Arrays.sort(shows);
        for(int i = 0; i<shows.length;i++){
            System.out.println("#" + i + " "+  shows[i]);
        }
    }
}
