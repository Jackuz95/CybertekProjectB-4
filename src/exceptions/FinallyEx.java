package exceptions;

public class FinallyEx {
    public static void main(String[] args) {
        String s ="";
        try{
             s = "cybertek";
            System.out.println(s.substring(30));
            System.exit(0);
        }catch (StringIndexOutOfBoundsException e ){
            System.out.println("Index doesnt exist");
            System.exit(0);
        }finally {
            System.out.println("The string was: " + s);
           // throw new RuntimeException();
        }
    }
}
