package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaskColors {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        Iterator<String> it = colors.iterator();
        String result = "";
        while(it.hasNext()){
          result += colors;
        }
    }
}
