package objectsSelf;

public class StudentSelf {
    public static void main(String[] args) {
        StudentTatu student1 = new StudentTatu("Jurabek");
        //student1.read(3);
       // student1.age =25;
        BookSelf book1 = new BookSelf("java","Jurabek",120);
        student1.read(book1);
        //System.out.println(student1);
    }
}
