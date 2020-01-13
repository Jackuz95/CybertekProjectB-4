package methodOverriding;

public class BankingTest {
    public static void main(String[] args) {
        BankAccountPublic ba = new BankAccountPublic();
        ba.balance = 300;
        ba.name = "Jennifer Lawrence";
        ba.accountNumber = 423442;
      //  ba.info();
        System.out.println(ba);
    }
}
