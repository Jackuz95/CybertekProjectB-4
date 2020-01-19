package Abstraction;

public class IphonSelfPrac extends PhoneExample implements Wifi{
    @Override
    public void sharingWifi() {
        System.out.println("Iphone sharing wifi");
    }

    @Override
    public void usingWifi() {
        System.out.println("You are using iphone's wifi");
    }

    @Override
    public void calling() {
        System.out.println("My iphone is calling");
    }

    @Override
    public void texting() {
        System.out.println("My iphone is texting");
    }

    @Override
    public void recivingCall() {
        System.out.println("My iphone is reciving a call");
    }

    @Override
    public void recivingtext() {
        System.out.println("My iphone is reciving a text");
    }
}
