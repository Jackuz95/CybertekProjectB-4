package constructor;

public class Phone {

    public Phone(String colorCode, String modelCode){
        this.color= colorCode;
        this.model = modelCode;

    }
    public Phone(String colorNew, String modelNew,  int memoryNew, boolean touchscreenNew) {

        this.color = colorNew;
        this.model = modelNew;
        this.touchscreen  = touchscreenNew;
        if(memoryNew<0){
            System.err.println("\nInvalid memory");
        } else {
            this.memory = memoryNew;
        }
    }

    String model;
    int memory;
    boolean touchscreen;
    String color;
    long phoneNumber;
    public void info() {
        System.out.println("\nColor of phone: " + color);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Phone type: " + model);
        System.out.println("Memory of the phone " + memory);
        System.out.println("is phone touchscreen or not? " + touchscreen);
    }
    public  boolean text (long phoneNumber, String message) {
        //int count=0;

//        for(int i=0; i<phoneNumber; i++){
//            count++;
//        }
        String number1 = phoneNumber + "";
         int lengthOfText = message.length();

        if(number1.length()==10 && !message.isEmpty()){
            System.out.println(message + " is sent to " + phoneNumber );
            return true;
        }
        else {
            System.out.println("invalid number or empty message") ;
        } return false;
    }

     public  void  call (long phoneNumber) {
        String pPhoneNUmber = phoneNumber + "";
        if(pPhoneNUmber.length()==10){
            System.out.println("Calling to " + phoneNumber);
        } else {
            System.out.println("invalid phone number");
        }
     }


}
