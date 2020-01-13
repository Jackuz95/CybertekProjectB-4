package StaticClass;

import java.util.Arrays;
import static java.util.Arrays.*;
public class ImportingStatic {
    public static void main(String[] args) {
        int [] a = {1,4,3,8};
        Arrays.sort(a);
        sort(a);
       // System.out.println(Arrays.toString(a));
    }
}
