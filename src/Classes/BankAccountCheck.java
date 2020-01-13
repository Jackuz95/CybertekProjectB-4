package Classes;

public class BankAccountCheck {
    public static void main(String[] args) {
        BankAccount checking = new BankAccount();
        checking.type = "business";
        checking.accountNUmber = 12345;
        checking.balance = 1000;
        checking.holderName = "Jurabek";

        checking.info();

        System.out.println(checking.balance);
        checking.deposit(200);
        System.out.println(checking.balance);
        checking.transfer(400);
        System.out.println(checking.balance);
        checking.info();
    }
}


//System.out.println(car1.mileage);
//        car1.drive("Downtown");
//        System.out.println(car1.mileage);
//        car1.drive(213);
//        System.out.println(car1.mileage);