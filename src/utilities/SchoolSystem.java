package utilities;

import Inheritance.Camera;


import java.util.ArrayList;

public class SchoolSystem  {
    public static void main(String[] args) {
Camera camera = new Camera();



//        ArrayList<String> store = Mycollection.getStringList();
//        System.out.println(store);
        ArrayList<String> list = new ArrayList<>();
        list.add("JAson");
        list.add("john");
        list.add("apple");
        list.add("karina");
        list.add("taha");
        list.add("JAson");
        list.add("apple");
        System.out.println(list+ "\n");
       ArrayList<String> z=  Mycollection.removeDuplicates(list);
        System.out.println(z);

    }
}
