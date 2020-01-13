package objectsSelf;

public class Facebook {
    public static void main(String[] args) {
        FacebookUser user1 = new FacebookUser("jutabek", "pass");
        FacebookUser user2 = new FacebookUser("dilshod", "dil");
        user1.numberOfFrinds = 500;
        user2.numberOfFrinds =5000;
        user2.name = "Jurabek";
        System.out.println(user1.SendFriendRequest(user2));
    }
}
