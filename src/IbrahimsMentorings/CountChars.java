package IbrahimsMentorings;

import javax.print.DocFlavor;
import java.util.HashMap;

public class CountChars {
    public static void main(String[] args) {
        String s = "abrakadabra";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch))
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch) + 1);
        }
       // System.out.println(map);


        int [] arr = {1,2,3,1,2,3,1,3,1,1,2,2,3};
        HashMap<Integer, Integer> intArraycounterMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!intArraycounterMap.containsKey(arr[i]))
                intArraycounterMap.put(arr[i],1);
            else
                intArraycounterMap.put(arr[i], intArraycounterMap.get(arr[i])+ 1);
        }
        System.out.println(intArraycounterMap);
    }
}
