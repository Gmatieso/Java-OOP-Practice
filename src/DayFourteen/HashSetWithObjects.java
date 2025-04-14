package DayFourteen;

// if we want to create an object we need to hv class. it's that simple.

import java.util.HashSet;
import java.util.Iterator;

class Employee {
    int empNo;
    String empName;
    int empSalary;

    Employee(int empNo, String empName, int empSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = 0;
    }
}

public class HashSetWithObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "John", 2000);
        Employee e2 = new Employee(102, "Mike", 3000);
        Employee e3 = new Employee(103, "Frank", 4000);

        HashSet<Employee> myset = new HashSet<Employee>();
        myset.add(e1);
        myset.add(e2);
        myset.add(e3);

        // read data from object using for..each loop
        for( Employee emp:myset){
            System.out.println("Name:" + emp.empName + " " + "No:" + emp.empNo + " " +  "Salary:" + emp.empSalary);
        }

        // read data using iterator
      Iterator itr = myset.iterator();

        while(itr.hasNext()){

            // here we doing typecasting..
            Employee emp = (Employee)itr.next();
            System.out.println(emp.empName + " " + "No:" + emp.empNo + " " +  "Salary:" + emp.empSalary);
        }

    }
}
