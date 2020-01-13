package Classes.Practise;

public class BankCheckAccount {
    public static void main(String[] args) {
        BankAccountAgain bank = new BankAccountAgain();
        bank.type = "Business";
        bank.balance = 5000;
        bank.holderName = "Jurabek Sayfiev";
        bank.accountNUmber = 123456789;
        bank.info();
        //System.out.println();
        bank.deposit(5000);
        bank.info();
       // System.out.println();
        bank.transfer(5449);
        bank.info();
    }
}
