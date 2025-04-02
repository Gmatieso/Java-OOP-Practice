import Dayone.Employee;
import Dayone.Student;

public class Main {

    public static void main(String args[]){
        //Create an Employee  object
        Employee emp = new Employee();
        emp.employeeId = 1;
        emp.employeeName = "Harry Potter";
        emp.departmentNo = 1;
        emp.Job = "The Training magician";

        //Print our items
//        emp.display();

        //Create another Employee object
        Employee emp2 = new Employee(); //emp2 is object reference variable
        emp2.employeeId = 2;
        emp2.employeeName = "Joy Kairetu";
        emp2.departmentNo = 2;
        emp2.Job = "The Lover Girl";

//        emp2.display();

        //Create a student object
//        Student student = new Student(); // student is object reference  variable
//        student.id = 1;
//        student.age = 20;
//        student.name = "Leansey Chelimo";
//        student.gender = "Girl";

        //using methods
//        student.getValues("Carlos Gambino", 22, "Male");

        Student newStudent = new Student(3, "Hundred",30 , "Girl");
        newStudent.display();

    }

    // We can assign values to variables in 3 ways.
    // By using reference variable
    // by using method
    // by using constructor
}