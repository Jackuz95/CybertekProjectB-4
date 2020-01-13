package Classes;

public class BankAccount {
    String type;
    int accountNUmber;
    int balance;
    String holderName;

     public void deposit(double amount){
         System.out.println(amount + " $ is deposited to your account");
         balance+=amount;
     }
     public void transfer(double amount1){
         System.out.println(amount1 + " $ is transferred from your account");
         balance -=amount1;
     }
     public void info(){
         System.out.println("\nName: " + holderName);
         System.out.println("Balance: " + balance);
         System.out.println("Type: business");
         System.out.println("Account number: " + accountNUmber);
     }
}
