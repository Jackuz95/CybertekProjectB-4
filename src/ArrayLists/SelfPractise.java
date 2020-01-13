package ArrayLists;

import java.util.ArrayList;

public class SelfPractise {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jason");
        names.add("Adam");
        names.add(0,"Jurabek");
        System.out.println(names);
        System.out.println(names.get(1).toLowerCase().charAt(2));

        ArrayList<CatSelf> catsForSale = new ArrayList<>();
       CatSelf cat1 = new CatSelf();
       cat1.color= "white";
       cat1.age =3;
       CatSelf cat2 = new CatSelf();
       cat2.color = "Orange";
       cat2.age = 5;
       catsForSale.add(cat1);
       catsForSale.add(cat2);
       for(int i=0; i<catsForSale.size(); i++){
           System.out.println("\nCat#" + (i+1));
           System.out.println("Color "  + catsForSale.get(i).color);
           System.out.println("Age " + catsForSale.get(i).age );
       }

    }
}
