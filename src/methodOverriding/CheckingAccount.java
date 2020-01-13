package methodOverriding;

public class CheckingAccount extends BankAccountPublic {

    @Override
    public  void transfer(double amount){
if(balance - ((amount*0.05)+amount)>0){
            System.out.println(amount + " is tranfered from your balance");
            this.balance = balance - (amount+amount*0.05);
}else{
    System.out.println("Invalid balance!");
}
    }
}
