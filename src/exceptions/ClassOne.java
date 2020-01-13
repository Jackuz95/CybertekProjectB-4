package exceptions;

public class ClassOne {
    public static void main(String[] args) {

        try {

            String s = "hello";
            System.out.println(s.charAt(3));
            System.out.println(3);
            System.out.println(new int [] {1,25,11} [5]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index does not exist");
        }
        catch(ArithmeticException e){
            System.out.println("Invalid math");
        } catch (Exception e){
            System.out.println("Unknown exception");
            System.out.println(e.toString());
        }
        System.out.println("The end");
    }
}
