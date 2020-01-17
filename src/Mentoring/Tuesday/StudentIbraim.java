package Mentoring.Tuesday;

public class StudentIbraim {
    String name;
    public StudentIbraim(String name){
        this.name = name;
    }
    @Override
public String toString(){
        return String.format("Student name is %s", this.name);
}

public boolean equals(StudentIbraim s){
        return this.name.equals(s.name);
}
    public static void main(String[] args) {
        StudentIbraim s = new StudentIbraim("John");
        StudentIbraim s2 = new StudentIbraim("John");
        System.out.println(s.toString());

        System.out.println(s.equals(s2));
    }
}
