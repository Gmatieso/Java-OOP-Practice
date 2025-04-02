package Dayone.Inheritance.methodoveriding_overloading;
//let start with some hierarchical inheritance.

class Employee {
    String empName;

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    int deptno;

    @Override
    double calculateSalary() {
        return 50000;
    }
}


class PartTimeEmployee extends Employee {

    @Override
    double calculateSalary() {

        return 20000;
    }

}
public class MethodOveridingDemo {

    public static void main(String[] args) {
//        FullTimeEmployee ft = new FullTimeEmployee();
//        System.out.println("Salary of Full time employee: " + ft.calculateSalary());
//
//        PartTimeEmployee ptt = new PartTimeEmployee();
//        System.out.println("Salary of Part time employee: " + ptt.calculateSalary());

        //Run time polymorphism.
        /*
            Just some pointer notes.. here we can store child class object into parent class  variable.
        * */
        Employee emp = new FullTimeEmployee();

        emp.empName = "John Smith"; // Valid
//        emp.dept = 101; invalid
        System.out.println("Employee salary"   + " " + emp.calculateSalary()); // called from FullTimeEmployee(child class)


        //lets create another object for child class reference variable parent class
        Employee emp2 = new PartTimeEmployee();
        System.out.println("Employee salary"   + " " + emp2.calculateSalary());  // called from PartTimeEmployee(child class)

    }
}
