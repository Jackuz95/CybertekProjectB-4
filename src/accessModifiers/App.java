package accessModifiers;

import java.util.ArrayList;

public class App extends Object{
    private String name;
    private String category;
    private double rating;
   private String decription;
    private double size;
   private ArrayList<String> ListOfReviews;
private static int numberOfApps ;

    public App(String name, String category, double size){
        this.name = name;
        this.category = category;
        this.size = size;
       numberOfApps ++;
       this.ListOfReviews = new ArrayList<>();
    }
    public App(){

    }

    public static int getNumOfApps(){
        return numberOfApps;
    }

    public void open(){
        System.out.println(this.name + " is opening");
    }
    public void close(){
        System.out.println(this.name + " is  closing");
    }
        public void update(){
            System.out.println(this.name + " is updating");
        }

        public void info(){
            System.out.println("\nName of the App: " + this.name);
            System.out.println("Category " + this.category);
            System.out.println("Rating: " + this.rating);
            System.out.println("Description: " + this.decription);
            System.out.println("Size: " + this.size);
           // System.out.println("Number of Apps created: " + this.numberOfApps);
        }
        public void setReview(String review) {
            if (review.length() >= 3) {
                this.ListOfReviews.add(review);
                System.out.println("Thanks for your review!");
            } else {
                System.out.println("Sorry your review is not enough!");
            }
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ArrayList<String> getListOfReviews() {
        return ListOfReviews;
    }

    public void setListOfReviews(ArrayList<String> listOfReviews) {
        ListOfReviews = listOfReviews;
    }

    public static int getNumberOfApps() {
        return numberOfApps;
    }

    public static void setNumberOfApps(int numberOfApps) {
        App.numberOfApps = numberOfApps;
    }
}
