package constructor;

import java.util.Scanner;

public class Author {
    int numberOfBooks;
    public String author;
     public String Title;
    public int pages;


    public Author(){

    }
    public Author(String Title, String author, int pages){
       this.Title = Title;
       this.author = author;
       this.pages = pages;

    }

    public void info(){
        System.out.println("Name " + this.Title);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }

}
