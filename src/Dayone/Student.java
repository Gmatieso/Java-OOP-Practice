package Dayone;

public class Student {

    // Create a student object
    public int id;
    public String sname;
    public int sage;
    public String sgender;

    // Rules for creating Java constructor
    /*
    1. Name should be of the same class name
    2. constructor will automatically invoked at the object creation .
    3. ONly for initialized of varibles
    4. Two types of constructor i.e default constructor and parameterized constructor
     */

   public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.sname = name;
        this.sage = age;
        this.sgender = gender;
    }


    // using methods.
    public void getValues(String name, int age, String gender) {
            sname = name;
            sage = age;
            sgender = gender;
    }


   public void display() {
        System.out.println("Identify no" + id + "Name is:" + sname + "I am  " + sage + " years old " + sgender);
    }
}
