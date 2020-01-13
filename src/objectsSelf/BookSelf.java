package objectsSelf;

public class BookSelf {

    String title;
    String author;
    int pages;

    public BookSelf(String title, String author, int pages){
        this.title = title;
        this.author= author;
        this.pages = pages;
    }

    public void info(){
        System.out.println("\nTitle of the book: "  + this.title);
        System.out.println("Author of the book: " + this.author);
        System.out.println("There are: "+ this.pages+  " pages");
        System.out.println();
    }

}
