package Dayone.assignment2.StudentGradeSystem;

public class Student {

    String name;
    int [] grades;

    // A parameterized constructor to initialize name and grades
    Student(String name, int [] grades) {
        this.name = name;
        this.grades = grades;
    }


    // method to add new grade to the grade arrays
    void addGrade(int grade) {
        this.grades[grade]++;
    }

    float calculateAverage() {
        float sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return sum / grades.length;

    }

    void printStudentDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Average: " + this.calculateAverage());
    }

    public static void main(String[] args) {
        Student student = new Student("John", new int[] {2,4,6,8,4});
        student.printStudentDetails();

    }


}
