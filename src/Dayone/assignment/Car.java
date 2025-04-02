package Dayone.assignment;

public class Car {
    // Simple class with attributes and methods. i.e make, model and year
    String make;
    String model;
    int year;


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
            // Initialize
            Car car = new Car("MAZDA", "CX5", 2020);
            car.make = "BMW";
            car.model = "Audi";
            car.year = 2020;
            car.displayInfo();

        }
    }

