package accessModifiers;

public class AppStore {
    public static void main(String[] args) {
        App whatsapp = new App("Whatsapp", "social network", 2.3);
        App telegram = new App("Telegram", "messenger", 4.1);
        whatsapp.info();
        telegram.info();
whatsapp.update();
whatsapp.setSize(2.6);
whatsapp.info();
        System.out.println("number of apps: " + App.getNumberOfApps());
        whatsapp.setReview("coolest app");
        System.out.println(whatsapp.getListOfReviews());
        whatsapp.setReview("Whats up is good one!");
         System.out.println(whatsapp.getListOfReviews());
    }
}
