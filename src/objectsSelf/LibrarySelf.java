package objectsSelf;

import java.util.*;
public class LibrarySelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many books do you have? " );
       int numsOfBook = input.nextInt();
       input.nextLine();
//        BookSelf books1 = new BookSelf("matematics","me", 50);
//        BookSelf books2 = new BookSelf("java", "cybertek", 100);
//        BookSelf books3 = new BookSelf("sometinhs", "cybertek", 200);
        BookSelf [] books = new BookSelf[numsOfBook];
//        books[0] =books1;
//        books[1] =books2;
//        books[2] = books3;
//        books[0].title = "OCA";

//        for(BookSelf eachbook: books){
//            //System.out.println(eachbook.title + " has " + eachbook.pages + " pages");
//            eachbook.info();
//            }

//        for(int i=0, j=100; i<books.length; i++, j+=50){
//            books[i].pages = j;
//            books[i].title = "Jurabek is great one";
//            books[i].author = "Jurabek sayfiev";
//            books[i].info();
//        }

       // System.out.println(Arrays.toString(books));
//        books1.info();
//          books2.info();
//          books3.info();
        for(int i=0; i<numsOfBook; i++){
            System.out.println("Enter the title of " + (i+1));
            String title  = input.nextLine();
            System.out.println("enter the author " + (i+1));
            String author = input.nextLine();
            System.out.println("Enter the number of pages " + (i+1));
            int pages = input.nextInt();
            input.nextLine();

            books[i] = new BookSelf(title,author,pages);
        }
         for(BookSelf eachBook: books){
             System.out.println(eachBook.title);
         }

    }
}
