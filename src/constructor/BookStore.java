package constructor;

public class BookStore {
    public static void main(String[] args) {
        Author book1 = new Author("Java", "Cybertek", 500);
        Author book2 = new Author("automation", "cybertek", 400);
        Author book3 = new Author("OCA", "cybertek", 300);
        Author[] myBooks = new Author[3];
        myBooks[0] = book1;
        myBooks[1] = book2;
        myBooks[2] = book3;
        myBooks[0].pages = 50;

        for (Author eachBook : myBooks) {
            eachBook.info();
            //System.out.println(eachBook.name + " has " + eachBook.pages + " pages");

        }
        for (int i = 0, j = 50; i < myBooks.length; i++, j+=100) {
            myBooks[i].pages = j;
        }
        for (Author eachBook : myBooks) {
            eachBook.info();
            //System.out.println(eachBook.name + " has " + eachBook.pages + " pages");


        }


    }
}
