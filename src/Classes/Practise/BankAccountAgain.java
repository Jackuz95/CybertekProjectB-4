package Classes.Practise;

public class BankAccountAgain {
    String type;
    long accountNUmber;
    double balance;
    String holderName;

    public void info(){
        System.out.println(" \nAccount Type: " + this.type);
        System.out.println("Account Number: " + this.accountNUmber);
        System.out.println("Current balance: " + this.balance);
        System.out.println("Owner of the Account: " + this.holderName);
    }
     public void deposit (double deposit){
         System.out.println();
         System.out.println( deposit + " deposited in your account");
         this.balance += deposit;
     }
     public void transfer (double amount) {
         if (balance - amount > 0) {
             System.out.println();
             System.out.println(amount + " $ is transfered from your account");
             this.balance -= amount;
             System.out.println("left amount is " + balance);
         } else {
             System.out.println("in your account doesnt have " + amount + " money");
             System.out.println("no enough balance");
         }
     }

}
