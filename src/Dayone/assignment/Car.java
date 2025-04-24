package Dayone.assignment;

public class Car {
    // Simple class with instance variables and methods. i.e make, model and year
    String make;
    String model;
    int year;

    void setDetails(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    //Constructor to initialize variables
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
    }



        public static void main(String[] args) {
            // Here we are using constructor to enter data into the object.
            Car car = new Car("MAZDA", "CX5", 2020);
            // here we are using Reference variable to enter data into the object.
            car.make = "BMW";
            car.model = "Audi";
            car.year = 2020;
            car.setDetails("CX5", "Mazda", 2020);
            car.displayInfo();

        }
    }

