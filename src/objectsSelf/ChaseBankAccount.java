package objectsSelf;

import java.util.jar.JarOutputStream;

public class ChaseBankAccount {
    String type;
    long accountNumber;
    double balance;
    String holderName;

    public void depositSelf(double deposit){
        System.out.println(deposit + " is deposited to your account");
        this.balance = balance+deposit;
    }

    public void transferSelf(double transfer){
        if(balance-transfer>0){
            System.out.println( transfer + " is transferred from your account");
            this.balance -= transfer;
        } else {
            System.out.println( transfer + " No enough money to transfer ");
        }
    }
    public  void info(){
        System.out.println("\nName: "+ this.holderName);
        System.out.println("Balance: "+  this.balance);
        System.out.println("Type: " + this.type);
        System.out.println("Account number: " + this.accountNumber + " \n");
    }
}
