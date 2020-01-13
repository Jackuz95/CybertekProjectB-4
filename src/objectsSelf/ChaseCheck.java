package objectsSelf;

public class ChaseCheck {
    public static void main(String[] args) {
        ChaseBankAccount myBank = new ChaseBankAccount();
        myBank.accountNumber = 123456889;
        myBank.type =" Business";
        myBank.balance = 5400;
        myBank.holderName = "Jurabek Sayfiev";

        myBank.info();
        myBank.depositSelf(2000);
        myBank.info();
        myBank.transferSelf(9000);
        myBank.info();
    }
}
