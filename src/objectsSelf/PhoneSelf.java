package objectsSelf;

public class PhoneSelf {
    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public PhoneSelf(String model, String color){
        this.model=model;
        this.color =color;
    }
    public PhoneSelf(String model, String color, int memory, boolean touchscreen){
        this.model = model;
        this.color = color;

        if(memory<0){
            System.err.println("Invalid memory");
        } else{
            this.memory = memory;
        }
         this.touchscreen = touchscreen;

    }
    public boolean text(long phoneNumber, String text){
        this.phoneNumber = phoneNumber;
        String num = ""+ phoneNumber;
        int count = 0;
        for(int i=0; i<num.length(); i++){
            count++;
        }
        if(count==10 && text.length()>0){
            System.out.println(text + " is sent to " + phoneNumber);
            return true;
        } else{
            System.out.println("Invalid information");
            return false;
        }
    }
    public void call(long phoneNumber){
        this.phoneNumber = phoneNumber;
        int count =0;
        String num = ""+phoneNumber;
        for(int i=0; i<num.length(); i++){
            count++;
        }
        if(count==10){
            System.out.println(phoneNumber + " calling to");
        } else{
            System.out.println("Invalid number");
        }
    }

    public void info(){
        System.out.println("\nPhone model: " + model);
        System.out.println("Phone touchscreen or not?  " + touchscreen);
        System.out.println("Phone memory: " + memory);
        System.out.println("Phone color: " + color);
        System.out.println("Phone number: " + phoneNumber + "\n");

    }

}
