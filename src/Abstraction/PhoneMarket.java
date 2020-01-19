package Abstraction;

public class PhoneMarket {
    public static void main(String[] args) {
        IphonSelfPrac iphone = new IphonSelfPrac();
        iphone.recivingCall();
        iphone.texting();
        SamsungSelfPractise samsung = new SamsungSelfPractise();
        System.out.println();
        samsung.recivingCall();
        samsung.texting();
        iphone.sharingWifi();
        System.out.println();
        samsung.sharingWifi();

    }
}
