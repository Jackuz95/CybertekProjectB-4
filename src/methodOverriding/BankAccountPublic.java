package methodOverriding;

public class BankAccountPublic {
    public double balance;
    public int accountNumber;
    public String name;

    public void info(){
        System.out.println("\nName: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public  void transfer(double amount){
            System.out.println(amount + " is transfered from balance plus 10% service fee!");
            this.balance = balance-amount;
            this.balance = balance- amount*0.10;

      }
      public void deposit(double amount){
          System.out.println(amount + " is deposited");
        this.balance = balance+amount;
      }
    @Override
    public String toString(){
        String result = "Name: " + this.name + "\nAccount number: " + this.accountNumber + " \nBalance " + this.balance
                + "\ninterest income: " ;
        return result;
    }



}
