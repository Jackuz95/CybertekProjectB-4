package methodOverriding;

public class SavingsAccount extends BankAccountPublic {
    public double interestIncome;

    @Override
    public  void transfer(double amount){
        if(balance - ((amount*0.20)+amount)>0){
            System.out.println(amount + " is tranfered from your balance");
            this.balance = balance - (amount+amount*0.20);
        }else{
            System.out.println("Invalid balance!");
        }
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Interest income: " + this.interestIncome);

    }
    public void calculateAnnualInterestIncome(){
        interestIncome+=balance*0.03;
        System.out.println("annual interest is 3% and total: " + balance);
    }
    @Override
    public String toString(){
        String result = "Name: " + this.name + "\nAccount number: " + this.accountNumber +
                " Balance " + this.balance
                + " interest income: " + this.interestIncome;
        return result;
    }

}
