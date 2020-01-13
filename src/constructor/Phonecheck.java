package constructor;

import Return.StringExtracts;

public class Phonecheck {
    public static void main(String[] args) {
        Phone phone = new Phone("Gold", "iphone");
        phone.info();
        Phone newPhone = new Phone("Silver","Samsung", -45, true);
        newPhone.info();
        System.out.println("----------------");
       boolean result = newPhone.text(3129751018l, "Taha are u ok?");
        System.out.println(result);
        newPhone.call(1234567891);
    }
}
