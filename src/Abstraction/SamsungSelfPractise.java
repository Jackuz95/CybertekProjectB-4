package Abstraction;

public class SamsungSelfPractise extends PhoneExample implements Wifi{
    int age = 5;
    String color = "Blue";

    @Override
    public void sharingWifi() {
        System.out.println("Samsun is sharing wifi");
    }

    @Override
    public void usingWifi() {
        System.out.println("you are Using samsung wifi");
    }

    @Override
    public void calling() {
        System.out.println("My sansung is calling");
    }

    @Override
    public void texting() {
        System.out.println("My samsung is texting");
    }

    @Override
    public void recivingCall() {
        System.out.println("My samsung is reciveing a call");
    }

    @Override
    public void recivingtext() {
        System.out.println("My samsung is reciving a text");
    }
}
