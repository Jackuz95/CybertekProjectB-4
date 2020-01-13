package Mentoring.Tuesday;

public class Student {
    String firstName;
    String lastName;
    int age;
    boolean isActive;
//
//    public Student() {
//
//    }
//
//    public Student(String lastName, String firstName) {
//        this.lastName = lastName;
//        this.firstName = firstName;
//    }
//
//    public Student(String lastName, String firstName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
    public void info(){
        System.out.println("\nName is: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("IsActive Or not: " +this.isActive);
    }
}