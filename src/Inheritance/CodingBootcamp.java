package Inheritance;

public class CodingBootcamp extends School {
    public static void main(String[] args) {


        CodingBootcamp codingBootcamp = new CodingBootcamp();
        codingBootcamp.name = "Vunderking school";
        codingBootcamp.address = "123 main st, chicago, Il";
        codingBootcamp.type  = "preparing developers";
        codingBootcamp.giveHW();
        codingBootcamp.hostEvent("12/30/2019");
        System.out.println("Name: " + codingBootcamp.name);
        System.out.println("Address "  + codingBootcamp.address);
        System.out.println("Type: " +codingBootcamp.type);
    }

}
