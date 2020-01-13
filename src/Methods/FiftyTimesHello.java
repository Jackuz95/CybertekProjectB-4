package Methods;

public class FiftyTimesHello {
    public static void main(String[] args) {
sayHello();
        //System.out.println("//////////////////////////");
        OddNumbers();
    }
    public static void sayHello () {
        for(int i=0; i<50; i++) {
            System.out.println("Hello! " + (i+1));
        }
        System.out.println("****************************");
    }
    public static void OddNumbers () {
        for(int i= 0; i<=100; i++) {
            if(i%2==1) {
                System.out.println(i);
            }
        }
    }
}
