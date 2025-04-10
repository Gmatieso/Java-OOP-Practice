package DayTwelve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

class Student {
    int rollNo;
    String name;
    int age;


    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class ArrayListWithObjects {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", 23);
        Student s2 = new Student(201, "Jane", 24);
        Student s3 = new Student(304, "Mike", 25);

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        // !we can use enhanced for loop to read Data from object data.
//        for(Student student : students) {
//            System.out.println(student.name);
//            System.out.println(student.age);
//            System.out.println(student.rollNo);
//        }

        // !we can also use iterator to read elements/ object data.
        Iterator iterate  = students.iterator();

        while(iterate.hasNext()) {
          Student str = (Student) iterate.next();  // we need to DownCasting.
          System.out.println( str.rollNo +  str.age +  str.name);
        }


    }
}
