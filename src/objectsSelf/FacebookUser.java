package objectsSelf;

public class FacebookUser {
    String userNAme;
    String password;
    String name;
    int age;
    int numberOfFrinds;

    public FacebookUser(String userName, String password){
        if(userName.contains(password)){
            System.out.println("Password contained username. Default password created: ‘password’");
            this.password = "password";
            } else {
            this.password = password;
        }
        this.userNAme = userName;
    }
    public FacebookUser(String userName, String password, String name){
        this(userName, password);
        name=name.trim().toLowerCase().replace(" ", "");
        //String [] arr = name.split("");
        for(int i=0; i<name.length(); i++){
            if(name.indexOf(name.charAt(i))>=97 && name.indexOf(name.charAt(i))<=122){
                this.name =name;
            } else {
                System.out.println("Invalid name");
                this.name = "no name";
            }
        }
    }
     public FacebookUser(String userNAme, String password, String name, int age, int numberOfFrinds){
        this(userNAme,password,name);
        if(age>0 ){
            this.age = age;

        } else{
           // this.age =0;

            System.out.println("Invalid age");
        }
        if(numberOfFrinds<0 || numberOfFrinds>5000){
            System.out.println("Invalid friends");
        } else {
         // this.numberOfFrinds =0;
            this.numberOfFrinds = numberOfFrinds;
        }
     }

     public boolean SendFriendRequest(FacebookUser userTwo) {
        if(this.numberOfFrinds>5000){
            System.out.println("You reached the limit");
            return false;
        } else if(userTwo.numberOfFrinds>5000){
            System.out.println("You reach the limit");
            return  false;
        } else {
            System.out.println("Request sent successfully");
            this.numberOfFrinds ++;
            userTwo.numberOfFrinds++;
            return true;
        }

     }


     public void info(){
         System.out.println("Username: " + userNAme);
         System.out.println("Password: " + password);
         System.out.println("User Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("NUmber of friends: " + numberOfFrinds);
     }

}
