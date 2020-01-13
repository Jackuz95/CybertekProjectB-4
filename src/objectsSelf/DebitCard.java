package objectsSelf;

public class DebitCard {
    long cardNumber;
    String holderName;
    String type;
    int pin;
    double balance;

    public DebitCard(long cardNumber, String holderName,double balance ){
        String cardNu = ""+ cardNumber;
        if(cardNu.length()==16){
         this.cardNumber = cardNumber;
            } else {
            System.out.println("Invalid card NUmber");
        }
        this.holderName = holderName;
        this.balance= balance;
    }

    public DebitCard(long cardNumber, String holderName, double balance, String type, int pin){
        if(type.equalsIgnoreCase("MasterCard") || type.equalsIgnoreCase("Visa")){
            this.type = type;
        } else {
            System.out.println("Invalid card type");
        }
        String pinn = "" +pin;
        if(pinn.length()==4){
            this.pin = pin;
        } else {
            System.out.println("Invalid pin length" );
        }
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void info() {
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Holder name: " + this.holderName);
        if(type!=null) {
            System.out.println("Card type: " + this.type);
        }
        System.out.println("Balance: " + this.balance);
        }

    }

