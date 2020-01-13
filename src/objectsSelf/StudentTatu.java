package objectsSelf;

public class StudentTatu {
    String name;
    String email;
    int age;

    public StudentTatu(String name){
        this.name = name;
    }

    public void read(){
        System.out.println(name + "  is reading");
    }

    public void read(int hours){
        System.out.println(name + " is reading for " + hours + " hours");
    }

    public void read(BookSelf book){
        System.out.println(name + " is reading " + book.title);
    }
}
