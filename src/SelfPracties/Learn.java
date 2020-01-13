package SelfPracties;

import java.util.ArrayList;

public class Learn {
    String name;
    int age;
  public Learn(String name){
      this.name = name;
  }
  public Learn(String name, int age){
      this.name = name;
      this.age = age;
  }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("Jk");
        names.add(1,"James");
        System.out.println(names);
    }
}
