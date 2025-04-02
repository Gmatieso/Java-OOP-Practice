package Dayone.assignment;

public class Student {
    // attributes and methods.

    String name;
    int rollNumber;
    String grade;

    void displayStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }


    public static void main(String[] args) {
        Student student = new Student();
        student.name = "George";
        student.rollNumber = 11;
        student.grade = "A";
        student.displayStudentInfo();

        Student student1 = new Student();
        student1.name = "Kwamboka";
        student1.rollNumber = 12;
        student1.grade = "B";
        student1.displayStudentInfo();


        Student student2 = new Student();
        student2.name = "Festus";
        student2.rollNumber = 13;
        student2.grade = "C";
        student2.displayStudentInfo();
    }

}
