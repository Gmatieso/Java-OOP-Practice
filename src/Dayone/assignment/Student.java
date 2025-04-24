package Dayone.assignment;


public class Student {
    // attributes and methods.

    // This are instance variables...
    String name;
    int rollNumber;
    String grade;

    void setDetails(String name, int rollNumber, String grade) {
        this.name  = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    void displayStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public  Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }


    public static void main(String[] args) {
        Student student = new Student("Jetty", 24,"A");
        student.name = "George";
        student.rollNumber = 11;
        student.grade = "A";
        student.setDetails("Jefferson", 13, "C"); // Here we using methods...
        student.displayStudentInfo();


        // here am using Reference variable directly to assign values to the reference object.
        Student student1 = new Student("Daniel", 32,"C");
        student1.name = "Kwamboka";
        student1.rollNumber = 12;
        student1.grade = "B";
        student1.displayStudentInfo();


        Student student2 = new Student("Frank",22, "E");
        student2.name = "Festus";
        student2.rollNumber = 13;
        student2.grade = "C";
        student2.displayStudentInfo();
    }

}
