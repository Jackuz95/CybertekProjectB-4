package objectsSelf;

import constructor.Phone;

public class PhoneCheck {
    public static void main(String[] args) {
//        PhoneSelf phone1 = new PhoneSelf("Iphone","silver");
//        phone1.info();
//        PhoneSelf phone2 = new PhoneSelf("Samsung", "blue",-25,true);
//        phone2.info();
        PhoneSelf phone3 = new PhoneSelf("iphone","blue");
        phone3.text(1234567890,"hello taha");
        phone3.info();
        phone3.call(123456789012l);
    }
}
