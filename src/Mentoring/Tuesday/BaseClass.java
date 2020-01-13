package Mentoring.Tuesday;
import java.util.*;
import java.awt.geom.AffineTransform;

public class BaseClass {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.firstName = "Mike";
        student1.lastName = "Jonhson";
        student1.age = 25;
        student1.isActive = true;

        Student student2 = new Student();
        student2.firstName = "Taha";
        student2.lastName = "Hammadi";
        student2.age = 24;
        student2.isActive = false;

        Student student3 = new Student();
        student3.firstName = "Ahmed";
        student3.lastName = "Hasib";
        student3.age = 28;
        student3.isActive = true;

//        Student[] arr = new Student[4];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].isActive == true) {
//            }
//            System.out.println(arr[i].firstName);
//        }
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for(Student student: students){
            if(student.isActive==true){
                student.info();
            }
        }

    }
}
