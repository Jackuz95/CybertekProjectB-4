package accessModifiers;



public class Storage {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.model = "Home depot";
        chair.setSize(15);

        chair.info();
        System.out.println(chair.getSize());
    }
}
