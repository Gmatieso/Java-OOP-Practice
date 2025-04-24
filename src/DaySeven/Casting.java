package DaySeven;

//Parent
class Vehicle {
    String brand = "Hyundai";

    void Start(){
        System.out.println("Vehicle is starting...");
    }

    void run(){
        System.out.println("Vehicle is running...");
    }
}

class Car extends Vehicle {
    String model = "i20";

    void Stop(){
        System.out.println("Car is stopping...");
    }

    void run(){
        System.out.println("Car is running...");
    }
}

public class Casting {
    public static void main(String[] args) {
        //Upcasting - possible directly implicit

        Vehicle car = new Car();  // Parent class reference can hold child class object.
        System.out.println(car.brand);
        car.Start();
        car.run();  //Override method can access from Child class Bcoz object is created for Child class



        // Down casting - indirect/explicit
        Vehicle v = new Car();

        //Down casting
        Car c = (Car) v; // now we can access everything from parent to child
        System.out.println(c.brand);
        System.out.println(c.model);
        c.Start();
        c.Stop();

    }
}
