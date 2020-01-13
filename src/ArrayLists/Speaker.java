package ArrayLists;
import java.util.*;
public class Speaker {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("James");
//        names.add("Adam");
//        names.add(1,"Taha");
//        System.out.println(names);
//        System.out.println(names.get(0));
//        System.out.println(names.remove(1));
//        System.out.println(names);
//
//        ArrayList<String> words = new ArrayList<>();
//        words.add("hi");
//        words.add("grass");
//        words.add("pen");
//        words.get(1);

         // How to use List for any objects.



        ArrayList<Cat> catsForSale = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.color = "White";
        cat1.age = 3;
        Cat cat2 = new Cat();
        cat2.color = "blue";
        cat2.age = 2;

        catsForSale.add(cat1);
        catsForSale.add(cat2);
          //System.out.println(catsForSale.size());

        for(int i=0; i<catsForSale.size(); i++){
            System.out.println("Cat# " + (i+1));
            System.out.println("Color: " + catsForSale.get(i).color);
            System.out.println("Age: "  + catsForSale.get(i).age );
            System.out.println();
        }
//        Cat#1
//        color: white.
//        age: 3;
//        Cat#2
//         color: blue.
//         age : 2
        System.out.println();

    }

}
