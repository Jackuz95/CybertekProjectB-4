package Inheritance;

public class School {
   public String name;
   public String address;
    public String type;

    public void giveHW(){
        System.out.println(this.name + " is giving home work");
    }
    public void hostEvent(String date){
        System.out.println(this.name + " hosting an event on " + date);
    }

}
